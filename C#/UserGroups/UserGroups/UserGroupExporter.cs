using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using UserGroups.UserManagementService;
using CsvHelper;
using UserGroups.Service;

namespace UserGroups
{
    class UserGroupExporter
    {
        private List<GroupOptions> groupOptions = new List<GroupOptions>();
        private FTPOptions ftpOptions;

        public UserGroupExporter(String groupOptionsFileName, String ftpOptionsFileName)
        {
            try
            {
                List<List<String>> groupOptionsAsStringList = OptionUtils.parseOptionsAsStringFromList(groupOptionsFileName, GroupOptions.NUMBER_OF_OPTIONS);

                foreach (List<String> optionsLine in groupOptionsAsStringList)
                { groupOptions.Add(new GroupOptions(optionsLine)); }

                ftpOptions = new FTPOptions(OptionUtils.parseOptionsAsStringFromList(ftpOptionsFileName, FTPOptions.NUMBER_OF_OPTIONS)[0]);
            }
            catch (Exception e)
            { Console.WriteLine("Error parsing options file, Make sure all options are properly specified"); }
        }

        private void writeGroupToCSV(PagedListResultOfArrayOfUserDataVUqw3SxC users, String CSVFileName)
        {
            try
            {
                using (var sr = new StreamWriter(@CSVFileName))
                {
                    var writer = new CsvWriter(sr);
                    /*-----------------------------------
                     * Header
                     * -----------------------------------*/
                    writer.WriteField("User Name");
                    for (int k = 0; k < users.ResultPage.First().Profile.NameValueList.Length; k++)
                    { writer.WriteField(users.ResultPage.First().Profile.NameValueList[k].Name); }

                    writer.WriteField("Email");
                    writer.WriteField("Group Membership");
                    writer.WriteField("UserGuid");
                    writer.NextRecord();


                    /*----------------------------------------------
                     * Write User Record
                     * ---------------------------------------------*/

                    for (int i = 0; i < users.ResultPage.Count(); i++)
                    {
                        writer.WriteField(users.ResultPage[i].UniqueIdentifier);
                        for (int j = 0; j < users.ResultPage.First().Profile.NameValueList.Count(); j++)
                        {
                            writer.WriteField(users.ResultPage[i].Profile.NameValueList[j].Value);
                        }
                        writer.WriteField(users.ResultPage[i].Email);
                        writer.WriteField(users.ResultPage[i].GroupMemberships.Count());
                        writer.WriteField(users.ResultPage[i].UserGuid);
                        writer.NextRecord();
                    }
                }
            }
            catch (Exception e)
            { }
        }
        public void exportDatatoFTP()
        {
            foreach (GroupOptions groupOption in groupOptions)
            {
                Uri apiUrl = groupOption.getAPIUrl();
                try
                {
                    UserGroup repsponseData = new UserGroup(apiUrl);
                    writeGroupToCSV(repsponseData.exportGroup(groupOption), groupOption.getCSVFileName());
                    var ftpUploader = new FTPUploader(ftpOptions.getHostname(), ftpOptions.getUsername(), ftpOptions.getPassword(), groupOption.getCSVFileName());
                    ftpUploader.uploadFile(groupOption.getCSVFileName(), ftpOptions.getDirectory());
                }
                catch (Exception e)
                {
                    Console.WriteLine("Data Export Failed");
                }

            }
        }

    }
}

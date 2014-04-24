using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ListUsers.UserManagementService;
using System.IO;
using CsvHelper;
using ListUsers.service;
namespace ListUsers
{
    class UserListExporter
    {
        private List<AdminOptions> adminOptions = new List<AdminOptions>();
        private FTPOptions ftpOptions;

        public UserListExporter(String adminOptionsFileName, String ftpOptionsFileName)
        {
            List<List<String>> adminOptionsAsStringList = OptionUtils.parseOptionsAsStringFromList(adminOptionsFileName, AdminOptions.NUMBER_OF_OPTIONS);

            foreach (List<String> optionsLine in adminOptionsAsStringList)
            { adminOptions.Add(new AdminOptions(optionsLine)); }

            ftpOptions = new FTPOptions(OptionUtils.parseOptionsAsStringFromList(ftpOptionsFileName, FTPOptions.NUMBER_OF_OPTIONS)[0]);
        }

        private void writeUserToCSVFile(PagedListResultOfArrayOfUserDataVUqw3SxC users, String CSVFileName)
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
            foreach (AdminOptions adminOption in adminOptions)
            {
                Uri apiUrl = adminOption.getAPIUrl();
                try
                {
                    User repsponseData = new User(apiUrl);
                    writeUserToCSVFile(repsponseData.exportUsers(adminOption), adminOption.getCsvFileName());
                    var ftpUploader = new FTPUploader(ftpOptions.getHostname(), ftpOptions.getUsername(), ftpOptions.getPassword(), adminOption.getCsvFileName());
                    ftpUploader.uploadFile(adminOption.getCsvFileName(), ftpOptions.getDirectory());
                }
                catch (Exception e)
                {
                    Console.WriteLine("Data Export Failed");
                }

            }
        }
    }
}
        
                            




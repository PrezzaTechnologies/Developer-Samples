using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using EmailListExporter.InviteService;
using EmailListExporter.AuthService;
using System.IO;
using CsvHelper;

namespace EmailListExporter
{
    class EmailListExport
    {
        private List<ExportOptions> exportOptions = new List<ExportOptions>();
        private FTPOptions ftpOptions;

        public EmailListExport(String exportOptionsFileName, String ftpOptionsFileName)
        {
            List<List<String>> exportOptionsAsStringList = OptionUtils.parseOptionsAsStringFromList(exportOptionsFileName, ExportOptions.NUMBER_OF_OPTIONS);

            foreach (List<String> optionsLine in exportOptionsAsStringList)
            {exportOptions.Add(new ExportOptions(optionsLine));}

            ftpOptions = new FTPOptions(OptionUtils.parseOptionsAsStringFromList(ftpOptionsFileName, FTPOptions.NUMBER_OF_OPTIONS)[0]);

        }

        private void writeEmailListToCSV(String[] emails, String CSVFileName)
        {
            try
            {
                using (var sr = new StreamWriter(@CSVFileName))
                {
                    var writer = new CsvWriter(sr);
                    /*-------------------------
                     * HEADER
                     * -----------------------*/
                    writer.WriteField("Email Address");
                    writer.NextRecord();
                    /*-------------------------
                     * Email List
                     * -----------------------*/
                    for(int i=0; i< emails.Length;i++)
                    {
                        writer.WriteField(emails[i]);
                        writer.NextRecord();
                    }

                        
                }
            }
            catch(Exception e)
            {Console.WriteLine("CSV write failed");}
        }

        public void exportDatatoFTP()
        {
            foreach (ExportOptions exportOption in exportOptions)
            {
                Uri apiUrl = exportOption.getAPIUrl();
                try
                {
                    EmailExport repsponseData = new EmailExport(apiUrl);
                    writeEmailListToCSV(repsponseData.exportEmail(exportOption), exportOption.getCsvFileName());
                    var ftpUploader = new FTPUploader(ftpOptions.getHostname(), ftpOptions.getUsername(), ftpOptions.getPassword(), exportOption.getCsvFileName());
                    ftpUploader.uploadFile(exportOption.getCsvFileName(), ftpOptions.getDirectory());
                }
                catch (Exception e)
                {
                    Console.WriteLine("Data Export Failed");
                }

            }
        }
    }
}

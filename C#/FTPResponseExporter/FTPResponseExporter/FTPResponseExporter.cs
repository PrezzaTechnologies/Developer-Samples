using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using CsvHelper;
using System.IO;
using System.Collections.Concurrent;
using ResponseExporter.service;
using FTPResponseExporter.ResponseDataService;
using FTPResponseExporter;

namespace ResponseExporter
{
    public class FtpResponseExporter
    {
        private List<ExportOptions> exportOptions = new List<ExportOptions>();
        private FTPOptions ftpOptions;


        public FtpResponseExporter(String exportOptionsFileName, String ftpOptionsFileName)
        {
            List<List<String>> exportOptionsAsStringList = OptionUtils.parseOptionsAsStringFromList(exportOptionsFileName, ExportOptions.NUMBER_OF_OPTIONS);

            foreach ( List<String> optionsLine in exportOptionsAsStringList)
            {exportOptions.Add(new ExportOptions(optionsLine));}

             ftpOptions = new FTPOptions(OptionUtils.parseOptionsAsStringFromList(ftpOptionsFileName,FTPOptions.NUMBER_OF_OPTIONS)[0]);
        }

        private void writeStringResponsesToCSVFile(IEnumerable<SimpleNameValueCollection> responses, String CSVFileName)
        {
           
            try
            {
                using (var sr = new StreamWriter(@CSVFileName))
                {
                    var writer = new CsvWriter(sr);

                    /*--------------------------------------------------------
                     * Write Header
                     * -------------------------------------------------------*/
                    for (int j = 0; j < responses.First().NameValueList.Count(); j++)
                    {
                        writer.WriteField(responses.First().NameValueList.ElementAt(j).Name);
                    }

                    writer.NextRecord();
                    
                    /*-------------------------------------------------------
                    * Write Responses
                    * ------------------------------------------------------*/
                    foreach (SimpleNameValueCollection record in responses)   
                    {
                        
                        for (int i = 0; i < record.NameValueList.Count(); i++)
                        {
                            writer.WriteField(record.NameValueList.ElementAt(i).Value);
                        }
                        writer.NextRecord();
                    }

                }

            }

            catch (Exception e)
            {
                Console.WriteLine("CSV file creation failed");            
            }
             
         }


        public void exportDatatoFTP()
        {
            foreach (ExportOptions expOptions in exportOptions)
            {
                Uri apiUrl = expOptions.getAPIUrl();
                try 
                {
                    ResponseDataServ repsponseData = new ResponseDataServ(apiUrl);
                    writeStringResponsesToCSVFile(repsponseData.exportResponses(expOptions), expOptions.getCsvFileName());
                    var ftpUploader = new FTPUploader(ftpOptions.getHostname(), ftpOptions.getUsername(), ftpOptions.getPassword(), expOptions.getCsvFileName());
                    ftpUploader.uploadFile(expOptions.getCsvFileName(), ftpOptions.getDirectory());
                }
                catch (Exception e)
                {
                    Console.WriteLine("Data Export Failed");
                }
                    
            }
        
        }
    }
}
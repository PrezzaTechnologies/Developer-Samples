using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmailListExporter
{
    class ExportOptions
    {public static readonly int NUMBER_OF_OPTIONS = 7;
        private Uri APIUrl;
        private string username;
        private string password;
        private string listName;
        private int pageNumber;
        private int pageSize;
        private String csvFileName;



        public ExportOptions(List<String> optionsLine)
        {
            APIUrl = new Uri(optionsLine[0]);
            username = optionsLine[1];
            password = optionsLine[2];
            listName = optionsLine[3];
            pageNumber = Convert.ToInt32(optionsLine[4]);
            pageSize = Convert.ToInt32(optionsLine[5]);
            csvFileName = optionsLine[6];


        }

        public Uri getAPIUrl()
        {
            return APIUrl;
        }
       
        public String getUserName()
        {
            return username;
        }
        
        public String getPassword()
        {
            return password;
        }
        
        public String getListName()
        {
            return listName;
        }
        
        public int getPageNumber()
        {
            return pageNumber;
        }
        
        public int getPageSize()
        {
            return pageSize;
        }

        public String getCsvFileName()
        {
            return csvFileName;
        }

    }
}

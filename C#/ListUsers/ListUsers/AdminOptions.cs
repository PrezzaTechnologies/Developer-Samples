using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ListUsers
{
    class AdminOptions
    {
        public static readonly int NUMBER_OF_OPTIONS = 11;
        private Uri APIUrl;
        private string username;
        private string password;
        private string provider;
        private int pageNumber;
        private int pageSize;
        private string sortField;
        private bool sortAscending;
        private string filterField;
        private string filterValue;
        private String csvFileName;



        public AdminOptions(List<String> optionsLine)
        {
            APIUrl = new Uri(optionsLine[0]);
            username = optionsLine[1];
            password = optionsLine[2];
            provider = optionsLine[3];
            pageNumber = Convert.ToInt32(optionsLine[4]);
            pageSize = Convert.ToInt32(optionsLine[5]);
            sortField = optionsLine[6];
            sortAscending = Convert.ToBoolean(optionsLine[7]);
            filterField = optionsLine[8];
            filterValue = optionsLine[9];
            csvFileName = optionsLine[10];


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
        
        public String getProvider()
        {
            return provider;
        }
        
        public int getPageNumber()
        {
            return pageNumber;
        }
        
        public int getPageSize()
        {
            return pageSize;
        }

        public String getSortField()
        {
            return sortField;
        }

        public bool getSortAscending()
        {
            return sortAscending;
        }

        public String getFilterField()
        {
            return filterField;
        }

        public String getFilterValue()
        {
            return filterValue;
        }

        public String getCsvFileName()
        {
            return csvFileName;
        }


    }
}

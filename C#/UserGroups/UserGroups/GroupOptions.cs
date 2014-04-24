using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserGroups
{
    class GroupOptions
    {
        public static readonly int NUMBER_OF_OPTIONS = 11;
        private Uri APIUrl;
        private string username;
        private string password;
        private string groupName;
        private String csvFileName;
        private int pageNum;
        private int pageSize;
        private String sortField;
        private bool sortAscend;
        private String filterField;
        private String filterValue;



        public GroupOptions(List<String> optionsLine)
        {
            APIUrl = new Uri(optionsLine[0]);
            username = optionsLine[1];
            password = optionsLine[2];
            groupName = optionsLine[3];
            csvFileName = optionsLine[4];
            pageNum = Convert.ToInt32(optionsLine[5]);
            pageSize =Convert.ToInt32( optionsLine[6]);
            sortField = optionsLine[7];
            sortAscend = Convert.ToBoolean(optionsLine[8]);
            filterField = optionsLine[9];
            filterValue = optionsLine[10];

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

        public String getGroup()
        {
            return groupName;
        }

        public String getCSVFileName()
        {
            return csvFileName;
        }

        public int getpageNum()
        {
            return pageNum;
        }

        public int getpageSize()
        {
            return pageSize;
        }

        public String getsortField()
        {
            return sortField;
        }

        public Boolean getsortAscend()
        {
            return sortAscend;
        }
        public String getfilterField()
        {
            return filterField;
        }

        public String getfilterValue()
        {
            return filterValue;
        }
    }
}

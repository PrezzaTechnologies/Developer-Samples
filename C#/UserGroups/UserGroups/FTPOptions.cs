using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserGroups
{
    class FTPOptions
    {
        public static readonly int NUMBER_OF_OPTIONS = 4;
        private String hostname;
        private String username;
        private String password;
        private String directory;

        public FTPOptions(List<String> ftpOptionsLine)
        {


            hostname = ftpOptionsLine[0];
            username = ftpOptionsLine[1];
            password = ftpOptionsLine[2];
            directory = ftpOptionsLine[3];
        }

        public String getHostname()
        {
            return hostname;
        }

        public String getUsername()
        {
            return username;
        }

        public String getPassword()
        {
            return password;
        }

        public String getDirectory()
        {
            return directory;
        }
    }
}

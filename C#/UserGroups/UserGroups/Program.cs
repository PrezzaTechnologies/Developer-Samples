using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserGroups
{
    class Program
    {
        static void Main(string[] args)
        {
            if (args.Length < 2)
            {
                Console.WriteLine("Please pass export_options_file.txt and ftp_options_file.txt as program args");
                return;
            }

            var exportOptionsFileName = args[0];
            var ftpOptionsFileName = args[1];

            try
            {
                var userGroupExporter = new UserGroupExporter(exportOptionsFileName, ftpOptionsFileName);
                userGroupExporter.exportDatatoFTP();
            }

            catch (Exception e)
            { }
        }
    }
}

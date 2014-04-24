using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ListUsers
{
    class Program
    {
        public static void Main(String[] args)
        {
            if (args.Length < 2)
            {
                Console.WriteLine("Please pass export_options_file.txt ftp_options_file.txt as program args");
                return;
            }

            var exportOptionsFileName = args[0];
            var ftpOptionsFileName = args[1];

            try
            {
                var userlistexporter = new UserListExporter(exportOptionsFileName, ftpOptionsFileName);
                userlistexporter.exportDatatoFTP();

            }
            catch (Exception e)
            {
                Console.WriteLine("Export Failed");
            }
        }
    }
}

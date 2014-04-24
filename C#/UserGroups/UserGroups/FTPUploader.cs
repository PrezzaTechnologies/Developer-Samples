using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace UserGroups
{
    class FTPUploader
    {
        FtpWebRequest request;

        public FTPUploader(String hostname, String username, String password, String fileName)
        {
            //Get Object used to communicate with server.
            request = (FtpWebRequest)WebRequest.Create(hostname + '/' + fileName);
            request.Method = WebRequestMethods.Ftp.UploadFile;

            // server authentication
            if (username.Equals("anonymous"))
            {
                request.Credentials = new NetworkCredential("anonymous", password);
            }

            else
            { request.Credentials = new NetworkCredential(username, password); }

        }

        public void uploadFile(String fileName, String hostDirectory)
        {
            try
            {
                StreamReader source = new StreamReader(fileName);
                byte[] fileContents = Encoding.UTF8.GetBytes(source.ReadToEnd());
                source.Close();
                request.ContentLength = fileContents.Length;

                Stream requestStream = request.GetRequestStream();
                requestStream.Write(fileContents, 0, fileContents.Length);
                requestStream.Close();

                FtpWebResponse response = (FtpWebResponse)request.GetResponse();
                Console.WriteLine("Upload File Complete, Status {0}", response.StatusDescription);
                response.Close();

            }
            catch (Exception e)
            {
                Console.WriteLine("File Upload Failed");
            }
        }
    }
}

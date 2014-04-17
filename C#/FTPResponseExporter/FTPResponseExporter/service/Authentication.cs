using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.ServiceModel;
using FTPResponseExporter.AuthService;

namespace ResponseExporter.service
{
    public class Authentication
    {
        private static readonly String WSDL_LOCATIONS = "Services/AuthenticationService.svc/soap";
        private AuthenticationServiceClient client;
      

        public Authentication(Uri APIUrl)
        {
            
            EndpointAddress endpoint = new EndpointAddress(APIUrl.ToString() + WSDL_LOCATIONS);
            if ("https".Equals(APIUrl.Scheme))
                client = new AuthenticationServiceClient("BasicHttpBinding_IAuthenticationService11", endpoint);
            else if ("http".Equals(APIUrl.Scheme))
                client = new AuthenticationServiceClient("BasicHttpBinding_IAuthenticationService", endpoint);
         
        }


        public String getAuthenticationToken(String userName, String password)
        {
            Console.WriteLine("Authenticating");
            ServiceOperationResultOfstring loginServiceResult = client.Login(userName, password);
            if (!loginServiceResult.CallSuccess)
            { Console.WriteLine("Authentication Failed"); }
            else
            { Console.Write("Authentication Success:"); }
         ;
            
            return loginServiceResult.ResultData;
            

        }
     
    }
}
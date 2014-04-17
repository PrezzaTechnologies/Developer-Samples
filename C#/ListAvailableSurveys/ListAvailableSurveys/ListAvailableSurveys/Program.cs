using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Configuration;

namespace ListAvailableSurveys
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                string ticket = authenticate();

                listSurveys(ticket);

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
#if DEBUG
            Console.ReadKey();
#endif
        }

        private static void listSurveys(string ticket)
        {
            var service = new SurveyManagementService();
            service.Url = ConfigurationManager.AppSettings["CheckboxRoot"] + "/Services/SurveyManagementService.svc/soap";

            var callRes = service.ListAvailableSurveys(ticket, 0, false, 100, true, null, false, false, null, null);
            if (!callRes.CallSuccess)
            {
                throw new Exception(callRes.FailureMessage);
            }

            foreach (var i in callRes.ResultData.ResultPage)
            {
                Console.WriteLine("ID = {0}, Name = {1}, Guid = {2}, last_modified = {3}", i.ID, i.Name, i.SurveyGuid, i.LastModified);
            }
        }

        private static string getString(string prompt)
        {
            string res = null;
            do
            {
                Console.WriteLine(prompt);
                res = Console.ReadLine();
            } while (string.IsNullOrEmpty(res));
            return res;
        }

        private static int getInt(string prompt)
        {
            int res = 0;
            do
            {
                Console.WriteLine(prompt);
            } while (!int.TryParse(Console.ReadLine(), out res));
            return res;
        }

        private static string authenticate()
        {
            var authenticationService = new AuthenticationService();
            authenticationService.Url = ConfigurationManager.AppSettings["CheckboxRoot"] + "/Services/AuthenticationService.svc/soap";
            var callRes = authenticationService.Login(ConfigurationManager.AppSettings["User"], ConfigurationManager.AppSettings["Password"]);

            if (callRes.CallSuccess)
            {
                return callRes.ResultData;
            }
            else
                throw new Exception(callRes.FailureMessage);
        }
    }
}

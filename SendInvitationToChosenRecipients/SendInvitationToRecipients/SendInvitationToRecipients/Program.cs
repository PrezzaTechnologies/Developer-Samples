using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Configuration;

namespace SendInvitationToRecipients
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                string ticket = authenticate();

                if (!listInvitations(ticket))
                    return;

                do
                {
                    var invitationId = getInt("Input InvitationID, a positive integer number.");

                    var filter = getString("Input filter: Valid values are \"Pending\", \"Deleted\", \"Current\", \"OptOut\", \"Responded\", \"NotResponded\"");

                    if (!listRecipients(ticket, invitationId, filter))
                    {
                        Console.WriteLine("No recipients found for the filter {0}", filter);
                        continue;
                    }

                    var emails = getString("Input comma-separated email addresses");

                    var invitationType = getString("Input invitation type: i[nvitation] or r[eminder].");
                    inviteRecipients(ticket, invitationId, "r".Equals(invitationType) ? "Reminder" : "Invitation", emails);
                }
                while (getString("Continue? y/n").Equals("y"));

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
#if DEBUG
            Console.ReadKey();
#endif
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

        private static bool listInvitations(string ticket)
        {
            bool res = false;
            InvitationManagementService invitationService = new InvitationManagementService();
            invitationService.Url = ConfigurationManager.AppSettings["CheckboxRoot"] + "/Services/InvitationManagementService.svc/soap";
            var callRes = invitationService.ListInvitations(ticket, int.Parse(ConfigurationManager.AppSettings["SurveyID"]), true, 0, false, 0, false, null, false, false, null, null);

            if (!callRes.CallSuccess)
            {
                throw new Exception(callRes.FailureMessage);
            }

            foreach (var i in callRes.ResultData.ResultPage)
            {
                res = true;
                Console.WriteLine("Invitation ID = {0}, Name = {1}", i.DatabaseId, i.Name);
            }

            return res;
        }

        private static bool listRecipients(string ticket, int invitationId, string filter)
        {
            bool res = false;
            InvitationManagementService invitationService = new InvitationManagementService();
            invitationService.Url = ConfigurationManager.AppSettings["CheckboxRoot"] + "/Services/InvitationManagementService.svc/soap";
            var callRes = invitationService.ListInvitationRecipients(ticket, invitationId, true, filter, null, 0, false, 0, false);

            if (!callRes.CallSuccess)
            {
                throw new Exception(callRes.FailureMessage);
            }

            Console.WriteLine("Recipents recieved: {0}", callRes.ResultData.ResultPage.Length);

            foreach (var i in callRes.ResultData.ResultPage)
            {
                res = true;
                Console.WriteLine("ID = {0}, Email = {1}, UserName = {2} {3} {4} {5}", i.DatabaseId, i.EmailToAddress, i.UserName, 
                    i.SuccessfullySent ? "Sent": "Not Sent",
                    i.HasResponded ? "Responded" : "Not Responded",
                    i.OptedOut ? "Opted Out": "");
            }

            return res;
        }

        private static void inviteRecipients(string ticket, int invitationId, string invitationType, string emails)
        {
            InvitationManagementService invitationService = new InvitationManagementService();
            invitationService.Url = ConfigurationManager.AppSettings["CheckboxRoot"] + "/Services/InvitationManagementService.svc/soap";
            var callRes = invitationService.SendInvitationToRecipientList(ticket, invitationId, true, emails, invitationType);

            if (!callRes.CallSuccess)
            {
                throw new Exception(callRes.FailureMessage);
            }

            foreach (var i in callRes.ResultData.NameValueList)
            {                
                Console.WriteLine("{0} -> {1}", i.Name, i.Value);
            }
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

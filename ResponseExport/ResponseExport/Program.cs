using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using ResponseExport.ServiceClientWrappers;

namespace ResponseExport
{
    class Program
    {
        static void Main(string[] args)
        {
            string surveyName, userName, authName, authPwd;
            ParseArgs(args, out authName, out authPwd, out surveyName, out userName);

            var surveyClient = new SurveyMgmtSvc();
            var responseDataClient = new ResponseSvc();
            var authClient = new AuthSvc();

            var authTicket = authClient.Authenticate(authName, authPwd);
            if (string.IsNullOrWhiteSpace(authTicket))
            {
                Console.WriteLine(
                    "A valid authentication ticket could not be acquired.  Please try a different user name and password combination.");
                Environment.Exit(1);
            }

            var id = surveyClient.GetSurveyIdByName(authTicket, surveyName);
            if(!id.HasValue)
            {
                Console.WriteLine("A valid survey id was not returned.  Please try a different survey name.");
                Environment.Exit(1);
            }

            var responseGuid = responseDataClient.GetResponseGuidForUser(authTicket, id.Value, userName);
            if(!responseGuid.HasValue)
            {
                Console.WriteLine("A valid response guid was not returned for the specified respondent.  Please make sure a respondent exists with that unique identifier and that the respondent has responded to the survey.");
                Environment.Exit(1);
            }

            var responseItems = responseDataClient.GetAnswersForResponseByGuid(authTicket, id.Value, "en-US",
                                                                                 responseGuid.Value);

            foreach(var item in responseItems)
            {
                var itemAnswer = new StringBuilder();
                Console.WriteLine(item.Alias);

                foreach(var answer in item.Answers)
                {
                    if (answer.OptionId.HasValue && !string.IsNullOrWhiteSpace(answer.AnswerText))
                    {
                        itemAnswer.Append("Other: " + answer.AnswerText + ", ");
                    }

                    if (answer.OptionId.HasValue)
                    {
                        itemAnswer.Append(answer.OptionText + ", ");
                        continue;
                    }

                    if (!string.IsNullOrWhiteSpace(answer.AnswerText))
                        itemAnswer.Append(answer.AnswerText + ", ");
                }

                Console.WriteLine(itemAnswer.ToString());
                Console.WriteLine();
            }
            
            Environment.Exit(1);
        }

        private static void ParseArgs(IList<string> args, out string authName, out string authPwd, out string surveyName, out string userName)
        {
            const string s = "/h";
            const string r = "/help";

            var showHelp = args.Any(s1 => s1.Contains(s) || s1.Contains(r));

            if(showHelp)
            {
                Console.WriteLine("Usage:   ResponseTest.exe {authName} {authPwd} {surveyName} {respondentName}");
                Console.WriteLine("------");
                Console.WriteLine("{authName}: user name for retrieving authentication ticket");
                Console.WriteLine("{authPwd}: password for retrieving authentication ticket");
                Console.WriteLine("{surveyName}: name of the survey to which the specified respondent respondend");
                Console.WriteLine("{respondentName}: unique identifier of the respondent");

                Environment.Exit(1);
            }

            authName = args[0];
            authPwd = args[1];
            surveyName = args[2];
            userName = args[3];
        }
    }
}

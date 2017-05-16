using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Policy;
using System.Text;
using System.Threading.Tasks;
using ResponseExport_Console.AuthService;
using ResponseExport_Console.Models;
using ResponseExport_Console.RespService;
using ResponseData = ResponseExport_Console.Models.ResponseData;

namespace ResponseExport_Console
{
    class Program
    {
        static void Main(string[] args)
        {
            var authenticationServiceClient = new AuthenticationServiceClient();
            var responseDataServiceClient = new ResponseDataServiceClient();
            var sampleDataEntities = new SampleDatabaseEntities();

            var authToken = authenticationServiceClient.Login("username", "password").ResultData;

            if (string.IsNullOrWhiteSpace(authToken)) return;

            var responses = responseDataServiceClient.ExportResponsesTabular(
                authToken, 1130, 0, 100, null, null, string.Empty, true, 0, DateTime.UtcNow.AddDays(-1),
                DateTime.UtcNow, true, true, true, true, true, true, true, true, true, false);

            if (!responses.CallSuccess) return;

            foreach (var response in responses.ResultData.ResultPage.Responses)
            {
                var responseData = new ResponseData
                {
                    ResponseId = int.Parse(response.NameValueList.First(x => x.Name == "Id").Value),
                    Invitee = response.NameValueList.First(x => x.Name == "Invitee").Value,
                    Ended = DateTime.Parse(response.NameValueList.First(x => x.Name == "CompletionDate").Value),
                    Started = DateTime.Parse(response.NameValueList.First(x => x.Name == "Started").Value),
                    IP = response.NameValueList.First(x => x.Name == "RespondentIp").Value,
                    Item1526 = response.NameValueList.First(x => x.Name == "What is your favorite color?").Value,
                    Item1527 = response.NameValueList.First(x => x.Name == "Why is this your favorite color?").Value
                };

                sampleDataEntities.ResponseDatas.Add(responseData);
            }
            sampleDataEntities.SaveChanges();
        }
    }
}

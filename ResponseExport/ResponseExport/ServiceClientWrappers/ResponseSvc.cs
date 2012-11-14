using System;
using System.Linq;
using Checkbox.Wcf.Services.Proxies;
using ResponseExport.ResponseDataService;

namespace ResponseExport.ServiceClientWrappers
{
    class ResponseSvc
    {
        private ResponseDataServiceClient Client { get; set; }

        public ResponseSvc()
        {
            Client = new ResponseDataServiceClient("BasicHttpBinding_IResponseDataService");
        }

        public Guid? GetResponseGuidForUser(string authTicket, int surveyId, string userName)
        {
            var page =
                Client.ListSurveyResponses(authTicket, surveyId, 0, 1, "UniqueIdentifier", userName, "", true).
                    GetResults();

            var firstOrDefault = page.ResultPage.FirstOrDefault();
            return firstOrDefault != null ? (Guid?)firstOrDefault.Guid : null;
        }

        public ResponseItemAnswerData[] GetAnswersForResponseByGuid(string authTicket, int surveyId, string languageCode, Guid responseGuid)
        {
            return Client.GetAnswersForResponseByGuid(authTicket, surveyId, languageCode, responseGuid).GetResults();
        }
    }
}

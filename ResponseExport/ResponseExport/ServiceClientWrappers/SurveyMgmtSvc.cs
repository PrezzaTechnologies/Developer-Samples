using ResponseExport.SurveyManagementService;

namespace ResponseExport.ServiceClientWrappers
{
    class SurveyMgmtSvc
    {
        private static SurveyManagementServiceClient Client { get; set; }

        public SurveyMgmtSvc()
        {
            Client = new SurveyManagementServiceClient("BasicHttpBinding_ISurveyManagementService");
        }

        public int? GetSurveyIdByName(string authTicket, string surveyName)
        {
            var surveyInfo = Client.GetSurveyInfoByName(authTicket, surveyName).GetResults();
            return surveyInfo.Id;
        }
    }
}

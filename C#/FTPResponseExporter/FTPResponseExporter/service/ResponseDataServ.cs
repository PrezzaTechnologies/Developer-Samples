using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Xml;
using System.Collections;
using System.ServiceModel;
using FTPResponseExporter.ResponseDataService;

namespace ResponseExporter.service
{
    public class ResponseDataServ
    {
        private static readonly String WSDL_LOCATION = "services/ResponseDataService.svc/soap";
        private ResponseDataServiceClient client;
      

        public ResponseDataServ(Uri APIUrl)
        {
            try
            {
                EndpointAddress endpoint = new EndpointAddress(APIUrl.ToString() + WSDL_LOCATION);
                client = new ResponseDataServiceClient("BasicHttpBinding_IResponseDataService", endpoint);
            }
            catch (Exception e)
            {
               Console.WriteLine("Invalid URL");
            }
            
        }

        private static IEnumerable<SimpleNameValueCollection> getServiceOperationResult(ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC serviceOpResult)
        {

            IEnumerable<SimpleNameValueCollection> simpleValueCollection = (serviceOpResult.ResultData.ResultPage.Responses).AsEnumerable();
            return simpleValueCollection;
        }
        
        public IEnumerable<SimpleNameValueCollection> exportResponses (ExportOptions exportOptions)
        {
            
                String authToken = new Authentication(exportOptions.getAPIUrl()).getAuthenticationToken(exportOptions.getUserName(), exportOptions.getPassword());
                ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC serviceOperationResult =
                    client.ExportResponsesTabular(authToken,
                    exportOptions.getSurveyId(),
                    exportOptions.getPageNumber(),
                    exportOptions.getResultsPerPage(),
                    exportOptions.getFilterField(),
                    exportOptions.getFilterValue(),
                    exportOptions.getSortField(),
                    exportOptions.getSortAscending(),
                    exportOptions.getPeriod(),
                    exportOptions.getDtStart(),
                    exportOptions.getDtEnd(),
                    exportOptions.getDetailedResponseInfo(),
                    exportOptions.getDetailedUserInfo(),
                    exportOptions.getIncludeOpenEndedResults(),
                    exportOptions.getIncludeAliases(),
                    exportOptions.getIncludeHiddenItems(),
                    exportOptions.getIncludeIncompleteResponses(),
                    exportOptions.getStripHTMLTagsFromAnswers(),
                    exportOptions.getStripHTMLTagsFromQuestions(),
                    exportOptions.getMergeAnswersForSelectMany());
              if (!serviceOperationResult.CallSuccess)
              { throw new System.ArgumentException(); }
             
            return getServiceOperationResult(serviceOperationResult);
        }

    }
}
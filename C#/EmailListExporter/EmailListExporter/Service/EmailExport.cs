using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using EmailListExporter.InviteService;
using System.ServiceModel;
using EmailListExporter.Service;

namespace EmailListExporter
{
    class EmailExport
    {
        private static readonly String WSDL_LOCATION = "Services/InvitationManagementService.svc/soap";
        private InvitationManagementServiceClient client;

        public EmailExport(Uri APIUrl)
        {
            try
            {
                EndpointAddress endpoint = new EndpointAddress(APIUrl.ToString() + WSDL_LOCATION);
                client = new InvitationManagementServiceClient("BasicHttpBinding_IInvitationManagementService", endpoint);
            }
            catch (Exception e)
            {
                Console.WriteLine("Invalid URL");
            }

        }

        private static String[] getServiceOperationResult(ServiceOperationResultOfPagedListResultOfArrayOfstringuHEDJ7DjVUqw3SxC serviceOpResult)
        {
            var emailList = serviceOpResult.ResultData.ResultPage;
            return emailList;
        }

        public String[] exportEmail(ExportOptions options)
        {
            String authToken = new Authentication(options.getAPIUrl()).getAuthenticationToken(options.getUserName(), options.getPassword());
            int emailListID = client.ListEmailPanels(authToken, "View/Use Email List", 1, 0, "", true, "Name", options.getListName()).ResultData.ResultPage.FirstOrDefault().DatabaseId;
            ServiceOperationResultOfPagedListResultOfArrayOfstringuHEDJ7DjVUqw3SxC serviceOperationResult = client.ListEmailListPanelAddresses(authToken, emailListID, options.getPageNumber(), options.getPageSize());
            if (!serviceOperationResult.CallSuccess)
            { throw new System.ArgumentException(); }

            return getServiceOperationResult(serviceOperationResult);
        }

    }
}

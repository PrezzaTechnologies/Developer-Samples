using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;




using ListUsers.UserManagementService;
using System.ServiceModel;
namespace ListUsers.service
{
    class User
    {
         private static readonly String WSDL_LOCATION = "services/UserManagementService.svc/soap"; 
        private UserManagementServiceClient client;
      

        public User(Uri APIUrl)
        {
            try
            {
                EndpointAddress endpoint = new EndpointAddress(APIUrl.ToString() + WSDL_LOCATION);
                client = new UserManagementServiceClient("BasicHttpBinding_IUserManagementService", endpoint);
               
            }
            catch (Exception e)
            {
               Console.WriteLine("Invalid URL");
            }
            
        }

        private static PagedListResultOfArrayOfUserDataVUqw3SxC getServiceOperationResult(ServiceOperationResultOfPagedListResultOfArrayOfUserDataVUqw3SxCVUqw3SxC serviceOpResult)
        {
            PagedListResultOfArrayOfUserDataVUqw3SxC users = serviceOpResult.ResultData;
            return users;
        }

        public PagedListResultOfArrayOfUserDataVUqw3SxC exportUsers(AdminOptions adminOptions)
        {
            String authToken = client.AuthenticateUser(adminOptions.getUserName(), adminOptions.getPassword()).ResultData;
            ServiceOperationResultOfPagedListResultOfArrayOfUserDataVUqw3SxCVUqw3SxC serviceOperationResult =
                client.GetUsers(authToken,
                adminOptions.getProvider(),
                adminOptions.getPageNumber(),
                adminOptions.getPageSize(),
                adminOptions.getSortField(),
                adminOptions.getSortAscending(),
                adminOptions.getFilterField(),
                adminOptions.getFilterValue());

            if (!serviceOperationResult.CallSuccess)
            { throw new System.ArgumentException(); }

            return getServiceOperationResult(serviceOperationResult);
        }
    }
}

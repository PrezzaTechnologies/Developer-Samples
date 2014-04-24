using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
using UserGroups.UserManagementService;

namespace UserGroups.Service
{
    class UserGroup
    {
        private static readonly String WSDL_LOCATION = "services/UserManagementService.svc/soap";
        private UserManagementServiceClient client;

        public UserGroup(Uri APIUrl)
        {
            try{
                EndpointAddress endpoint = new EndpointAddress(APIUrl.ToString() + WSDL_LOCATION);
                client = new UserManagementServiceClient("BasicHttpBinding_IUserManagementService", endpoint);
            }
            catch(Exception e)
            {
                Console.WriteLine("Invalid URL");
            }
        }

        private static PagedListResultOfArrayOfUserDataVUqw3SxC getServiceOperationResult(ServiceOperationResultOfPagedListResultOfArrayOfUserDataVUqw3SxCVUqw3SxC serviceOpResult)
        {
            PagedListResultOfArrayOfUserDataVUqw3SxC userGroup = serviceOpResult.ResultData;
            return userGroup;
        }

        public PagedListResultOfArrayOfUserDataVUqw3SxC exportGroup(GroupOptions options)
        {
            String authToken = client.AuthenticateUser(options.getUserName(), options.getPassword()).ResultData;
            ServiceOperationResultOfUserGroupDataVUqw3SxC servOP = client.GetUserGroupByName(authToken, options.getGroup());
            var groupID = servOP.ResultData.DatabaseId;
            ServiceOperationResultOfPagedListResultOfArrayOfUserDataVUqw3SxCVUqw3SxC  users = client.ListUserGroupMembers(authToken,groupID,options.getpageNum(),options.getpageSize(),
                options.getsortField(),options.getsortAscend(),options.getfilterField(),options.getfilterValue());
          

            if (!servOP.CallSuccess)
            { Console.WriteLine("Group Does Not Exist"); }

            return getServiceOperationResult(users);
        }
    }
}

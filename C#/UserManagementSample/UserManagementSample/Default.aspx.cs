using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net.Mime;
using System.ServiceModel.Security;
using System.Text;
using System.Web;
using System.Web.Caching;
using System.Web.UI;
using System.Web.UI.WebControls;
using UserManagementSample.AuthenticationServices;
using UserManagementSample.UserManagementServices;

namespace UserManagementSample

{
    internal class Program 
    {
        private static void Main(string[] args)
        {

            Console.WriteLine("Enter Username");
            var userName = Console.ReadLine();
            Console.WriteLine("Enter Password");
            var passWord = Console.ReadLine();
            var userToken = new HttpCookie("authInfo");
            userToken.Values["authToken"] = AuthenticateUser(userName, passWord);

            // Create a new User
            CreateUser(userToken.Values["authToken"], "bobbyD", "bd", "bd@fake.com", null, true);
            CreateUser(userToken.Values["authToken"], "William", "bill", "bill@fake.com", null, true);
            //  Change users name
            RenameUser(userToken.Values["authToken"], "bobbyD", "Robert");
            //  change password
            ChangeUserPassword(userToken.Values["authToken"], "Robert", "mypass");
            var userlist = getUsers(userToken.Values["authToken"], string.Empty, 0, 0, string.Empty, true, string.Empty,
                string.Empty, 0, string.Empty);
            Console.Write(userlist);




        }


        private static bool CreateUser(string authToken, string userName, string password, string emailAddress,
            SimpleNameValueCollection profile, bool updateIfExists)
        {
            var service = new UserManagementServiceClient();
            var result = service.CreateUser(authToken, userName, password, emailAddress, profile, updateIfExists);
            if (result.CallSuccess) return true;
            Console.WriteLine(result.FailureMessage);
            return false;
        }

        private static bool DeleteUser(string authToken, string uniqueIdentifier,
            bool deleteResponses)
        {
            var service = new UserManagementServiceClient();
            var result = service.DeleteUser(authToken, uniqueIdentifier, deleteResponses);
            if (result.CallSuccess) return true;
            Console.WriteLine(result.FailureMessage);
            return false;
        }

        private static bool RenameUser(string authToken, string uniqueIdentifier, string newUniqueIdentifier)
        {

            if (!String.IsNullOrEmpty(newUniqueIdentifier))
            {
                var service = new UserManagementServiceClient();
                var result = service.RenameUser(authToken, uniqueIdentifier, newUniqueIdentifier);

                if (result.CallSuccess) return true;
                Console.WriteLine(result.FailureMessage);
                return false;
            }
            else
            {
                Console.WriteLine("New Username is NULL or Empty");
                return false;
            }
        }

        private static bool ChangeUserPassword(string authToken, string uniqueIdentifier,
            string newPassword)
        {
            if (!String.IsNullOrEmpty(newPassword))
            {
                var service = new UserManagementServiceClient();
                var result = service.ChangeUserPassword(authToken, uniqueIdentifier, newPassword);
                if (result.CallSuccess) return true;
                Console.WriteLine(result.FailureMessage);
                return false;
            }
            else
            {
                Console.WriteLine("Password null or empty");
                return false;

            }
        }

        private static ServiceOperationResultOfPagedListResultOfArrayOfUserDataVUqw3SxCVUqw3SxC getUsers(
            string authToken, string provider, int pageNumber, int pageSize,
            string sortField, bool sortAscending, string filterField, string filterValue, int period,
            string dateFieldName)
        {
            var service = new UserManagementServiceClient();
            var result = service.GetUsers(authToken, provider, pageNumber, pageSize, sortField, sortAscending,
                filterField, filterValue);
            return result.CallSuccess ? result : null;
        }

        private static void UpdateUserProfile(string authToken, string userIdentity, SimpleNameValueCollection profile)
        {
            var service = new UserManagementServiceClient();
            var result = service.UpdateUserProfile(authToken, userIdentity, profile);
        }

        private void createUsers(string ticket, string fileName)
        {
            var reader = new StreamReader(fileName);
            string line;
            while ((line = reader.ReadLine()) != null)
            {
                var properties = line.Split(',');
                CreateUser(ticket, properties[0], properties[1], properties[2], null, false);
            }

        }


        private static string AuthenticateUser(string username, string password)
        {

            var proxy = new UserManagementServiceClient();
            var result = proxy.AuthenticateUser(username, password);

            return result.CallSuccess ? result.ResultData : result.FailureMessage;
        }




    }
}

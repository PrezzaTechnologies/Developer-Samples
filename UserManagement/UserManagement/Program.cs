using System;
using System.Collections.Generic;
using System.Linq;
using UserManagement.UserManagementService;

namespace UserManagement
{
    class Program
    {
        static void Main(string[] args)
        {
            var authenticationToken = AuthenticateUser("admin", "admin");

            //Get a list of users in a specific role
            //for this example we will get a list of system admins 
            Console.WriteLine("Get System Administrators:");
            var userList = GetUsersInRole(authenticationToken, "System Administrator", 0, 0, string.Empty, true, string.Empty, string.Empty);
            foreach (var user in userList)
            {
                Console.WriteLine(user.UniqueIdentifier);
            }

            //Get a list of users in a specific role
            //for this example we will get a list of respondents
            Console.WriteLine("Get Respondents:");
            userList = GetUsersInRole(authenticationToken, "Respondent", 0, 0, string.Empty, true, string.Empty, string.Empty);
            foreach (var user in userList)
            {
                Console.WriteLine(user.UniqueIdentifier);
            }

            //Creating a user is pretty simple, for this example we will create a Checkbox user and a network user 
            // the CreateUser() and CreateNetworkUser() will both return the userid for the newly created user
            Console.WriteLine("Creating a new user:");
            var userId = CreateUser(authenticationToken, "bwayne", "batman", "bwayne@gotham.com");

            Console.WriteLine("Creating a new network user:");
            var networkUserId = CreateNetworkUser(authenticationToken, "dgrayson", "gothm", "dgrayson@gotham.com");

            //It appears that there was a typo with my domain in the last method, next I will change the user "dgrayson" to use the correct domain name
            Console.WriteLine("Changing {0} domain to : gotham ", networkUserId);
            networkUserId = ChangeUserDomain(authenticationToken, networkUserId, "gothm", "gotham");

            //When we created the user, he only had the default roles set up, now lets make Bruce Wayne a system admin in our application
            Console.WriteLine("Assigning the System Administrator role to {0}:", userId);
            AddUserToRole(authenticationToken, userId, "System Administrator");
            
            //The password batman is not that secure, lets give Bruce a more secure password  - for this we are going to use the ChangeUserPassword() method
            Console.WriteLine("Changing {0}'s password to: batman", userId);
            ChangeUserPassword(authenticationToken, userId, "batman1");

            //The method GetUserData() will return the entire UserData object, we will use this below
            Console.WriteLine("Retrieving " + userId + "'s account details");
            var userData = GetUserData(authenticationToken, userId);

            //Lets get some of the profile information for Bruce, we can utilize the GetUserProfile() method to do this using
            //the userId value we received when creating the user. 
            Console.WriteLine("Retrieving " + userId + "'s profile");
            var profile = GetUserProfile(authenticationToken, userId);

            Console.WriteLine(string.Format("Profile information for {0}", userData.UniqueIdentifier));
            foreach (var profileEntry in profile.NameValueList)
            {
                Console.WriteLine(profileEntry.Name + " : " + profileEntry.Value);
            }

            //Now lets pull an entire list of users for our application, this will pull all Checkbox users, with no filter
            Console.WriteLine("Retrieving data for all users in the system");
            userList = GetUsers(authenticationToken, 0, 0, string.Empty, true, string.Empty, string.Empty);
            foreach (var user in userList)
            {
                Console.WriteLine(user.UniqueIdentifier);
            }

            //Sometimes we do not need the extra data, and only need the user names. The ListUserIdentities will pull a filtered list
            //of all user names in the application
            Console.WriteLine("Retrieving all user names in the system");
            var userIdentities = ListUserIdentities(authenticationToken, 0, 0, string.Empty, true, string.Empty, string.Empty);
            foreach (var userIdentitie in userIdentities)
            {
                Console.WriteLine(userIdentitie);
            }

            //Utilizing the ListUserRoles method, we can list roles for a user in the application
            //We are going to list the roles for Bruce since we have his userId value stored already
            Console.WriteLine("Lising " + userId +"'s roles");
            var roles = ListUserRoles(authenticationToken, userId);
            foreach (var role in roles)
            {
                Console.WriteLine(role);
            }

            //To search for users, we can utilize the SearchUsers() method, this method will return only a list of users that the 
            //authenticated user can see in the application, and that match the search term
            Console.WriteLine("Searching for users with the following search term: @");
            var searchResults = SearchUsers(authenticationToken, "@");
            foreach (var groupedResults in searchResults)
            {
                Console.WriteLine("Results that were matched on {0}", groupedResults.GroupKey);

                foreach (var user in groupedResults.GroupResults)
                {
                    Console.WriteLine(" - {0}", user.UniqueIdentifier);
                }
            }

            //It appears that Bruce does not have any profile information. To help utilize the piping feature in Checkbox, we should add some.
            //Using the UpdateUserProfile() method, we can submit a list of profile properties to be updated. If an old value does not exist in our key value pair
            //it will remain the same, if it exists, it will update to the new value.
            Console.WriteLine("Updating {0}'s profile. Changing Email, FirstName and LastName", userId);
            var updatedProfile = new List<KeyValuePair<string, string>>
                                                    {
                                                        new KeyValuePair<string, string>("Email", "bwayne@gotham.com"),
                                                        new KeyValuePair<string, string>("FirstName", "Bruce"),
                                                        new KeyValuePair<string, string>("LastName", "Wayne")
                                                    };
            UpdateUserProfile(authenticationToken, userId, updatedProfile);

            Console.WriteLine(UserExists(authenticationToken, userId) ? "User {0} exists." : "User {0} does not exist.", userId);
            Console.WriteLine(UserExists(authenticationToken, userId) ? "User {0} exists." : "User {0} does not exist.", new Random().Next());

            Console.WriteLine("Retrieving all available user roles in the system");
            var allAvailableroles = ListAllAvailableUserRoles(authenticationToken);
            foreach (var role in allAvailableroles)
            {
                Console.WriteLine("Role name : " + role.Name);
                foreach (var permission in role.Permissions)
                {
                    Console.WriteLine(" - {0}", permission);
                }
            }
        }

        /// <summary>
        /// Assign a role to an existing user.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="uniqueIdentifier">The id of the user to update.</param>
        /// <param name="roleName">The role being assigned to the user.</param>
        /// <returns></returns>
        private static bool AddUserToRole(string authenticationToken, string uniqueIdentifier, string roleName)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.AddUserToRole(authenticationToken, uniqueIdentifier, roleName);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            // The AddUserToRole method does not return ResultData. Return true if the operation completed successfully.
            return true;
        }

        /// <summary>
        /// Get list 
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <returns></returns>
        private static IEnumerable<RoleData> ListAllAvailableUserRoles(string authenticationToken)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.ListAllAvailableUserRoles(authenticationToken);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return new RoleData[0];
            }

            return result.ResultData;
        }

        /// <summary>
        /// Set a user's email address.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="uniqueIdentifier">The unique identifier of the user to update.</param>
        /// <param name="newEmailAddress">The new email address.</param>
        private static bool ChangeUserEmailAddress(string authenticationToken, string uniqueIdentifier, string newEmailAddress)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.ChangeUserEmailAddress(authenticationToken, uniqueIdentifier, newEmailAddress);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            // The ChangeUserPassword method does not return ResultData. Return true if the operation completed successfully.
            return true;
        }

        /// <summary>
        /// Set a user's password.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="uniqueIdentifier">The unique identifier of the user to update.</param>
        /// <param name="newPassword">The plain text new password.</param>
        private static bool ChangeUserPassword(string authenticationToken, string uniqueIdentifier, string newPassword)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.ChangeUserPassword(authenticationToken, uniqueIdentifier, newPassword);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            // The ChangeUserPassword method does not return ResultData. Return true if the operation completed successfully.
            return true;
        }

        /// <summary>
        /// Create a new user.
        /// Because no roles or permissions are explicitly set, the new user will have the "Report Viewer" and "Respondent" role.
        /// Additionally the new user will only be able to access public surveys and reports.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="username">The new user's username.</param>
        /// <param name="password">The new user's password.</param>
        /// <param name="emailAddress">The new user's email address.</param>
        /// <param name="profileProperties">(Optional) A list of profile properties to associate with the user.</param>
        private static string CreateUser(
                                        string authenticationToken,
                                        string username,
                                        string password,
                                        string emailAddress,
                                        IList<KeyValuePair<string, string>> profileProperties = null)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var profile = BuildProfile(profileProperties);

            var result = proxy.CreateUser(
                authenticationToken,
                username,
                password,
                emailAddress,
                profile,
                true); /* When true, if a user with the same name exists, update that user. */

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Create a new network user.
        /// Because no roles or permissions are explicitly set, the new user will have the "Report Viewer" and "Respondent" role
        /// and will only be able to access public surveys and reports.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="username">The new user's username.</param>
        /// <param name="domain">The new user's domain.</param>
        /// <param name="emailAddress">The new user's email address.</param>
        /// <param name="profileProperties">(Optional) A list of profile properties to associate with the user.</param>
        private static string CreateNetworkUser(
                                            string authenticationToken,
                                            string username,
                                            string domain,
                                            string emailAddress,
                                            IList<KeyValuePair<string, string>> profileProperties = null)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var profile = BuildProfile(profileProperties);


           var result = proxy.CreateNetworkUser(
                authenticationToken,
                username,
                domain,
                emailAddress,
                profile,
                true); /*When true, if a user with the same name exists, update that user.*/

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Change a network user's domain
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="userName">The user's name.</param>
        /// <param name="oldDomain">The user current domain name.</param>
        /// <param name="newDomain">The user's new domain name.</param>
        private static string ChangeUserDomain(string authenticationToken, string userName, string oldDomain, string newDomain)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();

            var result = proxy.ChangeUserDomain(
                authenticationToken,
                userName,
                oldDomain,
                newDomain);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Delete all of the specified user's responses.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>s
        /// <param name="userIds">Array of unique identifiers of the users whose responses to delete.</param>
        /// <remarks>
        /// Responses are "soft deleted" from the database. Responses are flagged as deleted, 
        /// but rows are not removed from the ckbx_Response or ckbx_ResponseAnswers tables.
        /// </remarks>
        private static bool DeleteResponsesOfUsers(string authenticationToken, string[] userIds)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.DeleteResponsesOfUsers(authenticationToken, userIds);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            // The DeleteResponseOfUsers method does not return ResultData. Return true if the operation completed successfully.
            return true;
        }

        /// <summary>
        /// Delete the specified user.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="uniqueIdentifier">The unique identifier of the user to delete.</param>
        /// <param name="deleteResponses">Indicates whether the user's responses should be deleted as well.</param>
        /// <remarks>
        /// Users and their responses are "soft deleted" from the database. Records are flagged as deleted, but
        /// data is not removed from the database permanently.
        /// </remarks>
        private static bool DeleteUser(string authenticationToken, string uniqueIdentifier, bool deleteResponses)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.DeleteUser(authenticationToken, uniqueIdentifier, deleteResponses);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            // The DeleteUser method does not return ResultData. Return true if the operation completed successfully.
            return true;
        }


        /// <summary>
        /// Delete multiple users.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="userIds">Array of unique identifiers of the users to delete.</param>
        /// <param name="deleteResponses">Indicates whether the user's responses should be deleted as well.</param>
        /// <returns></returns>
        /// <remarks>
        /// Users and their responses are "soft deleted" from the database. Records are flagged as deleted, but
        /// data is not removed from the database permanently.
        /// </remarks>
        private static bool DeleteUsers(string authenticationToken, string[] userIds, bool deleteResponses)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.DeleteUsers(authenticationToken, userIds, deleteResponses);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            // The DeleteUsers method does not return ResultData. Return true if the operation completed successfully.
            return true;
        }

        /// <summary>
        /// Delete a user's profile.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="uniqueIdentifier">The unique identifiers of the users whose profile is being deleted.</param>
        /// <returns></returns>
        private static bool DeleteUserProfile(string authenticationToken, string uniqueIdentifier)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.DeleteUserProfile(authenticationToken, uniqueIdentifier);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            // The DeleteUserProfile method does not return ResultData. Return true if the operation completed successfully.
            return true;
        }

        /// <summary>
        /// Get a user account's details. The returned object contains username, email address, account id, roles, group memberships and profile data.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="uniqueIdentifier">The unique identifiers of the user.</param>
        /// <returns></returns>
        private static UserData GetUserData(string authenticationToken, string uniqueIdentifier)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
           var result = proxy.GetUserData(authenticationToken, uniqueIdentifier);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Get a user's profile
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="uniqueIdentifier">The unique identifiers of the user.</param>
        /// <returns></returns>
        private static SimpleNameValueCollection GetUserProfile(string authenticationToken, string uniqueIdentifier)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.GetUserProfile(authenticationToken, uniqueIdentifier);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Get a paged, sorted, and filtered list of UserData objects.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="pageNumber">The index of the first page to begin retrieving results from. Specifying 0 disables pagination.</param>
        /// <param name="pageSize">The number of results to display on a page. Specifying 0 disables pagination.</param>
        /// <param name="sortField">The field used when sorting results. Specifying null disables sorting.</param>
        /// <param name="sortAscending">The sort direction.</param>
        /// <param name="filterField">The field to use when filtering results. Specifying null disables filtering.</param>
        /// <param name="filterValue">Filter criteria. Specifying null disables filtering.</param>
        /// <returns>List of user data matching filters (or all identities if filter values are null).</returns>
        private static IEnumerable<UserData> GetUsers(
                                        string authenticationToken,
                                        int pageNumber = 0,
                                        int pageSize = 0,
                                        string sortField = null,
                                        bool sortAscending = true,
                                        string filterField = null,
                                        string filterValue = null)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.GetUsers(
                                                                                    authenticationToken, 
                                                                                    null,
                                                                                    pageNumber, 
                                                                                    pageSize, 
                                                                                    sortField, 
                                                                                    sortAscending, 
                                                                                    filterField, 
                                                                                    filterValue);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData.ResultPage;
        }

        /// <summary>
        /// Get a paged, sorted, and filtered list of UserData objects.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="role"></param>
        /// <param name="pageNumber">The index of the first page to begin retrieving results from. Specifying 0 disables pagination.</param>
        /// <param name="pageSize">The number of results to display on a page. Specifying 0 disables pagination.</param>
        /// <param name="sortField">The field used when sorting results. Specifying null disables sorting.</param>
        /// <param name="sortAscending">The sort direction.</param>
        /// <param name="filterField">The field to use when filtering results. Specifying null disables filtering.</param>
        /// <param name="filterValue">Filter criteria. Specifying null disables filtering.</param>
        /// <returns>List of user data matching filters (or all identities if filter values are null).</returns>
        private static IEnumerable<UserData> GetUsersInRole(
                                        string authenticationToken,
                                        string role,
                                        int pageNumber = 0,
                                        int pageSize = 0,
                                        string sortField = null,
                                        bool sortAscending = true,
                                        string filterField = null,
                                        string filterValue = null)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.GetUsersInRole(
                                                                                    authenticationToken,
                                                                                    role,
                                                                                    pageNumber,
                                                                                    pageSize,
                                                                                    sortField,
                                                                                    sortAscending,
                                                                                    filterField,
                                                                                    filterValue);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData.ResultPage;
        }
        /// <summary>
        /// Get a paged, sorted, and filtered list of user identities.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="pageNumber">The index of the first page to begin retrieving results from. Specifying 0 disables pagination.</param>
        /// <param name="pageSize">The number of results to display on a page. Specifying 0 disables pagination.</param>
        /// <param name="sortField">The field used when sorting results. Specifying null disables sorting..</param>
        /// <param name="sortAscending">The sort direction.</param>
        /// <param name="filterField">The field to use when filtering results. Specifying null disables filtering.</param>
        /// <param name="filterValue">Filter criteria. Specifying null disables filtering.</param>
        /// <returns>List of user identities matching filters (or all identities if filter values are null).</returns>
        private static IEnumerable<string> ListUserIdentities(
                                            string authenticationToken,
                                            int pageNumber = 0,
                                            int pageSize = 0,
                                            string sortField = null,
                                            bool sortAscending = true,
                                            string filterField = null,
                                            string filterValue = null)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.ListUserIdentities(
                                                                                                authenticationToken,
                                                                                                pageNumber,
                                                                                                pageSize,
                                                                                                sortField,
                                                                                                sortAscending,
                                                                                                filterField,
                                                                                                filterValue);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData.ResultPage;
        }

        /// <summary>
        /// Retrieve the list of roles assigned to a user.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="uniqueIdentifier">The unique identifier of the user.</param>
        /// <returns></returns>
        private static IEnumerable<string> ListUserRoles(string authenticationToken, string uniqueIdentifier)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.ListUserRoles(authenticationToken, uniqueIdentifier);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Changes a user's unique identifier
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="uniqueIdentifier">The unique identifiers of the users to modify.</param>
        /// <param name="newUniqueIdentifier">The user's new unique identifier.</param>
        /// <returns></returns>
        private static string RenameUser(string authenticationToken, string uniqueIdentifier, string newUniqueIdentifier)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.RenameUser(authenticationToken, uniqueIdentifier, newUniqueIdentifier);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return string.Empty;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Find users by username and email address.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="searchTerm">The value to search for.</param>
        /// <returns></returns>
        private static IEnumerable<GroupedResultOfUserDataVUqw3SxC> SearchUsers(string authenticationToken, string searchTerm)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            
            var result = proxy.SearchUsers(authenticationToken, searchTerm);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Add new profile properties and updates existing ones.
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="uniqueIdentifier">The unique identifiers of the user to update.</param>
        /// <param name="profileProperties">The new list of profile properties to add/update.</param>
        /// <returns></returns>
        private static bool UpdateUserProfile(string authenticationToken, string uniqueIdentifier, IList<KeyValuePair<string, string>> profileProperties)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.UpdateUserProfile(authenticationToken, uniqueIdentifier, BuildProfile(profileProperties));

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            return true;
        }

        /// <summary>
        /// Checks if a user exists with the given unique identifier
        /// </summary>
        /// <param name="authenticationToken">Encrypted forms auth token identifying the requesting user.</param>
        /// <param name="uniqueIdentifier">Unique identifier to query.</param>
        /// <returns></returns>
        private static bool UserExists(string authenticationToken, string uniqueIdentifier)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.UserExists(authenticationToken, uniqueIdentifier);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            return result.ResultData;
        }

        /// <summary>
        /// A utility method used to construct a user's profile.
        /// </summary>
        /// <param name="profile">A list of profile properties.</param>
        /// <returns></returns>
        private static SimpleNameValueCollection BuildProfile(IList<KeyValuePair<string, string>> profile)
        {
            SimpleNameValueCollection userProfile = null;

            if (profile != null)
            {
                var profileProperties = new SimpleNameValue[profile.Count()];

                for (var i = 0; i < profile.Count(); i++)
                {
                    var property = profile[i];
                    profileProperties[i] = new SimpleNameValue { Name = property.Key, Value = property.Value };
                }

                userProfile = new SimpleNameValueCollection { NameValueList = profileProperties };
            }

            return userProfile;
        }

        /// <summary>
        /// Retrieve the authentication token required to make web service requests.
        /// </summary>
        /// <param name="username">The name of the user to authenticate.</param>
        /// <param name="password">The user's password.</param>
        /// <returns></returns>
        private static string AuthenticateUser(string username, string password)
        {
            /* 
             * If you are unable to reference System.Service make sure that the project is configured to
             * use the full 4.0 framework and not the client profile.
             */
            var proxy = new UserManagementServiceClient();
            var result = proxy.AuthenticateUser(username, password);
           

            return result.ResultData;
        }
    }
}

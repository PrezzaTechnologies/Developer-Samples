using System;
using System.Collections.Generic;
using EmailListManagement.InvMgmt;

namespace EmailListManagement
{
    class Program
    {
        static void Main(string[] args)
        {
            string authenticationToken = AuthenticateUser("[USERNAME]", "[PASSWORD]");

            const string name = "hello world";
            const string description = "The description";
            
            // Create a new email list
            Console.WriteLine("Creating a new email list named {0}", name);
            int emailListId = CreateEmailList(authenticationToken, name, description);

            if (emailListId > 0)
            {
                Console.WriteLine(" > Successfully created email list id {0}", emailListId);
            }

            // List all email lists
            Console.WriteLine("Listing all accessible email lists {0}", name);
            const string permission = "EmailList.View";
            IEnumerable<EmailListPanelData> emailLists = ListEmailPanels(authenticationToken, permission);

            if (emailLists != null)
            {
                foreach (EmailListPanelData emailList in emailLists)
                {
                    Console.WriteLine(" > Name: '{0}' - Id: {1}", emailList.Name, emailList.DatabaseId);
                    if (emailList.Name.Equals(name))
                        emailListId = emailList.DatabaseId;
                }
            }

            // Retrieve an email lists
            Console.WriteLine("Retrieving email list id {0}", emailListId);
            EmailListPanelData emailListDetail = GetEmailListPanelInfo(authenticationToken, emailListId);

            if (emailListDetail != null)
            {
                Console.WriteLine(" > Name: '{0}' - Id: {1}", emailListDetail.Name, emailListDetail.DatabaseId);
            }

            // Copy an email list
            Console.WriteLine("Copying email list id {0}", emailListId);
            int newEmailListId = CopyEmailListPanel(authenticationToken, emailListId, description);
            if (newEmailListId > 0)
            {
                Console.WriteLine(" > Successfully copied email list id {0}. The new email list is {1}", emailListId, newEmailListId);
            }

            // Add one or more email address to an email list
            string emailAddress = "bwayne@gotham.com";
            Console.WriteLine("Adding {0} to email list id {1}", emailAddress, emailListId);
            bool success = AddEmailAddressesToEmailListPanel(authenticationToken, emailListId, new[] { emailAddress });

            if (success)
            {
                Console.WriteLine(" > Successfully added {0}", emailAddress);
            }

            // Remove one or more email address to an email list
            emailAddress = "bwayne@gotham.co";
            Console.WriteLine("Removing {0} to email list id {1}", emailAddress, emailListId);
            success = RemoveEmailAddressesFromEmailListPanel(authenticationToken, emailListId, new[] { emailAddress });

            if (success)
            {
                Console.WriteLine(" > Successfully removed {0}", emailAddress);
            }

            //List all of the addresses on an email list
            Console.WriteLine("Listing addresses in email list id {0}",  emailListId);
            IEnumerable<string> addresses = ListEmailListPanelAddresses(authenticationToken, emailListId);

            if (addresses != null)
            {
                foreach (string address in addresses)
                {
                    Console.WriteLine(" > {0}", address);
                }
            }

            //List an email list's default policy permissions
            Console.WriteLine("Listing email list id {0}'s default policy permissions", emailListId);
            string[] permissions = ListEmailListPanelDefaultPolicyPermissions(authenticationToken, emailListId);

            if (addresses != null)
            {
                foreach (string deafultPermission in permissions)
                {
                    Console.WriteLine(" > {0}", deafultPermission);
                }
            }

            //Set an email list's default policy permissions
            string[] newDefaultPermissions = new[] {"EmailList.View"};
            Console.WriteLine("Setting email list id {0}'s default policy permissions", emailListId);
            success = SetEmailListPanelDefaultPolicyPermissions(authenticationToken, emailListId, newDefaultPermissions);

            if (success)
            {
                Console.WriteLine(" > Successfully updated the email list's default permissions");
            }

            //List all of the addresses on an email list
            const int groupId = 1000;
            Console.WriteLine("Listing group id {0}'s permissions on the email list id {1}", groupId, emailListId);
            IEnumerable<string> groupPermissions = ListEmailListPanelAccessListPermissionsForGroup(authenticationToken, emailListId, groupId);

            if (groupPermissions != null)
            {
                foreach (string groupPermission in groupPermissions)
                {
                    Console.WriteLine(" > {0}", groupPermission);
                }
            }

            //List all of the addresses on an email list
            const string uniqueIdenfiier = "bwayne";
            Console.WriteLine("Listing {0}'s permissions on email list id {1}", uniqueIdenfiier, emailListId);
            IEnumerable<string> userPermissions = ListEmailListPanelAccessListPermissionsForUser(authenticationToken, emailListId, uniqueIdenfiier);

            if (userPermissions != null)
            {
                foreach (string userPermission in userPermissions)
                {
                    Console.WriteLine(" > {0}", userPermission);
                }
            }

            //Remove a user group from an email list's acl
            Console.WriteLine("Removing user group id {0} from email list id {1}'s acl", groupId, emailListId);
            success = RemoveGroupFromEmailListPanelAccessList(authenticationToken, emailListId, groupId);

            if (success)
            {
                Console.WriteLine(" > Successfully removed group id {0} from email list id {1}'s acl", groupId, emailListId);
            }

            //remove a user from an email list's acl
            emailListId = 1000;
            Console.WriteLine("Removing {0} from email list id {1}'s acl", uniqueIdenfiier, emailListId);
            success = RemoveUserFromEmailListPanelAccessList(authenticationToken, emailListId, uniqueIdenfiier);

            if (success)
            {
                Console.WriteLine(" > Successfully removed {0} from the email list {1}'s acl", uniqueIdenfiier, emailListId);
            }

            //Add a user group to an email list's acl
            permissions = new [] {"EmailList.View"};
            Console.WriteLine("Adding user group id {0} to email list id {1}'s acl", groupId, emailListId);
            success = AddGroupToEmailListPanelAccessList(authenticationToken, emailListId, groupId, permissions);

            if (success)
            {
                Console.WriteLine(" > Successfully added group id {0} to email list id {1}'s acl", groupId, emailListId);
            }

            //Add a user group to an email list's acl
            permissions = new[] { "EmailList.View" };
            Console.WriteLine("Adding user group id {0} to email list id {1}'s acl", groupId, emailListId);
            success = AddUserToEmailListPanelAccessList(authenticationToken, emailListId, uniqueIdenfiier, permissions);

            if (success)
            {
                Console.WriteLine(" > Successfully added user {0} to email list id {1}'s acl", uniqueIdenfiier, emailListId);
            }

            //Delete email list's acl
            Console.WriteLine("Adding user group id {0} to email list id {1}'s acl", groupId, emailListId);
            success = DeleteEmailListPanel(authenticationToken, emailListId);

            if (success)
            {
                Console.WriteLine(" > Successfully deleted email list id {0}'s acl", emailListId);
            }

        }

        /// <summary>
        /// Create a new email list.
        /// </summary>
        /// <param name="authenticationToken"></param>
        /// <param name="name">The name of the email list.</param>
        /// <param name="description">The new email list's description.</param>
        /// <returns></returns>
        private static int CreateEmailList(string authenticationToken, string name, string description)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.CreateEmailListPanel(authenticationToken, name, description);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return -1;
            }

            return result.ResultData.DatabaseId;
        }

        /// <summary>
        /// Get a list of email
        /// </summary>
        /// <param name="authenticationToken"></param>
        /// <param name="permission">Permission to check for on the email lists.</param>
        /// <param name="pageNumber"></param>
        /// <param name="pageSize"></param>
        /// <param name="sortField"></param>
        /// <param name="sortAscending"></param>
        /// <param name="filterField"></param>
        /// <param name="filterValue"></param>
        /// <returns>List of email list panel info objects for the panels.</returns>
        private static IEnumerable<EmailListPanelData> ListEmailPanels(string authenticationToken, 
                                                            string permission,
                                                            int pageNumber = 0,
                                                            int pageSize = 0,
                                                            string sortField = "",
                                                            bool sortAscending = true,
                                                            string filterField = "",
                                                            string filterValue = "")
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.ListEmailPanels(authenticationToken, permission, pageNumber, pageSize, sortField, sortAscending, filterField, filterValue);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData.ResultPage;
        }

        /// <summary>
        /// Get a lightweight information object for the specified email list panel.
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="id">ID of the email list panel to get.</param>
        private static EmailListPanelData GetEmailListPanelInfo(string authenticationToken, int id)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.GetEmailListPanelInfo(authenticationToken, id);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Create a new email list.
        /// </summary>
        /// <param name="authenticationToken"></param>
        /// <param name="id"></param>
        /// <param name="languageCode"></param>
        /// <returns></returns>
        private static int CopyEmailListPanel(string authenticationToken, int id, string languageCode = "en-US")
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.CopyEmailListPanel(authenticationToken, id, languageCode);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return -1;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Add the specified email addresses to an email list panel.
        /// </summary>
        /// <param name="authenticationToken"></param>
        /// <param name="emailListId">ID of the panel to add addresses to</param>
        /// <param name="emailAddresses">Addresses to add to the panel.</param>
        private static bool AddEmailAddressesToEmailListPanel(string authenticationToken, int emailListId, string[] emailAddresses)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.AddEmailAddressesToEmailListPanel(authenticationToken, emailListId, emailAddresses);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            return true;
        }

        /// <summary>
        /// Remove the specified email addresses from an email list panel
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="emailListId">ID of the panel to remove email addresses from.</param>
        /// <param name="emailAddresses">Email addresses to remove from the panel.</param>
        private static bool RemoveEmailAddressesFromEmailListPanel(string authenticationToken, int emailListId, string[] emailAddresses)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.RemoveEmailAddressesFromEmailListPanel(authenticationToken, emailListId, emailAddresses);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            return true;
        }

        /// <summary>
        /// List the email addresses contained in an email list panel.
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="emailListId">ID of the email list panel.</param>
        /// <returns>List of email addresses in the panel.</returns>
        private static IEnumerable<string> ListEmailListPanelAddresses(string authenticationToken, int emailListId)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.ListEmailListPanelAddresses(authenticationToken, emailListId, -1, -1);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData.ResultPage;
        }

        /// <summary>
        /// Get a list of permissions set on the default policy of an email list panel.
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="emailListId">ID of the email list panel to get the default policy permissions for.</param>
        /// <returns>List of permissions on the email list panel's default policy.</returns>
        private static string[] ListEmailListPanelDefaultPolicyPermissions(string authenticationToken, int emailListId)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.ListEmailListPanelDefaultPolicyPermissions(authenticationToken, emailListId);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Set the default policy permissions for an email list panel.
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="emailListId">ID of the email list panel to set default policy permissions for.</param>
        /// <param name="permissions">Permissions to set on the default policy.</param>
        private static bool SetEmailListPanelDefaultPolicyPermissions(string authenticationToken, int emailListId, string[] permissions)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.SetEmailListPanelDefaultPolicyPermissions(authenticationToken, emailListId, permissions);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            return true;
        }

        /// <summary>
        /// List the ACL permissions that a given user group has on an email list panel.
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="emailListId">ID of the email list panel.</param>
        /// <param name="userGroupId">ID of the user group to list acl permissions for.</param>
        private static IEnumerable<string> ListEmailListPanelAccessListPermissionsForGroup(string authenticationToken, int emailListId, int userGroupId)
        {
            var proxy = new InvitationManagementServiceClient();
            var result = proxy.ListEmailListPanelAccessListPermissionsForGroup(authenticationToken, emailListId, userGroupId);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData;
        }

        /// <summary>
        /// List the ACL permissions that a given user has on an email list panel.
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="emailListId">ID of the email list panel.</param>
        /// <param name="uniqueIdentifier">Unique identifier of the user get the permissions list for.</param>
        private static IEnumerable<string> ListEmailListPanelAccessListPermissionsForUser(string authenticationToken, int emailListId, string uniqueIdentifier)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.ListEmailListPanelAccessListPermissionsForUser(authenticationToken, emailListId, uniqueIdentifier);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData;
        }

        /// <summary>
        /// Remove a user from an email list panel's access list.
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="emailListId">ID of the email list panel.</param>
        /// <param name="uniqueIdentifier">Unique identifier of the user to remove from the access list.</param>
        private static bool RemoveUserFromEmailListPanelAccessList(string authenticationToken, int emailListId, string uniqueIdentifier)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.RemoveUserFromEmailListPanelAccessList(authenticationToken, emailListId, uniqueIdentifier);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            return true;
        }

        /// <summary>
        /// Remove a user group from an email list panel's access list.
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="emailListId">ID of the email list panel.</param>
        /// <param name="userGroupId">ID of the user group to remove a user from.</param>
        private static bool RemoveGroupFromEmailListPanelAccessList(string authenticationToken, int emailListId, int userGroupId)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.RemoveGroupFromEmailListPanelAccessList(authenticationToken, emailListId, userGroupId);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            return true;
        }

        /// <summary>
        /// Add a user to an email list panel's access list with the specified permissions.  If the user is already
        /// on the access list, the user's permissions will be updated to match the passed-in permissions.
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="emailListId">ID of the email list panel.</param>
        /// <param name="uniqueIdentifier">Unique identifier of the user to add to the access list.</param>
        /// <param name="permissions">Permissions to set on the access list for the user.</param>
        private static bool AddUserToEmailListPanelAccessList(string authenticationToken, int emailListId, string uniqueIdentifier, string[] permissions)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.AddUserToEmailListPanelAccessList(authenticationToken, emailListId, uniqueIdentifier, permissions);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            return true;
        }

        /// <summary>
        /// Add a user group to an email list panel's access list with the specified permissions.  If the user group is already
        /// on the access list, the user group's permissions will be updated to match the passed-in permissions.
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="emailListId">ID of the email list panel.</param>
        /// <param name="userGroupId">ID of the user group to add to the access list.</param>
        /// <param name="permissions">Permissions to set on the access list for the user group.</param>
        private static bool AddGroupToEmailListPanelAccessList(string authenticationToken, int emailListId, int userGroupId, string[] permissions)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.AddGroupToEmailListPanelAccessList(authenticationToken, emailListId, userGroupId, permissions);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            return true;
        }

        /// <summary>
        /// Delete the specified email list panels
        /// </summary>
        /// <param name="authenticationToken">Authentication ticket identifying calling user.</param>
        /// <param name="emailListId">ID list of the email list panels to delete.</param>
        /// <returns></returns>
        private static bool DeleteEmailListPanel(string authenticationToken, int emailListId)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.DeleteEmailListPanel(authenticationToken, emailListId);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return false;
            }

            return true;
        }

        /// <summary>
        /// Retrieve the authentication token required to make web service requests.
        /// </summary>
        /// <param name="username">The name of the user to authenticate.</param>
        /// <param name="password">The user's password.</param>
        /// <returns></returns>
        private static string AuthenticateUser(string username, string password)
        {

            var proxy = new InvitationManagementServiceClient();
            var result = proxy.AuthenticateUser(username, password);

            return result.ResultData;
        }
    }
}

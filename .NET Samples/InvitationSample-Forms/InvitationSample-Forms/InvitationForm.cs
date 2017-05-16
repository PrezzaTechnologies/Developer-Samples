using System;
using System.Windows.Forms;
using InvitationSample_Forms.authService;
using InvitationSample_Forms.invService;

namespace InvitationSample_Forms
{
    public partial class InvitationForm : Form
    {
        readonly InvitationManagementServiceClient _invitationManagementServiceClient = new InvitationManagementServiceClient();
        readonly AuthenticationServiceClient _authenticationServiceClient = new AuthenticationServiceClient();
        public InvitationForm()
        {
            InitializeComponent();
        }

        private void btnSend_Click(object sender, EventArgs e)
        {
            if (!string.IsNullOrWhiteSpace(txtEmail.Text))
            {
                var authToken = _authenticationServiceClient.Login("username", "password").ResultData;

                if (!string.IsNullOrWhiteSpace(authToken))
                {
                    var newInvitation = _invitationManagementServiceClient.CreateInvitation(authToken, 1129, "Api Test Invitation").ResultData;
                    Logger($"Created new invitation with id {newInvitation.DatabaseId}");

                    newInvitation.Body =
                        "You have been invited to take the survey: Invitation API Test.<br /><br /><a href=\"@@SURVEY_URL_PLACEHOLDER__DO_NOT_ERASE\">Click here</a>&nbsp;to take the survey.<br /><br />===================================<br /><a id=\"unsubscribeLink\" href=\"@@OPT_OUT_PLACEHOLDER__DO_NOT_ERASE\">Unsubscribe from this list</a><br /><br />Our mailing address is:<br />@@FooterCompany<br />@@FooterAddress1<br />@@FooterAddress2<br />@@FooterCity, @@FooterState @@FooterPostCode<br />@@FooterCountry";
                    newInvitation.FromAddress = "support@checkbox.com";
                    newInvitation.FromName = "Checkbox Support";
                    newInvitation.IncludeOptOut = true;
                    newInvitation.ReminderBody = $"Reminder : {newInvitation.Body}";
                    newInvitation.Subject = $"Reminder : {newInvitation.Subject}";
                    
                    _invitationManagementServiceClient.UpdateInvitation(authToken, newInvitation);
                    Logger($"Updated invitation with id {newInvitation.DatabaseId}");

                    _invitationManagementServiceClient.AddEmailAddressesToInvitation(authToken, newInvitation.DatabaseId,
                        new[] {txtEmail.Text});
                    Logger($"Added {txtEmail.Text} as a recipient to invitation with id {newInvitation.DatabaseId}");

                    _invitationManagementServiceClient.AddScheduledInvitationActivity(authToken, newInvitation.DatabaseId, "Invitation",
                        DateTime.UtcNow.AddMinutes(2).ToString());
                    Logger($"Scheduled invitation to be sent out :  {DateTime.UtcNow.AddMinutes(2)}");

                    _invitationManagementServiceClient.AddScheduledInvitationActivity(authToken, newInvitation.DatabaseId, "Reminder",
                        DateTime.UtcNow.AddDays(7).ToString());
                    Logger($"Scheduled reminder to be sent out :  {DateTime.UtcNow.AddDays(7)}");

                    _invitationManagementServiceClient.Close();
                    _authenticationServiceClient.Close();

                }
            }
        }

        private void Logger(string logText)
        {
            txtLog.Text += $"{DateTime.UtcNow.ToString()} : {logText} {Environment.NewLine}";
        }
    }
}

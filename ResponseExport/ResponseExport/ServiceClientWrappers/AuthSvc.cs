using ResponseExport.AuthService;

namespace ResponseExport.ServiceClientWrappers
{
    class AuthSvc
    {
        private AuthenticationServiceClient Client { get; set; }

        public AuthSvc()
        {
            Client = new AuthenticationServiceClient("BasicHttpBinding_IAuthenticationService");
        }

        public string Authenticate(string uName, string pwd)
        {
            return Client.Login(uName, pwd).GetResults();
        }

        public void Logout()
        {
            Client.Logout();
        }
    }
}

package com.checkbox.ftpresponseexporter.service;

import com.checkbox.ftpresponseexporter.Main;
import com.checkbox.ftpresponseexporter.authentication.AuthenticationService;
import com.checkbox.ftpresponseexporter.authentication.IAuthenticationService;
import com.checkbox.ftpresponseexporter.authentication.ServiceOperationResultOfstring;
import com.checkbox.ftpresponseexporter.exception.LoginFailedException;

import java.net.MalformedURLException;
import java.net.URL;



public class Authentication {

    private static final String WSDL_LOCATION = "/Services/AuthenticationService.svc?wsdl";
    private AuthenticationService service;
    private IAuthenticationService client;

    public Authentication(URL APIUrl) throws MalformedURLException {
        service = new AuthenticationService(new URL(APIUrl.toString() + WSDL_LOCATION));
        if ("https".equals(APIUrl.getProtocol())) {
            client = service.getBasicHttpBindingIAuthenticationService1();
        } else {
            client = service.getBasicHttpBindingIAuthenticationService();
        }
    }

    public String getAuthenticationToken(String userName, String password) throws LoginFailedException {
        Main.LOGGER.info(userName + " authentication...");
        ServiceOperationResultOfstring loginServiceResult = client.login(userName, password);
        if (!loginServiceResult.isCallSuccess()) {
            throw new LoginFailedException(loginServiceResult.getFailureMessage().getValue());
        }
        return loginServiceResult.getResultData().getValue();
    }
}

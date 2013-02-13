# Getting Started #
Checkbox Web Services

## Introduction ##

This guide will demonstrate how to reference and use the Checkbox Web Services using Visual Studio 2010 and C#. 

## Foundation ##

Checkbox 6 Web Services are built with the Windows Communication Foundation (WCF).  We recommend building your application using the latest version of the .NET Framework (version 4.0 at the time of this document’s release) in order to take advantage of improvements in the WCF stack. 

Each of our Web Services have a Web Services Description Language (WSDL), which informs the client how to communicate with the service. This means that the services may be accessed using a number of different clients (environments and languages, i.e. Java).  It is up to you, the developer, to reference the Web Services appropriately. 

## Changes in Checkbox Version 6 ##

If you are familiar with using Web Services in prior versions of Checkbox, it is no longer required to use the “Web Services User” role in order to access the Web Services in Checkbox version 6.  Any registered Checkbox user can be used to connect to a Web Service, but the authenticated user must have the appropriate security permissions to make any changes to Checkbox items (surveys, styles, libraries, invitations, etc.). 

There is no need to install or copy any additional files. The Web Services are all located in the Services directory of your Checkbox installation. After successfully installing the Checkbox website they will be ready to use.

## How do I know if the web services are ready to use? ##

The first thing you will want to do is ensure that your Web Services are installed correctly and can be accessed by your application. The easiest way to do that is to type a service’s URL into a web browser. 

Let’s take a look at the User Management Service by visiting the following URL:  http://[CHECKBOX URL]/Services/UserManagementService.svc  

## Adding a Service Reference ##

Now that we know our service is working, we can reference it in our project. 
Note: we are using C# and Visual Studio 2010 for this example, but you may use whatever environment or language you would like. 
<ol>
<li> Create a new project or open an existing one </li>
<li> Right click the “References” folder </li>
<li> Find and select “Add Service Reference” (for .NET Framework 3.0 and up) or “Add Web Reference” (for .NET Framework 2.0 and 1.1). </li>
<li> Enter the address for the service you want to use </li>
<li> Click “Go” </li>
<li> Select the contract you want to use </li>
<li> Enter a name for the proxy class that will be created</li> 
<li> Click “OK” </li>
 </ol>

## Consuming Your New Service Client ##

Now that the Service Reference has been successfully created it can be used in a project. 

Here is an example of what a C# code file may look like to consume the “UserManagementService” client we created. 


   	    	var proxy = new UserManagementServiceClient();
            var result = proxy.GetUsersInRole(authenticationToken,role,pageNumber,
				pageSize,sortField,sortAscending,filterField,filterValue);

            // Handle exceptions
            if (!result.CallSuccess)
            {
                Console.WriteLine(result.FailureMessage);
                return null;
            }

            return result.ResultData.ResultPage;


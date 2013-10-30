Java FTP Response Exporter
=========

Checkbox 6 Response Exporter

This project has the following advantages to the user interface export : 

  - Automatically export responses from Checkbox
  - Automatically send file exports to a FTP Site
  - Run on Linux, Windows, or Mac environments
  - Maven must be installed on the developer machine in order to modify / compile the code

Requirements
--------------

In order for this project to run correctly you must have a SSL Secured Checkbox application that matches the current released version of Checkbox. At the time of this document that version is Checkbox 6.3. This project will not work with any previous version of Checkbox.

The project can be modified using any Java IDE however it as created using IntelliJ and its references and build resources are set up to leverage the features of this IDE. Unfortunately we can not support using any other IDE to modify or build the code at this time. 

All dependencies that the project requires should be built into the FTPResponseExporter-jar-with-dependencies.jar file.

How does it work
--------------

The response exporter utilizes the Checkbox Web Services ( using a secured SSL connection ) to pull response data in the same manner that the Export Resposnes dialog in the user interface does. This means that the CSV file that is returned from the Java project should be equivelent to the data returned from the UI. All possible settings in the user interface have equivelents in the web service call and can be utilized, including a few extras.

How do I use this thing?
--------------

In order to utilize the FTP Exporter you will first want to modify to txt files which control the settings of the project. These two files should be included in the code retrieved from GitHub. The two files are : 
 - export_options.txt
 - ftp_options.txt

export_options.txt is the file that will tell the Java code where your data is, and what options to pull that data with. The file retrieved from GitHub should look like this :

```sh 
https://[CUSTOMERURL].checkboxonline.com,[USERNAME],[PASSWORD],[TEMPLATEID],1,0,StartDate,Yesterday,,true,1,9/8/2012,9/11/2014,true,true,true,true,true,true,true,true,true,[FILENAME].csv
```

You can add as many different installations, or surveys as you want to this file as long as they are seperated by line breaks. For instance if I want to export 3 surveys, 2 from the same installation and 1 from a seperate one my file would look like this :

```sh 
https://dev.checkboxonline.com,[USERNAME],[PASSWORD],1000,1,0,StartDate,Yesterday,,true,1,9/8/2012,9/11/2014,true,true,true,true,true,true,true,true,true,survey1.csv
https://dev.checkboxonline.com,[USERNAME],[PASSWORD],1001,1,0,StartDate,Yesterday,,true,1,9/8/2012,9/11/2014,true,true,true,true,true,true,true,true,true,survey2.csv
https://dev2.checkboxonline.com,[USERNAME],[PASSWORD],1000,1,0,StartDate,Yesterday,,true,1,9/8/2012,9/11/2014,true,true,true,true,true,true,true,true,true,survey3.csv
```

The meanings for each parameter are as follows :

```sh 
[api url],[username],[password],[surveyid],[pagenumber],[pagesize],[filterfield],[filtervalue],[sortfield],[sortascending],[period],[completion start date],[completion end date],[detailed response info],[detailed user info],[include open ended],[include aliases],[include hidden items],[include incomplete],[strip html tags from answers],[strip html tags from questions],[merge checkbox answers],[csv file name]
```

Although you can export as many surveys from as many installations as you want you can only send the files to a single FTP site. If you just want the files on your server and do not want to FTP them somewhere you can just leave the ftp_options.txt file the way it is and the project will simply leave the files in the directory of the jar file that exports them.

ftp_options.txt contains the template for the FTP options of the project. You can use this file to set the FTP server, username, password, and directory. The default contents of this file are :

```sh 
[HOSTNAME],[USERNAME],[PASSWORD],[DIRECTORY - use / for default]
```

Leaving the file in its default format will simply leave the files on the same server and directory that the .jar file is ran. 

I want to run this, but how?
---

Once you read through everything, updated the export_options.txt and ftp_options.txt filse and are ready to get your data you can run the FTPResponseExporter-jar-with-dependencies.jar file in the following way :

Open command prompt (or terminal for Linux users ) and navigate to the directory of the FTPResponseExporter-jar-with-dependencies.jar file. Once there enter in the following command :

```sh 
java -jar ftpresponseexporter-jar-with-dependencies.jar export_options.txt ftp_options.txt
```

This will start the export process. Note that this manner of export is slower then the user interface but should contain the same data ( it may be displayed in a different column order then the UI ). 

Once this finishes running, you should have your CSV exports. You can set up a windows scheduled task to run these on a schedule or run them whenever you want, thats up to you!


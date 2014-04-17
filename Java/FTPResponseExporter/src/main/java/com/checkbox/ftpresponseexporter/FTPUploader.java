package com.checkbox.ftpresponseexporter;

import com.checkbox.ftpresponseexporter.exception.FTPUploaderException;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FTPUploader {

    private FTPClient ftpClient = null;

    public FTPUploader(String hostname, String username, String password) throws IOException, FTPUploaderException {
        ftpClient = new FTPClient();
        ftpClient.connect(hostname);
        if (!FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
            ftpClient.disconnect();
            throw new FTPUploaderException("FTP server refused connection");
        }
        ftpClient.login(username, password);
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        ftpClient.enterLocalPassiveMode();
    }

    public void uploadFile(String fileName, String hostDirectory) throws IOException {
        Main.LOGGER.info("Uploading file to FTP...");
        try (InputStream input = new FileInputStream(new File(fileName))) {
            ftpClient.storeFile(hostDirectory + fileName, input);
        }
        Main.LOGGER.info("Done!");
    }

    public void disconnect() {
        if (ftpClient.isConnected()) {
            try {
                ftpClient.logout();
                ftpClient.disconnect();
            } catch (IOException ioe) {
                // do nothing as file is already saved on server
            }
        }
    }
}

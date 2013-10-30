package com.checkbox.ftpresponseexporter;

import com.checkbox.ftpresponseexporter.exception.ParseOptionsException;

import java.io.IOException;
import java.util.List;

public class FTPOptions {

    public static final int NUMBER_OF_OPTIONS = 4;
    private String hostname;
    private String username;
    private String password;
    private String directory;

    public FTPOptions(List<String> ftpOptionsLine) throws IOException, ParseOptionsException {
        assert ftpOptionsLine != null;

        hostname = ftpOptionsLine.get(0);
        username = ftpOptionsLine.get(1);
        password = ftpOptionsLine.get(2);
        directory = ftpOptionsLine.get(3);
    }

    public String getHostname() {
        return hostname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDirectory() {
        return directory;
    }
}

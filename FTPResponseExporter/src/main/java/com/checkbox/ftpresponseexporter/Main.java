package com.checkbox.ftpresponseexporter;

import java.util.logging.Logger;


public class Main {

    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("FTPResponseExporter is running...");

        if (args.length < 2) {
            LOGGER.info("Please pass export_options_file.txt ftp_options_file.txt as program args");
            return;
        }

        String exportOptionsFileName = args[0];
        String ftpOptionsFileName = args[1];

        FTPResponseExporter ftpResponseExporter;

        try {
            ftpResponseExporter = new FTPResponseExporter(exportOptionsFileName, ftpOptionsFileName);
            ftpResponseExporter.exportDataToFTP();
        } catch (Exception e) {
            LOGGER.severe(e.getMessage());
        }

    }

}

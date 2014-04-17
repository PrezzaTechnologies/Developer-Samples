package com.checkbox.ftpresponseexporter;

import au.com.bytecode.opencsv.CSVWriter;
import com.checkbox.ftpresponseexporter.service.ResponseData;
import org.apache.commons.io.IOUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class FTPResponseExporter {

    private List<ExportOptions> exportOptions = new ArrayList<>();
    private FTPOptions ftpOptions;

    public FTPResponseExporter(String exportOptionsFileName, String ftpOptionsFileName) throws Exception {
        Main.LOGGER.info("Setting up options...");

        List<List<String>> exportOptionsAsStringList =
                OptionsUtils.parseOptionsAsStringListFromFile(exportOptionsFileName, ExportOptions.NUMBER_OF_OPTIONS);

        for (List<String> optionsLine : exportOptionsAsStringList) {
            exportOptions.add(new ExportOptions(optionsLine));
        }

        ftpOptions = new FTPOptions(
                OptionsUtils.parseOptionsAsStringListFromFile(ftpOptionsFileName, FTPOptions.NUMBER_OF_OPTIONS).get(0));
    }

    private void writeStringResponsesToCSVFile(List<List<String>> responses, String csvFileName) throws IOException {
        assert responses != null && csvFileName != null;

        CSVWriter csvWriter = null;
        try {
            Main.LOGGER.info("Writing responses to CSV file...");
            csvWriter = new CSVWriter(new FileWriter(csvFileName));
            for (List<String> stringList : responses) {
                csvWriter.writeNext(stringList.toArray(new String[stringList.size()]));
            }
        } finally {
            IOUtils.closeQuietly(csvWriter);
        }
    }

    public void exportDataToFTP() {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (final ExportOptions expOptions : exportOptions){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    URL apiUrl = expOptions.getAPIUrl();
                    FTPUploader ftpUploader = null;
                    try {
                        ResponseData responseData = new ResponseData(apiUrl);
                        writeStringResponsesToCSVFile(responseData.exportResponses(expOptions), expOptions.getCsvFileName());
                        ftpUploader = new FTPUploader(ftpOptions.getHostname(), ftpOptions.getUsername(), ftpOptions.getPassword());
                        ftpUploader.uploadFile(expOptions.getCsvFileName(), ftpOptions.getDirectory());
                    } catch (Exception e) {
                        Main.LOGGER.severe(e.getMessage());
                    } finally {
                        if (ftpUploader != null) {
                            ftpUploader.disconnect();
                        }
                    }
                }
            });
        }
        executor.shutdown();
    }

}

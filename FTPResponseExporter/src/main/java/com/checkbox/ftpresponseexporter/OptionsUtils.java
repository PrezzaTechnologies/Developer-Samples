package com.checkbox.ftpresponseexporter;

import com.checkbox.ftpresponseexporter.exception.ParseOptionsException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class OptionsUtils {

    private OptionsUtils() {

    }

    public static List<List<String>> parseOptionsAsStringListFromFile(String fileName, int numberOfOptions)
            throws IOException, ParseOptionsException {
        assert fileName != null;

        List<List<String>> optionsAsStringList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String options;
            while ((options = br.readLine()) != null) {
                List<String> optionsList = Arrays.asList(options.split(","));
                int numberOfOptionsInList = optionsList.size();
                if (numberOfOptionsInList == numberOfOptions) {
                    optionsAsStringList.add(optionsList);
                } else {
                    Main.LOGGER.warning(
                            String.format("Line '%s' has incorrect number of options (%d instead of %d) and will be ignored!",
                                    options, numberOfOptionsInList, numberOfOptions));
                }
            }
        }

        if (optionsAsStringList.isEmpty()) {
            throw new ParseOptionsException(String.format("There is no valid options in file '%s'", fileName));
        }

        return optionsAsStringList;
    }

}

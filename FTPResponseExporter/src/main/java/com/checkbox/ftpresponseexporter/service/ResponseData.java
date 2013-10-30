package com.checkbox.ftpresponseexporter.service;

import com.checkbox.ftpresponseexporter.ExportOptions;
import com.checkbox.ftpresponseexporter.Main;
import com.checkbox.ftpresponseexporter.exception.ExportResponsesException;
import com.checkbox.ftpresponseexporter.exception.LoginFailedException;
import com.checkbox.ftpresponseexporter.responsedata.ArrayOfUserData;
import com.checkbox.ftpresponseexporter.responsedata.IResponseDataService;
import com.checkbox.ftpresponseexporter.responsedata.ResponseDataService;
import com.checkbox.ftpresponseexporter.responsedata.ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC;
import com.checkbox.ftpresponseexporter.responsedata.SimpleNameValue;
import com.checkbox.ftpresponseexporter.responsedata.SimpleNameValueCollection;
import com.checkbox.ftpresponseexporter.responsedata.TabularResponseExportData;

import javax.xml.bind.JAXBElement;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ResponseData {

    private static final String WSDL_LOCATION = "/Services/ResponseDataService.svc?wsdl";
    private ResponseDataService service;
    private IResponseDataService client;

    public ResponseData(URL APIUrl) throws MalformedURLException {
        service = new ResponseDataService(new URL(APIUrl.toString() + WSDL_LOCATION));
        if ("https".equals(APIUrl.getProtocol())) {
            client = service.getBasicHttpBindingIResponseDataService1();
        } else {
            client = service.getBasicHttpBindingIResponseDataService();
        }
    }

    private static List<List<String>> parseServiceOperationResultToListOfStrings(ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC serviceOperationResult) {
        assert serviceOperationResult != null;

        Main.LOGGER.info("Parsing data from web service...");

        JAXBElement<TabularResponseExportData> resultPage = serviceOperationResult.getResultData().getValue().getResultPage();
        List<SimpleNameValueCollection> simpleValueCollection = resultPage.getValue().getResponses().getValue().getSimpleNameValueCollection();
        ArrayOfUserData respondentsData = resultPage.getValue().getRespondents().getValue();

        if (!simpleValueCollection.isEmpty()) {

            List<List<String>> listOfStrings = new ArrayList<>();
            List<SimpleNameValue> simpleNameValueList = simpleValueCollection.get(0).getNameValueList().getValue().getSimpleNameValue();

            //adding Names
            List<String> nameList = new ArrayList<>(simpleNameValueList.size());
            for (SimpleNameValue simpleNameValue : simpleNameValueList) {
                nameList.add(simpleNameValue.getName().getValue());
            }
            nameList.addAll(UserDataUtils.getUserDataFieldsAsStringList(respondentsData));
            listOfStrings.add(nameList);

            //adding Values
            for (SimpleNameValueCollection collection : simpleValueCollection) {
                List<SimpleNameValue> nameValues = collection.getNameValueList().getValue().getSimpleNameValue();
                List<String> values = new ArrayList<>(nameValues.size());
                for (SimpleNameValue nameValue : nameValues) {
                    values.add(nameValue.getValue().getValue());
                }
                values.addAll(UserDataUtils.getDetailUserInfoByUserIdentifier(respondentsData, values.get(1)));
                listOfStrings.add(values);
            }

            return listOfStrings;

        } else {
            return Collections.emptyList();
        }
    }

    public List<List<String>> exportResponses(ExportOptions exportOptions)
            throws MalformedURLException, LoginFailedException, ExportResponsesException {
        assert exportOptions != null;

        String authToken = new Authentication(exportOptions.getAPIUrl()).getAuthenticationToken(exportOptions.getUserName(), exportOptions.getPassword());
        ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC serviceOperationResult =
                client.exportResponsesTabular(authToken,
                        exportOptions.getSurveyId(),
                        exportOptions.getPageNumber(),
                        exportOptions.getResultsPerPage(),
                        exportOptions.getFilterField(),
                        exportOptions.getFilterValue(),
                        exportOptions.getSortField(),
                        exportOptions.getSortAscending(),
                        exportOptions.getPeriod(),
                        exportOptions.getDtStart(),
                        exportOptions.getDtEnd(),
                        exportOptions.getDetailedResponseInfo(),
                        exportOptions.getDetailedUserInfo(),
                        exportOptions.getIncludeOpenEndedResults(),
                        exportOptions.getIncludeAliases(),
                        exportOptions.getIncludeHiddenItems(),
                        exportOptions.getIncludeIncompleteResponses(),
                        exportOptions.getStripHTMLTagsFromAnswers(),
                        exportOptions.getStripHTMLTagsFromQuestions(),
                        exportOptions.getMergeAnswersForSelectMany());
        if (!serviceOperationResult.isCallSuccess()) {
            throw new ExportResponsesException(serviceOperationResult.getFailureMessage().getValue());
        }
        return parseServiceOperationResultToListOfStrings(serviceOperationResult);
    }
}

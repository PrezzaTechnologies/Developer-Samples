package com.checkbox.ftpresponseexporter;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Calendar;

public class ExportOptions {

    public static final int NUMBER_OF_OPTIONS = 23;
    private static final String DATE_FORMAT_PATTERN = "MM/DD/YYYY";
    private URL APIUrl;
    private String userName;
    private String password;
    private Integer surveyId;
    private Integer pageNumber;
    private Integer resultsPerPage;
    private String filterField;
    private String filterValue;
    private String sortField;
    private Boolean sortAscending;
    private Integer period;
    private XMLGregorianCalendar dtStart;
    private XMLGregorianCalendar dtEnd;
    private Boolean detailedResponseInfo;
    private Boolean detailedUserInfo;
    private Boolean includeOpenEndedResults;
    private Boolean includeAliases;
    private Boolean includeHiddenItems;
    private Boolean includeIncompleteResponses;
    private Boolean stripHTMLTagsFromAnswers;
    private Boolean stripHTMLTagsFromQuestions;
    private Boolean mergeAnswersForSelectMany;
    private String csvFileName;

    public ExportOptions(List<String> optinonsLine) throws Exception {
        assert optinonsLine != null || optinonsLine.isEmpty();

        APIUrl = new URL(optinonsLine.get(0));
        userName = optinonsLine.get(1);
        password = optinonsLine.get(2);
        surveyId = Integer.valueOf(optinonsLine.get(3));
        pageNumber = Integer.valueOf(optinonsLine.get(4));
        resultsPerPage = Integer.valueOf(optinonsLine.get(5));
        filterField = optinonsLine.get(6);
        filterValue = optinonsLine.get(7);
        if(filterValue.equals("Yesterday")){
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -1);
            filterValue = df.format(cal.getTime());
        }
        sortField = optinonsLine.get(8);
        sortAscending = Boolean.valueOf(optinonsLine.get(9));
        period = Integer.valueOf(optinonsLine.get(10));
        dtStart = parseStringToXMLGregorianCalendar(optinonsLine.get(11), DATE_FORMAT_PATTERN);
        dtEnd = parseStringToXMLGregorianCalendar(optinonsLine.get(12), DATE_FORMAT_PATTERN);
        detailedResponseInfo = Boolean.valueOf(optinonsLine.get(13));
        detailedUserInfo = Boolean.valueOf(optinonsLine.get(14));
        includeOpenEndedResults = Boolean.valueOf(optinonsLine.get(15));
        includeAliases = Boolean.valueOf(optinonsLine.get(16));
        includeHiddenItems = Boolean.valueOf(optinonsLine.get(17));
        includeIncompleteResponses = Boolean.valueOf(optinonsLine.get(18));
        stripHTMLTagsFromAnswers = Boolean.valueOf(optinonsLine.get(19));
        stripHTMLTagsFromQuestions = Boolean.valueOf(optinonsLine.get(20));
        mergeAnswersForSelectMany = Boolean.valueOf(optinonsLine.get(21));
        csvFileName = optinonsLine.get(22);
    }

    private static XMLGregorianCalendar parseStringToXMLGregorianCalendar(String stringDate, String dateFormatPattern)
            throws DatatypeConfigurationException, ParseException {
        assert stringDate != null && dateFormatPattern != null;

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date(stringDate));
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
    }

    public URL getAPIUrl() {
        return APIUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    public String getFilterField() {
        return filterField;
    }

    public String getFilterValue() {
        return filterValue;
    }

    public String getSortField() {
        return sortField;
    }

    public Boolean getSortAscending() {
        return sortAscending;
    }

    public Integer getPeriod() {
        return period;
    }

    public XMLGregorianCalendar getDtStart() {
        return dtStart;
    }

    public XMLGregorianCalendar getDtEnd() {
        return dtEnd;
    }

    public Boolean getDetailedResponseInfo() {
        return detailedResponseInfo;
    }

    public Boolean getDetailedUserInfo() {
        return detailedUserInfo;
    }

    public Boolean getIncludeOpenEndedResults() {
        return includeOpenEndedResults;
    }

    public Boolean getIncludeAliases() {
        return includeAliases;
    }

    public Boolean getIncludeHiddenItems() {
        return includeHiddenItems;
    }

    public Boolean getIncludeIncompleteResponses() {
        return includeIncompleteResponses;
    }

    public Boolean getStripHTMLTagsFromAnswers() {
        return stripHTMLTagsFromAnswers;
    }

    public Boolean getStripHTMLTagsFromQuestions() {
        return stripHTMLTagsFromQuestions;
    }

    public Boolean getMergeAnswersForSelectMany() {
        return mergeAnswersForSelectMany;
    }

    public String getCsvFileName() {
        return csvFileName;
    }
}

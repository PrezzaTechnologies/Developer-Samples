
package com.checkbox.ftpresponseexporter.responsedata;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.checkbox.ftpresponseexporter.responsedata package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _ArrayOfSimpleNameValueCollection_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ArrayOfSimpleNameValueCollection");
    private final static QName _ArrayOfResponseData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ArrayOfResponseData");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ServiceOperationResultOfResponseAggregatedDataVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfResponseAggregatedDataVUqw3SxC");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ResponseData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResponseData");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _PagedListResultOfTabularResponseExportDataVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "PagedListResultOfTabularResponseExportDataVUqw3SxC");
    private final static QName _GroupedResultOfResponseDataVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "GroupedResultOfResponseDataVUqw3SxC");
    private final static QName _ResponseItemAnswer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResponseItemAnswer");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfResponseItemAnswer_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ArrayOfResponseItemAnswer");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ResponseExportData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResponseExportData");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC");
    private final static QName _ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC");
    private final static QName _UserData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "UserData");
    private final static QName _PagedListResultOfResponseExportDataVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "PagedListResultOfResponseExportDataVUqw3SxC");
    private final static QName _ArrayOfSimpleNameValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ArrayOfSimpleNameValue");
    private final static QName _ItemProxyObject_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ItemProxyObject");
    private final static QName _ArrayOfResponseItemAnswerData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ArrayOfResponseItemAnswerData");
    private final static QName _PagedListResultOfArrayOfResponseDataVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "PagedListResultOfArrayOfResponseDataVUqw3SxC");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _SimpleNameValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "SimpleNameValue");
    private final static QName _ReportResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ReportResult");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ArrayOfAggregateResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ArrayOfAggregateResult");
    private final static QName _ArrayOfGroupedResultOfResponseDataVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ArrayOfGroupedResultOfResponseDataVUqw3SxC");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ResponseItemAnswerData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResponseItemAnswerData");
    private final static QName _ServiceOperationResultOfstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfstring");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ServiceOperationResultOfArrayOfResponseDataVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfArrayOfResponseDataVUqw3SxC");
    private final static QName _AggregateResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "AggregateResult");
    private final static QName _ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC");
    private final static QName _ServiceOperationResultOfanyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfanyType");
    private final static QName _ResponseAggregatedData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResponseAggregatedData");
    private final static QName _SimpleNameValueCollection_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "SimpleNameValueCollection");
    private final static QName _ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC");
    private final static QName _ResponseSummaryData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResponseSummaryData");
    private final static QName _ServiceOperationResultOfResponseSummaryDataVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfResponseSummaryDataVUqw3SxC");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfUserData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ArrayOfUserData");
    private final static QName _ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOflong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOflong");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _TabularResponseExportData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "TabularResponseExportData");
    private final static QName _ExportResponsesTabularFilterField_QNAME = new QName("http://tempuri.org/", "filterField");
    private final static QName _ExportResponsesTabularSortField_QNAME = new QName("http://tempuri.org/", "sortField");
    private final static QName _ExportResponsesTabularFilterValue_QNAME = new QName("http://tempuri.org/", "filterValue");
    private final static QName _ExportResponsesTabularAuthToken_QNAME = new QName("http://tempuri.org/", "authToken");
    private final static QName _GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME = new QName("http://tempuri.org/", "authTicket");
    private final static QName _ResponseItemAnswerDataAnswers_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Answers");
    private final static QName _ResponseItemAnswerDataText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Text");
    private final static QName _ResponseItemAnswerDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Description");
    private final static QName _ResponseItemAnswerDataAlias_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Alias");
    private final static QName _GetAnswersForResponseByGuidLanguageCode_QNAME = new QName("http://tempuri.org/", "languageCode");
    private final static QName _ListSurveyResponsesByPeriodResponseListSurveyResponsesByPeriodResult_QNAME = new QName("http://tempuri.org/", "ListSurveyResponsesByPeriodResult");
    private final static QName _GetLifecycleAggregatedResponseDataInDaysResponseGetLifecycleAggregatedResponseDataInDaysResult_QNAME = new QName("http://tempuri.org/", "GetLifecycleAggregatedResponseDataInDaysResult");
    private final static QName _DeleteAllSurveyResponsesResponseDeleteAllSurveyResponsesResult_QNAME = new QName("http://tempuri.org/", "DeleteAllSurveyResponsesResult");
    private final static QName _ServiceOperationResultOfstringFailureExceptionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "FailureExceptionType");
    private final static QName _ServiceOperationResultOfstringResultData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResultData");
    private final static QName _ServiceOperationResultOfstringFailureMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "FailureMessage");
    private final static QName _ExportResponsesTabularResponseExportResponsesTabularResult_QNAME = new QName("http://tempuri.org/", "ExportResponsesTabularResult");
    private final static QName _ExportResponsesResponseExportResponsesResult_QNAME = new QName("http://tempuri.org/", "ExportResponsesResult");
    private final static QName _ResponseDataUserIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "UserIdentifier");
    private final static QName _ResponseDataNetworkUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "NetworkUser");
    private final static QName _ResponseDataRespondentIp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "RespondentIp");
    private final static QName _ResponseDataLastEditDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "LastEditDate");
    private final static QName _ResponseDataAnonymousRespondentGuid_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "AnonymousRespondentGuid");
    private final static QName _ResponseDataResponseLanguage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResponseLanguage");
    private final static QName _ResponseDataStarted_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Started");
    private final static QName _ResponseDataSurveyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "SurveyName");
    private final static QName _ResponseDataCompletionDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "CompletionDate");
    private final static QName _ResponseDataWorkflowSessionId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "WorkflowSessionId");
    private final static QName _ResponseDataInvitee_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Invitee");
    private final static QName _UpdateResponseAnswerResponseUpdateResponseAnswerResult_QNAME = new QName("http://tempuri.org/", "UpdateResponseAnswerResult");
    private final static QName _SearchResponseSearchResult_QNAME = new QName("http://tempuri.org/", "SearchResult");
    private final static QName _ListSurveyResponsesByPeriodDateFieldName_QNAME = new QName("http://tempuri.org/", "dateFieldName");
    private final static QName _ListSurveyResponsesResponseListSurveyResponsesResult_QNAME = new QName("http://tempuri.org/", "ListSurveyResponsesResult");
    private final static QName _ResponseExportDataRespondents_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Respondents");
    private final static QName _ResponseExportDataResponses_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Responses");
    private final static QName _DeleteSurveyResponsesResponseDeleteSurveyResponsesResult_QNAME = new QName("http://tempuri.org/", "DeleteSurveyResponsesResult");
    private final static QName _SearchSearchTerm_QNAME = new QName("http://tempuri.org/", "searchTerm");
    private final static QName _SimpleNameValueCollectionNameValueList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "NameValueList");
    private final static QName _ResponseAggregatedDataAggregateResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "AggregateResults");
    private final static QName _DeleteSurveyResponsesResponseList_QNAME = new QName("http://tempuri.org/", "responseList");
    private final static QName _GroupedResultOfResponseDataVUqw3SxCGroupKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "GroupKey");
    private final static QName _GroupedResultOfResponseDataVUqw3SxCGroupField_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "GroupField");
    private final static QName _GroupedResultOfResponseDataVUqw3SxCGroupResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "GroupResults");
    private final static QName _ResponseItemAnswerOptionId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "OptionId");
    private final static QName _ResponseItemAnswerPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Points");
    private final static QName _ResponseItemAnswerAnswerText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "AnswerText");
    private final static QName _ResponseItemAnswerOptionText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "OptionText");
    private final static QName _GetAnswersForResponseByGuidResponseGetAnswersForResponseByGuidResult_QNAME = new QName("http://tempuri.org/", "GetAnswersForResponseByGuidResult");
    private final static QName _ListRecentSurveyResponsesResponseListRecentSurveyResponsesResult_QNAME = new QName("http://tempuri.org/", "ListRecentSurveyResponsesResult");
    private final static QName _SimpleNameValueName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Name");
    private final static QName _SimpleNameValueValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Value");
    private final static QName _PagedListResultOfArrayOfResponseDataVUqw3SxCResultPage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResultPage");
    private final static QName _GetSurveyResponseSummaryResponseGetSurveyResponseSummaryResult_QNAME = new QName("http://tempuri.org/", "GetSurveyResponseSummaryResult");
    private final static QName _UserDataProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Profile");
    private final static QName _UserDataUniqueIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "UniqueIdentifier");
    private final static QName _UserDataAuthenticationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "AuthenticationType");
    private final static QName _UserDataEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Email");
    private final static QName _UserDataRoleMemberships_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "RoleMemberships");
    private final static QName _UserDataEscapedUniqueIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "EscapedUniqueIdentifier");
    private final static QName _UserDataGroupMemberships_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "GroupMemberships");
    private final static QName _UpdateResponseAnswerAnswerText_QNAME = new QName("http://tempuri.org/", "answerText");
    private final static QName _UpdateResponseAnswerOptionID_QNAME = new QName("http://tempuri.org/", "optionID");
    private final static QName _UpdateResponseAnswerDateCreated_QNAME = new QName("http://tempuri.org/", "dateCreated");
    private final static QName _ReportResultResultKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResultKey");
    private final static QName _ReportResultResultText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResultText");
    private final static QName _DeleteAllSurveyTestResponsesResponseDeleteAllSurveyTestResponsesResult_QNAME = new QName("http://tempuri.org/", "DeleteAllSurveyTestResponsesResult");
    private final static QName _GetLifecycleResponseDataInDaysResponseGetLifecycleResponseDataInDaysResult_QNAME = new QName("http://tempuri.org/", "GetLifecycleResponseDataInDaysResult");
    private final static QName _ItemProxyObjectTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "TypeName");
    private final static QName _ItemProxyObjectMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "Metadata");
    private final static QName _ItemProxyObjectInstanceData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "InstanceData");
    private final static QName _ItemProxyObjectAdditionalData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "AdditionalData");
    private final static QName _ItemProxyObjectAppearanceData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "AppearanceData");
    private final static QName _GetLifecycleResponseDataInMonthsResponseGetLifecycleResponseDataInMonthsResult_QNAME = new QName("http://tempuri.org/", "GetLifecycleResponseDataInMonthsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.checkbox.ftpresponseexporter.responsedata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLifecycleResponseDataInMonths }
     * 
     */
    public GetLifecycleResponseDataInMonths createGetLifecycleResponseDataInMonths() {
        return new GetLifecycleResponseDataInMonths();
    }

    /**
     * Create an instance of {@link GetLifecycleResponseDataInDays }
     * 
     */
    public GetLifecycleResponseDataInDays createGetLifecycleResponseDataInDays() {
        return new GetLifecycleResponseDataInDays();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link GetSurveyResponseSummary }
     * 
     */
    public GetSurveyResponseSummary createGetSurveyResponseSummary() {
        return new GetSurveyResponseSummary();
    }

    /**
     * Create an instance of {@link ListSurveyResponsesByPeriodResponse }
     * 
     */
    public ListSurveyResponsesByPeriodResponse createListSurveyResponsesByPeriodResponse() {
        return new ListSurveyResponsesByPeriodResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC }
     * 
     */
    public ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC createServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC() {
        return new ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC();
    }

    /**
     * Create an instance of {@link GetLifecycleAggregatedResponseDataInDaysResponse }
     * 
     */
    public GetLifecycleAggregatedResponseDataInDaysResponse createGetLifecycleAggregatedResponseDataInDaysResponse() {
        return new GetLifecycleAggregatedResponseDataInDaysResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfResponseAggregatedDataVUqw3SxC }
     * 
     */
    public ServiceOperationResultOfResponseAggregatedDataVUqw3SxC createServiceOperationResultOfResponseAggregatedDataVUqw3SxC() {
        return new ServiceOperationResultOfResponseAggregatedDataVUqw3SxC();
    }

    /**
     * Create an instance of {@link GetAnswersForResponseByGuidResponse }
     * 
     */
    public GetAnswersForResponseByGuidResponse createGetAnswersForResponseByGuidResponse() {
        return new GetAnswersForResponseByGuidResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC }
     * 
     */
    public ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC createServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC() {
        return new ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC();
    }

    /**
     * Create an instance of {@link GetLifecycleResponseDataInDaysResponse }
     * 
     */
    public GetLifecycleResponseDataInDaysResponse createGetLifecycleResponseDataInDaysResponse() {
        return new GetLifecycleResponseDataInDaysResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfstring }
     * 
     */
    public ServiceOperationResultOfstring createServiceOperationResultOfstring() {
        return new ServiceOperationResultOfstring();
    }

    /**
     * Create an instance of {@link GetAnswersForResponseByGuid }
     * 
     */
    public GetAnswersForResponseByGuid createGetAnswersForResponseByGuid() {
        return new GetAnswersForResponseByGuid();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC }
     * 
     */
    public ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC createServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC() {
        return new ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC();
    }

    /**
     * Create an instance of {@link DeleteAllSurveyTestResponses }
     * 
     */
    public DeleteAllSurveyTestResponses createDeleteAllSurveyTestResponses() {
        return new DeleteAllSurveyTestResponses();
    }

    /**
     * Create an instance of {@link ListRecentSurveyResponsesResponse }
     * 
     */
    public ListRecentSurveyResponsesResponse createListRecentSurveyResponsesResponse() {
        return new ListRecentSurveyResponsesResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfArrayOfResponseDataVUqw3SxC }
     * 
     */
    public ServiceOperationResultOfArrayOfResponseDataVUqw3SxC createServiceOperationResultOfArrayOfResponseDataVUqw3SxC() {
        return new ServiceOperationResultOfArrayOfResponseDataVUqw3SxC();
    }

    /**
     * Create an instance of {@link GetSurveyResponseSummaryResponse }
     * 
     */
    public GetSurveyResponseSummaryResponse createGetSurveyResponseSummaryResponse() {
        return new GetSurveyResponseSummaryResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfResponseSummaryDataVUqw3SxC }
     * 
     */
    public ServiceOperationResultOfResponseSummaryDataVUqw3SxC createServiceOperationResultOfResponseSummaryDataVUqw3SxC() {
        return new ServiceOperationResultOfResponseSummaryDataVUqw3SxC();
    }

    /**
     * Create an instance of {@link ListSurveyResponsesResponse }
     * 
     */
    public ListSurveyResponsesResponse createListSurveyResponsesResponse() {
        return new ListSurveyResponsesResponse();
    }

    /**
     * Create an instance of {@link ExportResponses }
     * 
     */
    public ExportResponses createExportResponses() {
        return new ExportResponses();
    }

    /**
     * Create an instance of {@link GetLifecycleResponseDataInMonthsResponse }
     * 
     */
    public GetLifecycleResponseDataInMonthsResponse createGetLifecycleResponseDataInMonthsResponse() {
        return new GetLifecycleResponseDataInMonthsResponse();
    }

    /**
     * Create an instance of {@link DeleteSurveyResponsesResponse }
     * 
     */
    public DeleteSurveyResponsesResponse createDeleteSurveyResponsesResponse() {
        return new DeleteSurveyResponsesResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfanyType }
     * 
     */
    public ServiceOperationResultOfanyType createServiceOperationResultOfanyType() {
        return new ServiceOperationResultOfanyType();
    }

    /**
     * Create an instance of {@link ListSurveyResponsesByPeriod }
     * 
     */
    public ListSurveyResponsesByPeriod createListSurveyResponsesByPeriod() {
        return new ListSurveyResponsesByPeriod();
    }

    /**
     * Create an instance of {@link UpdateResponseAnswerResponse }
     * 
     */
    public UpdateResponseAnswerResponse createUpdateResponseAnswerResponse() {
        return new UpdateResponseAnswerResponse();
    }

    /**
     * Create an instance of {@link ListRecentSurveyResponses }
     * 
     */
    public ListRecentSurveyResponses createListRecentSurveyResponses() {
        return new ListRecentSurveyResponses();
    }

    /**
     * Create an instance of {@link DeleteAllSurveyResponsesResponse }
     * 
     */
    public DeleteAllSurveyResponsesResponse createDeleteAllSurveyResponsesResponse() {
        return new DeleteAllSurveyResponsesResponse();
    }

    /**
     * Create an instance of {@link GetLifecycleAggregatedResponseDataInDays }
     * 
     */
    public GetLifecycleAggregatedResponseDataInDays createGetLifecycleAggregatedResponseDataInDays() {
        return new GetLifecycleAggregatedResponseDataInDays();
    }

    /**
     * Create an instance of {@link ExportResponsesTabular }
     * 
     */
    public ExportResponsesTabular createExportResponsesTabular() {
        return new ExportResponsesTabular();
    }

    /**
     * Create an instance of {@link ExportResponsesTabularResponse }
     * 
     */
    public ExportResponsesTabularResponse createExportResponsesTabularResponse() {
        return new ExportResponsesTabularResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC }
     * 
     */
    public ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC createServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC() {
        return new ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC();
    }

    /**
     * Create an instance of {@link DeleteSurveyResponses }
     * 
     */
    public DeleteSurveyResponses createDeleteSurveyResponses() {
        return new DeleteSurveyResponses();
    }

    /**
     * Create an instance of {@link ArrayOflong }
     * 
     */
    public ArrayOflong createArrayOflong() {
        return new ArrayOflong();
    }

    /**
     * Create an instance of {@link DeleteAllSurveyResponses }
     * 
     */
    public DeleteAllSurveyResponses createDeleteAllSurveyResponses() {
        return new DeleteAllSurveyResponses();
    }

    /**
     * Create an instance of {@link ListSurveyResponses }
     * 
     */
    public ListSurveyResponses createListSurveyResponses() {
        return new ListSurveyResponses();
    }

    /**
     * Create an instance of {@link UpdateResponseAnswer }
     * 
     */
    public UpdateResponseAnswer createUpdateResponseAnswer() {
        return new UpdateResponseAnswer();
    }

    /**
     * Create an instance of {@link ExportResponsesResponse }
     * 
     */
    public ExportResponsesResponse createExportResponsesResponse() {
        return new ExportResponsesResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC }
     * 
     */
    public ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC createServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC() {
        return new ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC();
    }

    /**
     * Create an instance of {@link DeleteAllSurveyTestResponsesResponse }
     * 
     */
    public DeleteAllSurveyTestResponsesResponse createDeleteAllSurveyTestResponsesResponse() {
        return new DeleteAllSurveyTestResponsesResponse();
    }

    /**
     * Create an instance of {@link ResponseItemAnswer }
     * 
     */
    public ResponseItemAnswer createResponseItemAnswer() {
        return new ResponseItemAnswer();
    }

    /**
     * Create an instance of {@link ResponseAggregatedData }
     * 
     */
    public ResponseAggregatedData createResponseAggregatedData() {
        return new ResponseAggregatedData();
    }

    /**
     * Create an instance of {@link ArrayOfResponseItemAnswer }
     * 
     */
    public ArrayOfResponseItemAnswer createArrayOfResponseItemAnswer() {
        return new ArrayOfResponseItemAnswer();
    }

    /**
     * Create an instance of {@link SimpleNameValueCollection }
     * 
     */
    public SimpleNameValueCollection createSimpleNameValueCollection() {
        return new SimpleNameValueCollection();
    }

    /**
     * Create an instance of {@link AggregateResult }
     * 
     */
    public AggregateResult createAggregateResult() {
        return new AggregateResult();
    }

    /**
     * Create an instance of {@link ResponseData }
     * 
     */
    public ResponseData createResponseData() {
        return new ResponseData();
    }

    /**
     * Create an instance of {@link PagedListResultOfTabularResponseExportDataVUqw3SxC }
     * 
     */
    public PagedListResultOfTabularResponseExportDataVUqw3SxC createPagedListResultOfTabularResponseExportDataVUqw3SxC() {
        return new PagedListResultOfTabularResponseExportDataVUqw3SxC();
    }

    /**
     * Create an instance of {@link GroupedResultOfResponseDataVUqw3SxC }
     * 
     */
    public GroupedResultOfResponseDataVUqw3SxC createGroupedResultOfResponseDataVUqw3SxC() {
        return new GroupedResultOfResponseDataVUqw3SxC();
    }

    /**
     * Create an instance of {@link ArrayOfGroupedResultOfResponseDataVUqw3SxC }
     * 
     */
    public ArrayOfGroupedResultOfResponseDataVUqw3SxC createArrayOfGroupedResultOfResponseDataVUqw3SxC() {
        return new ArrayOfGroupedResultOfResponseDataVUqw3SxC();
    }

    /**
     * Create an instance of {@link ArrayOfAggregateResult }
     * 
     */
    public ArrayOfAggregateResult createArrayOfAggregateResult() {
        return new ArrayOfAggregateResult();
    }

    /**
     * Create an instance of {@link ResponseItemAnswerData }
     * 
     */
    public ResponseItemAnswerData createResponseItemAnswerData() {
        return new ResponseItemAnswerData();
    }

    /**
     * Create an instance of {@link ArrayOfResponseItemAnswerData }
     * 
     */
    public ArrayOfResponseItemAnswerData createArrayOfResponseItemAnswerData() {
        return new ArrayOfResponseItemAnswerData();
    }

    /**
     * Create an instance of {@link PagedListResultOfArrayOfResponseDataVUqw3SxC }
     * 
     */
    public PagedListResultOfArrayOfResponseDataVUqw3SxC createPagedListResultOfArrayOfResponseDataVUqw3SxC() {
        return new PagedListResultOfArrayOfResponseDataVUqw3SxC();
    }

    /**
     * Create an instance of {@link ArrayOfSimpleNameValueCollection }
     * 
     */
    public ArrayOfSimpleNameValueCollection createArrayOfSimpleNameValueCollection() {
        return new ArrayOfSimpleNameValueCollection();
    }

    /**
     * Create an instance of {@link SimpleNameValue }
     * 
     */
    public SimpleNameValue createSimpleNameValue() {
        return new SimpleNameValue();
    }

    /**
     * Create an instance of {@link ArrayOfResponseData }
     * 
     */
    public ArrayOfResponseData createArrayOfResponseData() {
        return new ArrayOfResponseData();
    }

    /**
     * Create an instance of {@link ReportResult }
     * 
     */
    public ReportResult createReportResult() {
        return new ReportResult();
    }

    /**
     * Create an instance of {@link ArrayOfSimpleNameValue }
     * 
     */
    public ArrayOfSimpleNameValue createArrayOfSimpleNameValue() {
        return new ArrayOfSimpleNameValue();
    }

    /**
     * Create an instance of {@link TabularResponseExportData }
     * 
     */
    public TabularResponseExportData createTabularResponseExportData() {
        return new TabularResponseExportData();
    }

    /**
     * Create an instance of {@link ItemProxyObject }
     * 
     */
    public ItemProxyObject createItemProxyObject() {
        return new ItemProxyObject();
    }

    /**
     * Create an instance of {@link ArrayOfUserData }
     * 
     */
    public ArrayOfUserData createArrayOfUserData() {
        return new ArrayOfUserData();
    }

    /**
     * Create an instance of {@link UserData }
     * 
     */
    public UserData createUserData() {
        return new UserData();
    }

    /**
     * Create an instance of {@link PagedListResultOfResponseExportDataVUqw3SxC }
     * 
     */
    public PagedListResultOfResponseExportDataVUqw3SxC createPagedListResultOfResponseExportDataVUqw3SxC() {
        return new PagedListResultOfResponseExportDataVUqw3SxC();
    }

    /**
     * Create an instance of {@link ResponseExportData }
     * 
     */
    public ResponseExportData createResponseExportData() {
        return new ResponseExportData();
    }

    /**
     * Create an instance of {@link ResponseSummaryData }
     * 
     */
    public ResponseSummaryData createResponseSummaryData() {
        return new ResponseSummaryData();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSimpleNameValueCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ArrayOfSimpleNameValueCollection")
    public JAXBElement<ArrayOfSimpleNameValueCollection> createArrayOfSimpleNameValueCollection(ArrayOfSimpleNameValueCollection value) {
        return new JAXBElement<ArrayOfSimpleNameValueCollection>(_ArrayOfSimpleNameValueCollection_QNAME, ArrayOfSimpleNameValueCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ArrayOfResponseData")
    public JAXBElement<ArrayOfResponseData> createArrayOfResponseData(ArrayOfResponseData value) {
        return new JAXBElement<ArrayOfResponseData>(_ArrayOfResponseData_QNAME, ArrayOfResponseData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfResponseAggregatedDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfResponseAggregatedDataVUqw3SxC")
    public JAXBElement<ServiceOperationResultOfResponseAggregatedDataVUqw3SxC> createServiceOperationResultOfResponseAggregatedDataVUqw3SxC(ServiceOperationResultOfResponseAggregatedDataVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfResponseAggregatedDataVUqw3SxC>(_ServiceOperationResultOfResponseAggregatedDataVUqw3SxC_QNAME, ServiceOperationResultOfResponseAggregatedDataVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResponseData")
    public JAXBElement<ResponseData> createResponseData(ResponseData value) {
        return new JAXBElement<ResponseData>(_ResponseData_QNAME, ResponseData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagedListResultOfTabularResponseExportDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "PagedListResultOfTabularResponseExportDataVUqw3SxC")
    public JAXBElement<PagedListResultOfTabularResponseExportDataVUqw3SxC> createPagedListResultOfTabularResponseExportDataVUqw3SxC(PagedListResultOfTabularResponseExportDataVUqw3SxC value) {
        return new JAXBElement<PagedListResultOfTabularResponseExportDataVUqw3SxC>(_PagedListResultOfTabularResponseExportDataVUqw3SxC_QNAME, PagedListResultOfTabularResponseExportDataVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupedResultOfResponseDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "GroupedResultOfResponseDataVUqw3SxC")
    public JAXBElement<GroupedResultOfResponseDataVUqw3SxC> createGroupedResultOfResponseDataVUqw3SxC(GroupedResultOfResponseDataVUqw3SxC value) {
        return new JAXBElement<GroupedResultOfResponseDataVUqw3SxC>(_GroupedResultOfResponseDataVUqw3SxC_QNAME, GroupedResultOfResponseDataVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseItemAnswer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResponseItemAnswer")
    public JAXBElement<ResponseItemAnswer> createResponseItemAnswer(ResponseItemAnswer value) {
        return new JAXBElement<ResponseItemAnswer>(_ResponseItemAnswer_QNAME, ResponseItemAnswer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseItemAnswer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ArrayOfResponseItemAnswer")
    public JAXBElement<ArrayOfResponseItemAnswer> createArrayOfResponseItemAnswer(ArrayOfResponseItemAnswer value) {
        return new JAXBElement<ArrayOfResponseItemAnswer>(_ArrayOfResponseItemAnswer_QNAME, ArrayOfResponseItemAnswer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseExportData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResponseExportData")
    public JAXBElement<ResponseExportData> createResponseExportData(ResponseExportData value) {
        return new JAXBElement<ResponseExportData>(_ResponseExportData_QNAME, ResponseExportData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC")
    public JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC> createServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC(ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC>(_ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC_QNAME, ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC")
    public JAXBElement<ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC> createServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC(ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC>(_ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC_QNAME, ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "UserData")
    public JAXBElement<UserData> createUserData(UserData value) {
        return new JAXBElement<UserData>(_UserData_QNAME, UserData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagedListResultOfResponseExportDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "PagedListResultOfResponseExportDataVUqw3SxC")
    public JAXBElement<PagedListResultOfResponseExportDataVUqw3SxC> createPagedListResultOfResponseExportDataVUqw3SxC(PagedListResultOfResponseExportDataVUqw3SxC value) {
        return new JAXBElement<PagedListResultOfResponseExportDataVUqw3SxC>(_PagedListResultOfResponseExportDataVUqw3SxC_QNAME, PagedListResultOfResponseExportDataVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSimpleNameValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ArrayOfSimpleNameValue")
    public JAXBElement<ArrayOfSimpleNameValue> createArrayOfSimpleNameValue(ArrayOfSimpleNameValue value) {
        return new JAXBElement<ArrayOfSimpleNameValue>(_ArrayOfSimpleNameValue_QNAME, ArrayOfSimpleNameValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemProxyObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ItemProxyObject")
    public JAXBElement<ItemProxyObject> createItemProxyObject(ItemProxyObject value) {
        return new JAXBElement<ItemProxyObject>(_ItemProxyObject_QNAME, ItemProxyObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseItemAnswerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ArrayOfResponseItemAnswerData")
    public JAXBElement<ArrayOfResponseItemAnswerData> createArrayOfResponseItemAnswerData(ArrayOfResponseItemAnswerData value) {
        return new JAXBElement<ArrayOfResponseItemAnswerData>(_ArrayOfResponseItemAnswerData_QNAME, ArrayOfResponseItemAnswerData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagedListResultOfArrayOfResponseDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "PagedListResultOfArrayOfResponseDataVUqw3SxC")
    public JAXBElement<PagedListResultOfArrayOfResponseDataVUqw3SxC> createPagedListResultOfArrayOfResponseDataVUqw3SxC(PagedListResultOfArrayOfResponseDataVUqw3SxC value) {
        return new JAXBElement<PagedListResultOfArrayOfResponseDataVUqw3SxC>(_PagedListResultOfArrayOfResponseDataVUqw3SxC_QNAME, PagedListResultOfArrayOfResponseDataVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleNameValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "SimpleNameValue")
    public JAXBElement<SimpleNameValue> createSimpleNameValue(SimpleNameValue value) {
        return new JAXBElement<SimpleNameValue>(_SimpleNameValue_QNAME, SimpleNameValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ReportResult")
    public JAXBElement<ReportResult> createReportResult(ReportResult value) {
        return new JAXBElement<ReportResult>(_ReportResult_QNAME, ReportResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAggregateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ArrayOfAggregateResult")
    public JAXBElement<ArrayOfAggregateResult> createArrayOfAggregateResult(ArrayOfAggregateResult value) {
        return new JAXBElement<ArrayOfAggregateResult>(_ArrayOfAggregateResult_QNAME, ArrayOfAggregateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGroupedResultOfResponseDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ArrayOfGroupedResultOfResponseDataVUqw3SxC")
    public JAXBElement<ArrayOfGroupedResultOfResponseDataVUqw3SxC> createArrayOfGroupedResultOfResponseDataVUqw3SxC(ArrayOfGroupedResultOfResponseDataVUqw3SxC value) {
        return new JAXBElement<ArrayOfGroupedResultOfResponseDataVUqw3SxC>(_ArrayOfGroupedResultOfResponseDataVUqw3SxC_QNAME, ArrayOfGroupedResultOfResponseDataVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseItemAnswerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResponseItemAnswerData")
    public JAXBElement<ResponseItemAnswerData> createResponseItemAnswerData(ResponseItemAnswerData value) {
        return new JAXBElement<ResponseItemAnswerData>(_ResponseItemAnswerData_QNAME, ResponseItemAnswerData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfstring")
    public JAXBElement<ServiceOperationResultOfstring> createServiceOperationResultOfstring(ServiceOperationResultOfstring value) {
        return new JAXBElement<ServiceOperationResultOfstring>(_ServiceOperationResultOfstring_QNAME, ServiceOperationResultOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfResponseDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfArrayOfResponseDataVUqw3SxC")
    public JAXBElement<ServiceOperationResultOfArrayOfResponseDataVUqw3SxC> createServiceOperationResultOfArrayOfResponseDataVUqw3SxC(ServiceOperationResultOfArrayOfResponseDataVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfArrayOfResponseDataVUqw3SxC>(_ServiceOperationResultOfArrayOfResponseDataVUqw3SxC_QNAME, ServiceOperationResultOfArrayOfResponseDataVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "AggregateResult")
    public JAXBElement<AggregateResult> createAggregateResult(AggregateResult value) {
        return new JAXBElement<AggregateResult>(_AggregateResult_QNAME, AggregateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC")
    public JAXBElement<ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC> createServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC(ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC>(_ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC_QNAME, ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfanyType")
    public JAXBElement<ServiceOperationResultOfanyType> createServiceOperationResultOfanyType(ServiceOperationResultOfanyType value) {
        return new JAXBElement<ServiceOperationResultOfanyType>(_ServiceOperationResultOfanyType_QNAME, ServiceOperationResultOfanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseAggregatedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResponseAggregatedData")
    public JAXBElement<ResponseAggregatedData> createResponseAggregatedData(ResponseAggregatedData value) {
        return new JAXBElement<ResponseAggregatedData>(_ResponseAggregatedData_QNAME, ResponseAggregatedData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "SimpleNameValueCollection")
    public JAXBElement<SimpleNameValueCollection> createSimpleNameValueCollection(SimpleNameValueCollection value) {
        return new JAXBElement<SimpleNameValueCollection>(_SimpleNameValueCollection_QNAME, SimpleNameValueCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC")
    public JAXBElement<ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC> createServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC(ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC>(_ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC_QNAME, ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseSummaryData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResponseSummaryData")
    public JAXBElement<ResponseSummaryData> createResponseSummaryData(ResponseSummaryData value) {
        return new JAXBElement<ResponseSummaryData>(_ResponseSummaryData_QNAME, ResponseSummaryData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfResponseSummaryDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfResponseSummaryDataVUqw3SxC")
    public JAXBElement<ServiceOperationResultOfResponseSummaryDataVUqw3SxC> createServiceOperationResultOfResponseSummaryDataVUqw3SxC(ServiceOperationResultOfResponseSummaryDataVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfResponseSummaryDataVUqw3SxC>(_ServiceOperationResultOfResponseSummaryDataVUqw3SxC_QNAME, ServiceOperationResultOfResponseSummaryDataVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ArrayOfUserData")
    public JAXBElement<ArrayOfUserData> createArrayOfUserData(ArrayOfUserData value) {
        return new JAXBElement<ArrayOfUserData>(_ArrayOfUserData_QNAME, ArrayOfUserData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC")
    public JAXBElement<ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC> createServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC(ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC>(_ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC_QNAME, ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOflong")
    public JAXBElement<ArrayOflong> createArrayOflong(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_ArrayOflong_QNAME, ArrayOflong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabularResponseExportData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "TabularResponseExportData")
    public JAXBElement<TabularResponseExportData> createTabularResponseExportData(TabularResponseExportData value) {
        return new JAXBElement<TabularResponseExportData>(_TabularResponseExportData_QNAME, TabularResponseExportData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filterField", scope = ExportResponsesTabular.class)
    public JAXBElement<String> createExportResponsesTabularFilterField(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularFilterField_QNAME, String.class, ExportResponsesTabular.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sortField", scope = ExportResponsesTabular.class)
    public JAXBElement<String> createExportResponsesTabularSortField(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularSortField_QNAME, String.class, ExportResponsesTabular.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filterValue", scope = ExportResponsesTabular.class)
    public JAXBElement<String> createExportResponsesTabularFilterValue(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularFilterValue_QNAME, String.class, ExportResponsesTabular.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ExportResponsesTabular.class)
    public JAXBElement<String> createExportResponsesTabularAuthToken(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularAuthToken_QNAME, String.class, ExportResponsesTabular.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = GetLifecycleAggregatedResponseDataInDays.class)
    public JAXBElement<String> createGetLifecycleAggregatedResponseDataInDaysAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, GetLifecycleAggregatedResponseDataInDays.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filterField", scope = ExportResponses.class)
    public JAXBElement<String> createExportResponsesFilterField(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularFilterField_QNAME, String.class, ExportResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sortField", scope = ExportResponses.class)
    public JAXBElement<String> createExportResponsesSortField(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularSortField_QNAME, String.class, ExportResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filterValue", scope = ExportResponses.class)
    public JAXBElement<String> createExportResponsesFilterValue(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularFilterValue_QNAME, String.class, ExportResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = ExportResponses.class)
    public JAXBElement<String> createExportResponsesAuthToken(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularAuthToken_QNAME, String.class, ExportResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseItemAnswer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Answers", scope = ResponseItemAnswerData.class)
    public JAXBElement<ArrayOfResponseItemAnswer> createResponseItemAnswerDataAnswers(ArrayOfResponseItemAnswer value) {
        return new JAXBElement<ArrayOfResponseItemAnswer>(_ResponseItemAnswerDataAnswers_QNAME, ArrayOfResponseItemAnswer.class, ResponseItemAnswerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Text", scope = ResponseItemAnswerData.class)
    public JAXBElement<String> createResponseItemAnswerDataText(String value) {
        return new JAXBElement<String>(_ResponseItemAnswerDataText_QNAME, String.class, ResponseItemAnswerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Description", scope = ResponseItemAnswerData.class)
    public JAXBElement<String> createResponseItemAnswerDataDescription(String value) {
        return new JAXBElement<String>(_ResponseItemAnswerDataDescription_QNAME, String.class, ResponseItemAnswerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Alias", scope = ResponseItemAnswerData.class)
    public JAXBElement<String> createResponseItemAnswerDataAlias(String value) {
        return new JAXBElement<String>(_ResponseItemAnswerDataAlias_QNAME, String.class, ResponseItemAnswerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "languageCode", scope = GetAnswersForResponseByGuid.class)
    public JAXBElement<String> createGetAnswersForResponseByGuidLanguageCode(String value) {
        return new JAXBElement<String>(_GetAnswersForResponseByGuidLanguageCode_QNAME, String.class, GetAnswersForResponseByGuid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = GetAnswersForResponseByGuid.class)
    public JAXBElement<String> createGetAnswersForResponseByGuidAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, GetAnswersForResponseByGuid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListSurveyResponsesByPeriodResult", scope = ListSurveyResponsesByPeriodResponse.class)
    public JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC> createListSurveyResponsesByPeriodResponseListSurveyResponsesByPeriodResult(ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC>(_ListSurveyResponsesByPeriodResponseListSurveyResponsesByPeriodResult_QNAME, ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC.class, ListSurveyResponsesByPeriodResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfResponseAggregatedDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetLifecycleAggregatedResponseDataInDaysResult", scope = GetLifecycleAggregatedResponseDataInDaysResponse.class)
    public JAXBElement<ServiceOperationResultOfResponseAggregatedDataVUqw3SxC> createGetLifecycleAggregatedResponseDataInDaysResponseGetLifecycleAggregatedResponseDataInDaysResult(ServiceOperationResultOfResponseAggregatedDataVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfResponseAggregatedDataVUqw3SxC>(_GetLifecycleAggregatedResponseDataInDaysResponseGetLifecycleAggregatedResponseDataInDaysResult_QNAME, ServiceOperationResultOfResponseAggregatedDataVUqw3SxC.class, GetLifecycleAggregatedResponseDataInDaysResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeleteAllSurveyResponsesResult", scope = DeleteAllSurveyResponsesResponse.class)
    public JAXBElement<ServiceOperationResultOfanyType> createDeleteAllSurveyResponsesResponseDeleteAllSurveyResponsesResult(ServiceOperationResultOfanyType value) {
        return new JAXBElement<ServiceOperationResultOfanyType>(_DeleteAllSurveyResponsesResponseDeleteAllSurveyResponsesResult_QNAME, ServiceOperationResultOfanyType.class, DeleteAllSurveyResponsesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfstring.class)
    public JAXBElement<String> createServiceOperationResultOfstringFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureExceptionType_QNAME, String.class, ServiceOperationResultOfstring.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfstring.class)
    public JAXBElement<String> createServiceOperationResultOfstringResultData(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringResultData_QNAME, String.class, ServiceOperationResultOfstring.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfstring.class)
    public JAXBElement<String> createServiceOperationResultOfstringFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureMessage_QNAME, String.class, ServiceOperationResultOfstring.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ExportResponsesTabularResult", scope = ExportResponsesTabularResponse.class)
    public JAXBElement<ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC> createExportResponsesTabularResponseExportResponsesTabularResult(ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC>(_ExportResponsesTabularResponseExportResponsesTabularResult_QNAME, ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC.class, ExportResponsesTabularResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filterField", scope = ListSurveyResponses.class)
    public JAXBElement<String> createListSurveyResponsesFilterField(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularFilterField_QNAME, String.class, ListSurveyResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sortField", scope = ListSurveyResponses.class)
    public JAXBElement<String> createListSurveyResponsesSortField(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularSortField_QNAME, String.class, ListSurveyResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filterValue", scope = ListSurveyResponses.class)
    public JAXBElement<String> createListSurveyResponsesFilterValue(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularFilterValue_QNAME, String.class, ListSurveyResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = ListSurveyResponses.class)
    public JAXBElement<String> createListSurveyResponsesAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, ListSurveyResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ExportResponsesResult", scope = ExportResponsesResponse.class)
    public JAXBElement<ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC> createExportResponsesResponseExportResponsesResult(ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC>(_ExportResponsesResponseExportResponsesResult_QNAME, ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC.class, ExportResponsesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseItemAnswerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Answers", scope = ResponseData.class)
    public JAXBElement<ArrayOfResponseItemAnswerData> createResponseDataAnswers(ArrayOfResponseItemAnswerData value) {
        return new JAXBElement<ArrayOfResponseItemAnswerData>(_ResponseItemAnswerDataAnswers_QNAME, ArrayOfResponseItemAnswerData.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "UserIdentifier", scope = ResponseData.class)
    public JAXBElement<String> createResponseDataUserIdentifier(String value) {
        return new JAXBElement<String>(_ResponseDataUserIdentifier_QNAME, String.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "NetworkUser", scope = ResponseData.class)
    public JAXBElement<String> createResponseDataNetworkUser(String value) {
        return new JAXBElement<String>(_ResponseDataNetworkUser_QNAME, String.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "RespondentIp", scope = ResponseData.class)
    public JAXBElement<String> createResponseDataRespondentIp(String value) {
        return new JAXBElement<String>(_ResponseDataRespondentIp_QNAME, String.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "LastEditDate", scope = ResponseData.class)
    public JAXBElement<XMLGregorianCalendar> createResponseDataLastEditDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResponseDataLastEditDate_QNAME, XMLGregorianCalendar.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "AnonymousRespondentGuid", scope = ResponseData.class)
    public JAXBElement<String> createResponseDataAnonymousRespondentGuid(String value) {
        return new JAXBElement<String>(_ResponseDataAnonymousRespondentGuid_QNAME, String.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResponseLanguage", scope = ResponseData.class)
    public JAXBElement<String> createResponseDataResponseLanguage(String value) {
        return new JAXBElement<String>(_ResponseDataResponseLanguage_QNAME, String.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Started", scope = ResponseData.class)
    public JAXBElement<XMLGregorianCalendar> createResponseDataStarted(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResponseDataStarted_QNAME, XMLGregorianCalendar.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "SurveyName", scope = ResponseData.class)
    public JAXBElement<String> createResponseDataSurveyName(String value) {
        return new JAXBElement<String>(_ResponseDataSurveyName_QNAME, String.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "CompletionDate", scope = ResponseData.class)
    public JAXBElement<XMLGregorianCalendar> createResponseDataCompletionDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResponseDataCompletionDate_QNAME, XMLGregorianCalendar.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "WorkflowSessionId", scope = ResponseData.class)
    public JAXBElement<String> createResponseDataWorkflowSessionId(String value) {
        return new JAXBElement<String>(_ResponseDataWorkflowSessionId_QNAME, String.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Invitee", scope = ResponseData.class)
    public JAXBElement<String> createResponseDataInvitee(String value) {
        return new JAXBElement<String>(_ResponseDataInvitee_QNAME, String.class, ResponseData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UpdateResponseAnswerResult", scope = UpdateResponseAnswerResponse.class)
    public JAXBElement<ServiceOperationResultOfanyType> createUpdateResponseAnswerResponseUpdateResponseAnswerResult(ServiceOperationResultOfanyType value) {
        return new JAXBElement<ServiceOperationResultOfanyType>(_UpdateResponseAnswerResponseUpdateResponseAnswerResult_QNAME, ServiceOperationResultOfanyType.class, UpdateResponseAnswerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchResult", scope = SearchResponse.class)
    public JAXBElement<ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC> createSearchResponseSearchResult(ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC>(_SearchResponseSearchResult_QNAME, ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC.class, SearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filterField", scope = ListSurveyResponsesByPeriod.class)
    public JAXBElement<String> createListSurveyResponsesByPeriodFilterField(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularFilterField_QNAME, String.class, ListSurveyResponsesByPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sortField", scope = ListSurveyResponsesByPeriod.class)
    public JAXBElement<String> createListSurveyResponsesByPeriodSortField(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularSortField_QNAME, String.class, ListSurveyResponsesByPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filterValue", scope = ListSurveyResponsesByPeriod.class)
    public JAXBElement<String> createListSurveyResponsesByPeriodFilterValue(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularFilterValue_QNAME, String.class, ListSurveyResponsesByPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateFieldName", scope = ListSurveyResponsesByPeriod.class)
    public JAXBElement<String> createListSurveyResponsesByPeriodDateFieldName(String value) {
        return new JAXBElement<String>(_ListSurveyResponsesByPeriodDateFieldName_QNAME, String.class, ListSurveyResponsesByPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = ListSurveyResponsesByPeriod.class)
    public JAXBElement<String> createListSurveyResponsesByPeriodAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, ListSurveyResponsesByPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListSurveyResponsesResult", scope = ListSurveyResponsesResponse.class)
    public JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC> createListSurveyResponsesResponseListSurveyResponsesResult(ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC>(_ListSurveyResponsesResponseListSurveyResponsesResult_QNAME, ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC.class, ListSurveyResponsesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Respondents", scope = ResponseExportData.class)
    public JAXBElement<ArrayOfUserData> createResponseExportDataRespondents(ArrayOfUserData value) {
        return new JAXBElement<ArrayOfUserData>(_ResponseExportDataRespondents_QNAME, ArrayOfUserData.class, ResponseExportData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Responses", scope = ResponseExportData.class)
    public JAXBElement<ArrayOfResponseData> createResponseExportDataResponses(ArrayOfResponseData value) {
        return new JAXBElement<ArrayOfResponseData>(_ResponseExportDataResponses_QNAME, ArrayOfResponseData.class, ResponseExportData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = DeleteAllSurveyTestResponses.class)
    public JAXBElement<String> createDeleteAllSurveyTestResponsesAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, DeleteAllSurveyTestResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfanyType.class)
    public JAXBElement<String> createServiceOperationResultOfanyTypeFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureExceptionType_QNAME, String.class, ServiceOperationResultOfanyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfanyType.class)
    public JAXBElement<Object> createServiceOperationResultOfanyTypeResultData(Object value) {
        return new JAXBElement<Object>(_ServiceOperationResultOfstringResultData_QNAME, Object.class, ServiceOperationResultOfanyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfanyType.class)
    public JAXBElement<String> createServiceOperationResultOfanyTypeFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureMessage_QNAME, String.class, ServiceOperationResultOfanyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = GetLifecycleResponseDataInDays.class)
    public JAXBElement<String> createGetLifecycleResponseDataInDaysAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, GetLifecycleResponseDataInDays.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxCFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureExceptionType_QNAME, String.class, ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGroupedResultOfResponseDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<ArrayOfGroupedResultOfResponseDataVUqw3SxC> createServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxCResultData(ArrayOfGroupedResultOfResponseDataVUqw3SxC value) {
        return new JAXBElement<ArrayOfGroupedResultOfResponseDataVUqw3SxC>(_ServiceOperationResultOfstringResultData_QNAME, ArrayOfGroupedResultOfResponseDataVUqw3SxC.class, ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxCFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureMessage_QNAME, String.class, ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeleteSurveyResponsesResult", scope = DeleteSurveyResponsesResponse.class)
    public JAXBElement<ServiceOperationResultOfanyType> createDeleteSurveyResponsesResponseDeleteSurveyResponsesResult(ServiceOperationResultOfanyType value) {
        return new JAXBElement<ServiceOperationResultOfanyType>(_DeleteSurveyResponsesResponseDeleteSurveyResponsesResult_QNAME, ServiceOperationResultOfanyType.class, DeleteSurveyResponsesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchTerm", scope = Search.class)
    public JAXBElement<String> createSearchSearchTerm(String value) {
        return new JAXBElement<String>(_SearchSearchTerm_QNAME, String.class, Search.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = Search.class)
    public JAXBElement<String> createSearchAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, Search.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSimpleNameValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "NameValueList", scope = SimpleNameValueCollection.class)
    public JAXBElement<ArrayOfSimpleNameValue> createSimpleNameValueCollectionNameValueList(ArrayOfSimpleNameValue value) {
        return new JAXBElement<ArrayOfSimpleNameValue>(_SimpleNameValueCollectionNameValueList_QNAME, ArrayOfSimpleNameValue.class, SimpleNameValueCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAggregateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "AggregateResults", scope = ResponseAggregatedData.class)
    public JAXBElement<ArrayOfAggregateResult> createResponseAggregatedDataAggregateResults(ArrayOfAggregateResult value) {
        return new JAXBElement<ArrayOfAggregateResult>(_ResponseAggregatedDataAggregateResults_QNAME, ArrayOfAggregateResult.class, ResponseAggregatedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = GetLifecycleResponseDataInMonths.class)
    public JAXBElement<String> createGetLifecycleResponseDataInMonthsAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, GetLifecycleResponseDataInMonths.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxCFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureExceptionType_QNAME, String.class, ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagedListResultOfTabularResponseExportDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<PagedListResultOfTabularResponseExportDataVUqw3SxC> createServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxCResultData(PagedListResultOfTabularResponseExportDataVUqw3SxC value) {
        return new JAXBElement<PagedListResultOfTabularResponseExportDataVUqw3SxC>(_ServiceOperationResultOfstringResultData_QNAME, PagedListResultOfTabularResponseExportDataVUqw3SxC.class, ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxCFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureMessage_QNAME, String.class, ServiceOperationResultOfPagedListResultOfTabularResponseExportDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "responseList", scope = DeleteSurveyResponses.class)
    public JAXBElement<ArrayOflong> createDeleteSurveyResponsesResponseList(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_DeleteSurveyResponsesResponseList_QNAME, ArrayOflong.class, DeleteSurveyResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = DeleteSurveyResponses.class)
    public JAXBElement<String> createDeleteSurveyResponsesAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, DeleteSurveyResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = DeleteAllSurveyResponses.class)
    public JAXBElement<String> createDeleteAllSurveyResponsesAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, DeleteAllSurveyResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "GroupKey", scope = GroupedResultOfResponseDataVUqw3SxC.class)
    public JAXBElement<String> createGroupedResultOfResponseDataVUqw3SxCGroupKey(String value) {
        return new JAXBElement<String>(_GroupedResultOfResponseDataVUqw3SxCGroupKey_QNAME, String.class, GroupedResultOfResponseDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "GroupField", scope = GroupedResultOfResponseDataVUqw3SxC.class)
    public JAXBElement<String> createGroupedResultOfResponseDataVUqw3SxCGroupField(String value) {
        return new JAXBElement<String>(_GroupedResultOfResponseDataVUqw3SxCGroupField_QNAME, String.class, GroupedResultOfResponseDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "GroupResults", scope = GroupedResultOfResponseDataVUqw3SxC.class)
    public JAXBElement<ArrayOfResponseData> createGroupedResultOfResponseDataVUqw3SxCGroupResults(ArrayOfResponseData value) {
        return new JAXBElement<ArrayOfResponseData>(_GroupedResultOfResponseDataVUqw3SxCGroupResults_QNAME, ArrayOfResponseData.class, GroupedResultOfResponseDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "OptionId", scope = ResponseItemAnswer.class)
    public JAXBElement<Integer> createResponseItemAnswerOptionId(Integer value) {
        return new JAXBElement<Integer>(_ResponseItemAnswerOptionId_QNAME, Integer.class, ResponseItemAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Points", scope = ResponseItemAnswer.class)
    public JAXBElement<Double> createResponseItemAnswerPoints(Double value) {
        return new JAXBElement<Double>(_ResponseItemAnswerPoints_QNAME, Double.class, ResponseItemAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "AnswerText", scope = ResponseItemAnswer.class)
    public JAXBElement<String> createResponseItemAnswerAnswerText(String value) {
        return new JAXBElement<String>(_ResponseItemAnswerAnswerText_QNAME, String.class, ResponseItemAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "OptionText", scope = ResponseItemAnswer.class)
    public JAXBElement<String> createResponseItemAnswerOptionText(String value) {
        return new JAXBElement<String>(_ResponseItemAnswerOptionText_QNAME, String.class, ResponseItemAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Alias", scope = ResponseItemAnswer.class)
    public JAXBElement<String> createResponseItemAnswerAlias(String value) {
        return new JAXBElement<String>(_ResponseItemAnswerDataAlias_QNAME, String.class, ResponseItemAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAnswersForResponseByGuidResult", scope = GetAnswersForResponseByGuidResponse.class)
    public JAXBElement<ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC> createGetAnswersForResponseByGuidResponseGetAnswersForResponseByGuidResult(ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC>(_GetAnswersForResponseByGuidResponseGetAnswersForResponseByGuidResult_QNAME, ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC.class, GetAnswersForResponseByGuidResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfResponseSummaryDataVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfResponseSummaryDataVUqw3SxCFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureExceptionType_QNAME, String.class, ServiceOperationResultOfResponseSummaryDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseSummaryData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfResponseSummaryDataVUqw3SxC.class)
    public JAXBElement<ResponseSummaryData> createServiceOperationResultOfResponseSummaryDataVUqw3SxCResultData(ResponseSummaryData value) {
        return new JAXBElement<ResponseSummaryData>(_ServiceOperationResultOfstringResultData_QNAME, ResponseSummaryData.class, ServiceOperationResultOfResponseSummaryDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfResponseSummaryDataVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfResponseSummaryDataVUqw3SxCFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureMessage_QNAME, String.class, ServiceOperationResultOfResponseSummaryDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfResponseDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListRecentSurveyResponsesResult", scope = ListRecentSurveyResponsesResponse.class)
    public JAXBElement<ServiceOperationResultOfArrayOfResponseDataVUqw3SxC> createListRecentSurveyResponsesResponseListRecentSurveyResponsesResult(ServiceOperationResultOfArrayOfResponseDataVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfArrayOfResponseDataVUqw3SxC>(_ListRecentSurveyResponsesResponseListRecentSurveyResponsesResult_QNAME, ServiceOperationResultOfArrayOfResponseDataVUqw3SxC.class, ListRecentSurveyResponsesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Name", scope = SimpleNameValue.class)
    public JAXBElement<String> createSimpleNameValueName(String value) {
        return new JAXBElement<String>(_SimpleNameValueName_QNAME, String.class, SimpleNameValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Value", scope = SimpleNameValue.class)
    public JAXBElement<String> createSimpleNameValueValue(String value) {
        return new JAXBElement<String>(_SimpleNameValueValue_QNAME, String.class, SimpleNameValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultPage", scope = PagedListResultOfArrayOfResponseDataVUqw3SxC.class)
    public JAXBElement<ArrayOfResponseData> createPagedListResultOfArrayOfResponseDataVUqw3SxCResultPage(ArrayOfResponseData value) {
        return new JAXBElement<ArrayOfResponseData>(_PagedListResultOfArrayOfResponseDataVUqw3SxCResultPage_QNAME, ArrayOfResponseData.class, PagedListResultOfArrayOfResponseDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfArrayOfResponseDataVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfArrayOfResponseDataVUqw3SxCFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureExceptionType_QNAME, String.class, ServiceOperationResultOfArrayOfResponseDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfArrayOfResponseDataVUqw3SxC.class)
    public JAXBElement<ArrayOfResponseData> createServiceOperationResultOfArrayOfResponseDataVUqw3SxCResultData(ArrayOfResponseData value) {
        return new JAXBElement<ArrayOfResponseData>(_ServiceOperationResultOfstringResultData_QNAME, ArrayOfResponseData.class, ServiceOperationResultOfArrayOfResponseDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfArrayOfResponseDataVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfArrayOfResponseDataVUqw3SxCFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureMessage_QNAME, String.class, ServiceOperationResultOfArrayOfResponseDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxCFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureExceptionType_QNAME, String.class, ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagedListResultOfArrayOfResponseDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<PagedListResultOfArrayOfResponseDataVUqw3SxC> createServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxCResultData(PagedListResultOfArrayOfResponseDataVUqw3SxC value) {
        return new JAXBElement<PagedListResultOfArrayOfResponseDataVUqw3SxC>(_ServiceOperationResultOfstringResultData_QNAME, PagedListResultOfArrayOfResponseDataVUqw3SxC.class, ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxCFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureMessage_QNAME, String.class, ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfResponseAggregatedDataVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfResponseAggregatedDataVUqw3SxCFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureExceptionType_QNAME, String.class, ServiceOperationResultOfResponseAggregatedDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseAggregatedData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfResponseAggregatedDataVUqw3SxC.class)
    public JAXBElement<ResponseAggregatedData> createServiceOperationResultOfResponseAggregatedDataVUqw3SxCResultData(ResponseAggregatedData value) {
        return new JAXBElement<ResponseAggregatedData>(_ServiceOperationResultOfstringResultData_QNAME, ResponseAggregatedData.class, ServiceOperationResultOfResponseAggregatedDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfResponseAggregatedDataVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfResponseAggregatedDataVUqw3SxCFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureMessage_QNAME, String.class, ServiceOperationResultOfResponseAggregatedDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxCFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureExceptionType_QNAME, String.class, ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagedListResultOfResponseExportDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<PagedListResultOfResponseExportDataVUqw3SxC> createServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxCResultData(PagedListResultOfResponseExportDataVUqw3SxC value) {
        return new JAXBElement<PagedListResultOfResponseExportDataVUqw3SxC>(_ServiceOperationResultOfstringResultData_QNAME, PagedListResultOfResponseExportDataVUqw3SxC.class, ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxCFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureMessage_QNAME, String.class, ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxCFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureExceptionType_QNAME, String.class, ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResponseItemAnswerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC.class)
    public JAXBElement<ArrayOfResponseItemAnswerData> createServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxCResultData(ArrayOfResponseItemAnswerData value) {
        return new JAXBElement<ArrayOfResponseItemAnswerData>(_ServiceOperationResultOfstringResultData_QNAME, ArrayOfResponseItemAnswerData.class, ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC.class)
    public JAXBElement<String> createServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxCFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfstringFailureMessage_QNAME, String.class, ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfResponseSummaryDataVUqw3SxC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSurveyResponseSummaryResult", scope = GetSurveyResponseSummaryResponse.class)
    public JAXBElement<ServiceOperationResultOfResponseSummaryDataVUqw3SxC> createGetSurveyResponseSummaryResponseGetSurveyResponseSummaryResult(ServiceOperationResultOfResponseSummaryDataVUqw3SxC value) {
        return new JAXBElement<ServiceOperationResultOfResponseSummaryDataVUqw3SxC>(_GetSurveyResponseSummaryResponseGetSurveyResponseSummaryResult_QNAME, ServiceOperationResultOfResponseSummaryDataVUqw3SxC.class, GetSurveyResponseSummaryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Profile", scope = UserData.class)
    public JAXBElement<SimpleNameValueCollection> createUserDataProfile(SimpleNameValueCollection value) {
        return new JAXBElement<SimpleNameValueCollection>(_UserDataProfile_QNAME, SimpleNameValueCollection.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "UniqueIdentifier", scope = UserData.class)
    public JAXBElement<String> createUserDataUniqueIdentifier(String value) {
        return new JAXBElement<String>(_UserDataUniqueIdentifier_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "AuthenticationType", scope = UserData.class)
    public JAXBElement<String> createUserDataAuthenticationType(String value) {
        return new JAXBElement<String>(_UserDataAuthenticationType_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Email", scope = UserData.class)
    public JAXBElement<String> createUserDataEmail(String value) {
        return new JAXBElement<String>(_UserDataEmail_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "RoleMemberships", scope = UserData.class)
    public JAXBElement<ArrayOfstring> createUserDataRoleMemberships(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_UserDataRoleMemberships_QNAME, ArrayOfstring.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "EscapedUniqueIdentifier", scope = UserData.class)
    public JAXBElement<String> createUserDataEscapedUniqueIdentifier(String value) {
        return new JAXBElement<String>(_UserDataEscapedUniqueIdentifier_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "GroupMemberships", scope = UserData.class)
    public JAXBElement<ArrayOfstring> createUserDataGroupMemberships(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_UserDataGroupMemberships_QNAME, ArrayOfstring.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabularResponseExportData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultPage", scope = PagedListResultOfTabularResponseExportDataVUqw3SxC.class)
    public JAXBElement<TabularResponseExportData> createPagedListResultOfTabularResponseExportDataVUqw3SxCResultPage(TabularResponseExportData value) {
        return new JAXBElement<TabularResponseExportData>(_PagedListResultOfArrayOfResponseDataVUqw3SxCResultPage_QNAME, TabularResponseExportData.class, PagedListResultOfTabularResponseExportDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "answerText", scope = UpdateResponseAnswer.class)
    public JAXBElement<String> createUpdateResponseAnswerAnswerText(String value) {
        return new JAXBElement<String>(_UpdateResponseAnswerAnswerText_QNAME, String.class, UpdateResponseAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "optionID", scope = UpdateResponseAnswer.class)
    public JAXBElement<Integer> createUpdateResponseAnswerOptionID(Integer value) {
        return new JAXBElement<Integer>(_UpdateResponseAnswerOptionID_QNAME, Integer.class, UpdateResponseAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateCreated", scope = UpdateResponseAnswer.class)
    public JAXBElement<XMLGregorianCalendar> createUpdateResponseAnswerDateCreated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateResponseAnswerDateCreated_QNAME, XMLGregorianCalendar.class, UpdateResponseAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authToken", scope = UpdateResponseAnswer.class)
    public JAXBElement<String> createUpdateResponseAnswerAuthToken(String value) {
        return new JAXBElement<String>(_ExportResponsesTabularAuthToken_QNAME, String.class, UpdateResponseAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseExportData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultPage", scope = PagedListResultOfResponseExportDataVUqw3SxC.class)
    public JAXBElement<ResponseExportData> createPagedListResultOfResponseExportDataVUqw3SxCResultPage(ResponseExportData value) {
        return new JAXBElement<ResponseExportData>(_PagedListResultOfArrayOfResponseDataVUqw3SxCResultPage_QNAME, ResponseExportData.class, PagedListResultOfResponseExportDataVUqw3SxC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Respondents", scope = TabularResponseExportData.class)
    public JAXBElement<ArrayOfUserData> createTabularResponseExportDataRespondents(ArrayOfUserData value) {
        return new JAXBElement<ArrayOfUserData>(_ResponseExportDataRespondents_QNAME, ArrayOfUserData.class, TabularResponseExportData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSimpleNameValueCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Responses", scope = TabularResponseExportData.class)
    public JAXBElement<ArrayOfSimpleNameValueCollection> createTabularResponseExportDataResponses(ArrayOfSimpleNameValueCollection value) {
        return new JAXBElement<ArrayOfSimpleNameValueCollection>(_ResponseExportDataResponses_QNAME, ArrayOfSimpleNameValueCollection.class, TabularResponseExportData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultKey", scope = ReportResult.class)
    public JAXBElement<String> createReportResultResultKey(String value) {
        return new JAXBElement<String>(_ReportResultResultKey_QNAME, String.class, ReportResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultText", scope = ReportResult.class)
    public JAXBElement<String> createReportResultResultText(String value) {
        return new JAXBElement<String>(_ReportResultResultText_QNAME, String.class, ReportResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeleteAllSurveyTestResponsesResult", scope = DeleteAllSurveyTestResponsesResponse.class)
    public JAXBElement<ServiceOperationResultOfanyType> createDeleteAllSurveyTestResponsesResponseDeleteAllSurveyTestResponsesResult(ServiceOperationResultOfanyType value) {
        return new JAXBElement<ServiceOperationResultOfanyType>(_DeleteAllSurveyTestResponsesResponseDeleteAllSurveyTestResponsesResult_QNAME, ServiceOperationResultOfanyType.class, DeleteAllSurveyTestResponsesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetLifecycleResponseDataInDaysResult", scope = GetLifecycleResponseDataInDaysResponse.class)
    public JAXBElement<ServiceOperationResultOfstring> createGetLifecycleResponseDataInDaysResponseGetLifecycleResponseDataInDaysResult(ServiceOperationResultOfstring value) {
        return new JAXBElement<ServiceOperationResultOfstring>(_GetLifecycleResponseDataInDaysResponseGetLifecycleResponseDataInDaysResult_QNAME, ServiceOperationResultOfstring.class, GetLifecycleResponseDataInDaysResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = ListRecentSurveyResponses.class)
    public JAXBElement<String> createListRecentSurveyResponsesAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, ListRecentSurveyResponses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "TypeName", scope = ItemProxyObject.class)
    public JAXBElement<String> createItemProxyObjectTypeName(String value) {
        return new JAXBElement<String>(_ItemProxyObjectTypeName_QNAME, String.class, ItemProxyObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "Metadata", scope = ItemProxyObject.class)
    public JAXBElement<SimpleNameValueCollection> createItemProxyObjectMetadata(SimpleNameValueCollection value) {
        return new JAXBElement<SimpleNameValueCollection>(_ItemProxyObjectMetadata_QNAME, SimpleNameValueCollection.class, ItemProxyObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "InstanceData", scope = ItemProxyObject.class)
    public JAXBElement<SimpleNameValueCollection> createItemProxyObjectInstanceData(SimpleNameValueCollection value) {
        return new JAXBElement<SimpleNameValueCollection>(_ItemProxyObjectInstanceData_QNAME, SimpleNameValueCollection.class, ItemProxyObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "AdditionalData", scope = ItemProxyObject.class)
    public JAXBElement<Object> createItemProxyObjectAdditionalData(Object value) {
        return new JAXBElement<Object>(_ItemProxyObjectAdditionalData_QNAME, Object.class, ItemProxyObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "AppearanceData", scope = ItemProxyObject.class)
    public JAXBElement<SimpleNameValueCollection> createItemProxyObjectAppearanceData(SimpleNameValueCollection value) {
        return new JAXBElement<SimpleNameValueCollection>(_ItemProxyObjectAppearanceData_QNAME, SimpleNameValueCollection.class, ItemProxyObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetLifecycleResponseDataInMonthsResult", scope = GetLifecycleResponseDataInMonthsResponse.class)
    public JAXBElement<ServiceOperationResultOfstring> createGetLifecycleResponseDataInMonthsResponseGetLifecycleResponseDataInMonthsResult(ServiceOperationResultOfstring value) {
        return new JAXBElement<ServiceOperationResultOfstring>(_GetLifecycleResponseDataInMonthsResponseGetLifecycleResponseDataInMonthsResult_QNAME, ServiceOperationResultOfstring.class, GetLifecycleResponseDataInMonthsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authTicket", scope = GetSurveyResponseSummary.class)
    public JAXBElement<String> createGetSurveyResponseSummaryAuthTicket(String value) {
        return new JAXBElement<String>(_GetLifecycleAggregatedResponseDataInDaysAuthTicket_QNAME, String.class, GetSurveyResponseSummary.class, value);
    }

}

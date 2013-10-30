
package com.checkbox.ftpresponseexporter.responsedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surveyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="filterField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortAscending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dtStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DetailedResponseInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DetailedUserInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeOpenEndedResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeAliases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeHiddenItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeIncompleteResponses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StripHTMLTagsFromAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StripHTMLTagsFromQuestions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MergeAnswersForSelectMany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authToken",
    "surveyId",
    "pageNumber",
    "resultsPerPage",
    "filterField",
    "filterValue",
    "sortField",
    "sortAscending",
    "period",
    "dtStart",
    "dtEnd",
    "detailedResponseInfo",
    "detailedUserInfo",
    "includeOpenEndedResults",
    "includeAliases",
    "includeHiddenItems",
    "includeIncompleteResponses",
    "stripHTMLTagsFromAnswers",
    "stripHTMLTagsFromQuestions",
    "mergeAnswersForSelectMany"
})
@XmlRootElement(name = "ExportResponsesTabular", namespace = "http://tempuri.org/")
public class ExportResponsesTabular {

    @XmlElementRef(name = "authToken", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authToken;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer surveyId;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer pageNumber;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer resultsPerPage;
    @XmlElementRef(name = "filterField", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filterField;
    @XmlElementRef(name = "filterValue", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filterValue;
    @XmlElementRef(name = "sortField", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sortField;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Boolean sortAscending;
    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer period;
    @XmlElement(namespace = "http://tempuri.org/")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtStart;
    @XmlElement(namespace = "http://tempuri.org/")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtEnd;
    @XmlElement(name = "DetailedResponseInfo", namespace = "http://tempuri.org/")
    protected Boolean detailedResponseInfo;
    @XmlElement(name = "DetailedUserInfo", namespace = "http://tempuri.org/")
    protected Boolean detailedUserInfo;
    @XmlElement(name = "IncludeOpenEndedResults", namespace = "http://tempuri.org/")
    protected Boolean includeOpenEndedResults;
    @XmlElement(name = "IncludeAliases", namespace = "http://tempuri.org/")
    protected Boolean includeAliases;
    @XmlElement(name = "IncludeHiddenItems", namespace = "http://tempuri.org/")
    protected Boolean includeHiddenItems;
    @XmlElement(name = "IncludeIncompleteResponses", namespace = "http://tempuri.org/")
    protected Boolean includeIncompleteResponses;
    @XmlElement(name = "StripHTMLTagsFromAnswers", namespace = "http://tempuri.org/")
    protected Boolean stripHTMLTagsFromAnswers;
    @XmlElement(name = "StripHTMLTagsFromQuestions", namespace = "http://tempuri.org/")
    protected Boolean stripHTMLTagsFromQuestions;
    @XmlElement(name = "MergeAnswersForSelectMany", namespace = "http://tempuri.org/")
    protected Boolean mergeAnswersForSelectMany;

    /**
     * Gets the value of the authToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthToken() {
        return authToken;
    }

    /**
     * Sets the value of the authToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthToken(JAXBElement<String> value) {
        this.authToken = value;
    }

    /**
     * Gets the value of the surveyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSurveyId() {
        return surveyId;
    }

    /**
     * Sets the value of the surveyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSurveyId(Integer value) {
        this.surveyId = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the resultsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    /**
     * Sets the value of the resultsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultsPerPage(Integer value) {
        this.resultsPerPage = value;
    }

    /**
     * Gets the value of the filterField property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilterField() {
        return filterField;
    }

    /**
     * Sets the value of the filterField property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilterField(JAXBElement<String> value) {
        this.filterField = value;
    }

    /**
     * Gets the value of the filterValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilterValue() {
        return filterValue;
    }

    /**
     * Sets the value of the filterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilterValue(JAXBElement<String> value) {
        this.filterValue = value;
    }

    /**
     * Gets the value of the sortField property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSortField() {
        return sortField;
    }

    /**
     * Sets the value of the sortField property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSortField(JAXBElement<String> value) {
        this.sortField = value;
    }

    /**
     * Gets the value of the sortAscending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortAscending() {
        return sortAscending;
    }

    /**
     * Sets the value of the sortAscending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortAscending(Boolean value) {
        this.sortAscending = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriod(Integer value) {
        this.period = value;
    }

    /**
     * Gets the value of the dtStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtStart() {
        return dtStart;
    }

    /**
     * Sets the value of the dtStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtStart(XMLGregorianCalendar value) {
        this.dtStart = value;
    }

    /**
     * Gets the value of the dtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEnd() {
        return dtEnd;
    }

    /**
     * Sets the value of the dtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEnd(XMLGregorianCalendar value) {
        this.dtEnd = value;
    }

    /**
     * Gets the value of the detailedResponseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetailedResponseInfo() {
        return detailedResponseInfo;
    }

    /**
     * Sets the value of the detailedResponseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailedResponseInfo(Boolean value) {
        this.detailedResponseInfo = value;
    }

    /**
     * Gets the value of the detailedUserInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetailedUserInfo() {
        return detailedUserInfo;
    }

    /**
     * Sets the value of the detailedUserInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailedUserInfo(Boolean value) {
        this.detailedUserInfo = value;
    }

    /**
     * Gets the value of the includeOpenEndedResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOpenEndedResults() {
        return includeOpenEndedResults;
    }

    /**
     * Sets the value of the includeOpenEndedResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOpenEndedResults(Boolean value) {
        this.includeOpenEndedResults = value;
    }

    /**
     * Gets the value of the includeAliases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAliases() {
        return includeAliases;
    }

    /**
     * Sets the value of the includeAliases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAliases(Boolean value) {
        this.includeAliases = value;
    }

    /**
     * Gets the value of the includeHiddenItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHiddenItems() {
        return includeHiddenItems;
    }

    /**
     * Sets the value of the includeHiddenItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHiddenItems(Boolean value) {
        this.includeHiddenItems = value;
    }

    /**
     * Gets the value of the includeIncompleteResponses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeIncompleteResponses() {
        return includeIncompleteResponses;
    }

    /**
     * Sets the value of the includeIncompleteResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeIncompleteResponses(Boolean value) {
        this.includeIncompleteResponses = value;
    }

    /**
     * Gets the value of the stripHTMLTagsFromAnswers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStripHTMLTagsFromAnswers() {
        return stripHTMLTagsFromAnswers;
    }

    /**
     * Sets the value of the stripHTMLTagsFromAnswers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStripHTMLTagsFromAnswers(Boolean value) {
        this.stripHTMLTagsFromAnswers = value;
    }

    /**
     * Gets the value of the stripHTMLTagsFromQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStripHTMLTagsFromQuestions() {
        return stripHTMLTagsFromQuestions;
    }

    /**
     * Sets the value of the stripHTMLTagsFromQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStripHTMLTagsFromQuestions(Boolean value) {
        this.stripHTMLTagsFromQuestions = value;
    }

    /**
     * Gets the value of the mergeAnswersForSelectMany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMergeAnswersForSelectMany() {
        return mergeAnswersForSelectMany;
    }

    /**
     * Sets the value of the mergeAnswersForSelectMany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMergeAnswersForSelectMany(Boolean value) {
        this.mergeAnswersForSelectMany = value;
    }

}

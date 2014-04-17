
package com.checkbox.ftpresponseexporter.responsedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseSummaryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseSummaryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompletedResponseCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncompleteResponseCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SurveyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TestResponseCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseSummaryData", propOrder = {
    "completedResponseCount",
    "incompleteResponseCount",
    "surveyId",
    "testResponseCount"
})
public class ResponseSummaryData {

    @XmlElement(name = "CompletedResponseCount")
    protected Integer completedResponseCount;
    @XmlElement(name = "IncompleteResponseCount")
    protected Integer incompleteResponseCount;
    @XmlElement(name = "SurveyId")
    protected Integer surveyId;
    @XmlElement(name = "TestResponseCount")
    protected Integer testResponseCount;

    /**
     * Gets the value of the completedResponseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompletedResponseCount() {
        return completedResponseCount;
    }

    /**
     * Sets the value of the completedResponseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompletedResponseCount(Integer value) {
        this.completedResponseCount = value;
    }

    /**
     * Gets the value of the incompleteResponseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncompleteResponseCount() {
        return incompleteResponseCount;
    }

    /**
     * Sets the value of the incompleteResponseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncompleteResponseCount(Integer value) {
        this.incompleteResponseCount = value;
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
     * Gets the value of the testResponseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTestResponseCount() {
        return testResponseCount;
    }

    /**
     * Sets the value of the testResponseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTestResponseCount(Integer value) {
        this.testResponseCount = value;
    }

}


package com.checkbox.ftpresponseexporter.responsedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetSurveyResponseSummaryResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ServiceOperationResultOfResponseSummaryDataVUqw3SxC" minOccurs="0"/>
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
    "getSurveyResponseSummaryResult"
})
@XmlRootElement(name = "GetSurveyResponseSummaryResponse", namespace = "http://tempuri.org/")
public class GetSurveyResponseSummaryResponse {

    @XmlElementRef(name = "GetSurveyResponseSummaryResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOperationResultOfResponseSummaryDataVUqw3SxC> getSurveyResponseSummaryResult;

    /**
     * Gets the value of the getSurveyResponseSummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfResponseSummaryDataVUqw3SxC }{@code >}
     *     
     */
    public JAXBElement<ServiceOperationResultOfResponseSummaryDataVUqw3SxC> getGetSurveyResponseSummaryResult() {
        return getSurveyResponseSummaryResult;
    }

    /**
     * Sets the value of the getSurveyResponseSummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfResponseSummaryDataVUqw3SxC }{@code >}
     *     
     */
    public void setGetSurveyResponseSummaryResult(JAXBElement<ServiceOperationResultOfResponseSummaryDataVUqw3SxC> value) {
        this.getSurveyResponseSummaryResult = value;
    }

}


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
 *         &lt;element name="DeleteSurveyResponsesResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ServiceOperationResultOfanyType" minOccurs="0"/>
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
    "deleteSurveyResponsesResult"
})
@XmlRootElement(name = "DeleteSurveyResponsesResponse", namespace = "http://tempuri.org/")
public class DeleteSurveyResponsesResponse {

    @XmlElementRef(name = "DeleteSurveyResponsesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOperationResultOfanyType> deleteSurveyResponsesResult;

    /**
     * Gets the value of the deleteSurveyResponsesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfanyType }{@code >}
     *     
     */
    public JAXBElement<ServiceOperationResultOfanyType> getDeleteSurveyResponsesResult() {
        return deleteSurveyResponsesResult;
    }

    /**
     * Sets the value of the deleteSurveyResponsesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfanyType }{@code >}
     *     
     */
    public void setDeleteSurveyResponsesResult(JAXBElement<ServiceOperationResultOfanyType> value) {
        this.deleteSurveyResponsesResult = value;
    }

}

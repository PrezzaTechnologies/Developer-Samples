
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
 *         &lt;element name="DeleteAllSurveyResponsesResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ServiceOperationResultOfanyType" minOccurs="0"/>
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
    "deleteAllSurveyResponsesResult"
})
@XmlRootElement(name = "DeleteAllSurveyResponsesResponse", namespace = "http://tempuri.org/")
public class DeleteAllSurveyResponsesResponse {

    @XmlElementRef(name = "DeleteAllSurveyResponsesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOperationResultOfanyType> deleteAllSurveyResponsesResult;

    /**
     * Gets the value of the deleteAllSurveyResponsesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfanyType }{@code >}
     *     
     */
    public JAXBElement<ServiceOperationResultOfanyType> getDeleteAllSurveyResponsesResult() {
        return deleteAllSurveyResponsesResult;
    }

    /**
     * Sets the value of the deleteAllSurveyResponsesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfanyType }{@code >}
     *     
     */
    public void setDeleteAllSurveyResponsesResult(JAXBElement<ServiceOperationResultOfanyType> value) {
        this.deleteAllSurveyResponsesResult = value;
    }

}

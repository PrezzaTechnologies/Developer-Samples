
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
 *         &lt;element name="ListRecentSurveyResponsesResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ServiceOperationResultOfArrayOfResponseDataVUqw3SxC" minOccurs="0"/>
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
    "listRecentSurveyResponsesResult"
})
@XmlRootElement(name = "ListRecentSurveyResponsesResponse", namespace = "http://tempuri.org/")
public class ListRecentSurveyResponsesResponse {

    @XmlElementRef(name = "ListRecentSurveyResponsesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOperationResultOfArrayOfResponseDataVUqw3SxC> listRecentSurveyResponsesResult;

    /**
     * Gets the value of the listRecentSurveyResponsesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfResponseDataVUqw3SxC }{@code >}
     *     
     */
    public JAXBElement<ServiceOperationResultOfArrayOfResponseDataVUqw3SxC> getListRecentSurveyResponsesResult() {
        return listRecentSurveyResponsesResult;
    }

    /**
     * Sets the value of the listRecentSurveyResponsesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfResponseDataVUqw3SxC }{@code >}
     *     
     */
    public void setListRecentSurveyResponsesResult(JAXBElement<ServiceOperationResultOfArrayOfResponseDataVUqw3SxC> value) {
        this.listRecentSurveyResponsesResult = value;
    }

}

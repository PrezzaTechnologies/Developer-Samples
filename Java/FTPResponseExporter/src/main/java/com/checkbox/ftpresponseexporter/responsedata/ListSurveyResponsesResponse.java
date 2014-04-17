
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
 *         &lt;element name="ListSurveyResponsesResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC" minOccurs="0"/>
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
    "listSurveyResponsesResult"
})
@XmlRootElement(name = "ListSurveyResponsesResponse", namespace = "http://tempuri.org/")
public class ListSurveyResponsesResponse {

    @XmlElementRef(name = "ListSurveyResponsesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC> listSurveyResponsesResult;

    /**
     * Gets the value of the listSurveyResponsesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC }{@code >}
     *     
     */
    public JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC> getListSurveyResponsesResult() {
        return listSurveyResponsesResult;
    }

    /**
     * Sets the value of the listSurveyResponsesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC }{@code >}
     *     
     */
    public void setListSurveyResponsesResult(JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC> value) {
        this.listSurveyResponsesResult = value;
    }

}

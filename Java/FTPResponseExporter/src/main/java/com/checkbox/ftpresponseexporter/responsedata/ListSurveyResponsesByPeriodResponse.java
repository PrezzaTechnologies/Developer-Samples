
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
 *         &lt;element name="ListSurveyResponsesByPeriodResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC" minOccurs="0"/>
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
    "listSurveyResponsesByPeriodResult"
})
@XmlRootElement(name = "ListSurveyResponsesByPeriodResponse", namespace = "http://tempuri.org/")
public class ListSurveyResponsesByPeriodResponse {

    @XmlElementRef(name = "ListSurveyResponsesByPeriodResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC> listSurveyResponsesByPeriodResult;

    /**
     * Gets the value of the listSurveyResponsesByPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC }{@code >}
     *     
     */
    public JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC> getListSurveyResponsesByPeriodResult() {
        return listSurveyResponsesByPeriodResult;
    }

    /**
     * Sets the value of the listSurveyResponsesByPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC }{@code >}
     *     
     */
    public void setListSurveyResponsesByPeriodResult(JAXBElement<ServiceOperationResultOfPagedListResultOfArrayOfResponseDataVUqw3SxCVUqw3SxC> value) {
        this.listSurveyResponsesByPeriodResult = value;
    }

}

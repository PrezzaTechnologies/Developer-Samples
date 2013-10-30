
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
 *         &lt;element name="GetAnswersForResponseByGuidResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC" minOccurs="0"/>
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
    "getAnswersForResponseByGuidResult"
})
@XmlRootElement(name = "GetAnswersForResponseByGuidResponse", namespace = "http://tempuri.org/")
public class GetAnswersForResponseByGuidResponse {

    @XmlElementRef(name = "GetAnswersForResponseByGuidResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC> getAnswersForResponseByGuidResult;

    /**
     * Gets the value of the getAnswersForResponseByGuidResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC }{@code >}
     *     
     */
    public JAXBElement<ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC> getGetAnswersForResponseByGuidResult() {
        return getAnswersForResponseByGuidResult;
    }

    /**
     * Sets the value of the getAnswersForResponseByGuidResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC }{@code >}
     *     
     */
    public void setGetAnswersForResponseByGuidResult(JAXBElement<ServiceOperationResultOfArrayOfResponseItemAnswerDataVUqw3SxC> value) {
        this.getAnswersForResponseByGuidResult = value;
    }

}


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
 *         &lt;element name="GetLifecycleAggregatedResponseDataInDaysResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ServiceOperationResultOfResponseAggregatedDataVUqw3SxC" minOccurs="0"/>
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
    "getLifecycleAggregatedResponseDataInDaysResult"
})
@XmlRootElement(name = "GetLifecycleAggregatedResponseDataInDaysResponse", namespace = "http://tempuri.org/")
public class GetLifecycleAggregatedResponseDataInDaysResponse {

    @XmlElementRef(name = "GetLifecycleAggregatedResponseDataInDaysResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOperationResultOfResponseAggregatedDataVUqw3SxC> getLifecycleAggregatedResponseDataInDaysResult;

    /**
     * Gets the value of the getLifecycleAggregatedResponseDataInDaysResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfResponseAggregatedDataVUqw3SxC }{@code >}
     *     
     */
    public JAXBElement<ServiceOperationResultOfResponseAggregatedDataVUqw3SxC> getGetLifecycleAggregatedResponseDataInDaysResult() {
        return getLifecycleAggregatedResponseDataInDaysResult;
    }

    /**
     * Sets the value of the getLifecycleAggregatedResponseDataInDaysResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfResponseAggregatedDataVUqw3SxC }{@code >}
     *     
     */
    public void setGetLifecycleAggregatedResponseDataInDaysResult(JAXBElement<ServiceOperationResultOfResponseAggregatedDataVUqw3SxC> value) {
        this.getLifecycleAggregatedResponseDataInDaysResult = value;
    }

}

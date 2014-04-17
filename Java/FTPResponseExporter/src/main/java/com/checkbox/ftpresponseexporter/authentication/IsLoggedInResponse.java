
package com.checkbox.ftpresponseexporter.authentication;

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
 *         &lt;element name="IsLoggedInResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ServiceOperationResultOfboolean" minOccurs="0"/>
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
    "isLoggedInResult"
})
@XmlRootElement(name = "IsLoggedInResponse")
public class IsLoggedInResponse {

    @XmlElementRef(name = "IsLoggedInResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOperationResultOfboolean> isLoggedInResult;

    /**
     * Gets the value of the isLoggedInResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfboolean }{@code >}
     *     
     */
    public JAXBElement<ServiceOperationResultOfboolean> getIsLoggedInResult() {
        return isLoggedInResult;
    }

    /**
     * Sets the value of the isLoggedInResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfboolean }{@code >}
     *     
     */
    public void setIsLoggedInResult(JAXBElement<ServiceOperationResultOfboolean> value) {
        this.isLoggedInResult = value;
    }

}


package com.checkbox.ftpresponseexporter.responsedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TabularResponseExportData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TabularResponseExportData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Respondents" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ArrayOfUserData" minOccurs="0"/>
 *         &lt;element name="Responses" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ArrayOfSimpleNameValueCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabularResponseExportData", propOrder = {
    "respondents",
    "responses"
})
public class TabularResponseExportData {

    @XmlElementRef(name = "Respondents", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUserData> respondents;
    @XmlElementRef(name = "Responses", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSimpleNameValueCollection> responses;

    /**
     * Gets the value of the respondents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUserData> getRespondents() {
        return respondents;
    }

    /**
     * Sets the value of the respondents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserData }{@code >}
     *     
     */
    public void setRespondents(JAXBElement<ArrayOfUserData> value) {
        this.respondents = value;
    }

    /**
     * Gets the value of the responses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSimpleNameValueCollection }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSimpleNameValueCollection> getResponses() {
        return responses;
    }

    /**
     * Sets the value of the responses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSimpleNameValueCollection }{@code >}
     *     
     */
    public void setResponses(JAXBElement<ArrayOfSimpleNameValueCollection> value) {
        this.responses = value;
    }

}

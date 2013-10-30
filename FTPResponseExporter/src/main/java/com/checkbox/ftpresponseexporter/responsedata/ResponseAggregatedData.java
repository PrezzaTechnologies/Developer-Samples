
package com.checkbox.ftpresponseexporter.responsedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseAggregatedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseAggregatedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AggregateResults" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ArrayOfAggregateResult" minOccurs="0"/>
 *         &lt;element name="CompletedResponseCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseAggregatedData", propOrder = {
    "aggregateResults",
    "completedResponseCount"
})
public class ResponseAggregatedData {

    @XmlElementRef(name = "AggregateResults", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAggregateResult> aggregateResults;
    @XmlElement(name = "CompletedResponseCount")
    protected Integer completedResponseCount;

    /**
     * Gets the value of the aggregateResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAggregateResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAggregateResult> getAggregateResults() {
        return aggregateResults;
    }

    /**
     * Sets the value of the aggregateResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAggregateResult }{@code >}
     *     
     */
    public void setAggregateResults(JAXBElement<ArrayOfAggregateResult> value) {
        this.aggregateResults = value;
    }

    /**
     * Gets the value of the completedResponseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompletedResponseCount() {
        return completedResponseCount;
    }

    /**
     * Sets the value of the completedResponseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompletedResponseCount(Integer value) {
        this.completedResponseCount = value;
    }

}

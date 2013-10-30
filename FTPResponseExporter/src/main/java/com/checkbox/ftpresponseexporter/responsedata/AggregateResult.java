
package com.checkbox.ftpresponseexporter.responsedata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ReportResult">
 *       &lt;sequence>
 *         &lt;element name="AnswerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AnswerPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateResult", propOrder = {
    "answerCount",
    "answerPercent"
})
public class AggregateResult
    extends ReportResult
{

    @XmlElement(name = "AnswerCount")
    protected Integer answerCount;
    @XmlElement(name = "AnswerPercent")
    protected Double answerPercent;

    /**
     * Gets the value of the answerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnswerCount() {
        return answerCount;
    }

    /**
     * Sets the value of the answerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnswerCount(Integer value) {
        this.answerCount = value;
    }

    /**
     * Gets the value of the answerPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnswerPercent() {
        return answerPercent;
    }

    /**
     * Sets the value of the answerPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnswerPercent(Double value) {
        this.answerPercent = value;
    }

}


package com.checkbox.ftpresponseexporter.responsedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAggregateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAggregateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AggregateResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}AggregateResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAggregateResult", propOrder = {
    "aggregateResult"
})
public class ArrayOfAggregateResult {

    @XmlElement(name = "AggregateResult", nillable = true)
    protected List<AggregateResult> aggregateResult;

    /**
     * Gets the value of the aggregateResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregateResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregateResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateResult }
     * 
     * 
     */
    public List<AggregateResult> getAggregateResult() {
        if (aggregateResult == null) {
            aggregateResult = new ArrayList<AggregateResult>();
        }
        return this.aggregateResult;
    }

}

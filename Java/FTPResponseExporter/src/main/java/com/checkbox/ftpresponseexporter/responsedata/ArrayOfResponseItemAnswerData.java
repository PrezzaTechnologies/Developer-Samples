
package com.checkbox.ftpresponseexporter.responsedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResponseItemAnswerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResponseItemAnswerData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseItemAnswerData" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ResponseItemAnswerData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResponseItemAnswerData", propOrder = {
    "responseItemAnswerData"
})
public class ArrayOfResponseItemAnswerData {

    @XmlElement(name = "ResponseItemAnswerData", nillable = true)
    protected List<ResponseItemAnswerData> responseItemAnswerData;

    /**
     * Gets the value of the responseItemAnswerData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseItemAnswerData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseItemAnswerData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseItemAnswerData }
     * 
     * 
     */
    public List<ResponseItemAnswerData> getResponseItemAnswerData() {
        if (responseItemAnswerData == null) {
            responseItemAnswerData = new ArrayList<ResponseItemAnswerData>();
        }
        return this.responseItemAnswerData;
    }

}

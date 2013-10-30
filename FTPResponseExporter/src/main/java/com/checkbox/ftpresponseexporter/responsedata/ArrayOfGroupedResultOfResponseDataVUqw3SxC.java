
package com.checkbox.ftpresponseexporter.responsedata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGroupedResultOfResponseDataVUqw3SxC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGroupedResultOfResponseDataVUqw3SxC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupedResultOfResponseDataVUqw3SxC" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}GroupedResultOfResponseDataVUqw3SxC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGroupedResultOfResponseDataVUqw3SxC", propOrder = {
    "groupedResultOfResponseDataVUqw3SxC"
})
public class ArrayOfGroupedResultOfResponseDataVUqw3SxC {

    @XmlElement(name = "GroupedResultOfResponseDataVUqw3SxC", nillable = true)
    protected List<GroupedResultOfResponseDataVUqw3SxC> groupedResultOfResponseDataVUqw3SxC;

    /**
     * Gets the value of the groupedResultOfResponseDataVUqw3SxC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupedResultOfResponseDataVUqw3SxC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupedResultOfResponseDataVUqw3SxC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupedResultOfResponseDataVUqw3SxC }
     * 
     * 
     */
    public List<GroupedResultOfResponseDataVUqw3SxC> getGroupedResultOfResponseDataVUqw3SxC() {
        if (groupedResultOfResponseDataVUqw3SxC == null) {
            groupedResultOfResponseDataVUqw3SxC = new ArrayList<GroupedResultOfResponseDataVUqw3SxC>();
        }
        return this.groupedResultOfResponseDataVUqw3SxC;
    }

}

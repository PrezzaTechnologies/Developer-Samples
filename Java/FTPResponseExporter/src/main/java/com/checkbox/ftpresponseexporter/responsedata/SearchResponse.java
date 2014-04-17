
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
 *         &lt;element name="SearchResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC" minOccurs="0"/>
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
    "searchResult"
})
@XmlRootElement(name = "SearchResponse", namespace = "http://tempuri.org/")
public class SearchResponse {

    @XmlElementRef(name = "SearchResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC> searchResult;

    /**
     * Gets the value of the searchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC }{@code >}
     *     
     */
    public JAXBElement<ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC> getSearchResult() {
        return searchResult;
    }

    /**
     * Sets the value of the searchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC }{@code >}
     *     
     */
    public void setSearchResult(JAXBElement<ServiceOperationResultOfArrayOfGroupedResultOfResponseDataVUqw3SxCVUqw3SxC> value) {
        this.searchResult = value;
    }

}

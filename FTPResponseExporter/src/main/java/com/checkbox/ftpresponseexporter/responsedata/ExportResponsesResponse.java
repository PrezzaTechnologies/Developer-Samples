
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
 *         &lt;element name="ExportResponsesResult" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC" minOccurs="0"/>
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
    "exportResponsesResult"
})
@XmlRootElement(name = "ExportResponsesResponse", namespace = "http://tempuri.org/")
public class ExportResponsesResponse {

    @XmlElementRef(name = "ExportResponsesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC> exportResponsesResult;

    /**
     * Gets the value of the exportResponsesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC }{@code >}
     *     
     */
    public JAXBElement<ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC> getExportResponsesResult() {
        return exportResponsesResult;
    }

    /**
     * Sets the value of the exportResponsesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC }{@code >}
     *     
     */
    public void setExportResponsesResult(JAXBElement<ServiceOperationResultOfPagedListResultOfResponseExportDataVUqw3SxCVUqw3SxC> value) {
        this.exportResponsesResult = value;
    }

}

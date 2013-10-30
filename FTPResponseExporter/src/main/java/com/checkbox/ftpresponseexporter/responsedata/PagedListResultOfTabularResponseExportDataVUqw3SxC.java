
package com.checkbox.ftpresponseexporter.responsedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagedListResultOfTabularResponseExportDataVUqw3SxC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagedListResultOfTabularResponseExportDataVUqw3SxC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultPage" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}TabularResponseExportData" minOccurs="0"/>
 *         &lt;element name="TotalItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagedListResultOfTabularResponseExportDataVUqw3SxC", propOrder = {
    "resultPage",
    "totalItemCount"
})
public class PagedListResultOfTabularResponseExportDataVUqw3SxC {

    @XmlElementRef(name = "ResultPage", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<TabularResponseExportData> resultPage;
    @XmlElement(name = "TotalItemCount")
    protected Integer totalItemCount;

    /**
     * Gets the value of the resultPage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TabularResponseExportData }{@code >}
     *     
     */
    public JAXBElement<TabularResponseExportData> getResultPage() {
        return resultPage;
    }

    /**
     * Sets the value of the resultPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TabularResponseExportData }{@code >}
     *     
     */
    public void setResultPage(JAXBElement<TabularResponseExportData> value) {
        this.resultPage = value;
    }

    /**
     * Gets the value of the totalItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalItemCount() {
        return totalItemCount;
    }

    /**
     * Sets the value of the totalItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalItemCount(Integer value) {
        this.totalItemCount = value;
    }

}

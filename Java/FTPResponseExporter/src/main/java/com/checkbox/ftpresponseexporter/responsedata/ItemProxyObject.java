
package com.checkbox.ftpresponseexporter.responsedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemProxyObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemProxyObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="AppearanceData" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}SimpleNameValueCollection" minOccurs="0"/>
 *         &lt;element name="InstanceData" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}SimpleNameValueCollection" minOccurs="0"/>
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}SimpleNameValueCollection" minOccurs="0"/>
 *         &lt;element name="ParentTemplateId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemProxyObject", propOrder = {
    "additionalData",
    "appearanceData",
    "instanceData",
    "itemId",
    "metadata",
    "parentTemplateId",
    "typeName"
})
@XmlSeeAlso({
    ResponseItemAnswerData.class
})
public class ItemProxyObject {

    @XmlElementRef(name = "AdditionalData", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> additionalData;
    @XmlElementRef(name = "AppearanceData", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleNameValueCollection> appearanceData;
    @XmlElementRef(name = "InstanceData", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleNameValueCollection> instanceData;
    @XmlElement(name = "ItemId")
    protected Integer itemId;
    @XmlElementRef(name = "Metadata", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleNameValueCollection> metadata;
    @XmlElement(name = "ParentTemplateId")
    protected Integer parentTemplateId;
    @XmlElementRef(name = "TypeName", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeName;

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setAdditionalData(JAXBElement<Object> value) {
        this.additionalData = value;
    }

    /**
     * Gets the value of the appearanceData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}
     *     
     */
    public JAXBElement<SimpleNameValueCollection> getAppearanceData() {
        return appearanceData;
    }

    /**
     * Sets the value of the appearanceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}
     *     
     */
    public void setAppearanceData(JAXBElement<SimpleNameValueCollection> value) {
        this.appearanceData = value;
    }

    /**
     * Gets the value of the instanceData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}
     *     
     */
    public JAXBElement<SimpleNameValueCollection> getInstanceData() {
        return instanceData;
    }

    /**
     * Sets the value of the instanceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}
     *     
     */
    public void setInstanceData(JAXBElement<SimpleNameValueCollection> value) {
        this.instanceData = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemId(Integer value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}
     *     
     */
    public JAXBElement<SimpleNameValueCollection> getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}
     *     
     */
    public void setMetadata(JAXBElement<SimpleNameValueCollection> value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the parentTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentTemplateId() {
        return parentTemplateId;
    }

    /**
     * Sets the value of the parentTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentTemplateId(Integer value) {
        this.parentTemplateId = value;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeName(JAXBElement<String> value) {
        this.typeName = value;
    }

}

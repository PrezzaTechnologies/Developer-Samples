
package com.checkbox.ftpresponseexporter.responsedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EscapedUniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupMemberships" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="IsInList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LockedOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Profile" type="{http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies}SimpleNameValueCollection" minOccurs="0"/>
 *         &lt;element name="RoleMemberships" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="UniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserData", propOrder = {
    "authenticationType",
    "email",
    "escapedUniqueIdentifier",
    "groupMemberships",
    "isInList",
    "lockedOut",
    "profile",
    "roleMemberships",
    "uniqueIdentifier",
    "userGuid"
})
public class UserData {

    @XmlElementRef(name = "AuthenticationType", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authenticationType;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "EscapedUniqueIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<String> escapedUniqueIdentifier;
    @XmlElementRef(name = "GroupMemberships", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> groupMemberships;
    @XmlElement(name = "IsInList")
    protected Boolean isInList;
    @XmlElement(name = "LockedOut")
    protected Boolean lockedOut;
    @XmlElementRef(name = "Profile", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleNameValueCollection> profile;
    @XmlElementRef(name = "RoleMemberships", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> roleMemberships;
    @XmlElementRef(name = "UniqueIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uniqueIdentifier;
    @XmlElement(name = "UserGuid")
    protected String userGuid;

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthenticationType(JAXBElement<String> value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the escapedUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEscapedUniqueIdentifier() {
        return escapedUniqueIdentifier;
    }

    /**
     * Sets the value of the escapedUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEscapedUniqueIdentifier(JAXBElement<String> value) {
        this.escapedUniqueIdentifier = value;
    }

    /**
     * Gets the value of the groupMemberships property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getGroupMemberships() {
        return groupMemberships;
    }

    /**
     * Sets the value of the groupMemberships property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setGroupMemberships(JAXBElement<ArrayOfstring> value) {
        this.groupMemberships = value;
    }

    /**
     * Gets the value of the isInList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInList() {
        return isInList;
    }

    /**
     * Sets the value of the isInList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInList(Boolean value) {
        this.isInList = value;
    }

    /**
     * Gets the value of the lockedOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockedOut() {
        return lockedOut;
    }

    /**
     * Sets the value of the lockedOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockedOut(Boolean value) {
        this.lockedOut = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}
     *     
     */
    public JAXBElement<SimpleNameValueCollection> getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleNameValueCollection }{@code >}
     *     
     */
    public void setProfile(JAXBElement<SimpleNameValueCollection> value) {
        this.profile = value;
    }

    /**
     * Gets the value of the roleMemberships property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getRoleMemberships() {
        return roleMemberships;
    }

    /**
     * Sets the value of the roleMemberships property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setRoleMemberships(JAXBElement<ArrayOfstring> value) {
        this.roleMemberships = value;
    }

    /**
     * Gets the value of the uniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    /**
     * Sets the value of the uniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUniqueIdentifier(JAXBElement<String> value) {
        this.uniqueIdentifier = value;
    }

    /**
     * Gets the value of the userGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGuid() {
        return userGuid;
    }

    /**
     * Sets the value of the userGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGuid(String value) {
        this.userGuid = value;
    }

}

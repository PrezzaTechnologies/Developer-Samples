
package com.checkbox.ftpresponseexporter.authentication;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.checkbox.ftpresponseexporter.authentication package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _LoginUserName_QNAME = new QName("http://tempuri.org/", "userName");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ServiceOperationResultOfstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfstring");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ServiceOperationResultOfanyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfanyType");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ServiceOperationResultOfboolean_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ServiceOperationResultOfboolean");
    private final static QName _ServiceOperationResultOfbooleanFailureExceptionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "FailureExceptionType");
    private final static QName _ServiceOperationResultOfbooleanFailureMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "FailureMessage");
    private final static QName _ServiceOperationResultOfanyTypeResultData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", "ResultData");
    private final static QName _IsLoggedInResponseIsLoggedInResult_QNAME = new QName("http://tempuri.org/", "IsLoggedInResult");
    private final static QName _LoginResponseLoginResult_QNAME = new QName("http://tempuri.org/", "LoginResult");
    private final static QName _LogoutResponseLogoutResult_QNAME = new QName("http://tempuri.org/", "LogoutResult");
    private final static QName _ValidateUserResponseValidateUserResult_QNAME = new QName("http://tempuri.org/", "ValidateUserResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.checkbox.ftpresponseexporter.authentication
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfanyType }
     * 
     */
    public ServiceOperationResultOfanyType createServiceOperationResultOfanyType() {
        return new ServiceOperationResultOfanyType();
    }

    /**
     * Create an instance of {@link IsLoggedInResponse }
     * 
     */
    public IsLoggedInResponse createIsLoggedInResponse() {
        return new IsLoggedInResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfboolean }
     * 
     */
    public ServiceOperationResultOfboolean createServiceOperationResultOfboolean() {
        return new ServiceOperationResultOfboolean();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link IsLoggedIn }
     * 
     */
    public IsLoggedIn createIsLoggedIn() {
        return new IsLoggedIn();
    }

    /**
     * Create an instance of {@link ValidateUser }
     * 
     */
    public ValidateUser createValidateUser() {
        return new ValidateUser();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ServiceOperationResultOfstring }
     * 
     */
    public ServiceOperationResultOfstring createServiceOperationResultOfstring() {
        return new ServiceOperationResultOfstring();
    }

    /**
     * Create an instance of {@link ValidateUserResponse }
     * 
     */
    public ValidateUserResponse createValidateUserResponse() {
        return new ValidateUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Login.class)
    public JAXBElement<String> createLoginPassword(String value) {
        return new JAXBElement<String>(_LoginPassword_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userName", scope = Login.class)
    public JAXBElement<String> createLoginUserName(String value) {
        return new JAXBElement<String>(_LoginUserName_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfstring")
    public JAXBElement<ServiceOperationResultOfstring> createServiceOperationResultOfstring(ServiceOperationResultOfstring value) {
        return new JAXBElement<ServiceOperationResultOfstring>(_ServiceOperationResultOfstring_QNAME, ServiceOperationResultOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfanyType")
    public JAXBElement<ServiceOperationResultOfanyType> createServiceOperationResultOfanyType(ServiceOperationResultOfanyType value) {
        return new JAXBElement<ServiceOperationResultOfanyType>(_ServiceOperationResultOfanyType_QNAME, ServiceOperationResultOfanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfboolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ServiceOperationResultOfboolean")
    public JAXBElement<ServiceOperationResultOfboolean> createServiceOperationResultOfboolean(ServiceOperationResultOfboolean value) {
        return new JAXBElement<ServiceOperationResultOfboolean>(_ServiceOperationResultOfboolean_QNAME, ServiceOperationResultOfboolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfboolean.class)
    public JAXBElement<String> createServiceOperationResultOfbooleanFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfbooleanFailureExceptionType_QNAME, String.class, ServiceOperationResultOfboolean.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfboolean.class)
    public JAXBElement<String> createServiceOperationResultOfbooleanFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfbooleanFailureMessage_QNAME, String.class, ServiceOperationResultOfboolean.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfanyType.class)
    public JAXBElement<String> createServiceOperationResultOfanyTypeFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfbooleanFailureExceptionType_QNAME, String.class, ServiceOperationResultOfanyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfanyType.class)
    public JAXBElement<Object> createServiceOperationResultOfanyTypeResultData(Object value) {
        return new JAXBElement<Object>(_ServiceOperationResultOfanyTypeResultData_QNAME, Object.class, ServiceOperationResultOfanyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfanyType.class)
    public JAXBElement<String> createServiceOperationResultOfanyTypeFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfbooleanFailureMessage_QNAME, String.class, ServiceOperationResultOfanyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = ValidateUser.class)
    public JAXBElement<String> createValidateUserPassword(String value) {
        return new JAXBElement<String>(_LoginPassword_QNAME, String.class, ValidateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userName", scope = ValidateUser.class)
    public JAXBElement<String> createValidateUserUserName(String value) {
        return new JAXBElement<String>(_LoginUserName_QNAME, String.class, ValidateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureExceptionType", scope = ServiceOperationResultOfstring.class)
    public JAXBElement<String> createServiceOperationResultOfstringFailureExceptionType(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfbooleanFailureExceptionType_QNAME, String.class, ServiceOperationResultOfstring.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "ResultData", scope = ServiceOperationResultOfstring.class)
    public JAXBElement<String> createServiceOperationResultOfstringResultData(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfanyTypeResultData_QNAME, String.class, ServiceOperationResultOfstring.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Checkbox.Wcf.Services.Proxies", name = "FailureMessage", scope = ServiceOperationResultOfstring.class)
    public JAXBElement<String> createServiceOperationResultOfstringFailureMessage(String value) {
        return new JAXBElement<String>(_ServiceOperationResultOfbooleanFailureMessage_QNAME, String.class, ServiceOperationResultOfstring.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfboolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IsLoggedInResult", scope = IsLoggedInResponse.class)
    public JAXBElement<ServiceOperationResultOfboolean> createIsLoggedInResponseIsLoggedInResult(ServiceOperationResultOfboolean value) {
        return new JAXBElement<ServiceOperationResultOfboolean>(_IsLoggedInResponseIsLoggedInResult_QNAME, ServiceOperationResultOfboolean.class, IsLoggedInResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoginResult", scope = LoginResponse.class)
    public JAXBElement<ServiceOperationResultOfstring> createLoginResponseLoginResult(ServiceOperationResultOfstring value) {
        return new JAXBElement<ServiceOperationResultOfstring>(_LoginResponseLoginResult_QNAME, ServiceOperationResultOfstring.class, LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LogoutResult", scope = LogoutResponse.class)
    public JAXBElement<ServiceOperationResultOfanyType> createLogoutResponseLogoutResult(ServiceOperationResultOfanyType value) {
        return new JAXBElement<ServiceOperationResultOfanyType>(_LogoutResponseLogoutResult_QNAME, ServiceOperationResultOfanyType.class, LogoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOperationResultOfboolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ValidateUserResult", scope = ValidateUserResponse.class)
    public JAXBElement<ServiceOperationResultOfboolean> createValidateUserResponseValidateUserResult(ServiceOperationResultOfboolean value) {
        return new JAXBElement<ServiceOperationResultOfboolean>(_ValidateUserResponseValidateUserResult_QNAME, ServiceOperationResultOfboolean.class, ValidateUserResponse.class, value);
    }

}

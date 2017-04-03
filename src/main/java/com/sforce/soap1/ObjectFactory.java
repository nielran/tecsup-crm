//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.03 a las 04:06:05 PM COT 
//


package com.sforce.soap1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sforce.soap1 package. 
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

    private final static QName _Fault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "fault");
    private final static QName _LoginFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "LoginFault");
    private final static QName _InvalidIdFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault");
    private final static QName _UnexpectedErrorFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sforce.soap1
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
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginResult }
     * 
     */
    public LoginResult createLoginResult() {
        return new LoginResult();
    }

    /**
     * Create an instance of {@link ExtendedErrorDetails }
     * 
     */
    public ExtendedErrorDetails createExtendedErrorDetails() {
        return new ExtendedErrorDetails();
    }

    /**
     * Create an instance of {@link GetUserInfoResult }
     * 
     */
    public GetUserInfoResult createGetUserInfoResult() {
        return new GetUserInfoResult();
    }

    /**
     * Create an instance of {@link ApiFault }
     * 
     */
    public ApiFault createApiFault() {
        return new ApiFault();
    }

    /**
     * Create an instance of {@link LoginFault }
     * 
     */
    public LoginFault createLoginFault() {
        return new LoginFault();
    }

    /**
     * Create an instance of {@link InvalidIdFault }
     * 
     */
    public InvalidIdFault createInvalidIdFault() {
        return new InvalidIdFault();
    }

    /**
     * Create an instance of {@link UnexpectedErrorFault }
     * 
     */
    public UnexpectedErrorFault createUnexpectedErrorFault() {
        return new UnexpectedErrorFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "fault")
    public JAXBElement<ApiFault> createFault(ApiFault value) {
        return new JAXBElement<ApiFault>(_Fault_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "LoginFault")
    public JAXBElement<LoginFault> createLoginFault(LoginFault value) {
        return new JAXBElement<LoginFault>(_LoginFault_QNAME, LoginFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidIdFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "InvalidIdFault")
    public JAXBElement<InvalidIdFault> createInvalidIdFault(InvalidIdFault value) {
        return new JAXBElement<InvalidIdFault>(_InvalidIdFault_QNAME, InvalidIdFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnexpectedErrorFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "UnexpectedErrorFault")
    public JAXBElement<UnexpectedErrorFault> createUnexpectedErrorFault(UnexpectedErrorFault value) {
        return new JAXBElement<UnexpectedErrorFault>(_UnexpectedErrorFault_QNAME, UnexpectedErrorFault.class, null, value);
    }

}

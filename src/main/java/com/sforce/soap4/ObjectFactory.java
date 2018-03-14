
package com.sforce.soap4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the yyyy package. 
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

    private final static QName _ObjResponseBlnResultado_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "blnResultado");
    private final static QName _ObjResponseStrMensajeError_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strMensajeError");
    private final static QName _ObjResponseStrIdContacto_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strIdContacto");
    private final static QName _ObjRequestStrEstadoCivil_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strEstadoCivil");
    private final static QName _ObjRequestStrTipoDocumento_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strTipoDocumento");
    private final static QName _ObjRequestStrOficina_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strOficina");
    private final static QName _ObjRequestStrPrimerNombre_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strPrimerNombre");
    private final static QName _ObjRequestStrTelefonoCasa_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strTelefonoCasa");
    private final static QName _ObjRequestStrApellidoMaterno_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strApellidoMaterno");
    private final static QName _ObjRequestStrGenero_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strGenero");
    private final static QName _ObjRequestStrLeadSource_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strLeadSource");
    private final static QName _ObjRequestStrFecNac_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strFecNac");
    private final static QName _ObjRequestStrSede_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strSede");
    private final static QName _ObjRequestStrLastName_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strLastName");
    private final static QName _ObjRequestStrRecordTypeId_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strRecordTypeId");
    private final static QName _ObjRequestStrOwnerId_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strOwnerId");
    private final static QName _ObjRequestStrTipoPersona_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strTipoPersona");
    private final static QName _ObjRequestStrEmail_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strEmail");
    private final static QName _ObjRequestStrCelular_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strCelular");
    private final static QName _ObjRequestStrCodPersona_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strCodPersona");
    private final static QName _ObjRequestStrSegundoNombre_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strSegundoNombre");
    private final static QName _ObjRequestStrDomicilio_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strDomicilio");
    private final static QName _ObjRequestStrFecAceptaLey_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strFecAceptaLey");
    private final static QName _ObjRequestStrNumDocumento_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strNumDocumento");
    private final static QName _ObjRequestStrTipoOperacion_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strTipoOperacion");
    private final static QName _ObjRequestStrEmailActualizador_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", "strEmailActualizador");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: yyyy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SincronizarContactosResponse }
     * 
     */
    public SincronizarContactosResponse createSincronizarContactosResponse() {
        return new SincronizarContactosResponse();
    }

    /**
     * Create an instance of {@link ObjResponse4 }
     * 
     */
    public ObjResponse4 createObjResponse() {
        return new ObjResponse4();
    }


    /**
     * Create an instance of {@link SincronizarContactos }
     *
     */
    public SincronizarContactos createSincronizarContactos() {
        return new SincronizarContactos();
    }

    /**
     * Create an instance of {@link ObjRequest4 }
     *
     */
    public ObjRequest4 createObjRequest() {
        return new ObjRequest4();
    }

    /**
     * Create an instance of {@link SessionHeader }
     *
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strEstadoCivil", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrEstadoCivil(String value) {
        return new JAXBElement<String>(_ObjRequestStrEstadoCivil_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strTipoDocumento", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrTipoDocumento(String value) {
        return new JAXBElement<String>(_ObjRequestStrTipoDocumento_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strOficina", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrOficina(String value) {
        return new JAXBElement<String>(_ObjRequestStrOficina_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strPrimerNombre", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrPrimerNombre(String value) {
        return new JAXBElement<String>(_ObjRequestStrPrimerNombre_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strTelefonoCasa", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrTelefonoCasa(String value) {
        return new JAXBElement<String>(_ObjRequestStrTelefonoCasa_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strApellidoMaterno", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrApellidoMaterno(String value) {
        return new JAXBElement<String>(_ObjRequestStrApellidoMaterno_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strGenero", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrGenero(String value) {
        return new JAXBElement<String>(_ObjRequestStrGenero_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strLeadSource", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrLeadSource(String value) {
        return new JAXBElement<String>(_ObjRequestStrLeadSource_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strFecNac", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrFecNac(String value) {
        return new JAXBElement<String>(_ObjRequestStrFecNac_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strSede", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrSede(String value) {
        return new JAXBElement<String>(_ObjRequestStrSede_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strLastName", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrLastName(String value) {
        return new JAXBElement<String>(_ObjRequestStrLastName_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strRecordTypeId", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrRecordTypeId(String value) {
        return new JAXBElement<String>(_ObjRequestStrRecordTypeId_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strOwnerId", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrOwnerId(String value) {
        return new JAXBElement<String>(_ObjRequestStrOwnerId_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strTipoPersona", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrTipoPersona(String value) {
        return new JAXBElement<String>(_ObjRequestStrTipoPersona_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strEmail", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrEmail(String value) {
        return new JAXBElement<String>(_ObjRequestStrEmail_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strCelular", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrCelular(String value) {
        return new JAXBElement<String>(_ObjRequestStrCelular_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strCodPersona", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrCodPersona(String value) {
        return new JAXBElement<String>(_ObjRequestStrCodPersona_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strSegundoNombre", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrSegundoNombre(String value) {
        return new JAXBElement<String>(_ObjRequestStrSegundoNombre_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strDomicilio", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrDomicilio(String value) {
        return new JAXBElement<String>(_ObjRequestStrDomicilio_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strFecAceptaLey", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrFecAceptaLey(String value) {
        return new JAXBElement<String>(_ObjRequestStrFecAceptaLey_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strNumDocumento", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrNumDocumento(String value) {
        return new JAXBElement<String>(_ObjRequestStrNumDocumento_QNAME, String.class, ObjRequest4.class, value);
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "blnResultado", scope = ObjResponse4.class)
    public JAXBElement<Boolean> createObjResponseBlnResultado(Boolean value) {
        return new JAXBElement<Boolean>(_ObjResponseBlnResultado_QNAME, Boolean.class, ObjResponse4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strMensajeError", scope = ObjResponse4.class)
    public JAXBElement<String> createObjResponseStrMensajeError(String value) {
        return new JAXBElement<String>(_ObjResponseStrMensajeError_QNAME, String.class, ObjResponse4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strIdContacto", scope = ObjResponse4.class)
    public JAXBElement<String> createObjResponseStrIdContacto(String value) {
        return new JAXBElement<String>(_ObjResponseStrIdContacto_QNAME, String.class, ObjResponse4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strTipoOperacion", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrTipoOperacion(String value) {
        return new JAXBElement<String>(_ObjRequestStrTipoOperacion_QNAME, String.class, ObjRequest4.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", name = "strEmailActualizador", scope = ObjRequest4.class)
    public JAXBElement<String> createObjRequestStrEmailActualizador(String value) {
        return new JAXBElement<String>(_ObjRequestStrEmailActualizador_QNAME, String.class, ObjRequest4.class, value);
    }
}

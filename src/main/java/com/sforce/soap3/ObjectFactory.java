//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.03 a las 04:06:06 PM COT 
//


package com.sforce.soap3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sforce.soap3 package. 
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

    private final static QName _ObjRequestStrTipoVenta_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strTipoVenta");
    private final static QName _ObjRequestStrMoneda_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strMoneda");
    private final static QName _ObjRequestNumMonto_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "numMonto");
    private final static QName _ObjResponseBlnResultado_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "blnResultado");
    private final static QName _ObjResponseStrIdCourseEnrollment_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strIdCourseEnrollment");
    private final static QName _ObjResponseStrMensajeError_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strMensajeError");
    private final static QName _ObjRequestStrAuspiciador_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strAuspiciador");
    private final static QName _ObjRequestStrConvenio_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strConvenio");
    private final static QName _ObjRequestStrEstado_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strEstado");
    private final static QName _ObjRequestStrIdCursoTecsup_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strIdCursoTecsup");
    private final static QName _ObjRequestStrIdTerminoTecsup_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strIdTerminoTecsup");
    private final static QName _ObjRequestStrNumeroDocContacto_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strNumeroDocContacto");
    private final static QName _ObjRequestStrTipoDocContacto_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strTipoDocContacto");
    private final static QName _ObjRequestStrTipoOperacion_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", "strTipoOperacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sforce.soap3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SessionHeader }
     * 
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }

    /**
     * Create an instance of {@link ProductosAdquiridosPorCliente }
     * 
     */
    public ProductosAdquiridosPorCliente createProductosAdquiridosPorCliente() {
        return new ProductosAdquiridosPorCliente();
    }

    /**
     * Create an instance of {@link ObjRequest }
     * 
     */
    public ObjRequest createObjRequest() {
        return new ObjRequest();
    }

    /**
     * Create an instance of {@link ProductosAdquiridosPorClienteResponse }
     * 
     */
    public ProductosAdquiridosPorClienteResponse createProductosAdquiridosPorClienteResponse() {
        return new ProductosAdquiridosPorClienteResponse();
    }

    /**
     * Create an instance of {@link ObjResponse }
     * 
     */
    public ObjResponse createObjResponse() {
        return new ObjResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "blnResultado", scope = ObjResponse.class)
    public JAXBElement<Boolean> createObjResponseBlnResultado(Boolean value) {
        return new JAXBElement<Boolean>(_ObjResponseBlnResultado_QNAME, Boolean.class, ObjResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strIdCourseEnrollment", scope = ObjResponse.class)
    public JAXBElement<String> createObjResponseStrIdCourseEnrollment(String value) {
        return new JAXBElement<String>(_ObjResponseStrIdCourseEnrollment_QNAME, String.class, ObjResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strMensajeError", scope = ObjResponse.class)
    public JAXBElement<String> createObjResponseStrMensajeError(String value) {
        return new JAXBElement<String>(_ObjResponseStrMensajeError_QNAME, String.class, ObjResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strAuspiciador", scope = ObjRequest.class)
    public JAXBElement<String> createObjRequestStrAuspiciador(String value) {
        return new JAXBElement<String>(_ObjRequestStrAuspiciador_QNAME, String.class, ObjRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strConvenio", scope = ObjRequest.class)
    public JAXBElement<String> createObjRequestStrConvenio(String value) {
        return new JAXBElement<String>(_ObjRequestStrConvenio_QNAME, String.class, ObjRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strEstado", scope = ObjRequest.class)
    public JAXBElement<String> createObjRequestStrEstado(String value) {
        return new JAXBElement<String>(_ObjRequestStrEstado_QNAME, String.class, ObjRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strIdCursoTecsup", scope = ObjRequest.class)
    public JAXBElement<String> createObjRequestStrIdCursoTecsup(String value) {
        return new JAXBElement<String>(_ObjRequestStrIdCursoTecsup_QNAME, String.class, ObjRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strIdTerminoTecsup", scope = ObjRequest.class)
    public JAXBElement<String> createObjRequestStrIdTerminoTecsup(String value) {
        return new JAXBElement<String>(_ObjRequestStrIdTerminoTecsup_QNAME, String.class, ObjRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strNumeroDocContacto", scope = ObjRequest.class)
    public JAXBElement<String> createObjRequestStrNumeroDocContacto(String value) {
        return new JAXBElement<String>(_ObjRequestStrNumeroDocContacto_QNAME, String.class, ObjRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strTipoDocContacto", scope = ObjRequest.class)
    public JAXBElement<String> createObjRequestStrTipoDocContacto(String value) {
        return new JAXBElement<String>(_ObjRequestStrTipoDocContacto_QNAME, String.class, ObjRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strTipoOperacion", scope = ObjRequest.class)
    public JAXBElement<String> createObjRequestStrTipoOperacion(String value) {
        return new JAXBElement<String>(_ObjRequestStrTipoOperacion_QNAME, String.class, ObjRequest.class, value);
    }

    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strMoneda", scope = ObjRequest.class)
    public JAXBElement<String> createObjRequestStrMoneda(String value) {
        return new JAXBElement<String>(_ObjRequestStrMoneda_QNAME, String.class, ObjRequest.class, value);
    }

    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "numMonto", scope = ObjRequest.class)
    public JAXBElement<Double> createObjRequestNumMonto(Double value) {
        return new JAXBElement<Double>(_ObjRequestNumMonto_QNAME, Double.class, ObjRequest.class, value);
    }

    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", name = "strTipoVenta", scope = ObjRequest.class)
    public JAXBElement<String> createObjRequestStrTipoVenta(String value) {
        return new JAXBElement<String>(_ObjRequestStrTipoVenta_QNAME, String.class, ObjRequest.class, value);
    }
}

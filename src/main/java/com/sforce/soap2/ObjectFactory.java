//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.03 a las 04:06:06 PM COT 
//


package com.sforce.soap2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sforce.soap2 package. 
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

    private final static QName _TECActualizarProductoResponseClsError_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", "Error");
    private final static QName _TECActualizarProductoResponseClsIdCurso_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", "IdCurso");
    private final static QName _TECActualizarProductoResponseClsIdOfertaCurso_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", "IdOfertaCurso");
    private final static QName _TECActualizarProductoResponseClsIdPeriodo_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", "IdPeriodo");
    private final static QName _TECActualizarProductoResponseClsResultado_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", "Resultado");
    private final static QName _TECActualizarProductoRequestClsAbreviatura_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "Abreviatura");
    private final static QName _TECActualizarProductoRequestClsCapacidad_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "Capacidad");
    private final static QName _TECActualizarProductoRequestClsDescripcionCurso_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "DescripcionCurso");
    private final static QName _TECActualizarProductoRequestClsDescripcionPeriodo_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "DescripcionPeriodo");
    private final static QName _TECActualizarProductoRequestClsEstado_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "Estado");
    private final static QName _TECActualizarProductoRequestClsFamilia_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "Familia");
    private final static QName _TECActualizarProductoRequestClsFechaFin_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "FechaFin");
    private final static QName _TECActualizarProductoRequestClsFechaInicio_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "FechaInicio");
    private final static QName _TECActualizarProductoRequestClsHoras_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "Horas");
    private final static QName _TECActualizarProductoRequestClsIdTecsupArea_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "IdTecsupArea");
    private final static QName _TECActualizarProductoRequestClsIdTecsupCurso_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "IdTecsupCurso");
    private final static QName _TECActualizarProductoRequestClsIdTecsupPeriodo_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "IdTecsupPeriodo");
    private final static QName _TECActualizarProductoRequestClsNombreCurso_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "NombreCurso");
    private final static QName _TECActualizarProductoRequestClsNombrePeriodo_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "NombrePeriodo");
    private final static QName _TECActualizarProductoRequestClsOficina_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "Oficina");
    private final static QName _TECActualizarProductoRequestClsSeccion_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "Seccion");
    private final static QName _TECActualizarProductoRequestClsSede_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "Sede");
    private final static QName _TECActualizarProductoRequestClsTipo_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "Tipo");
    private final static QName _TECActualizarProductoRequestClsTipoOperacion_QNAME = new QName("http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", "TipoOperacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sforce.soap2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TECActualizarProductoRequestCls }
     * 
     */
    public TECActualizarProductoRequestCls createTECActualizarProductoRequestCls() {
        return new TECActualizarProductoRequestCls();
    }

    /**
     * Create an instance of {@link TECActualizarProductoResponseCls }
     * 
     */
    public TECActualizarProductoResponseCls createTECActualizarProductoResponseCls() {
        return new TECActualizarProductoResponseCls();
    }

    /**
     * Create an instance of {@link SessionHeader }
     * 
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }

    /**
     * Create an instance of {@link PersistirProducto }
     * 
     */
    public PersistirProducto createPersistirProducto() {
        return new PersistirProducto();
    }

    /**
     * Create an instance of {@link PersistirProductoResponse }
     * 
     */
    public PersistirProductoResponse createPersistirProductoResponse() {
        return new PersistirProductoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", name = "Error", scope = TECActualizarProductoResponseCls.class)
    public JAXBElement<String> createTECActualizarProductoResponseClsError(String value) {
        return new JAXBElement<String>(_TECActualizarProductoResponseClsError_QNAME, String.class, TECActualizarProductoResponseCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", name = "IdCurso", scope = TECActualizarProductoResponseCls.class)
    public JAXBElement<String> createTECActualizarProductoResponseClsIdCurso(String value) {
        return new JAXBElement<String>(_TECActualizarProductoResponseClsIdCurso_QNAME, String.class, TECActualizarProductoResponseCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", name = "IdOfertaCurso", scope = TECActualizarProductoResponseCls.class)
    public JAXBElement<String> createTECActualizarProductoResponseClsIdOfertaCurso(String value) {
        return new JAXBElement<String>(_TECActualizarProductoResponseClsIdOfertaCurso_QNAME, String.class, TECActualizarProductoResponseCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", name = "IdPeriodo", scope = TECActualizarProductoResponseCls.class)
    public JAXBElement<String> createTECActualizarProductoResponseClsIdPeriodo(String value) {
        return new JAXBElement<String>(_TECActualizarProductoResponseClsIdPeriodo_QNAME, String.class, TECActualizarProductoResponseCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", name = "Resultado", scope = TECActualizarProductoResponseCls.class)
    public JAXBElement<Boolean> createTECActualizarProductoResponseClsResultado(Boolean value) {
        return new JAXBElement<Boolean>(_TECActualizarProductoResponseClsResultado_QNAME, Boolean.class, TECActualizarProductoResponseCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "Abreviatura", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsAbreviatura(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsAbreviatura_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "Capacidad", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<Integer> createTECActualizarProductoRequestClsCapacidad(Integer value) {
        return new JAXBElement<Integer>(_TECActualizarProductoRequestClsCapacidad_QNAME, Integer.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "DescripcionCurso", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsDescripcionCurso(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsDescripcionCurso_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "DescripcionPeriodo", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsDescripcionPeriodo(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsDescripcionPeriodo_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "Estado", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsEstado(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsEstado_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "Familia", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsFamilia(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsFamilia_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "FechaFin", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsFechaFin(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsFechaFin_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "FechaInicio", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsFechaInicio(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsFechaInicio_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "Horas", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<Integer> createTECActualizarProductoRequestClsHoras(Integer value) {
        return new JAXBElement<Integer>(_TECActualizarProductoRequestClsHoras_QNAME, Integer.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "IdTecsupArea", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsIdTecsupArea(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsIdTecsupArea_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "IdTecsupCurso", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsIdTecsupCurso(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsIdTecsupCurso_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "IdTecsupPeriodo", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsIdTecsupPeriodo(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsIdTecsupPeriodo_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "NombreCurso", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsNombreCurso(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsNombreCurso_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "NombrePeriodo", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsNombrePeriodo(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsNombrePeriodo_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "Seccion", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsSeccion(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsSeccion_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /* Oficina

     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "Oficina", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsOficina(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsOficina_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "Sede", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsSede(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsSede_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "Tipo", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsTipo(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsTipo_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }

    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", name = "TipoOperacion", scope = TECActualizarProductoRequestCls.class)
    public JAXBElement<String> createTECActualizarProductoRequestClsTipoOperacion(String value) {
        return new JAXBElement<String>(_TECActualizarProductoRequestClsTipoOperacion_QNAME, String.class, TECActualizarProductoRequestCls.class, value);
    }
}

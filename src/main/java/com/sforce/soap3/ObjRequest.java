//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.03 a las 04:06:06 PM COT 
//


package com.sforce.soap3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para objRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="objRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strAuspiciador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strIdCursoTecsup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strIdTerminoTecsup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strNumeroDocContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strTipoDocContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strTipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objRequest", propOrder = {
    "strIDInscriptor","strFecInscripcion",
    "strMotivoAnulacion",
    "strTipoVenta",
    "strMoneda",
    "numMonto",
    "strAuspiciador",
    "strConvenio",
    "strEstado",
    "strIdCursoTecsup",
    "strIdTerminoTecsup",
    "strNumeroDocContacto",
    "strTipoDocContacto",
    "strTipoOperacion"
})
public class ObjRequest {

    @XmlElementRef(name = "strIDInscriptor", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strIDInscriptor;
    @XmlElementRef(name = "strFecInscripcion", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strFecInscripcion;
    @XmlElementRef(name = "strMotivoAnulacion", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strMotivoAnulacion;
    @XmlElementRef(name = "strTipoVenta", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strTipoVenta;
    @XmlElementRef(name = "strMoneda", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strMoneda;
    @XmlElementRef(name = "numMonto", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> numMonto;
    @XmlElementRef(name = "strAuspiciador", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strAuspiciador;
    @XmlElementRef(name = "strConvenio", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strConvenio;
    @XmlElementRef(name = "strEstado", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strEstado;
    @XmlElementRef(name = "strIdCursoTecsup", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strIdCursoTecsup;
    @XmlElementRef(name = "strIdTerminoTecsup", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strIdTerminoTecsup;
    @XmlElementRef(name = "strNumeroDocContacto", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strNumeroDocContacto;
    @XmlElementRef(name = "strTipoDocContacto", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strTipoDocContacto;
    @XmlElementRef(name = "strTipoOperacion", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strTipoOperacion;

    /**
     * Obtiene el valor de la propiedad strAuspiciador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrAuspiciador() {
        return strAuspiciador;
    }

    /**
     * Define el valor de la propiedad strAuspiciador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrAuspiciador(JAXBElement<String> value) {
        this.strAuspiciador = value;
    }

    /**
     * Obtiene el valor de la propiedad strConvenio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrConvenio() {
        return strConvenio;
    }

    /**
     * Define el valor de la propiedad strConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrConvenio(JAXBElement<String> value) {
        this.strConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad strEstado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrEstado() {
        return strEstado;
    }

    /**
     * Define el valor de la propiedad strEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrEstado(JAXBElement<String> value) {
        this.strEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad strIdCursoTecsup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrIdCursoTecsup() {
        return strIdCursoTecsup;
    }

    /**
     * Define el valor de la propiedad strIdCursoTecsup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrIdCursoTecsup(JAXBElement<String> value) {
        this.strIdCursoTecsup = value;
    }

    /**
     * Obtiene el valor de la propiedad strIdTerminoTecsup.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrIdTerminoTecsup() {
        return strIdTerminoTecsup;
    }

    /**
     * Define el valor de la propiedad strIdTerminoTecsup.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrIdTerminoTecsup(JAXBElement<String> value) {
        this.strIdTerminoTecsup = value;
    }

    /**
     * Obtiene el valor de la propiedad strNumeroDocContacto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrNumeroDocContacto() {
        return strNumeroDocContacto;
    }

    /**
     * Define el valor de la propiedad strNumeroDocContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrNumeroDocContacto(JAXBElement<String> value) {
        this.strNumeroDocContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad strTipoDocContacto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrTipoDocContacto() {
        return strTipoDocContacto;
    }

    /**
     * Define el valor de la propiedad strTipoDocContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrTipoDocContacto(JAXBElement<String> value) {
        this.strTipoDocContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad strTipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrTipoOperacion() {
        return strTipoOperacion;
    }

    /**
     * Define el valor de la propiedad strTipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrTipoOperacion(JAXBElement<String> value) {
        this.strTipoOperacion = value;
    }


    public JAXBElement<String> getStrMoneda() { return strMoneda; }

    public void setStrMoneda(JAXBElement<String> strMoneda) { this.strMoneda = strMoneda; }

    public JAXBElement<Double> getNumMonto() { return numMonto; }

    public void setNumMonto(JAXBElement<Double> numMonto) { this.numMonto = numMonto; }

    public JAXBElement<String> getStrTipoVenta() {
        return strTipoVenta;
    }

    public void setStrTipoVenta(JAXBElement<String> strTipoVenta) {
        this.strTipoVenta = strTipoVenta;
    }

    public JAXBElement<String> getStrMotivoAnulacion() {
        return strMotivoAnulacion;
    }

    public void setStrMotivoAnulacion(JAXBElement<String> strMotivoAnulacion) {
        this.strMotivoAnulacion = strMotivoAnulacion;
    }

    public JAXBElement<String> getStrFecInscripcion() {
        return strFecInscripcion;
    }

    public void setStrFecInscripcion(JAXBElement<String> strFecInscripcion) {
        this.strFecInscripcion = strFecInscripcion;
    }

    public JAXBElement<String> getStrIDInscriptor() {
        return strIDInscriptor;
    }

    public void setStrIDInscriptor(JAXBElement<String> strIDInscriptor) {
        this.strIDInscriptor = strIDInscriptor;
    }

    @XmlTransient
    private String update;

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }


}

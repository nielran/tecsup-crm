//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.03 a las 04:06:06 PM COT 
//


package com.sforce.soap3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para objResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="objResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blnResultado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="strIdCourseEnrollment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strMensajeError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objResponse", propOrder = {
    "blnResultado",
    "strIdCourseEnrollment",
    "strMensajeError"
})
public class ObjResponse {

    @XmlElementRef(name = "blnResultado", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> blnResultado;
    @XmlElementRef(name = "strIdCourseEnrollment", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strIdCourseEnrollment;
    @XmlElementRef(name = "strMensajeError", namespace = "http://soap.sforce.com/schemas/class/TEC_ProductosAdquiridosPorCliente_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strMensajeError;

    /**
     * Obtiene el valor de la propiedad blnResultado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBlnResultado() {
        return blnResultado;
    }

    /**
     * Define el valor de la propiedad blnResultado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBlnResultado(JAXBElement<Boolean> value) {
        this.blnResultado = value;
    }

    /**
     * Obtiene el valor de la propiedad strIdCourseEnrollment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrIdCourseEnrollment() {
        return strIdCourseEnrollment;
    }

    /**
     * Define el valor de la propiedad strIdCourseEnrollment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrIdCourseEnrollment(JAXBElement<String> value) {
        this.strIdCourseEnrollment = value;
    }

    /**
     * Obtiene el valor de la propiedad strMensajeError.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrMensajeError() {
        return strMensajeError;
    }

    /**
     * Define el valor de la propiedad strMensajeError.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrMensajeError(JAXBElement<String> value) {
        this.strMensajeError = value;
    }

}

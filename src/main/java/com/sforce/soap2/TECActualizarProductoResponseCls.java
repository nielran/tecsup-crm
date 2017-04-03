//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.03 a las 04:06:06 PM COT 
//


package com.sforce.soap2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TEC_Actualizar_ProductoResponse_cls complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TEC_Actualizar_ProductoResponse_cls"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdOfertaCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Resultado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEC_Actualizar_ProductoResponse_cls", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", propOrder = {
    "error",
    "idCurso",
    "idOfertaCurso",
    "idPeriodo",
    "resultado"
})
public class TECActualizarProductoResponseCls {

    @XmlElementRef(name = "Error", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> error;
    @XmlElementRef(name = "IdCurso", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idCurso;
    @XmlElementRef(name = "IdOfertaCurso", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idOfertaCurso;
    @XmlElementRef(name = "IdPeriodo", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idPeriodo;
    @XmlElementRef(name = "Resultado", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoResponse_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> resultado;

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setError(JAXBElement<String> value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad idCurso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdCurso() {
        return idCurso;
    }

    /**
     * Define el valor de la propiedad idCurso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdCurso(JAXBElement<String> value) {
        this.idCurso = value;
    }

    /**
     * Obtiene el valor de la propiedad idOfertaCurso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdOfertaCurso() {
        return idOfertaCurso;
    }

    /**
     * Define el valor de la propiedad idOfertaCurso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdOfertaCurso(JAXBElement<String> value) {
        this.idOfertaCurso = value;
    }

    /**
     * Obtiene el valor de la propiedad idPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdPeriodo() {
        return idPeriodo;
    }

    /**
     * Define el valor de la propiedad idPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdPeriodo(JAXBElement<String> value) {
        this.idPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setResultado(JAXBElement<Boolean> value) {
        this.resultado = value;
    }

}

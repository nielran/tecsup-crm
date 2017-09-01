//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.03 a las 04:06:06 PM COT 
//


package com.sforce.soap2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para TEC_Actualizar_ProductoRequest_cls complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TEC_Actualizar_ProductoRequest_cls"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Abreviatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Capacidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Familia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Horas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdTecsupArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdTecsupCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdTecsupPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreCurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombrePeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Oficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Seccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEC_Actualizar_ProductoRequest_cls", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", propOrder = {
    "abreviatura",
    "capacidad",
    "descripcionCurso",
    "descripcionPeriodo",
    "estado",
    "familia",
    "fechaFin",
    "fechaInicio",
    "horas",
    "idTecsupArea",
    "idTecsupCurso",
    "idTecsupPeriodo",
    "nombreCurso",
    "nombrePeriodo",
    "oficina",
    "seccion",
    "sede",
    "tipo",
    "tipoOperacion"
})
public class TECActualizarProductoRequestCls {

    @XmlElementRef(name = "Abreviatura", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abreviatura;
    @XmlElementRef(name = "Capacidad", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> capacidad;
    @XmlElementRef(name = "DescripcionCurso", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionCurso;
    @XmlElementRef(name = "DescripcionPeriodo", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionPeriodo;
    @XmlElementRef(name = "Estado", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElementRef(name = "Familia", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> familia;
    @XmlElementRef(name = "FechaFin", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaFin;
    @XmlElementRef(name = "FechaInicio", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaInicio;
    @XmlElementRef(name = "Horas", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> horas;
    @XmlElementRef(name = "IdTecsupArea", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idTecsupArea;
    @XmlElementRef(name = "IdTecsupCurso", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idTecsupCurso;
    @XmlElementRef(name = "IdTecsupPeriodo", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idTecsupPeriodo;
    @XmlElementRef(name = "NombreCurso", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreCurso;
    @XmlElementRef(name = "NombrePeriodo", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePeriodo;
    @XmlElementRef(name = "Oficina", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oficina;
    @XmlElementRef(name = "Seccion", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seccion;
    @XmlElementRef(name = "Sede", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sede;
    @XmlElementRef(name = "Tipo", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipo;
    @XmlElementRef(name = "TipoOperacion", namespace = "http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoOperacion;

    /**
     * Obtiene el valor de la propiedad oficina.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getOficina() {
        return oficina;
    }

    /**
     * Define el valor de la propiedad oficina.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setOficina(JAXBElement<String> value) {
        this.oficina = value;
    }

    /**
     * Obtiene el valor de la propiedad sede.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSede() {
        return sede;
    }

    /**
     * Define el valor de la propiedad sede.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSede(JAXBElement<String> value) {
        this.sede = value;
    }

    /**
     * Obtiene el valor de la propiedad abreviatura.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbreviatura() {
        return abreviatura;
    }

    /**
     * Define el valor de la propiedad abreviatura.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbreviatura(JAXBElement<String> value) {
        this.abreviatura = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCapacidad() {
        return capacidad;
    }

    /**
     * Define el valor de la propiedad capacidad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCapacidad(JAXBElement<Integer> value) {
        this.capacidad = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionCurso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionCurso() {
        return descripcionCurso;
    }

    /**
     * Define el valor de la propiedad descripcionCurso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionCurso(JAXBElement<String> value) {
        this.descripcionCurso = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionPeriodo() {
        return descripcionPeriodo;
    }

    /**
     * Define el valor de la propiedad descripcionPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionPeriodo(JAXBElement<String> value) {
        this.descripcionPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstado(JAXBElement<String> value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad familia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFamilia() {
        return familia;
    }

    /**
     * Define el valor de la propiedad familia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFamilia(JAXBElement<String> value) {
        this.familia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaFin(JAXBElement<String> value) {
        this.fechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaInicio(JAXBElement<String> value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad horas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoras() {
        return horas;
    }

    /**
     * Define el valor de la propiedad horas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoras(JAXBElement<Integer> value) {
        this.horas = value;
    }

    /**
     * Obtiene el valor de la propiedad idTecsupArea.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdTecsupArea() {
        return idTecsupArea;
    }

    /**
     * Define el valor de la propiedad idTecsupArea.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdTecsupArea(JAXBElement<String> value) {
        this.idTecsupArea = value;
    }

    /**
     * Obtiene el valor de la propiedad idTecsupCurso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdTecsupCurso() {
        return idTecsupCurso;
    }

    /**
     * Define el valor de la propiedad idTecsupCurso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdTecsupCurso(JAXBElement<String> value) {
        this.idTecsupCurso = value;
    }

    /**
     * Obtiene el valor de la propiedad idTecsupPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdTecsupPeriodo() {
        return idTecsupPeriodo;
    }

    /**
     * Define el valor de la propiedad idTecsupPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdTecsupPeriodo(JAXBElement<String> value) {
        this.idTecsupPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCurso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreCurso() {
        return nombreCurso;
    }

    /**
     * Define el valor de la propiedad nombreCurso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreCurso(JAXBElement<String> value) {
        this.nombreCurso = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePeriodo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePeriodo() {
        return nombrePeriodo;
    }

    /**
     * Define el valor de la propiedad nombrePeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePeriodo(JAXBElement<String> value) {
        this.nombrePeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad seccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeccion() {
        return seccion;
    }

    /**
     * Define el valor de la propiedad seccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeccion(JAXBElement<String> value) {
        this.seccion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipo(JAXBElement<String> value) {
        this.tipo = value;
    }


    public JAXBElement<String> getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(JAXBElement<String> tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
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

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.03 a las 04:06:06 PM COT 
//


package com.sforce.soap2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductoRequest" type="{http://soap.sforce.com/schemas/class/TEC_Actualizar_ProductoRequest_cls}TEC_Actualizar_ProductoRequest_cls"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productoRequest"
})
@XmlRootElement(name = "PersistirProducto")
public class PersistirProducto {

    @XmlElement(name = "ProductoRequest", required = true, nillable = true)
    protected TECActualizarProductoRequestCls productoRequest;

    /**
     * Obtiene el valor de la propiedad productoRequest.
     * 
     * @return
     *     possible object is
     *     {@link TECActualizarProductoRequestCls }
     *     
     */
    public TECActualizarProductoRequestCls getProductoRequest() {
        return productoRequest;
    }

    /**
     * Define el valor de la propiedad productoRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TECActualizarProductoRequestCls }
     *     
     */
    public void setProductoRequest(TECActualizarProductoRequestCls value) {
        this.productoRequest = value;
    }

}


package com.sforce.soap4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for objResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blnResultado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="strIdContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strMensajeError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "objResponse", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", propOrder = {
    "blnResultado",
    "strIdContacto",
    "strMensajeError"
})
public class ObjResponse4 {

    @XmlElementRef(name = "blnResultado", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> blnResultado;
    @XmlElementRef(name = "strIdContacto", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strIdContacto;
    @XmlElementRef(name = "strMensajeError", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strMensajeError;

    /**
     * Gets the value of the blnResultado property.
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
     * Sets the value of the blnResultado property.
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
     * Gets the value of the strIdContacto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrIdContacto() {
        return strIdContacto;
    }

    /**
     * Sets the value of the strIdContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrIdContacto(JAXBElement<String> value) {
        this.strIdContacto = value;
    }

    /**
     * Gets the value of the strMensajeError property.
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
     * Sets the value of the strMensajeError property.
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

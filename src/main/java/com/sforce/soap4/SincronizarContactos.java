
package com.sforce.soap4;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infoContacto" type="{http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws}objRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "infoContacto"
})
@XmlRootElement(name = "sincronizarContactos", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws")
public class SincronizarContactos {

    @XmlElement(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", required = true, nillable = true)
    protected ObjRequest4 infoContacto;

    /**
     * Gets the value of the infoContacto property.
     * 
     * @return
     *     possible object is
     *     {@link ObjRequest4 }
     *     
     */
    public ObjRequest4 getInfoContacto() {
        return infoContacto;
    }

    /**
     * Sets the value of the infoContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjRequest4 }
     *     
     */
    public void setInfoContacto(ObjRequest4 value) {
        this.infoContacto = value;
    }

}

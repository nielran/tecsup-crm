
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
 *         &lt;element name="result" type="{http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws}objResponse"/>
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
    "result"
})
@XmlRootElement(name = "sincronizarContactosResponse", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws")
public class SincronizarContactosResponse {

    @XmlElement(namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", required = true, nillable = true)
    protected ObjResponse4 result;

    /**
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link ObjResponse4 }
     *
     */
    public ObjResponse4 getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link ObjResponse4 }
     *
     */
    public void setResult(ObjResponse4 value) {
        this.result = value;
    }

}

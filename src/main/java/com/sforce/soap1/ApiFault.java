//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.03 a las 04:06:05 PM COT 
//


package com.sforce.soap1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ApiFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ApiFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exceptionCode" type="{urn:fault.partner.soap.sforce.com}ExceptionCode"/&gt;
 *         &lt;element name="exceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="extendedErrorDetails" type="{urn:partner.soap.sforce.com}ExtendedErrorDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiFault", namespace = "urn:fault.partner.soap.sforce.com", propOrder = {
    "exceptionCode",
    "exceptionMessage",
    "extendedErrorDetails"
})
@XmlSeeAlso({
    LoginFault.class,
    InvalidIdFault.class,
    UnexpectedErrorFault.class
})
public class ApiFault {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ExceptionCode exceptionCode;
    @XmlElement(required = true)
    protected String exceptionMessage;
    @XmlElement(nillable = true)
    protected List<ExtendedErrorDetails> extendedErrorDetails;

    /**
     * Obtiene el valor de la propiedad exceptionCode.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionCode }
     *     
     */
    public ExceptionCode getExceptionCode() {
        return exceptionCode;
    }

    /**
     * Define el valor de la propiedad exceptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionCode }
     *     
     */
    public void setExceptionCode(ExceptionCode value) {
        this.exceptionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad exceptionMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Define el valor de la propiedad exceptionMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessage(String value) {
        this.exceptionMessage = value;
    }

    /**
     * Gets the value of the extendedErrorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedErrorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedErrorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedErrorDetails }
     * 
     * 
     */
    public List<ExtendedErrorDetails> getExtendedErrorDetails() {
        if (extendedErrorDetails == null) {
            extendedErrorDetails = new ArrayList<ExtendedErrorDetails>();
        }
        return this.extendedErrorDetails;
    }

}

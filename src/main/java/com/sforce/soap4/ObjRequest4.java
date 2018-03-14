
package com.sforce.soap4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for objRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strApellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNumDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strPrimerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strSegundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objRequest4", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", propOrder = {
        "strApellidoMaterno",
        "strCelular",
        "strCodPersona",
        "strDomicilio",
        "strEmail",
        "strEstadoCivil",
        "strFecAceptaLey",
        "strFecNac",
        "strGenero",
        "strLastName",
        "strLeadSource",
        "strNumDocumento",
        "strOficina",
        "strOwnerId",
        "strPrimerNombre",
        "strRecordTypeId",
        "strSede",
        "strSegundoNombre",
        "strTelefonoCasa",
        "strTipoDocumento",
        "strTipoPersona",
        "strTipoOperacion",
        "strEmailActualizador"
})
public class ObjRequest4 {

    @XmlElementRef(name = "strApellidoMaterno", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strApellidoMaterno;
    @XmlElementRef(name = "strCelular", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strCelular;
    @XmlElementRef(name = "strCodPersona", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strCodPersona;
    @XmlElementRef(name = "strDomicilio", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strDomicilio;
    @XmlElementRef(name = "strEmail", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strEmail;
    @XmlElementRef(name = "strEstadoCivil", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strEstadoCivil;
    @XmlElementRef(name = "strFecAceptaLey", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strFecAceptaLey;
    @XmlElementRef(name = "strFecNac", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strFecNac;
    @XmlElementRef(name = "strGenero", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strGenero;
    @XmlElementRef(name = "strLastName", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strLastName;
    @XmlElementRef(name = "strLeadSource", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strLeadSource;
    @XmlElementRef(name = "strNumDocumento", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strNumDocumento;
    @XmlElementRef(name = "strOficina", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strOficina;
    @XmlElementRef(name = "strOwnerId", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strOwnerId;
    @XmlElementRef(name = "strPrimerNombre", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strPrimerNombre;
    @XmlElementRef(name = "strRecordTypeId", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strRecordTypeId;
    @XmlElementRef(name = "strSede", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strSede;
    @XmlElementRef(name = "strSegundoNombre", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strSegundoNombre;
    @XmlElementRef(name = "strTelefonoCasa", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strTelefonoCasa;
    @XmlElementRef(name = "strTipoDocumento", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strTipoDocumento;
    @XmlElementRef(name = "strTipoPersona", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strTipoPersona;
    @XmlElementRef(name = "strTipoOperacion", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strTipoOperacion;
    @XmlElementRef(name = "strEmailActualizador", namespace = "http://soap.sforce.com/schemas/class/TEC_SincronizarContactos_ws", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strEmailActualizador;


    /**
     * Gets the value of the strApellidoMaterno property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrApellidoMaterno() {
        return strApellidoMaterno;
    }

    /**
     * Sets the value of the strApellidoMaterno property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrApellidoMaterno(JAXBElement<String> value) {
        this.strApellidoMaterno = value;
    }

    /**
     * Gets the value of the strCelular property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrCelular() {
        return strCelular;
    }

    /**
     * Sets the value of the strCelular property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrCelular(JAXBElement<String> value) {
        this.strCelular = value;
    }

    /**
     * Gets the value of the strCodPersona property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrCodPersona() {
        return strCodPersona;
    }

    /**
     * Sets the value of the strCodPersona property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrCodPersona(JAXBElement<String> value) {
        this.strCodPersona = value;
    }

    /**
     * Gets the value of the strDomicilio property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrDomicilio() {
        return strDomicilio;
    }

    /**
     * Sets the value of the strDomicilio property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrDomicilio(JAXBElement<String> value) {
        this.strDomicilio = value;
    }

    /**
     * Gets the value of the strEmail property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrEmail() {
        return strEmail;
    }

    /**
     * Sets the value of the strEmail property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrEmail(JAXBElement<String> value) {
        this.strEmail = value;
    }

    /**
     * Gets the value of the strEstadoCivil property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrEstadoCivil() {
        return strEstadoCivil;
    }

    /**
     * Sets the value of the strEstadoCivil property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrEstadoCivil(JAXBElement<String> value) {
        this.strEstadoCivil = value;
    }

    /**
     * Gets the value of the strFecAceptaLey property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrFecAceptaLey() {
        return strFecAceptaLey;
    }

    /**
     * Sets the value of the strFecAceptaLey property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrFecAceptaLey(JAXBElement<String> value) {
        this.strFecAceptaLey = value;
    }

    /**
     * Gets the value of the strFecNac property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrFecNac() {
        return strFecNac;
    }

    /**
     * Sets the value of the strFecNac property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrFecNac(JAXBElement<String> value) {
        this.strFecNac = value;
    }

    /**
     * Gets the value of the strGenero property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrGenero() {
        return strGenero;
    }

    /**
     * Sets the value of the strGenero property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrGenero(JAXBElement<String> value) {
        this.strGenero = value;
    }

    /**
     * Gets the value of the strLastName property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrLastName() {
        return strLastName;
    }

    /**
     * Sets the value of the strLastName property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrLastName(JAXBElement<String> value) {
        this.strLastName = value;
    }

    /**
     * Gets the value of the strLeadSource property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrLeadSource() {
        return strLeadSource;
    }

    /**
     * Sets the value of the strLeadSource property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrLeadSource(JAXBElement<String> value) {
        this.strLeadSource = value;
    }

    /**
     * Gets the value of the strNumDocumento property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrNumDocumento() {
        return strNumDocumento;
    }

    /**
     * Sets the value of the strNumDocumento property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrNumDocumento(JAXBElement<String> value) {
        this.strNumDocumento = value;
    }

    /**
     * Gets the value of the strOficina property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrOficina() {
        return strOficina;
    }

    /**
     * Sets the value of the strOficina property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrOficina(JAXBElement<String> value) {
        this.strOficina = value;
    }

    /**
     * Gets the value of the strOwnerId property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrOwnerId() {
        return strOwnerId;
    }

    /**
     * Sets the value of the strOwnerId property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrOwnerId(JAXBElement<String> value) {
        this.strOwnerId = value;
    }

    /**
     * Gets the value of the strPrimerNombre property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrPrimerNombre() {
        return strPrimerNombre;
    }

    /**
     * Sets the value of the strPrimerNombre property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrPrimerNombre(JAXBElement<String> value) {
        this.strPrimerNombre = value;
    }

    /**
     * Gets the value of the strRecordTypeId property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrRecordTypeId() {
        return strRecordTypeId;
    }

    /**
     * Sets the value of the strRecordTypeId property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrRecordTypeId(JAXBElement<String> value) {
        this.strRecordTypeId = value;
    }

    /**
     * Gets the value of the strSede property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrSede() {
        return strSede;
    }

    /**
     * Sets the value of the strSede property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrSede(JAXBElement<String> value) {
        this.strSede = value;
    }

    /**
     * Gets the value of the strSegundoNombre property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrSegundoNombre() {
        return strSegundoNombre;
    }

    /**
     * Sets the value of the strSegundoNombre property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrSegundoNombre(JAXBElement<String> value) {
        this.strSegundoNombre = value;
    }

    /**
     * Gets the value of the strTelefonoCasa property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrTelefonoCasa() {
        return strTelefonoCasa;
    }

    /**
     * Sets the value of the strTelefonoCasa property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrTelefonoCasa(JAXBElement<String> value) {
        this.strTelefonoCasa = value;
    }

    /**
     * Gets the value of the strTipoDocumento property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrTipoDocumento() {
        return strTipoDocumento;
    }

    /**
     * Sets the value of the strTipoDocumento property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrTipoDocumento(JAXBElement<String> value) {
        this.strTipoDocumento = value;
    }

    /**
     * Gets the value of the strTipoPersona property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getStrTipoPersona() {
        return strTipoPersona;
    }

    /**
     * Sets the value of the strTipoPersona property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setStrTipoPersona(JAXBElement<String> value) {
        this.strTipoPersona = value;
    }

    public JAXBElement<String> getStrTipoOperacion() {
        return strTipoOperacion;
    }
    public void setStrTipoOperacion(JAXBElement<String> value) {
        this.strTipoOperacion = value;
    }

    public JAXBElement<String> getStrEmailActualizador() { return strEmailActualizador; }
    public void setStrEmailActualizador(JAXBElement<String> value) { this.strEmailActualizador = value; }
}

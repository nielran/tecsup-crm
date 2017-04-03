//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.03 a las 04:06:05 PM COT 
//


package com.sforce.soap1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoginResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoginResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metadataServerUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="passwordExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sandbox" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="serverUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="userInfo" type="{urn:partner.soap.sforce.com}GetUserInfoResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResult", propOrder = {
    "metadataServerUrl",
    "passwordExpired",
    "sandbox",
    "serverUrl",
    "sessionId",
    "userId",
    "userInfo"
})
public class LoginResult {

    @XmlElement(required = true, nillable = true)
    protected String metadataServerUrl;
    protected boolean passwordExpired;
    protected boolean sandbox;
    @XmlElement(required = true, nillable = true)
    protected String serverUrl;
    @XmlElement(required = true, nillable = true)
    protected String sessionId;
    @XmlElement(required = true, nillable = true)
    protected String userId;
    protected GetUserInfoResult userInfo;

    /**
     * Obtiene el valor de la propiedad metadataServerUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataServerUrl() {
        return metadataServerUrl;
    }

    /**
     * Define el valor de la propiedad metadataServerUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataServerUrl(String value) {
        this.metadataServerUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad passwordExpired.
     * 
     */
    public boolean isPasswordExpired() {
        return passwordExpired;
    }

    /**
     * Define el valor de la propiedad passwordExpired.
     * 
     */
    public void setPasswordExpired(boolean value) {
        this.passwordExpired = value;
    }

    /**
     * Obtiene el valor de la propiedad sandbox.
     * 
     */
    public boolean isSandbox() {
        return sandbox;
    }

    /**
     * Define el valor de la propiedad sandbox.
     * 
     */
    public void setSandbox(boolean value) {
        this.sandbox = value;
    }

    /**
     * Obtiene el valor de la propiedad serverUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerUrl() {
        return serverUrl;
    }

    /**
     * Define el valor de la propiedad serverUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerUrl(String value) {
        this.serverUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Define el valor de la propiedad sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Obtiene el valor de la propiedad userId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Define el valor de la propiedad userId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Obtiene el valor de la propiedad userInfo.
     * 
     * @return
     *     possible object is
     *     {@link GetUserInfoResult }
     *     
     */
    public GetUserInfoResult getUserInfo() {
        return userInfo;
    }

    /**
     * Define el valor de la propiedad userInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserInfoResult }
     *     
     */
    public void setUserInfo(GetUserInfoResult value) {
        this.userInfo = value;
    }

}

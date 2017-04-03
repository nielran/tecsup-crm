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
 * <p>Clase Java para GetUserInfoResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetUserInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessibilityMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="currencySymbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orgAttachmentFileSizeLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orgDefaultCurrencyIsoCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orgDefaultCurrencyLocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orgDisallowHtmlAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="orgHasPersonAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="organizationId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="organizationMultiCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="profileId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="roleId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="sessionSecondsValid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userDefaultCurrencyIsoCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userFullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userId" type="{urn:partner.soap.sforce.com}ID"/&gt;
 *         &lt;element name="userLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userLocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userUiSkin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserInfoResult", propOrder = {
    "accessibilityMode",
    "currencySymbol",
    "orgAttachmentFileSizeLimit",
    "orgDefaultCurrencyIsoCode",
    "orgDefaultCurrencyLocale",
    "orgDisallowHtmlAttachments",
    "orgHasPersonAccounts",
    "organizationId",
    "organizationMultiCurrency",
    "organizationName",
    "profileId",
    "roleId",
    "sessionSecondsValid",
    "userDefaultCurrencyIsoCode",
    "userEmail",
    "userFullName",
    "userId",
    "userLanguage",
    "userLocale",
    "userName",
    "userTimeZone",
    "userType",
    "userUiSkin"
})
public class GetUserInfoResult {

    protected boolean accessibilityMode;
    @XmlElement(required = true, nillable = true)
    protected String currencySymbol;
    protected int orgAttachmentFileSizeLimit;
    @XmlElement(required = true, nillable = true)
    protected String orgDefaultCurrencyIsoCode;
    @XmlElement(required = true, nillable = true)
    protected String orgDefaultCurrencyLocale;
    protected boolean orgDisallowHtmlAttachments;
    protected boolean orgHasPersonAccounts;
    @XmlElement(required = true)
    protected String organizationId;
    protected boolean organizationMultiCurrency;
    @XmlElement(required = true)
    protected String organizationName;
    @XmlElement(required = true)
    protected String profileId;
    @XmlElement(required = true, nillable = true)
    protected String roleId;
    protected int sessionSecondsValid;
    @XmlElement(required = true, nillable = true)
    protected String userDefaultCurrencyIsoCode;
    @XmlElement(required = true)
    protected String userEmail;
    @XmlElement(required = true)
    protected String userFullName;
    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected String userLanguage;
    @XmlElement(required = true)
    protected String userLocale;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String userTimeZone;
    @XmlElement(required = true)
    protected String userType;
    @XmlElement(required = true)
    protected String userUiSkin;

    /**
     * Obtiene el valor de la propiedad accessibilityMode.
     * 
     */
    public boolean isAccessibilityMode() {
        return accessibilityMode;
    }

    /**
     * Define el valor de la propiedad accessibilityMode.
     * 
     */
    public void setAccessibilityMode(boolean value) {
        this.accessibilityMode = value;
    }

    /**
     * Obtiene el valor de la propiedad currencySymbol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Define el valor de la propiedad currencySymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySymbol(String value) {
        this.currencySymbol = value;
    }

    /**
     * Obtiene el valor de la propiedad orgAttachmentFileSizeLimit.
     * 
     */
    public int getOrgAttachmentFileSizeLimit() {
        return orgAttachmentFileSizeLimit;
    }

    /**
     * Define el valor de la propiedad orgAttachmentFileSizeLimit.
     * 
     */
    public void setOrgAttachmentFileSizeLimit(int value) {
        this.orgAttachmentFileSizeLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad orgDefaultCurrencyIsoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgDefaultCurrencyIsoCode() {
        return orgDefaultCurrencyIsoCode;
    }

    /**
     * Define el valor de la propiedad orgDefaultCurrencyIsoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgDefaultCurrencyIsoCode(String value) {
        this.orgDefaultCurrencyIsoCode = value;
    }

    /**
     * Obtiene el valor de la propiedad orgDefaultCurrencyLocale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgDefaultCurrencyLocale() {
        return orgDefaultCurrencyLocale;
    }

    /**
     * Define el valor de la propiedad orgDefaultCurrencyLocale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgDefaultCurrencyLocale(String value) {
        this.orgDefaultCurrencyLocale = value;
    }

    /**
     * Obtiene el valor de la propiedad orgDisallowHtmlAttachments.
     * 
     */
    public boolean isOrgDisallowHtmlAttachments() {
        return orgDisallowHtmlAttachments;
    }

    /**
     * Define el valor de la propiedad orgDisallowHtmlAttachments.
     * 
     */
    public void setOrgDisallowHtmlAttachments(boolean value) {
        this.orgDisallowHtmlAttachments = value;
    }

    /**
     * Obtiene el valor de la propiedad orgHasPersonAccounts.
     * 
     */
    public boolean isOrgHasPersonAccounts() {
        return orgHasPersonAccounts;
    }

    /**
     * Define el valor de la propiedad orgHasPersonAccounts.
     * 
     */
    public void setOrgHasPersonAccounts(boolean value) {
        this.orgHasPersonAccounts = value;
    }

    /**
     * Obtiene el valor de la propiedad organizationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Define el valor de la propiedad organizationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Obtiene el valor de la propiedad organizationMultiCurrency.
     * 
     */
    public boolean isOrganizationMultiCurrency() {
        return organizationMultiCurrency;
    }

    /**
     * Define el valor de la propiedad organizationMultiCurrency.
     * 
     */
    public void setOrganizationMultiCurrency(boolean value) {
        this.organizationMultiCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad organizationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Define el valor de la propiedad organizationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Obtiene el valor de la propiedad profileId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Define el valor de la propiedad profileId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Obtiene el valor de la propiedad roleId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * Define el valor de la propiedad roleId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleId(String value) {
        this.roleId = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionSecondsValid.
     * 
     */
    public int getSessionSecondsValid() {
        return sessionSecondsValid;
    }

    /**
     * Define el valor de la propiedad sessionSecondsValid.
     * 
     */
    public void setSessionSecondsValid(int value) {
        this.sessionSecondsValid = value;
    }

    /**
     * Obtiene el valor de la propiedad userDefaultCurrencyIsoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefaultCurrencyIsoCode() {
        return userDefaultCurrencyIsoCode;
    }

    /**
     * Define el valor de la propiedad userDefaultCurrencyIsoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefaultCurrencyIsoCode(String value) {
        this.userDefaultCurrencyIsoCode = value;
    }

    /**
     * Obtiene el valor de la propiedad userEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Define el valor de la propiedad userEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad userFullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFullName() {
        return userFullName;
    }

    /**
     * Define el valor de la propiedad userFullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFullName(String value) {
        this.userFullName = value;
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
     * Obtiene el valor de la propiedad userLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLanguage() {
        return userLanguage;
    }

    /**
     * Define el valor de la propiedad userLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLanguage(String value) {
        this.userLanguage = value;
    }

    /**
     * Obtiene el valor de la propiedad userLocale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocale() {
        return userLocale;
    }

    /**
     * Define el valor de la propiedad userLocale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocale(String value) {
        this.userLocale = value;
    }

    /**
     * Obtiene el valor de la propiedad userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Define el valor de la propiedad userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Obtiene el valor de la propiedad userTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTimeZone() {
        return userTimeZone;
    }

    /**
     * Define el valor de la propiedad userTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTimeZone(String value) {
        this.userTimeZone = value;
    }

    /**
     * Obtiene el valor de la propiedad userType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Define el valor de la propiedad userType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Obtiene el valor de la propiedad userUiSkin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserUiSkin() {
        return userUiSkin;
    }

    /**
     * Define el valor de la propiedad userUiSkin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserUiSkin(String value) {
        this.userUiSkin = value;
    }

}

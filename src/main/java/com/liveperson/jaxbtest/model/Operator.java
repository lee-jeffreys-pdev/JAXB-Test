//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.05 at 02:53:59 PM GMT 
//


package com.liveperson.jaxbtest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginName" type="{http://liveperson.com/v1.0}lpString"/>
 *         &lt;element name="password">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="displayName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://liveperson.com/v1.0}lpString">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nickName" type="{http://liveperson.com/v1.0}lpString"/>
 *         &lt;element name="employeeId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="130"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="showCallerId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="changePasswordOnNextLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://liveperson.com/v1.0}lpString"/>
 *         &lt;element name="phoneConsoleId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="maxNumberOfChats" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="Unlimited"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;minInclusive value="0"/>
 *                   &lt;maxInclusive value="10"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="maxNumberOfChatsWhileCalling" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="Unlimited"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;minInclusive value="0"/>
 *                   &lt;maxInclusive value="10"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="callPresentationTimeout" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="inherit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="timeoutAfter" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;minInclusive value="1"/>
 *                         &lt;maxInclusive value="100000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SetoperatorToAwayIfCallPresentationsTimeOut" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="inherit"/>
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="acdAutoAnswerMode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="-1"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="maxNumberOfTicketsInWorkspace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;enumeration value="Unlimited"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;minInclusive value="0"/>
 *                   &lt;maxInclusive value="20"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="permissionGroup" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="acceptIncomingChats" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="acceptIncomingPhoneCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useDesktopSharing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useCoBrowse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowTalkbyPCCallIfNoOfConcurrentChatsIsLessThan" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="skills" type="{http://liveperson.com/v1.0}skillIds" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://liveperson.com/v1.0}extensionPhoneNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operator", propOrder = {
    "loginName",
    "password",
    "enabled",
    "displayName",
    "nickName",
    "employeeId",
    "showCallerId",
    "changePasswordOnNextLogin",
    "emailAddress",
    "phoneConsoleId",
    "maxNumberOfChats",
    "maxNumberOfChatsWhileCalling",
    "callPresentationTimeout",
    "setoperatorToAwayIfCallPresentationsTimeOut",
    "acdAutoAnswerMode",
    "maxNumberOfTicketsInWorkspace",
    "permissionGroup",
    "acceptIncomingChats",
    "acceptIncomingPhoneCalls",
    "useDesktopSharing",
    "useCoBrowse",
    "allowTalkbyPCCallIfNoOfConcurrentChatsIsLessThan",
    "skills",
    "extension"
})
public class Operator {

    @XmlElement(required = true)
    protected String loginName;
    @XmlElement(required = true)
    protected String password;
    protected boolean enabled;
    @XmlElement(defaultValue = "")
    protected String displayName;
    @XmlElement(required = true)
    protected String nickName;
    @XmlElement(defaultValue = "")
    protected String employeeId;
    @XmlElement(defaultValue = "true")
    protected Boolean showCallerId;
    @XmlElement(defaultValue = "false")
    protected Boolean changePasswordOnNextLogin;
    @XmlElement(required = true)
    protected String emailAddress;
    protected Integer phoneConsoleId;
    @XmlElement(defaultValue = "Unlimited")
    protected String maxNumberOfChats;
    @XmlElement(defaultValue = "Unlimited")
    protected String maxNumberOfChatsWhileCalling;
    protected Operator.CallPresentationTimeout callPresentationTimeout;
    @XmlElement(name = "SetoperatorToAwayIfCallPresentationsTimeOut")
    protected String setoperatorToAwayIfCallPresentationsTimeOut;
    @XmlElement(defaultValue = "0")
    protected Integer acdAutoAnswerMode;
    @XmlElement(defaultValue = "Unlimited")
    protected String maxNumberOfTicketsInWorkspace;
    protected long permissionGroup;
    @XmlElement(defaultValue = "true")
    protected Boolean acceptIncomingChats;
    @XmlElement(defaultValue = "true")
    protected Boolean acceptIncomingPhoneCalls;
    @XmlElement(defaultValue = "false")
    protected Boolean useDesktopSharing;
    @XmlElement(defaultValue = "true")
    protected Boolean useCoBrowse;
    @XmlElement(defaultValue = "1")
    protected Integer allowTalkbyPCCallIfNoOfConcurrentChatsIsLessThan;
    protected SkillIds skills;
    protected String extension;

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the showCallerId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowCallerId() {
        return showCallerId;
    }

    /**
     * Sets the value of the showCallerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCallerId(Boolean value) {
        this.showCallerId = value;
    }

    /**
     * Gets the value of the changePasswordOnNextLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangePasswordOnNextLogin() {
        return changePasswordOnNextLogin;
    }

    /**
     * Sets the value of the changePasswordOnNextLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangePasswordOnNextLogin(Boolean value) {
        this.changePasswordOnNextLogin = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the phoneConsoleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhoneConsoleId() {
        return phoneConsoleId;
    }

    /**
     * Sets the value of the phoneConsoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhoneConsoleId(Integer value) {
        this.phoneConsoleId = value;
    }

    /**
     * Gets the value of the maxNumberOfChats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNumberOfChats() {
        return maxNumberOfChats;
    }

    /**
     * Sets the value of the maxNumberOfChats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNumberOfChats(String value) {
        this.maxNumberOfChats = value;
    }

    /**
     * Gets the value of the maxNumberOfChatsWhileCalling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNumberOfChatsWhileCalling() {
        return maxNumberOfChatsWhileCalling;
    }

    /**
     * Sets the value of the maxNumberOfChatsWhileCalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNumberOfChatsWhileCalling(String value) {
        this.maxNumberOfChatsWhileCalling = value;
    }

    /**
     * Gets the value of the callPresentationTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Operator.CallPresentationTimeout }
     *     
     */
    public Operator.CallPresentationTimeout getCallPresentationTimeout() {
        return callPresentationTimeout;
    }

    /**
     * Sets the value of the callPresentationTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator.CallPresentationTimeout }
     *     
     */
    public void setCallPresentationTimeout(Operator.CallPresentationTimeout value) {
        this.callPresentationTimeout = value;
    }

    /**
     * Gets the value of the setoperatorToAwayIfCallPresentationsTimeOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetoperatorToAwayIfCallPresentationsTimeOut() {
        return setoperatorToAwayIfCallPresentationsTimeOut;
    }

    /**
     * Sets the value of the setoperatorToAwayIfCallPresentationsTimeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetoperatorToAwayIfCallPresentationsTimeOut(String value) {
        this.setoperatorToAwayIfCallPresentationsTimeOut = value;
    }

    /**
     * Gets the value of the acdAutoAnswerMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcdAutoAnswerMode() {
        return acdAutoAnswerMode;
    }

    /**
     * Sets the value of the acdAutoAnswerMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcdAutoAnswerMode(Integer value) {
        this.acdAutoAnswerMode = value;
    }

    /**
     * Gets the value of the maxNumberOfTicketsInWorkspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNumberOfTicketsInWorkspace() {
        return maxNumberOfTicketsInWorkspace;
    }

    /**
     * Sets the value of the maxNumberOfTicketsInWorkspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNumberOfTicketsInWorkspace(String value) {
        this.maxNumberOfTicketsInWorkspace = value;
    }

    /**
     * Gets the value of the permissionGroup property.
     * 
     */
    public long getPermissionGroup() {
        return permissionGroup;
    }

    /**
     * Sets the value of the permissionGroup property.
     * 
     */
    public void setPermissionGroup(long value) {
        this.permissionGroup = value;
    }

    /**
     * Gets the value of the acceptIncomingChats property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptIncomingChats() {
        return acceptIncomingChats;
    }

    /**
     * Sets the value of the acceptIncomingChats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptIncomingChats(Boolean value) {
        this.acceptIncomingChats = value;
    }

    /**
     * Gets the value of the acceptIncomingPhoneCalls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptIncomingPhoneCalls() {
        return acceptIncomingPhoneCalls;
    }

    /**
     * Sets the value of the acceptIncomingPhoneCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptIncomingPhoneCalls(Boolean value) {
        this.acceptIncomingPhoneCalls = value;
    }

    /**
     * Gets the value of the useDesktopSharing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDesktopSharing() {
        return useDesktopSharing;
    }

    /**
     * Sets the value of the useDesktopSharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDesktopSharing(Boolean value) {
        this.useDesktopSharing = value;
    }

    /**
     * Gets the value of the useCoBrowse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCoBrowse() {
        return useCoBrowse;
    }

    /**
     * Sets the value of the useCoBrowse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCoBrowse(Boolean value) {
        this.useCoBrowse = value;
    }

    /**
     * Gets the value of the allowTalkbyPCCallIfNoOfConcurrentChatsIsLessThan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllowTalkbyPCCallIfNoOfConcurrentChatsIsLessThan() {
        return allowTalkbyPCCallIfNoOfConcurrentChatsIsLessThan;
    }

    /**
     * Sets the value of the allowTalkbyPCCallIfNoOfConcurrentChatsIsLessThan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllowTalkbyPCCallIfNoOfConcurrentChatsIsLessThan(Integer value) {
        this.allowTalkbyPCCallIfNoOfConcurrentChatsIsLessThan = value;
    }

    /**
     * Gets the value of the skills property.
     * 
     * @return
     *     possible object is
     *     {@link SkillIds }
     *     
     */
    public SkillIds getSkills() {
        return skills;
    }

    /**
     * Sets the value of the skills property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillIds }
     *     
     */
    public void setSkills(SkillIds value) {
        this.skills = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="inherit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="timeoutAfter" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;minInclusive value="1"/>
     *               &lt;maxInclusive value="100000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inherit",
        "timeoutAfter"
    })
    public static class CallPresentationTimeout {

        protected Boolean inherit;
        protected Integer timeoutAfter;

        /**
         * Gets the value of the inherit property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInherit() {
            return inherit;
        }

        /**
         * Sets the value of the inherit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInherit(Boolean value) {
            this.inherit = value;
        }

        /**
         * Gets the value of the timeoutAfter property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTimeoutAfter() {
            return timeoutAfter;
        }

        /**
         * Sets the value of the timeoutAfter property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTimeoutAfter(Integer value) {
            this.timeoutAfter = value;
        }

    }

}

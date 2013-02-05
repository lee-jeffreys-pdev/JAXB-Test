//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.05 at 02:53:59 PM GMT 
//


package com.liveperson.jaxbtest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 All components in this type are optional in schema. But there is some restriction regards to provisioned features , that checked in the code.
 *                 Please refer to each element documentation for restrictions.
 *                 When Named System Messages feature is not provisioned, the create operation allowed only once at first time.
 *             
 * 
 * <p>Java class for systemMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="adminProfile" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *         &lt;element name="defaultSet" type="{http://liveperson.com/v1.0}default" minOccurs="0"/>
 *         &lt;element name="staller" type="{http://liveperson.com/v1.0}staller" minOccurs="0"/>
 *         &lt;element name="messagesTable" type="{http://liveperson.com/v1.0}messagesTable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemMessage", propOrder = {
    "lang",
    "name",
    "adminProfile",
    "defaultSet",
    "staller",
    "messagesTable"
})
public class SystemMessage {

    protected String lang;
    protected String name;
    protected IdRef adminProfile;
    protected Default defaultSet;
    protected Staller staller;
    protected MessagesTable messagesTable;

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the adminProfile property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getAdminProfile() {
        return adminProfile;
    }

    /**
     * Sets the value of the adminProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setAdminProfile(IdRef value) {
        this.adminProfile = value;
    }

    /**
     * Gets the value of the defaultSet property.
     * 
     * @return
     *     possible object is
     *     {@link Default }
     *     
     */
    public Default getDefaultSet() {
        return defaultSet;
    }

    /**
     * Sets the value of the defaultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Default }
     *     
     */
    public void setDefaultSet(Default value) {
        this.defaultSet = value;
    }

    /**
     * Gets the value of the staller property.
     * 
     * @return
     *     possible object is
     *     {@link Staller }
     *     
     */
    public Staller getStaller() {
        return staller;
    }

    /**
     * Sets the value of the staller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staller }
     *     
     */
    public void setStaller(Staller value) {
        this.staller = value;
    }

    /**
     * Gets the value of the messagesTable property.
     * 
     * @return
     *     possible object is
     *     {@link MessagesTable }
     *     
     */
    public MessagesTable getMessagesTable() {
        return messagesTable;
    }

    /**
     * Sets the value of the messagesTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagesTable }
     *     
     */
    public void setMessagesTable(MessagesTable value) {
        this.messagesTable = value;
    }

}
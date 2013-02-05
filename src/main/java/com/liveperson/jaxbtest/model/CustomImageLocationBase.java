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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customImageLocationBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customImageLocationBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="onlineState" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="offlineState" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="busyState" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="alternateState" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customImageLocationBase", propOrder = {
    "onlineState",
    "offlineState",
    "busyState",
    "alternateState"
})
@XmlSeeAlso({
    CustomImageLocation.class,
    UpdateCustomImageLocation.class
})
public class CustomImageLocationBase {

    @XmlElement(defaultValue = "")
    protected String onlineState;
    @XmlElement(defaultValue = "")
    protected String offlineState;
    @XmlElement(defaultValue = "")
    protected String busyState;
    @XmlElement(defaultValue = "")
    protected String alternateState;

    /**
     * Gets the value of the onlineState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineState() {
        return onlineState;
    }

    /**
     * Sets the value of the onlineState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineState(String value) {
        this.onlineState = value;
    }

    /**
     * Gets the value of the offlineState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfflineState() {
        return offlineState;
    }

    /**
     * Sets the value of the offlineState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfflineState(String value) {
        this.offlineState = value;
    }

    /**
     * Gets the value of the busyState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusyState() {
        return busyState;
    }

    /**
     * Sets the value of the busyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusyState(String value) {
        this.busyState = value;
    }

    /**
     * Gets the value of the alternateState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateState() {
        return alternateState;
    }

    /**
     * Sets the value of the alternateState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateState(String value) {
        this.alternateState = value;
    }

}
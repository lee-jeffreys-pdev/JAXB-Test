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
 * 
 *                 The customer will be able to choose from three phone number input conventions.
 *             
 * 
 * <p>Java class for phoneNumberInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoneNumberInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="USformat" type="{http://liveperson.com/v1.0}digits" minOccurs="0"/>
 *         &lt;element name="formatted" type="{http://liveperson.com/v1.0}digits" minOccurs="0"/>
 *         &lt;element name="plain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoneNumberInput", propOrder = {
    "uSformat",
    "formatted",
    "plain"
})
public class PhoneNumberInput {

    @XmlElement(name = "USformat")
    protected Digits uSformat;
    protected Digits formatted;
    protected Integer plain;

    /**
     * Gets the value of the uSformat property.
     * 
     * @return
     *     possible object is
     *     {@link Digits }
     *     
     */
    public Digits getUSformat() {
        return uSformat;
    }

    /**
     * Sets the value of the uSformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Digits }
     *     
     */
    public void setUSformat(Digits value) {
        this.uSformat = value;
    }

    /**
     * Gets the value of the formatted property.
     * 
     * @return
     *     possible object is
     *     {@link Digits }
     *     
     */
    public Digits getFormatted() {
        return formatted;
    }

    /**
     * Sets the value of the formatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Digits }
     *     
     */
    public void setFormatted(Digits value) {
        this.formatted = value;
    }

    /**
     * Gets the value of the plain property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlain() {
        return plain;
    }

    /**
     * Sets the value of the plain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlain(Integer value) {
        this.plain = value;
    }

}

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
 * <p>Java class for IEOnTop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IEOnTop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ieontopcolor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IEOnTop", propOrder = {
    "ieontopcolor"
})
public class IEOnTop {

    @XmlElement(required = true, nillable = true)
    protected String ieontopcolor;

    /**
     * Gets the value of the ieontopcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIeontopcolor() {
        return ieontopcolor;
    }

    /**
     * Sets the value of the ieontopcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIeontopcolor(String value) {
        this.ieontopcolor = value;
    }

}
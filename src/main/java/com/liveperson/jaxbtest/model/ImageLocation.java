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
 * <p>Java class for imageLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imageLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="imagePath" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="customImages" type="{http://liveperson.com/v1.0}customImageLocation" minOccurs="0"/>
 *         &lt;element name="HTML" type="{http://liveperson.com/v1.0}customImageLocation" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imageLocation", propOrder = {
    "imagePath",
    "customImages",
    "html"
})
public class ImageLocation {

    protected String imagePath;
    protected CustomImageLocation customImages;
    @XmlElement(name = "HTML")
    protected CustomImageLocation html;

    /**
     * Gets the value of the imagePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Sets the value of the imagePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath(String value) {
        this.imagePath = value;
    }

    /**
     * Gets the value of the customImages property.
     * 
     * @return
     *     possible object is
     *     {@link CustomImageLocation }
     *     
     */
    public CustomImageLocation getCustomImages() {
        return customImages;
    }

    /**
     * Sets the value of the customImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomImageLocation }
     *     
     */
    public void setCustomImages(CustomImageLocation value) {
        this.customImages = value;
    }

    /**
     * Gets the value of the html property.
     * 
     * @return
     *     possible object is
     *     {@link CustomImageLocation }
     *     
     */
    public CustomImageLocation getHTML() {
        return html;
    }

    /**
     * Sets the value of the html property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomImageLocation }
     *     
     */
    public void setHTML(CustomImageLocation value) {
        this.html = value;
    }

}

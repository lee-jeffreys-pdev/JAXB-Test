//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.05 at 02:53:59 PM GMT 
//


package com.liveperson.jaxbtest.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The common members for all new dynamic button types.
 *             
 * 
 * <p>Java class for dynamicButtonBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dynamicButtonBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://liveperson.com/v1.0}dynamicButton">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://liveperson.com/v1.0}lpString"/>
 *         &lt;element name="refresh" type="{http://liveperson.com/v1.0}refresh" minOccurs="0"/>
 *         &lt;element name="onTopOfObjects" type="{http://liveperson.com/v1.0}onTopOfObjects" minOccurs="0"/>
 *         &lt;element name="position" type="{http://liveperson.com/v1.0}dynamicButtonPosition"/>
 *         &lt;element name="buttonTitle" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dynamicButtonBase", propOrder = {
    "name",
    "refresh",
    "onTopOfObjects",
    "position",
    "buttonTitle"
})
@XmlSeeAlso({
    ChatDynamicButton.class,
    VoiceDualStepDynamicButton.class,
    VoiceSingleStepDynamicButton.class
})
public class DynamicButtonBase
    extends DynamicButton
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(defaultValue = "-1")
    protected Integer refresh;
    protected OnTopOfObjects onTopOfObjects;
    @XmlElement(required = true)
    protected DynamicButtonPosition position;
    @XmlElementRef(name = "buttonTitle", namespace = "http://liveperson.com/v1.0", type = JAXBElement.class)
    protected JAXBElement<String> buttonTitle;

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
     * Gets the value of the refresh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefresh() {
        return refresh;
    }

    /**
     * Sets the value of the refresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefresh(Integer value) {
        this.refresh = value;
    }

    /**
     * Gets the value of the onTopOfObjects property.
     * 
     * @return
     *     possible object is
     *     {@link OnTopOfObjects }
     *     
     */
    public OnTopOfObjects getOnTopOfObjects() {
        return onTopOfObjects;
    }

    /**
     * Sets the value of the onTopOfObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnTopOfObjects }
     *     
     */
    public void setOnTopOfObjects(OnTopOfObjects value) {
        this.onTopOfObjects = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicButtonPosition }
     *     
     */
    public DynamicButtonPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicButtonPosition }
     *     
     */
    public void setPosition(DynamicButtonPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the buttonTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getButtonTitle() {
        return buttonTitle;
    }

    /**
     * Sets the value of the buttonTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setButtonTitle(JAXBElement<String> value) {
        this.buttonTitle = ((JAXBElement<String> ) value);
    }

}
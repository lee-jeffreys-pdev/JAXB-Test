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
 * <p>Java class for surveyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adminProfile" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *         &lt;element name="title" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="heading" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="params" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="extraParams" type="{http://liveperson.com/v1.0}surveyExtraParams" minOccurs="0"/>
 *         &lt;element name="default" type="{http://liveperson.com/v1.0}default" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyBase", propOrder = {
    "dbid",
    "adminProfile",
    "title",
    "heading",
    "params",
    "extraParams",
    "_default"
})
@XmlSeeAlso({
    Survey.class,
    UpdateSurvey.class
})
public class SurveyBase {

    protected Long dbid;
    protected IdRef adminProfile;
    protected String title;
    protected String heading;
    protected String params;
    protected SurveyExtraParams extraParams;
    @XmlElement(name = "default")
    protected Default _default;

    /**
     * Gets the value of the dbid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDbid() {
        return dbid;
    }

    /**
     * Sets the value of the dbid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDbid(Long value) {
        this.dbid = value;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeading(String value) {
        this.heading = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParams(String value) {
        this.params = value;
    }

    /**
     * Gets the value of the extraParams property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyExtraParams }
     *     
     */
    public SurveyExtraParams getExtraParams() {
        return extraParams;
    }

    /**
     * Sets the value of the extraParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyExtraParams }
     *     
     */
    public void setExtraParams(SurveyExtraParams value) {
        this.extraParams = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Default }
     *     
     */
    public Default getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Default }
     *     
     */
    public void setDefault(Default value) {
        this._default = value;
    }

}
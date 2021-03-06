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
 * <p>Java class for operatorGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operatorGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://liveperson.com/v1.0}lpString"/>
 *         &lt;element name="description" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="groupMembers" type="{http://liveperson.com/v1.0}groupMembersList"/>
 *         &lt;element name="acdAttributesSetId" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *         &lt;element name="adminProfile" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operatorGroup", propOrder = {
    "name",
    "description",
    "groupMembers",
    "acdAttributesSetId",
    "adminProfile"
})
public class OperatorGroup {

    @XmlElement(required = true)
    protected String name;
    protected String description;
    @XmlElement(required = true)
    protected GroupMembersList groupMembers;
    @XmlElement(defaultValue = "-1")
    protected IdRef acdAttributesSetId;
    @XmlElement(defaultValue = "-1")
    protected IdRef adminProfile;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the groupMembers property.
     * 
     * @return
     *     possible object is
     *     {@link GroupMembersList }
     *     
     */
    public GroupMembersList getGroupMembers() {
        return groupMembers;
    }

    /**
     * Sets the value of the groupMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupMembersList }
     *     
     */
    public void setGroupMembers(GroupMembersList value) {
        this.groupMembers = value;
    }

    /**
     * Gets the value of the acdAttributesSetId property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getAcdAttributesSetId() {
        return acdAttributesSetId;
    }

    /**
     * Sets the value of the acdAttributesSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setAcdAttributesSetId(IdRef value) {
        this.acdAttributesSetId = value;
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

}

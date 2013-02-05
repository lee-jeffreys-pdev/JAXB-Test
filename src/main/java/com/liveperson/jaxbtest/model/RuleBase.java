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
 * <p>Java class for ruleBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ruleBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="initiative" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *           &lt;element name="followupCampaign" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *           &lt;element name="campaign" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="isMatchAny" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isStopProcessing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="conditions" type="{http://liveperson.com/v1.0}conditions" minOccurs="0"/>
 *         &lt;element name="complexConditions" type="{http://liveperson.com/v1.0}complexConditions" minOccurs="0"/>
 *         &lt;element name="actions" type="{http://liveperson.com/v1.0}actions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ruleBase", propOrder = {
    "description",
    "initiative",
    "followupCampaign",
    "campaign",
    "isMatchAny",
    "isStopProcessing",
    "conditions",
    "complexConditions",
    "actions"
})
@XmlSeeAlso({
    Rule.class,
    UpdateRule.class
})
public class RuleBase {

    @XmlElement(defaultValue = "")
    protected String description;
    @XmlElement(defaultValue = "-1")
    protected IdRef initiative;
    @XmlElement(defaultValue = "-1")
    protected IdRef followupCampaign;
    @XmlElement(defaultValue = "-1")
    protected IdRef campaign;
    @XmlElement(defaultValue = "true")
    protected Boolean isMatchAny;
    @XmlElement(defaultValue = "false")
    protected Boolean isStopProcessing;
    protected Conditions conditions;
    protected ComplexConditions complexConditions;
    protected Actions actions;

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
     * Gets the value of the initiative property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getInitiative() {
        return initiative;
    }

    /**
     * Sets the value of the initiative property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setInitiative(IdRef value) {
        this.initiative = value;
    }

    /**
     * Gets the value of the followupCampaign property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getFollowupCampaign() {
        return followupCampaign;
    }

    /**
     * Sets the value of the followupCampaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setFollowupCampaign(IdRef value) {
        this.followupCampaign = value;
    }

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setCampaign(IdRef value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the isMatchAny property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMatchAny() {
        return isMatchAny;
    }

    /**
     * Sets the value of the isMatchAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMatchAny(Boolean value) {
        this.isMatchAny = value;
    }

    /**
     * Gets the value of the isStopProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStopProcessing() {
        return isStopProcessing;
    }

    /**
     * Sets the value of the isStopProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStopProcessing(Boolean value) {
        this.isStopProcessing = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link Conditions }
     *     
     */
    public Conditions getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conditions }
     *     
     */
    public void setConditions(Conditions value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the complexConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexConditions }
     *     
     */
    public ComplexConditions getComplexConditions() {
        return complexConditions;
    }

    /**
     * Sets the value of the complexConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexConditions }
     *     
     */
    public void setComplexConditions(ComplexConditions value) {
        this.complexConditions = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link Actions }
     *     
     */
    public Actions getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actions }
     *     
     */
    public void setActions(Actions value) {
        this.actions = value;
    }

}
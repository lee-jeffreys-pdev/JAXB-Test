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
 * <p>Java class for predictiveDialerBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="predictiveDialerBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="type" type="{http://liveperson.com/v1.0}predictiveDialerType"/>
 *         &lt;element name="invitationAcceptRatio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="buttonAcceptRatio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="invitationTimeoutSeconds">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="buttonTimeoutSeconds">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="visitorMaxWaitTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="agentFactor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="priority">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dialerMode" type="{http://liveperson.com/v1.0}predictiveDialerDialerMode"/>
 *         &lt;element name="routingMode" type="{http://liveperson.com/v1.0}predictiveDialerRouting"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "predictiveDialerBase", propOrder = {
    "description",
    "type",
    "invitationAcceptRatio",
    "buttonAcceptRatio",
    "invitationTimeoutSeconds",
    "buttonTimeoutSeconds",
    "visitorMaxWaitTime",
    "agentFactor",
    "priority",
    "dialerMode",
    "routingMode"
})
@XmlSeeAlso({
    PredictiveDialer.class,
    UpdatePredictiveDialer.class
})
public class PredictiveDialerBase {

    protected String description;
    @XmlElement(required = true)
    protected PredictiveDialerType type;
    protected double invitationAcceptRatio;
    protected double buttonAcceptRatio;
    protected int invitationTimeoutSeconds;
    protected int buttonTimeoutSeconds;
    protected long visitorMaxWaitTime;
    protected double agentFactor;
    protected double priority;
    @XmlElement(required = true)
    protected PredictiveDialerDialerMode dialerMode;
    @XmlElement(required = true)
    protected PredictiveDialerRouting routingMode;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PredictiveDialerType }
     *     
     */
    public PredictiveDialerType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictiveDialerType }
     *     
     */
    public void setType(PredictiveDialerType value) {
        this.type = value;
    }

    /**
     * Gets the value of the invitationAcceptRatio property.
     * 
     */
    public double getInvitationAcceptRatio() {
        return invitationAcceptRatio;
    }

    /**
     * Sets the value of the invitationAcceptRatio property.
     * 
     */
    public void setInvitationAcceptRatio(double value) {
        this.invitationAcceptRatio = value;
    }

    /**
     * Gets the value of the buttonAcceptRatio property.
     * 
     */
    public double getButtonAcceptRatio() {
        return buttonAcceptRatio;
    }

    /**
     * Sets the value of the buttonAcceptRatio property.
     * 
     */
    public void setButtonAcceptRatio(double value) {
        this.buttonAcceptRatio = value;
    }

    /**
     * Gets the value of the invitationTimeoutSeconds property.
     * 
     */
    public int getInvitationTimeoutSeconds() {
        return invitationTimeoutSeconds;
    }

    /**
     * Sets the value of the invitationTimeoutSeconds property.
     * 
     */
    public void setInvitationTimeoutSeconds(int value) {
        this.invitationTimeoutSeconds = value;
    }

    /**
     * Gets the value of the buttonTimeoutSeconds property.
     * 
     */
    public int getButtonTimeoutSeconds() {
        return buttonTimeoutSeconds;
    }

    /**
     * Sets the value of the buttonTimeoutSeconds property.
     * 
     */
    public void setButtonTimeoutSeconds(int value) {
        this.buttonTimeoutSeconds = value;
    }

    /**
     * Gets the value of the visitorMaxWaitTime property.
     * 
     */
    public long getVisitorMaxWaitTime() {
        return visitorMaxWaitTime;
    }

    /**
     * Sets the value of the visitorMaxWaitTime property.
     * 
     */
    public void setVisitorMaxWaitTime(long value) {
        this.visitorMaxWaitTime = value;
    }

    /**
     * Gets the value of the agentFactor property.
     * 
     */
    public double getAgentFactor() {
        return agentFactor;
    }

    /**
     * Sets the value of the agentFactor property.
     * 
     */
    public void setAgentFactor(double value) {
        this.agentFactor = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public double getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(double value) {
        this.priority = value;
    }

    /**
     * Gets the value of the dialerMode property.
     * 
     * @return
     *     possible object is
     *     {@link PredictiveDialerDialerMode }
     *     
     */
    public PredictiveDialerDialerMode getDialerMode() {
        return dialerMode;
    }

    /**
     * Sets the value of the dialerMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictiveDialerDialerMode }
     *     
     */
    public void setDialerMode(PredictiveDialerDialerMode value) {
        this.dialerMode = value;
    }

    /**
     * Gets the value of the routingMode property.
     * 
     * @return
     *     possible object is
     *     {@link PredictiveDialerRouting }
     *     
     */
    public PredictiveDialerRouting getRoutingMode() {
        return routingMode;
    }

    /**
     * Sets the value of the routingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictiveDialerRouting }
     *     
     */
    public void setRoutingMode(PredictiveDialerRouting value) {
        this.routingMode = value;
    }

}

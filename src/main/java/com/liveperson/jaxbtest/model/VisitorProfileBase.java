//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.05 at 02:53:59 PM GMT 
//


package com.liveperson.jaxbtest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for visitorProfileBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="visitorProfileBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adminProfileId" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *         &lt;element name="description" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="chatWindowProfileId" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *         &lt;element name="systemMessageSetId" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *         &lt;element name="enablePreChatSurvey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="activePreChatSurveyId" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *         &lt;element name="enableExitSurvey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="activeExitSurveyId" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *         &lt;element name="enableOperatorSurvey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="activeOperatorSurveyId" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *         &lt;element name="activeOfflineSurveyId" type="{http://liveperson.com/v1.0}idRef" minOccurs="0"/>
 *         &lt;element name="cannedResponsesSetIds" type="{http://liveperson.com/v1.0}cannedResponsesSetIds" minOccurs="0"/>
 *         &lt;element name="chatTemplates" type="{http://liveperson.com/v1.0}chatTemplates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visitorProfileBase", propOrder = {
    "adminProfileId",
    "description",
    "chatWindowProfileId",
    "systemMessageSetId",
    "enablePreChatSurvey",
    "activePreChatSurveyId",
    "enableExitSurvey",
    "activeExitSurveyId",
    "enableOperatorSurvey",
    "activeOperatorSurveyId",
    "activeOfflineSurveyId",
    "cannedResponsesSetIds",
    "chatTemplates"
})
@XmlSeeAlso({
    VisitorProfile.class,
    UpdateVisitorProfile.class
})
public class VisitorProfileBase {

    protected IdRef adminProfileId;
    protected String description;
    protected IdRef chatWindowProfileId;
    protected IdRef systemMessageSetId;
    protected Boolean enablePreChatSurvey;
    protected IdRef activePreChatSurveyId;
    protected Boolean enableExitSurvey;
    protected IdRef activeExitSurveyId;
    protected Boolean enableOperatorSurvey;
    protected IdRef activeOperatorSurveyId;
    protected IdRef activeOfflineSurveyId;
    protected CannedResponsesSetIds cannedResponsesSetIds;
    protected ChatTemplates chatTemplates;

    /**
     * Gets the value of the adminProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getAdminProfileId() {
        return adminProfileId;
    }

    /**
     * Sets the value of the adminProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setAdminProfileId(IdRef value) {
        this.adminProfileId = value;
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
     * Gets the value of the chatWindowProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getChatWindowProfileId() {
        return chatWindowProfileId;
    }

    /**
     * Sets the value of the chatWindowProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setChatWindowProfileId(IdRef value) {
        this.chatWindowProfileId = value;
    }

    /**
     * Gets the value of the systemMessageSetId property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getSystemMessageSetId() {
        return systemMessageSetId;
    }

    /**
     * Sets the value of the systemMessageSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setSystemMessageSetId(IdRef value) {
        this.systemMessageSetId = value;
    }

    /**
     * Gets the value of the enablePreChatSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnablePreChatSurvey() {
        return enablePreChatSurvey;
    }

    /**
     * Sets the value of the enablePreChatSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablePreChatSurvey(Boolean value) {
        this.enablePreChatSurvey = value;
    }

    /**
     * Gets the value of the activePreChatSurveyId property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getActivePreChatSurveyId() {
        return activePreChatSurveyId;
    }

    /**
     * Sets the value of the activePreChatSurveyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setActivePreChatSurveyId(IdRef value) {
        this.activePreChatSurveyId = value;
    }

    /**
     * Gets the value of the enableExitSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableExitSurvey() {
        return enableExitSurvey;
    }

    /**
     * Sets the value of the enableExitSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableExitSurvey(Boolean value) {
        this.enableExitSurvey = value;
    }

    /**
     * Gets the value of the activeExitSurveyId property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getActiveExitSurveyId() {
        return activeExitSurveyId;
    }

    /**
     * Sets the value of the activeExitSurveyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setActiveExitSurveyId(IdRef value) {
        this.activeExitSurveyId = value;
    }

    /**
     * Gets the value of the enableOperatorSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableOperatorSurvey() {
        return enableOperatorSurvey;
    }

    /**
     * Sets the value of the enableOperatorSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableOperatorSurvey(Boolean value) {
        this.enableOperatorSurvey = value;
    }

    /**
     * Gets the value of the activeOperatorSurveyId property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getActiveOperatorSurveyId() {
        return activeOperatorSurveyId;
    }

    /**
     * Sets the value of the activeOperatorSurveyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setActiveOperatorSurveyId(IdRef value) {
        this.activeOperatorSurveyId = value;
    }

    /**
     * Gets the value of the activeOfflineSurveyId property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getActiveOfflineSurveyId() {
        return activeOfflineSurveyId;
    }

    /**
     * Sets the value of the activeOfflineSurveyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setActiveOfflineSurveyId(IdRef value) {
        this.activeOfflineSurveyId = value;
    }

    /**
     * Gets the value of the cannedResponsesSetIds property.
     * 
     * @return
     *     possible object is
     *     {@link CannedResponsesSetIds }
     *     
     */
    public CannedResponsesSetIds getCannedResponsesSetIds() {
        return cannedResponsesSetIds;
    }

    /**
     * Sets the value of the cannedResponsesSetIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link CannedResponsesSetIds }
     *     
     */
    public void setCannedResponsesSetIds(CannedResponsesSetIds value) {
        this.cannedResponsesSetIds = value;
    }

    /**
     * Gets the value of the chatTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link ChatTemplates }
     *     
     */
    public ChatTemplates getChatTemplates() {
        return chatTemplates;
    }

    /**
     * Sets the value of the chatTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChatTemplates }
     *     
     */
    public void setChatTemplates(ChatTemplates value) {
        this.chatTemplates = value;
    }

}

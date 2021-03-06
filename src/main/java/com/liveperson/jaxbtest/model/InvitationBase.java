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
 * <p>Java class for invitationBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="invitationBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="default" type="{http://liveperson.com/v1.0}default" minOccurs="0"/>
 *         &lt;element name="contentType" type="{http://liveperson.com/v1.0}contentTypeEnum" minOccurs="0"/>
 *         &lt;element name="posType" type="{http://liveperson.com/v1.0}posTypeEnum" minOccurs="0"/>
 *         &lt;element name="onTopOfObj" type="{http://liveperson.com/v1.0}OnTopOfObjEnum" minOccurs="0"/>
 *         &lt;element name="imagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="ieOnTopColour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ieOnTop" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hideFlash" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="posX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="posY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="posWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="posHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="visualStyle" type="{http://liveperson.com/v1.0}visualStyleEnum" minOccurs="0"/>
 *         &lt;element name="linkTitle" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="closeTitle" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="buttonTitle" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="preventOffPage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="soundFileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inviteSound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inviteDynTextEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inviteHtmlDynTextEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="invDynTextClickable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dynTextPosX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dynTextPosY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dynTextWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dynTextHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dynText" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="dynTextOn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="invDynTextShowIfAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invitationBase", propOrder = {
    "_default",
    "contentType",
    "posType",
    "onTopOfObj",
    "imagePath",
    "customHTML",
    "description",
    "ieOnTopColour",
    "ieOnTop",
    "hideFlash",
    "posX",
    "posY",
    "posWidth",
    "posHeight",
    "visualStyle",
    "linkTitle",
    "closeTitle",
    "buttonTitle",
    "preventOffPage",
    "soundFileUrl",
    "inviteSound",
    "inviteDynTextEnabled",
    "inviteHtmlDynTextEnabled",
    "invDynTextClickable",
    "dynTextPosX",
    "dynTextPosY",
    "dynTextWidth",
    "dynTextHeight",
    "dynText",
    "dynTextOn",
    "invDynTextShowIfAll"
})
@XmlSeeAlso({
    Invitation.class,
    UpdateInvitation.class
})
public class InvitationBase {

    @XmlElement(name = "default")
    protected Default _default;
    protected Integer contentType;
    protected Integer posType;
    protected Integer onTopOfObj;
    protected String imagePath;
    protected String customHTML;
    protected String description;
    protected String ieOnTopColour;
    protected Integer ieOnTop;
    protected Integer hideFlash;
    protected Integer posX;
    protected Integer posY;
    protected Integer posWidth;
    protected Integer posHeight;
    protected Integer visualStyle;
    protected String linkTitle;
    protected String closeTitle;
    protected String buttonTitle;
    protected Boolean preventOffPage;
    protected String soundFileUrl;
    protected Boolean inviteSound;
    protected Boolean inviteDynTextEnabled;
    protected Boolean inviteHtmlDynTextEnabled;
    protected Boolean invDynTextClickable;
    protected Integer dynTextPosX;
    protected Integer dynTextPosY;
    protected Integer dynTextWidth;
    protected Integer dynTextHeight;
    protected String dynText;
    protected Integer dynTextOn;
    protected Boolean invDynTextShowIfAll;

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

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContentType(Integer value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the posType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosType() {
        return posType;
    }

    /**
     * Sets the value of the posType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosType(Integer value) {
        this.posType = value;
    }

    /**
     * Gets the value of the onTopOfObj property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOnTopOfObj() {
        return onTopOfObj;
    }

    /**
     * Sets the value of the onTopOfObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOnTopOfObj(Integer value) {
        this.onTopOfObj = value;
    }

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
     * Gets the value of the customHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomHTML() {
        return customHTML;
    }

    /**
     * Sets the value of the customHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomHTML(String value) {
        this.customHTML = value;
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
     * Gets the value of the ieOnTopColour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIeOnTopColour() {
        return ieOnTopColour;
    }

    /**
     * Sets the value of the ieOnTopColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIeOnTopColour(String value) {
        this.ieOnTopColour = value;
    }

    /**
     * Gets the value of the ieOnTop property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIeOnTop() {
        return ieOnTop;
    }

    /**
     * Sets the value of the ieOnTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIeOnTop(Integer value) {
        this.ieOnTop = value;
    }

    /**
     * Gets the value of the hideFlash property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHideFlash() {
        return hideFlash;
    }

    /**
     * Sets the value of the hideFlash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHideFlash(Integer value) {
        this.hideFlash = value;
    }

    /**
     * Gets the value of the posX property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosX() {
        return posX;
    }

    /**
     * Sets the value of the posX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosX(Integer value) {
        this.posX = value;
    }

    /**
     * Gets the value of the posY property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosY() {
        return posY;
    }

    /**
     * Sets the value of the posY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosY(Integer value) {
        this.posY = value;
    }

    /**
     * Gets the value of the posWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosWidth() {
        return posWidth;
    }

    /**
     * Sets the value of the posWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosWidth(Integer value) {
        this.posWidth = value;
    }

    /**
     * Gets the value of the posHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosHeight() {
        return posHeight;
    }

    /**
     * Sets the value of the posHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosHeight(Integer value) {
        this.posHeight = value;
    }

    /**
     * Gets the value of the visualStyle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisualStyle() {
        return visualStyle;
    }

    /**
     * Sets the value of the visualStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisualStyle(Integer value) {
        this.visualStyle = value;
    }

    /**
     * Gets the value of the linkTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTitle() {
        return linkTitle;
    }

    /**
     * Sets the value of the linkTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTitle(String value) {
        this.linkTitle = value;
    }

    /**
     * Gets the value of the closeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseTitle() {
        return closeTitle;
    }

    /**
     * Sets the value of the closeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseTitle(String value) {
        this.closeTitle = value;
    }

    /**
     * Gets the value of the buttonTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonTitle() {
        return buttonTitle;
    }

    /**
     * Sets the value of the buttonTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonTitle(String value) {
        this.buttonTitle = value;
    }

    /**
     * Gets the value of the preventOffPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreventOffPage() {
        return preventOffPage;
    }

    /**
     * Sets the value of the preventOffPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreventOffPage(Boolean value) {
        this.preventOffPage = value;
    }

    /**
     * Gets the value of the soundFileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoundFileUrl() {
        return soundFileUrl;
    }

    /**
     * Sets the value of the soundFileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoundFileUrl(String value) {
        this.soundFileUrl = value;
    }

    /**
     * Gets the value of the inviteSound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInviteSound() {
        return inviteSound;
    }

    /**
     * Sets the value of the inviteSound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInviteSound(Boolean value) {
        this.inviteSound = value;
    }

    /**
     * Gets the value of the inviteDynTextEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInviteDynTextEnabled() {
        return inviteDynTextEnabled;
    }

    /**
     * Sets the value of the inviteDynTextEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInviteDynTextEnabled(Boolean value) {
        this.inviteDynTextEnabled = value;
    }

    /**
     * Gets the value of the inviteHtmlDynTextEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInviteHtmlDynTextEnabled() {
        return inviteHtmlDynTextEnabled;
    }

    /**
     * Sets the value of the inviteHtmlDynTextEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInviteHtmlDynTextEnabled(Boolean value) {
        this.inviteHtmlDynTextEnabled = value;
    }

    /**
     * Gets the value of the invDynTextClickable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvDynTextClickable() {
        return invDynTextClickable;
    }

    /**
     * Sets the value of the invDynTextClickable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvDynTextClickable(Boolean value) {
        this.invDynTextClickable = value;
    }

    /**
     * Gets the value of the dynTextPosX property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDynTextPosX() {
        return dynTextPosX;
    }

    /**
     * Sets the value of the dynTextPosX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDynTextPosX(Integer value) {
        this.dynTextPosX = value;
    }

    /**
     * Gets the value of the dynTextPosY property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDynTextPosY() {
        return dynTextPosY;
    }

    /**
     * Sets the value of the dynTextPosY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDynTextPosY(Integer value) {
        this.dynTextPosY = value;
    }

    /**
     * Gets the value of the dynTextWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDynTextWidth() {
        return dynTextWidth;
    }

    /**
     * Sets the value of the dynTextWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDynTextWidth(Integer value) {
        this.dynTextWidth = value;
    }

    /**
     * Gets the value of the dynTextHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDynTextHeight() {
        return dynTextHeight;
    }

    /**
     * Sets the value of the dynTextHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDynTextHeight(Integer value) {
        this.dynTextHeight = value;
    }

    /**
     * Gets the value of the dynText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynText() {
        return dynText;
    }

    /**
     * Sets the value of the dynText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynText(String value) {
        this.dynText = value;
    }

    /**
     * Gets the value of the dynTextOn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDynTextOn() {
        return dynTextOn;
    }

    /**
     * Sets the value of the dynTextOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDynTextOn(Integer value) {
        this.dynTextOn = value;
    }

    /**
     * Gets the value of the invDynTextShowIfAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvDynTextShowIfAll() {
        return invDynTextShowIfAll;
    }

    /**
     * Sets the value of the invDynTextShowIfAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvDynTextShowIfAll(Boolean value) {
        this.invDynTextShowIfAll = value;
    }

}

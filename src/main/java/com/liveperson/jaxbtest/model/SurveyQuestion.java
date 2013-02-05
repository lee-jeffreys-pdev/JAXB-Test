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
 * <p>Java class for surveyQuestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyQuestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="question" type="{http://liveperson.com/v1.0}lpString"/>
 *         &lt;element name="type" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *         &lt;element name="logicID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="displayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UDEScope" type="{http://liveperson.com/v1.0}UDEScope"/>
 *         &lt;element name="UDEType" type="{http://liveperson.com/v1.0}UDEType"/>
 *         &lt;element name="globalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="answersList" type="{http://liveperson.com/v1.0}answersList" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isAutoSubmitQuestion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="autoSubmitAnswer" type="{http://liveperson.com/v1.0}lpString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyQuestion", propOrder = {
    "question",
    "type",
    "logicID",
    "displayed",
    "required",
    "udeScope",
    "udeType",
    "globalName",
    "answersList",
    "encrypted",
    "isAutoSubmitQuestion",
    "autoSubmitAnswer"
})
public class SurveyQuestion {

    @XmlElement(required = true)
    protected String question;
    protected String type;
    protected Integer logicID;
    protected boolean displayed;
    protected boolean required;
    @XmlElement(name = "UDEScope", required = true)
    protected UDEScope udeScope;
    @XmlElement(name = "UDEType", required = true)
    protected UDEType udeType;
    protected String globalName;
    protected AnswersList answersList;
    protected Boolean encrypted;
    protected Boolean isAutoSubmitQuestion;
    protected String autoSubmitAnswer;

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the logicID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogicID() {
        return logicID;
    }

    /**
     * Sets the value of the logicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogicID(Integer value) {
        this.logicID = value;
    }

    /**
     * Gets the value of the displayed property.
     * 
     */
    public boolean isDisplayed() {
        return displayed;
    }

    /**
     * Sets the value of the displayed property.
     * 
     */
    public void setDisplayed(boolean value) {
        this.displayed = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the udeScope property.
     * 
     * @return
     *     possible object is
     *     {@link UDEScope }
     *     
     */
    public UDEScope getUDEScope() {
        return udeScope;
    }

    /**
     * Sets the value of the udeScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link UDEScope }
     *     
     */
    public void setUDEScope(UDEScope value) {
        this.udeScope = value;
    }

    /**
     * Gets the value of the udeType property.
     * 
     * @return
     *     possible object is
     *     {@link UDEType }
     *     
     */
    public UDEType getUDEType() {
        return udeType;
    }

    /**
     * Sets the value of the udeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UDEType }
     *     
     */
    public void setUDEType(UDEType value) {
        this.udeType = value;
    }

    /**
     * Gets the value of the globalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalName() {
        return globalName;
    }

    /**
     * Sets the value of the globalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalName(String value) {
        this.globalName = value;
    }

    /**
     * Gets the value of the answersList property.
     * 
     * @return
     *     possible object is
     *     {@link AnswersList }
     *     
     */
    public AnswersList getAnswersList() {
        return answersList;
    }

    /**
     * Sets the value of the answersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswersList }
     *     
     */
    public void setAnswersList(AnswersList value) {
        this.answersList = value;
    }

    /**
     * Gets the value of the encrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncrypted(Boolean value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the isAutoSubmitQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutoSubmitQuestion() {
        return isAutoSubmitQuestion;
    }

    /**
     * Sets the value of the isAutoSubmitQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutoSubmitQuestion(Boolean value) {
        this.isAutoSubmitQuestion = value;
    }

    /**
     * Gets the value of the autoSubmitAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoSubmitAnswer() {
        return autoSubmitAnswer;
    }

    /**
     * Sets the value of the autoSubmitAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoSubmitAnswer(String value) {
        this.autoSubmitAnswer = value;
    }

}

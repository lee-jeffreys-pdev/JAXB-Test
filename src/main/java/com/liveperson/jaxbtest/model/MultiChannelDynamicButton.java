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
 * 
 *                 This schema should be used in case of creating new Multi Channel Dynamic Button.
 *             
 * 
 * <p>Java class for multiChannelDynamicButton complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiChannelDynamicButton">
 *   &lt;complexContent>
 *     &lt;extension base="{http://liveperson.com/v1.0}dynamicButton">
 *       &lt;sequence>
 *         &lt;element name="commonProperties" type="{http://liveperson.com/v1.0}commonProperties"/>
 *         &lt;element name="chatProperties" type="{http://liveperson.com/v1.0}chatProperties"/>
 *         &lt;choice>
 *           &lt;element name="voiceDualStepProperties" type="{http://liveperson.com/v1.0}voiceDualStepProperties"/>
 *           &lt;element name="voiceSingleStepProperties" type="{http://liveperson.com/v1.0}voiceSingleStepProperties"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiChannelDynamicButton", propOrder = {
    "commonProperties",
    "chatProperties",
    "voiceDualStepProperties",
    "voiceSingleStepProperties"
})
public class MultiChannelDynamicButton
    extends DynamicButton
{

    @XmlElement(required = true)
    protected CommonProperties commonProperties;
    @XmlElement(required = true)
    protected ChatProperties chatProperties;
    protected VoiceDualStepProperties voiceDualStepProperties;
    protected VoiceSingleStepProperties voiceSingleStepProperties;

    /**
     * Gets the value of the commonProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CommonProperties }
     *     
     */
    public CommonProperties getCommonProperties() {
        return commonProperties;
    }

    /**
     * Sets the value of the commonProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonProperties }
     *     
     */
    public void setCommonProperties(CommonProperties value) {
        this.commonProperties = value;
    }

    /**
     * Gets the value of the chatProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ChatProperties }
     *     
     */
    public ChatProperties getChatProperties() {
        return chatProperties;
    }

    /**
     * Sets the value of the chatProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChatProperties }
     *     
     */
    public void setChatProperties(ChatProperties value) {
        this.chatProperties = value;
    }

    /**
     * Gets the value of the voiceDualStepProperties property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceDualStepProperties }
     *     
     */
    public VoiceDualStepProperties getVoiceDualStepProperties() {
        return voiceDualStepProperties;
    }

    /**
     * Sets the value of the voiceDualStepProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceDualStepProperties }
     *     
     */
    public void setVoiceDualStepProperties(VoiceDualStepProperties value) {
        this.voiceDualStepProperties = value;
    }

    /**
     * Gets the value of the voiceSingleStepProperties property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceSingleStepProperties }
     *     
     */
    public VoiceSingleStepProperties getVoiceSingleStepProperties() {
        return voiceSingleStepProperties;
    }

    /**
     * Sets the value of the voiceSingleStepProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceSingleStepProperties }
     *     
     */
    public void setVoiceSingleStepProperties(VoiceSingleStepProperties value) {
        this.voiceSingleStepProperties = value;
    }

}

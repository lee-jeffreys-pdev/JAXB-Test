//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.05 at 02:53:59 PM GMT 
//


package com.liveperson.jaxbtest.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cannedResponseTree complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cannedResponseTree">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="menu" type="{http://liveperson.com/v1.0}menuType"/>
 *         &lt;element name="message" type="{http://liveperson.com/v1.0}messageType"/>
 *         &lt;element name="separator" type="{http://liveperson.com/v1.0}separatorType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cannedResponseTree", propOrder = {
    "menuOrMessageOrSeparator"
})
public class CannedResponseTree {

    @XmlElements({
        @XmlElement(name = "separator", type = SeparatorType.class),
        @XmlElement(name = "menu", type = MenuType.class),
        @XmlElement(name = "message", type = MessageType.class)
    })
    protected List<Object> menuOrMessageOrSeparator;

    /**
     * Gets the value of the menuOrMessageOrSeparator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the menuOrMessageOrSeparator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMenuOrMessageOrSeparator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeparatorType }
     * {@link MenuType }
     * {@link MessageType }
     * 
     * 
     */
    public List<Object> getMenuOrMessageOrSeparator() {
        if (menuOrMessageOrSeparator == null) {
            menuOrMessageOrSeparator = new ArrayList<Object>();
        }
        return this.menuOrMessageOrSeparator;
    }

}
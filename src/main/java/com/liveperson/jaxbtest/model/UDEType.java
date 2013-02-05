//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.05 at 02:53:59 PM GMT 
//


package com.liveperson.jaxbtest.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UDEType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UDEType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text Field"/>
 *     &lt;enumeration value="Radio Button"/>
 *     &lt;enumeration value="Checkbox"/>
 *     &lt;enumeration value="Dropdown Box"/>
 *     &lt;enumeration value="Text Area"/>
 *     &lt;enumeration value="Radio Button (side by side)"/>
 *     &lt;enumeration value="Date"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UDEType")
@XmlEnum
public enum UDEType {

    @XmlEnumValue("Text Field")
    TEXT_FIELD("Text Field"),
    @XmlEnumValue("Radio Button")
    RADIO_BUTTON("Radio Button"),
    @XmlEnumValue("Checkbox")
    CHECKBOX("Checkbox"),
    @XmlEnumValue("Dropdown Box")
    DROPDOWN_BOX("Dropdown Box"),
    @XmlEnumValue("Text Area")
    TEXT_AREA("Text Area"),
    @XmlEnumValue("Radio Button (side by side)")
    RADIO_BUTTON_SIDE_BY_SIDE("Radio Button (side by side)"),
    @XmlEnumValue("Date")
    DATE("Date");
    private final String value;

    UDEType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UDEType fromValue(String v) {
        for (UDEType c: UDEType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

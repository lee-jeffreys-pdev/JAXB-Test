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
 * <p>Java class for skin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="skin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LP Connect"/>
 *     &lt;enumeration value="Classic Look"/>
 *     &lt;enumeration value="Legacy Look"/>
 *     &lt;enumeration value="Modern Look"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "skin")
@XmlEnum
public enum Skin {

    @XmlEnumValue("LP Connect")
    LP_CONNECT("LP Connect"),
    @XmlEnumValue("Classic Look")
    CLASSIC_LOOK("Classic Look"),
    @XmlEnumValue("Legacy Look")
    LEGACY_LOOK("Legacy Look"),
    @XmlEnumValue("Modern Look")
    MODERN_LOOK("Modern Look");
    private final String value;

    Skin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Skin fromValue(String v) {
        for (Skin c: Skin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

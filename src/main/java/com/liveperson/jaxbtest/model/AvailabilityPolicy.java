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
 * <p>Java class for availabilityPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="availabilityPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Available within"/>
 *     &lt;enumeration value="Online operators"/>
 *     &lt;enumeration value="Always available"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "availabilityPolicy")
@XmlEnum
public enum AvailabilityPolicy {

    @XmlEnumValue("Available within")
    AVAILABLE_WITHIN("Available within"),
    @XmlEnumValue("Online operators")
    ONLINE_OPERATORS("Online operators"),
    @XmlEnumValue("Always available")
    ALWAYS_AVAILABLE("Always available");
    private final String value;

    AvailabilityPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailabilityPolicy fromValue(String v) {
        for (AvailabilityPolicy c: AvailabilityPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

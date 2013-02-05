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
 * <p>Java class for chatTemplateName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chatTemplateName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ChatWindow"/>
 *     &lt;enumeration value="PreChatWindow"/>
 *     &lt;enumeration value="OfflineWindow"/>
 *     &lt;enumeration value="ExitWindow"/>
 *     &lt;enumeration value="PreChatContent"/>
 *     &lt;enumeration value="PreChatDone"/>
 *     &lt;enumeration value="OfflineContent"/>
 *     &lt;enumeration value="OfflineDone"/>
 *     &lt;enumeration value="ExitDone"/>
 *     &lt;enumeration value="Includes"/>
 *     &lt;enumeration value="AgentControl"/>
 *     &lt;enumeration value="AgentControlRedirect"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chatTemplateName")
@XmlEnum
public enum ChatTemplateName {

    @XmlEnumValue("ChatWindow")
    CHAT_WINDOW("ChatWindow"),
    @XmlEnumValue("PreChatWindow")
    PRE_CHAT_WINDOW("PreChatWindow"),
    @XmlEnumValue("OfflineWindow")
    OFFLINE_WINDOW("OfflineWindow"),
    @XmlEnumValue("ExitWindow")
    EXIT_WINDOW("ExitWindow"),
    @XmlEnumValue("PreChatContent")
    PRE_CHAT_CONTENT("PreChatContent"),
    @XmlEnumValue("PreChatDone")
    PRE_CHAT_DONE("PreChatDone"),
    @XmlEnumValue("OfflineContent")
    OFFLINE_CONTENT("OfflineContent"),
    @XmlEnumValue("OfflineDone")
    OFFLINE_DONE("OfflineDone"),
    @XmlEnumValue("ExitDone")
    EXIT_DONE("ExitDone"),
    @XmlEnumValue("Includes")
    INCLUDES("Includes"),
    @XmlEnumValue("AgentControl")
    AGENT_CONTROL("AgentControl"),
    @XmlEnumValue("AgentControlRedirect")
    AGENT_CONTROL_REDIRECT("AgentControlRedirect");
    private final String value;

    ChatTemplateName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChatTemplateName fromValue(String v) {
        for (ChatTemplateName c: ChatTemplateName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

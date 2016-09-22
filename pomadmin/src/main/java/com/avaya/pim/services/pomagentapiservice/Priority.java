
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Priority的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Priority"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOW"/&gt;
 *     &lt;enumeration value="TWO"/&gt;
 *     &lt;enumeration value="THREE"/&gt;
 *     &lt;enumeration value="FOUR"/&gt;
 *     &lt;enumeration value="MEDIUM"/&gt;
 *     &lt;enumeration value="SIX"/&gt;
 *     &lt;enumeration value="SEVEN"/&gt;
 *     &lt;enumeration value="EIGHT"/&gt;
 *     &lt;enumeration value="NINE"/&gt;
 *     &lt;enumeration value="HIGH"/&gt;
 *     &lt;enumeration value="BOTTOM"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Priority")
@XmlEnum
public enum Priority {

    LOW,
    TWO,
    THREE,
    FOUR,
    MEDIUM,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    HIGH,
    BOTTOM,
    TOP;

    public String value() {
        return name();
    }

    public static Priority fromValue(String v) {
        return valueOf(v);
    }

}

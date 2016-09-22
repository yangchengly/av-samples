
package com.avaya.pim.services.pomcmpmgmtservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RecurringFrequencyType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RecurringFrequencyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RunEveryNMins"/&gt;
 *     &lt;enumeration value="Daily"/&gt;
 *     &lt;enumeration value="Weekly"/&gt;
 *     &lt;enumeration value="Monthly"/&gt;
 *     &lt;enumeration value="Yearly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RecurringFrequencyType")
@XmlEnum
public enum RecurringFrequencyType {

    @XmlEnumValue("RunEveryNMins")
    RUN_EVERY_N_MINS("RunEveryNMins"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Yearly")
    YEARLY("Yearly");
    private final String value;

    RecurringFrequencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurringFrequencyType fromValue(String v) {
        for (RecurringFrequencyType c: RecurringFrequencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.avaya.pim.services.pomcmpmgmtservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArchivalFrequencyType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ArchivalFrequencyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Hourly"/&gt;
 *     &lt;enumeration value="RunEveryNHours"/&gt;
 *     &lt;enumeration value="DailyAt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ArchivalFrequencyType")
@XmlEnum
public enum ArchivalFrequencyType {

    @XmlEnumValue("Hourly")
    HOURLY("Hourly"),
    @XmlEnumValue("RunEveryNHours")
    RUN_EVERY_N_HOURS("RunEveryNHours"),
    @XmlEnumValue("DailyAt")
    DAILY_AT("DailyAt");
    private final String value;

    ArchivalFrequencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArchivalFrequencyType fromValue(String v) {
        for (ArchivalFrequencyType c: ArchivalFrequencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

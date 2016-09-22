
package com.avaya.pim.services.pomcmpmgmtservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImportJobState的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ImportJobState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *     &lt;enumeration value="QUEUED"/&gt;
 *     &lt;enumeration value="RUNNING"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="FILE_COPYING"/&gt;
 *     &lt;enumeration value="PAUSING"/&gt;
 *     &lt;enumeration value="PAUSED"/&gt;
 *     &lt;enumeration value="STOPPING"/&gt;
 *     &lt;enumeration value="WAITING_TO_RESUME"/&gt;
 *     &lt;enumeration value="DELETING_CONTACTS"/&gt;
 *     &lt;enumeration value="CREATING_HISTORY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImportJobState")
@XmlEnum
public enum ImportJobState {

    COMPLETED,
    QUEUED,
    RUNNING,
    ERROR,
    FILE_COPYING,
    PAUSING,
    PAUSED,
    STOPPING,
    WAITING_TO_RESUME,
    DELETING_CONTACTS,
    CREATING_HISTORY;

    public String value() {
        return name();
    }

    public static ImportJobState fromValue(String v) {
        return valueOf(v);
    }

}

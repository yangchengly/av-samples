
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ListStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ListStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LIST_BEING_IDLE"/&gt;
 *     &lt;enumeration value="LIST_BEING_EMPTIED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ListStatus")
@XmlEnum
public enum ListStatus {

    LIST_BEING_IDLE,
    LIST_BEING_EMPTIED;

    public String value() {
        return name();
    }

    public static ListStatus fromValue(String v) {
        return valueOf(v);
    }

}

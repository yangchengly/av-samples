
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OperationType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="OperationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="MINUS"/&gt;
 *     &lt;enumeration value="ASSIGN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperationType")
@XmlEnum
public enum OperationType {

    ADD,
    MINUS,
    ASSIGN;

    public String value() {
        return name();
    }

    public static OperationType fromValue(String v) {
        return valueOf(v);
    }

}


package com.avaya.pim.services.pomcmpmgmtservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FaultMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RetCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "faultMsg",
    "retCode"
})
@XmlRootElement(name = "GetContactListNamesFaultInfo")
public class GetContactListNamesFaultInfo {

    @XmlElement(name = "FaultMsg", required = true)
    protected String faultMsg;
    @XmlElement(name = "RetCode")
    protected int retCode;

    /**
     * ��ȡfaultMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultMsg() {
        return faultMsg;
    }

    /**
     * ����faultMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultMsg(String value) {
        this.faultMsg = value;
    }

    /**
     * ��ȡretCode���Ե�ֵ��
     * 
     */
    public int getRetCode() {
        return retCode;
    }

    /**
     * ����retCode���Ե�ֵ��
     * 
     */
    public void setRetCode(int value) {
        this.retCode = value;
    }

}

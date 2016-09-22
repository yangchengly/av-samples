
package com.avaya.pim.services.pomagentapiservice;

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
 *         &lt;element name="RetCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FaultMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "retCode",
    "faultMsg"
})
@XmlRootElement(name = "SaveContactToListFaultInfo")
public class SaveContactToListFaultInfo {

    @XmlElement(name = "RetCode")
    protected int retCode;
    @XmlElement(name = "FaultMsg", required = true)
    protected String faultMsg;

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

}

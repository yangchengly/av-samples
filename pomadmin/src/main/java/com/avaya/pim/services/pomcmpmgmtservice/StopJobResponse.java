
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
 *         &lt;element name="IsStopped" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isStopped"
})
@XmlRootElement(name = "StopJobResponse")
public class StopJobResponse {

    @XmlElement(name = "IsStopped")
    protected boolean isStopped;

    /**
     * ��ȡisStopped���Ե�ֵ��
     * 
     */
    public boolean isIsStopped() {
        return isStopped;
    }

    /**
     * ����isStopped���Ե�ֵ��
     * 
     */
    public void setIsStopped(boolean value) {
        this.isStopped = value;
    }

}

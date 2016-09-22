
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
 *         &lt;element name="PimSessionID" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CompletionCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "pimSessionID",
    "completionCode"
})
@XmlRootElement(name = "UpdateCompletionCode")
public class UpdateCompletionCode {

    @XmlElement(name = "PimSessionID")
    protected double pimSessionID;
    @XmlElement(name = "CompletionCode", required = true)
    protected String completionCode;

    /**
     * ��ȡpimSessionID���Ե�ֵ��
     * 
     */
    public double getPimSessionID() {
        return pimSessionID;
    }

    /**
     * ����pimSessionID���Ե�ֵ��
     * 
     */
    public void setPimSessionID(double value) {
        this.pimSessionID = value;
    }

    /**
     * ��ȡcompletionCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionCode() {
        return completionCode;
    }

    /**
     * ����completionCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionCode(String value) {
        this.completionCode = value;
    }

}


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
 *         &lt;element name="ContactRecord" type="{http://services.pim.avaya.com/AgentAPI/}ContactDataType"/&gt;
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
    "contactRecord"
})
@XmlRootElement(name = "GetContactDataFromListResponse")
public class GetContactDataFromListResponse {

    @XmlElement(name = "ContactRecord", required = true)
    protected ContactDataType contactRecord;

    /**
     * ��ȡcontactRecord���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactDataType }
     *     
     */
    public ContactDataType getContactRecord() {
        return contactRecord;
    }

    /**
     * ����contactRecord���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDataType }
     *     
     */
    public void setContactRecord(ContactDataType value) {
        this.contactRecord = value;
    }

}

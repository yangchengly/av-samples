
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
 *         &lt;element name="ContactListEmptyStatus" type="{http://services.pim.avaya.com/AgentAPI/}ContactListStatus"/&gt;
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
    "contactListEmptyStatus"
})
@XmlRootElement(name = "GetContactListEmptyStatusResponse")
public class GetContactListEmptyStatusResponse {

    @XmlElement(name = "ContactListEmptyStatus", required = true)
    protected ContactListStatus contactListEmptyStatus;

    /**
     * ��ȡcontactListEmptyStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactListStatus }
     *     
     */
    public ContactListStatus getContactListEmptyStatus() {
        return contactListEmptyStatus;
    }

    /**
     * ����contactListEmptyStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactListStatus }
     *     
     */
    public void setContactListEmptyStatus(ContactListStatus value) {
        this.contactListEmptyStatus = value;
    }

}

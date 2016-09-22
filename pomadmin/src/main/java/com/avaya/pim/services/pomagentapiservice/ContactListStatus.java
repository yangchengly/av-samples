
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContactListStatus complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ContactListStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmptyStatus" type="{http://services.pim.avaya.com/AgentAPI/}ListStatus"/&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactListStatus", propOrder = {
    "emptyStatus",
    "totalCount"
})
public class ContactListStatus {

    @XmlElement(name = "EmptyStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ListStatus emptyStatus;
    @XmlElement(name = "TotalCount")
    protected long totalCount;

    /**
     * ��ȡemptyStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ListStatus }
     *     
     */
    public ListStatus getEmptyStatus() {
        return emptyStatus;
    }

    /**
     * ����emptyStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ListStatus }
     *     
     */
    public void setEmptyStatus(ListStatus value) {
        this.emptyStatus = value;
    }

    /**
     * ��ȡtotalCount���Ե�ֵ��
     * 
     */
    public long getTotalCount() {
        return totalCount;
    }

    /**
     * ����totalCount���Ե�ֵ��
     * 
     */
    public void setTotalCount(long value) {
        this.totalCount = value;
    }

}


package com.avaya.pim.services.pomagentapiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactListName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactPriority" type="{http://services.pim.avaya.com/AgentAPI/}Priority" minOccurs="0"/&gt;
 *         &lt;element name="ApplyFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "campaignName",
    "contactListName",
    "contactPriority",
    "applyFilter"
})
@XmlRootElement(name = "AddContactListToJob")
public class AddContactListToJob {

    @XmlElement(name = "CampaignName", required = true)
    protected String campaignName;
    @XmlElement(name = "ContactListName", required = true)
    protected String contactListName;
    @XmlElement(name = "ContactPriority", defaultValue = "MEDIUM")
    @XmlSchemaType(name = "string")
    protected Priority contactPriority;
    @XmlElement(name = "ApplyFilter", defaultValue = "false")
    protected Boolean applyFilter;

    /**
     * ��ȡcampaignName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * ����campaignName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * ��ȡcontactListName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactListName() {
        return contactListName;
    }

    /**
     * ����contactListName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactListName(String value) {
        this.contactListName = value;
    }

    /**
     * ��ȡcontactPriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getContactPriority() {
        return contactPriority;
    }

    /**
     * ����contactPriority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setContactPriority(Priority value) {
        this.contactPriority = value;
    }

    /**
     * ��ȡapplyFilter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyFilter() {
        return applyFilter;
    }

    /**
     * ����applyFilter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyFilter(Boolean value) {
        this.applyFilter = value;
    }

}


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
 *         &lt;element name="ContactToBeSaved" type="{http://services.pim.avaya.com/AgentAPI/}ContactDataType"/&gt;
 *         &lt;element name="AutomaticUpdateForTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CheckForRejectPattern" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CheckForPhoneFormatsRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpdateExisting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CheckDNC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "contactToBeSaved",
    "automaticUpdateForTimeZone",
    "checkForRejectPattern",
    "checkForPhoneFormatsRule",
    "updateExisting",
    "checkDNC"
})
@XmlRootElement(name = "SaveContactToList")
public class SaveContactToList {

    @XmlElement(name = "ContactToBeSaved", required = true)
    protected ContactDataType contactToBeSaved;
    @XmlElement(name = "AutomaticUpdateForTimeZone", defaultValue = "false")
    protected Boolean automaticUpdateForTimeZone;
    @XmlElement(name = "CheckForRejectPattern", defaultValue = "false")
    protected Boolean checkForRejectPattern;
    @XmlElement(name = "CheckForPhoneFormatsRule", defaultValue = "false")
    protected Boolean checkForPhoneFormatsRule;
    @XmlElement(name = "UpdateExisting", defaultValue = "false")
    protected Boolean updateExisting;
    @XmlElement(name = "CheckDNC", defaultValue = "false")
    protected Boolean checkDNC;

    /**
     * ��ȡcontactToBeSaved���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactDataType }
     *     
     */
    public ContactDataType getContactToBeSaved() {
        return contactToBeSaved;
    }

    /**
     * ����contactToBeSaved���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDataType }
     *     
     */
    public void setContactToBeSaved(ContactDataType value) {
        this.contactToBeSaved = value;
    }

    /**
     * ��ȡautomaticUpdateForTimeZone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticUpdateForTimeZone() {
        return automaticUpdateForTimeZone;
    }

    /**
     * ����automaticUpdateForTimeZone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticUpdateForTimeZone(Boolean value) {
        this.automaticUpdateForTimeZone = value;
    }

    /**
     * ��ȡcheckForRejectPattern���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckForRejectPattern() {
        return checkForRejectPattern;
    }

    /**
     * ����checkForRejectPattern���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckForRejectPattern(Boolean value) {
        this.checkForRejectPattern = value;
    }

    /**
     * ��ȡcheckForPhoneFormatsRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckForPhoneFormatsRule() {
        return checkForPhoneFormatsRule;
    }

    /**
     * ����checkForPhoneFormatsRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckForPhoneFormatsRule(Boolean value) {
        this.checkForPhoneFormatsRule = value;
    }

    /**
     * ��ȡupdateExisting���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateExisting() {
        return updateExisting;
    }

    /**
     * ����updateExisting���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateExisting(Boolean value) {
        this.updateExisting = value;
    }

    /**
     * ��ȡcheckDNC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckDNC() {
        return checkDNC;
    }

    /**
     * ����checkDNC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckDNC(Boolean value) {
        this.checkDNC = value;
    }

}

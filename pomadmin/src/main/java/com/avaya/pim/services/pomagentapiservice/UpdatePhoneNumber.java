
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactListName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PhoneObject" type="{http://services.pim.avaya.com/AgentAPI/}PhoneType"/&gt;
 *         &lt;element name="AutomaticUpdateForTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CheckForRejectPattern" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CheckForPhoneFormatsRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "contactID",
    "contactListName",
    "phoneObject",
    "automaticUpdateForTimeZone",
    "checkForRejectPattern",
    "checkForPhoneFormatsRule",
    "checkDNC"
})
@XmlRootElement(name = "UpdatePhoneNumber")
public class UpdatePhoneNumber {

    @XmlElement(name = "ContactID", required = true)
    protected String contactID;
    @XmlElement(name = "ContactListName", required = true)
    protected String contactListName;
    @XmlElement(name = "PhoneObject", required = true)
    protected PhoneType phoneObject;
    @XmlElement(name = "AutomaticUpdateForTimeZone", defaultValue = "false")
    protected Boolean automaticUpdateForTimeZone;
    @XmlElement(name = "CheckForRejectPattern", defaultValue = "false")
    protected Boolean checkForRejectPattern;
    @XmlElement(name = "CheckForPhoneFormatsRule", defaultValue = "false")
    protected Boolean checkForPhoneFormatsRule;
    @XmlElement(name = "CheckDNC", defaultValue = "false")
    protected Boolean checkDNC;

    /**
     * 获取contactID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactID() {
        return contactID;
    }

    /**
     * 设置contactID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactID(String value) {
        this.contactID = value;
    }

    /**
     * 获取contactListName属性的值。
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
     * 设置contactListName属性的值。
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
     * 获取phoneObject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPhoneObject() {
        return phoneObject;
    }

    /**
     * 设置phoneObject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    public void setPhoneObject(PhoneType value) {
        this.phoneObject = value;
    }

    /**
     * 获取automaticUpdateForTimeZone属性的值。
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
     * 设置automaticUpdateForTimeZone属性的值。
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
     * 获取checkForRejectPattern属性的值。
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
     * 设置checkForRejectPattern属性的值。
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
     * 获取checkForPhoneFormatsRule属性的值。
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
     * 设置checkForPhoneFormatsRule属性的值。
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
     * 获取checkDNC属性的值。
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
     * 设置checkDNC属性的值。
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

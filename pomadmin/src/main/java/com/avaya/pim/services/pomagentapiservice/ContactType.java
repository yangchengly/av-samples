
package com.avaya.pim.services.pomagentapiservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ContactType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PhoneNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastAttemptTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastSuccessfulAttemptTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastCompletionCodeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AttributeObj" type="{http://services.pim.avaya.com/AgentAPI/}AttributeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = {
    "contactId",
    "contactGroupName",
    "phoneNumber1",
    "phoneNumber2",
    "firstName",
    "lastName",
    "email",
    "lastModifiedOn",
    "lastModifiedBy",
    "language",
    "timeZone",
    "lastAttemptTime",
    "lastSuccessfulAttemptTime",
    "lastCompletionCodeId",
    "attributeObj"
})
public class ContactType {

    @XmlElement(name = "ContactId", required = true)
    protected String contactId;
    @XmlElement(name = "ContactGroupName", required = true)
    protected String contactGroupName;
    @XmlElement(name = "PhoneNumber1")
    protected String phoneNumber1;
    @XmlElement(name = "PhoneNumber2")
    protected String phoneNumber2;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "LastModifiedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedOn;
    @XmlElement(name = "LastModifiedBy")
    protected String lastModifiedBy;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "LastAttemptTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAttemptTime;
    @XmlElement(name = "LastSuccessfulAttemptTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSuccessfulAttemptTime;
    @XmlElement(name = "LastCompletionCodeId")
    protected Integer lastCompletionCodeId;
    @XmlElement(name = "AttributeObj")
    protected List<AttributeType> attributeObj;

    /**
     * ��ȡcontactId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * ����contactId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * ��ȡcontactGroupName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactGroupName() {
        return contactGroupName;
    }

    /**
     * ����contactGroupName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactGroupName(String value) {
        this.contactGroupName = value;
    }

    /**
     * ��ȡphoneNumber1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    /**
     * ����phoneNumber1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber1(String value) {
        this.phoneNumber1 = value;
    }

    /**
     * ��ȡphoneNumber2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    /**
     * ����phoneNumber2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber2(String value) {
        this.phoneNumber2 = value;
    }

    /**
     * ��ȡfirstName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * ����firstName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * ��ȡlastName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * ����lastName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * ��ȡlastModifiedOn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedOn() {
        return lastModifiedOn;
    }

    /**
     * ����lastModifiedOn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedOn(XMLGregorianCalendar value) {
        this.lastModifiedOn = value;
    }

    /**
     * ��ȡlastModifiedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * ����lastModifiedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedBy(String value) {
        this.lastModifiedBy = value;
    }

    /**
     * ��ȡlanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * ��ȡtimeZone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * ����timeZone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * ��ȡlastAttemptTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAttemptTime() {
        return lastAttemptTime;
    }

    /**
     * ����lastAttemptTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAttemptTime(XMLGregorianCalendar value) {
        this.lastAttemptTime = value;
    }

    /**
     * ��ȡlastSuccessfulAttemptTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSuccessfulAttemptTime() {
        return lastSuccessfulAttemptTime;
    }

    /**
     * ����lastSuccessfulAttemptTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSuccessfulAttemptTime(XMLGregorianCalendar value) {
        this.lastSuccessfulAttemptTime = value;
    }

    /**
     * ��ȡlastCompletionCodeId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastCompletionCodeId() {
        return lastCompletionCodeId;
    }

    /**
     * ����lastCompletionCodeId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastCompletionCodeId(Integer value) {
        this.lastCompletionCodeId = value;
    }

    /**
     * Gets the value of the attributeObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType }
     * 
     * 
     */
    public List<AttributeType> getAttributeObj() {
        if (attributeObj == null) {
            attributeObj = new ArrayList<AttributeType>();
        }
        return this.attributeObj;
    }

}

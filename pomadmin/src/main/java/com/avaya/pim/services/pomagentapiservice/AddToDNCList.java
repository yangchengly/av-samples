
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
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckForRejectPattern" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CheckForPhoneFormatsRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "address",
    "orgName",
    "checkForRejectPattern",
    "checkForPhoneFormatsRule"
})
@XmlRootElement(name = "AddToDNCList")
public class AddToDNCList {

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "OrgName")
    protected String orgName;
    @XmlElement(name = "CheckForRejectPattern", defaultValue = "false")
    protected Boolean checkForRejectPattern;
    @XmlElement(name = "CheckForPhoneFormatsRule", defaultValue = "false")
    protected Boolean checkForPhoneFormatsRule;

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取orgName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置orgName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
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

}

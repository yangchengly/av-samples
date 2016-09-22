
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AttributeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AttributeValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Operation" type="{http://services.pim.avaya.com/AgentAPI/}OperationType" minOccurs="0"/&gt;
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
    "jobId",
    "attributeName",
    "attributeValue",
    "operation"
})
@XmlRootElement(name = "UpdateCampaignAttributeValue")
public class UpdateCampaignAttributeValue {

    @XmlElement(name = "JobId")
    protected int jobId;
    @XmlElement(name = "AttributeName", required = true)
    protected String attributeName;
    @XmlElement(name = "AttributeValue")
    protected double attributeValue;
    @XmlElement(name = "Operation", defaultValue = "ADD")
    @XmlSchemaType(name = "string")
    protected OperationType operation;

    /**
     * 获取jobId属性的值。
     * 
     */
    public int getJobId() {
        return jobId;
    }

    /**
     * 设置jobId属性的值。
     * 
     */
    public void setJobId(int value) {
        this.jobId = value;
    }

    /**
     * 获取attributeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * 设置attributeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * 获取attributeValue属性的值。
     * 
     */
    public double getAttributeValue() {
        return attributeValue;
    }

    /**
     * 设置attributeValue属性的值。
     * 
     */
    public void setAttributeValue(double value) {
        this.attributeValue = value;
    }

    /**
     * 获取operation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getOperation() {
        return operation;
    }

    /**
     * 设置operation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setOperation(OperationType value) {
        this.operation = value;
    }

}

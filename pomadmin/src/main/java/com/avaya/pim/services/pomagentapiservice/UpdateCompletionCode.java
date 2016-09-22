
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
     * 获取pimSessionID属性的值。
     * 
     */
    public double getPimSessionID() {
        return pimSessionID;
    }

    /**
     * 设置pimSessionID属性的值。
     * 
     */
    public void setPimSessionID(double value) {
        this.pimSessionID = value;
    }

    /**
     * 获取completionCode属性的值。
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
     * 设置completionCode属性的值。
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

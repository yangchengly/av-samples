
package com.avaya.pim.services.pomcmpmgmtservice;

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
 *         &lt;element name="JobID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "jobID",
    "count"
})
@XmlRootElement(name = "SetMaxAttemptsCount")
public class SetMaxAttemptsCount {

    @XmlElement(name = "JobID")
    protected int jobID;
    @XmlElement(name = "Count")
    protected int count;

    /**
     * 获取jobID属性的值。
     * 
     */
    public int getJobID() {
        return jobID;
    }

    /**
     * 设置jobID属性的值。
     * 
     */
    public void setJobID(int value) {
        this.jobID = value;
    }

    /**
     * 获取count属性的值。
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

}

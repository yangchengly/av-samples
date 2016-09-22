
package com.avaya.pim.services.pomcmpmgmtservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>JobIDsAndStates complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="JobIDsAndStates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="JobState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobIDsAndStates", propOrder = {
    "jobID",
    "jobState"
})
public class JobIDsAndStates {

    @XmlElement(name = "JobID")
    protected int jobID;
    @XmlElement(name = "JobState", required = true)
    protected String jobState;

    /**
     * ��ȡjobID���Ե�ֵ��
     * 
     */
    public int getJobID() {
        return jobID;
    }

    /**
     * ����jobID���Ե�ֵ��
     * 
     */
    public void setJobID(int value) {
        this.jobID = value;
    }

    /**
     * ��ȡjobState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobState() {
        return jobState;
    }

    /**
     * ����jobState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobState(String value) {
        this.jobState = value;
    }

}

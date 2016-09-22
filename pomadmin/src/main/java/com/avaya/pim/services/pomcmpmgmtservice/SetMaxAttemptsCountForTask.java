
package com.avaya.pim.services.pomcmpmgmtservice;

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
 *         &lt;element name="JobID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TaskID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "taskID",
    "count"
})
@XmlRootElement(name = "SetMaxAttemptsCountForTask")
public class SetMaxAttemptsCountForTask {

    @XmlElement(name = "JobID")
    protected int jobID;
    @XmlElement(name = "TaskID")
    protected int taskID;
    @XmlElement(name = "Count")
    protected int count;

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
     * ��ȡtaskID���Ե�ֵ��
     * 
     */
    public int getTaskID() {
        return taskID;
    }

    /**
     * ����taskID���Ե�ֵ��
     * 
     */
    public void setTaskID(int value) {
        this.taskID = value;
    }

    /**
     * ��ȡcount���Ե�ֵ��
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * ����count���Ե�ֵ��
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

}


package com.avaya.pim.services.pomcmpmgmtservice;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="JobDetails" type="{http://services.pim.avaya.com/CmpMgmt/}JobIDsAndStates" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "jobDetails"
})
@XmlRootElement(name = "GetCampaignJobsResponse")
public class GetCampaignJobsResponse {

    @XmlElement(name = "JobDetails")
    protected List<JobIDsAndStates> jobDetails;

    /**
     * Gets the value of the jobDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobIDsAndStates }
     * 
     * 
     */
    public List<JobIDsAndStates> getJobDetails() {
        if (jobDetails == null) {
            jobDetails = new ArrayList<JobIDsAndStates>();
        }
        return this.jobDetails;
    }

}

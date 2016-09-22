
package com.avaya.pim.services.pomcmpmgmtservice;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ActiveJobsAndTaskDetails" type="{http://services.pim.avaya.com/CmpMgmt/}JobIDAndTask" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "activeJobsAndTaskDetails"
})
@XmlRootElement(name = "GetActiveJobTaskIdForTaskResponse")
public class GetActiveJobTaskIdForTaskResponse {

    @XmlElement(name = "ActiveJobsAndTaskDetails")
    protected List<JobIDAndTask> activeJobsAndTaskDetails;

    /**
     * Gets the value of the activeJobsAndTaskDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeJobsAndTaskDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveJobsAndTaskDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobIDAndTask }
     * 
     * 
     */
    public List<JobIDAndTask> getActiveJobsAndTaskDetails() {
        if (activeJobsAndTaskDetails == null) {
            activeJobsAndTaskDetails = new ArrayList<JobIDAndTask>();
        }
        return this.activeJobsAndTaskDetails;
    }

}

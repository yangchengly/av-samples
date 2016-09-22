
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
 *         &lt;element name="ImportJobs" type="{http://services.pim.avaya.com/CmpMgmt/}ImportJobStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "importJobs"
})
@XmlRootElement(name = "GetImportJobStatusResponse")
public class GetImportJobStatusResponse {

    @XmlElement(name = "ImportJobs")
    protected List<ImportJobStatus> importJobs;

    /**
     * Gets the value of the importJobs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importJobs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportJobs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportJobStatus }
     * 
     * 
     */
    public List<ImportJobStatus> getImportJobs() {
        if (importJobs == null) {
            importJobs = new ArrayList<ImportJobStatus>();
        }
        return this.importJobs;
    }

}

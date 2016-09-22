
package com.avaya.pim.services.pomcmpmgmtservice;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="DataSourceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JobStates" type="{http://services.pim.avaya.com/CmpMgmt/}ImportJobState" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "dataSourceName",
    "jobStates"
})
@XmlRootElement(name = "GetImportJobStatus")
public class GetImportJobStatus {

    @XmlElement(name = "DataSourceName", required = true)
    protected String dataSourceName;
    @XmlElement(name = "JobStates", defaultValue = "RUNNING")
    @XmlSchemaType(name = "string")
    protected List<ImportJobState> jobStates;

    /**
     * 获取dataSourceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceName() {
        return dataSourceName;
    }

    /**
     * 设置dataSourceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceName(String value) {
        this.dataSourceName = value;
    }

    /**
     * Gets the value of the jobStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportJobState }
     * 
     * 
     */
    public List<ImportJobState> getJobStates() {
        if (jobStates == null) {
            jobStates = new ArrayList<ImportJobState>();
        }
        return this.jobStates;
    }

}

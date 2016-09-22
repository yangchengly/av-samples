
package com.avaya.pim.services.pomcmpmgmtservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImportJobStatus complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ImportJobStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportJobId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://services.pim.avaya.com/CmpMgmt/}ImportJobState" minOccurs="0"/&gt;
 *         &lt;element name="SuccessCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UpdateCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RunTimeErrorCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ValidationFailedCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DuplicateIgnoredCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MatchPhoneRejectPatternCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DeleteCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MatchesDncCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PhoneFormatFailedCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ProcessedRecordCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportJobStatus", propOrder = {
    "importName",
    "listName",
    "importJobId",
    "status",
    "successCount",
    "updateCount",
    "runTimeErrorCount",
    "validationFailedCount",
    "duplicateIgnoredCount",
    "matchPhoneRejectPatternCount",
    "deleteCount",
    "matchesDncCount",
    "phoneFormatFailedCount",
    "processedRecordCount"
})
public class ImportJobStatus {

    @XmlElement(name = "ImportName")
    protected String importName;
    @XmlElement(name = "ListName")
    protected String listName;
    @XmlElement(name = "ImportJobId")
    protected Long importJobId;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected ImportJobState status;
    @XmlElement(name = "SuccessCount")
    protected Long successCount;
    @XmlElement(name = "UpdateCount")
    protected Long updateCount;
    @XmlElement(name = "RunTimeErrorCount")
    protected Long runTimeErrorCount;
    @XmlElement(name = "ValidationFailedCount")
    protected Long validationFailedCount;
    @XmlElement(name = "DuplicateIgnoredCount")
    protected Long duplicateIgnoredCount;
    @XmlElement(name = "MatchPhoneRejectPatternCount")
    protected Long matchPhoneRejectPatternCount;
    @XmlElement(name = "DeleteCount")
    protected Long deleteCount;
    @XmlElement(name = "MatchesDncCount")
    protected Long matchesDncCount;
    @XmlElement(name = "PhoneFormatFailedCount")
    protected Long phoneFormatFailedCount;
    @XmlElement(name = "ProcessedRecordCount")
    protected Long processedRecordCount;

    /**
     * 获取importName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportName() {
        return importName;
    }

    /**
     * 设置importName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportName(String value) {
        this.importName = value;
    }

    /**
     * 获取listName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListName() {
        return listName;
    }

    /**
     * 设置listName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * 获取importJobId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImportJobId() {
        return importJobId;
    }

    /**
     * 设置importJobId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImportJobId(Long value) {
        this.importJobId = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImportJobState }
     *     
     */
    public ImportJobState getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImportJobState }
     *     
     */
    public void setStatus(ImportJobState value) {
        this.status = value;
    }

    /**
     * 获取successCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSuccessCount() {
        return successCount;
    }

    /**
     * 设置successCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSuccessCount(Long value) {
        this.successCount = value;
    }

    /**
     * 获取updateCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdateCount() {
        return updateCount;
    }

    /**
     * 设置updateCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdateCount(Long value) {
        this.updateCount = value;
    }

    /**
     * 获取runTimeErrorCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRunTimeErrorCount() {
        return runTimeErrorCount;
    }

    /**
     * 设置runTimeErrorCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRunTimeErrorCount(Long value) {
        this.runTimeErrorCount = value;
    }

    /**
     * 获取validationFailedCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValidationFailedCount() {
        return validationFailedCount;
    }

    /**
     * 设置validationFailedCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValidationFailedCount(Long value) {
        this.validationFailedCount = value;
    }

    /**
     * 获取duplicateIgnoredCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDuplicateIgnoredCount() {
        return duplicateIgnoredCount;
    }

    /**
     * 设置duplicateIgnoredCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDuplicateIgnoredCount(Long value) {
        this.duplicateIgnoredCount = value;
    }

    /**
     * 获取matchPhoneRejectPatternCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatchPhoneRejectPatternCount() {
        return matchPhoneRejectPatternCount;
    }

    /**
     * 设置matchPhoneRejectPatternCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatchPhoneRejectPatternCount(Long value) {
        this.matchPhoneRejectPatternCount = value;
    }

    /**
     * 获取deleteCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeleteCount() {
        return deleteCount;
    }

    /**
     * 设置deleteCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeleteCount(Long value) {
        this.deleteCount = value;
    }

    /**
     * 获取matchesDncCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatchesDncCount() {
        return matchesDncCount;
    }

    /**
     * 设置matchesDncCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatchesDncCount(Long value) {
        this.matchesDncCount = value;
    }

    /**
     * 获取phoneFormatFailedCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPhoneFormatFailedCount() {
        return phoneFormatFailedCount;
    }

    /**
     * 设置phoneFormatFailedCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPhoneFormatFailedCount(Long value) {
        this.phoneFormatFailedCount = value;
    }

    /**
     * 获取processedRecordCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProcessedRecordCount() {
        return processedRecordCount;
    }

    /**
     * 设置processedRecordCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProcessedRecordCount(Long value) {
        this.processedRecordCount = value;
    }

}

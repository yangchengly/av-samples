
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
 *         &lt;element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScheduleFrequency" type="{http://services.pim.avaya.com/CmpMgmt/}RecurringFrequencyType"/&gt;
 *         &lt;element name="WeekDaysOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SelectedDays" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RunEveryMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArchivalScheduleFrequency" type="{http://services.pim.avaya.com/CmpMgmt/}ArchivalFrequencyType" minOccurs="0"/&gt;
 *         &lt;element name="ArchivalInNHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArchivalTimeInHrsMins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "campaignName",
    "startTime",
    "endTime",
    "timeZone",
    "scheduleFrequency",
    "weekDaysOnly",
    "selectedDays",
    "runEveryMinutes",
    "archivalScheduleFrequency",
    "archivalInNHours",
    "archivalTimeInHrsMins"
})
@XmlRootElement(name = "ScheduleRecurringCampaign")
public class ScheduleRecurringCampaign {

    @XmlElement(name = "CampaignName", required = true)
    protected String campaignName;
    @XmlElement(name = "StartTime", required = true)
    protected String startTime;
    @XmlElement(name = "EndTime", required = true)
    protected String endTime;
    @XmlElement(name = "TimeZone", required = true)
    protected String timeZone;
    @XmlElement(name = "ScheduleFrequency", required = true)
    @XmlSchemaType(name = "string")
    protected RecurringFrequencyType scheduleFrequency;
    @XmlElement(name = "WeekDaysOnly", defaultValue = "false")
    protected Boolean weekDaysOnly;
    @XmlElement(name = "SelectedDays")
    protected List<String> selectedDays;
    @XmlElement(name = "RunEveryMinutes")
    protected String runEveryMinutes;
    @XmlElement(name = "ArchivalScheduleFrequency")
    @XmlSchemaType(name = "string")
    protected ArchivalFrequencyType archivalScheduleFrequency;
    @XmlElement(name = "ArchivalInNHours")
    protected String archivalInNHours;
    @XmlElement(name = "ArchivalTimeInHrsMins")
    protected String archivalTimeInHrsMins;

    /**
     * 获取campaignName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * 设置campaignName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * 获取timeZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 设置timeZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * 获取scheduleFrequency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecurringFrequencyType }
     *     
     */
    public RecurringFrequencyType getScheduleFrequency() {
        return scheduleFrequency;
    }

    /**
     * 设置scheduleFrequency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringFrequencyType }
     *     
     */
    public void setScheduleFrequency(RecurringFrequencyType value) {
        this.scheduleFrequency = value;
    }

    /**
     * 获取weekDaysOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeekDaysOnly() {
        return weekDaysOnly;
    }

    /**
     * 设置weekDaysOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeekDaysOnly(Boolean value) {
        this.weekDaysOnly = value;
    }

    /**
     * Gets the value of the selectedDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSelectedDays() {
        if (selectedDays == null) {
            selectedDays = new ArrayList<String>();
        }
        return this.selectedDays;
    }

    /**
     * 获取runEveryMinutes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunEveryMinutes() {
        return runEveryMinutes;
    }

    /**
     * 设置runEveryMinutes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunEveryMinutes(String value) {
        this.runEveryMinutes = value;
    }

    /**
     * 获取archivalScheduleFrequency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArchivalFrequencyType }
     *     
     */
    public ArchivalFrequencyType getArchivalScheduleFrequency() {
        return archivalScheduleFrequency;
    }

    /**
     * 设置archivalScheduleFrequency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArchivalFrequencyType }
     *     
     */
    public void setArchivalScheduleFrequency(ArchivalFrequencyType value) {
        this.archivalScheduleFrequency = value;
    }

    /**
     * 获取archivalInNHours属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivalInNHours() {
        return archivalInNHours;
    }

    /**
     * 设置archivalInNHours属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivalInNHours(String value) {
        this.archivalInNHours = value;
    }

    /**
     * 获取archivalTimeInHrsMins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivalTimeInHrsMins() {
        return archivalTimeInHrsMins;
    }

    /**
     * 设置archivalTimeInHrsMins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivalTimeInHrsMins(String value) {
        this.archivalTimeInHrsMins = value;
    }

}

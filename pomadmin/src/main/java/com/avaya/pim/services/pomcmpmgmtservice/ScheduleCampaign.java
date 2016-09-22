
package com.avaya.pim.services.pomcmpmgmtservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ArchivalScheduleFrequency" type="{http://services.pim.avaya.com/CmpMgmt/}ArchivalFrequencyType" minOccurs="0"/&gt;
 *         &lt;element name="ArchivalTimeInHrsMins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArchivalInNHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "timeZone",
    "archivalScheduleFrequency",
    "archivalTimeInHrsMins",
    "archivalInNHours"
})
@XmlRootElement(name = "ScheduleCampaign")
public class ScheduleCampaign {

    @XmlElement(name = "CampaignName", required = true)
    protected String campaignName;
    @XmlElement(name = "StartTime", required = true)
    protected String startTime;
    @XmlElement(name = "TimeZone", required = true)
    protected String timeZone;
    @XmlElement(name = "ArchivalScheduleFrequency", defaultValue = "Hourly")
    @XmlSchemaType(name = "string")
    protected ArchivalFrequencyType archivalScheduleFrequency;
    @XmlElement(name = "ArchivalTimeInHrsMins")
    protected String archivalTimeInHrsMins;
    @XmlElement(name = "ArchivalInNHours")
    protected String archivalInNHours;

    /**
     * ��ȡcampaignName���Ե�ֵ��
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
     * ����campaignName���Ե�ֵ��
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
     * ��ȡstartTime���Ե�ֵ��
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
     * ����startTime���Ե�ֵ��
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
     * ��ȡtimeZone���Ե�ֵ��
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
     * ����timeZone���Ե�ֵ��
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
     * ��ȡarchivalScheduleFrequency���Ե�ֵ��
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
     * ����archivalScheduleFrequency���Ե�ֵ��
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
     * ��ȡarchivalTimeInHrsMins���Ե�ֵ��
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
     * ����archivalTimeInHrsMins���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivalTimeInHrsMins(String value) {
        this.archivalTimeInHrsMins = value;
    }

    /**
     * ��ȡarchivalInNHours���Ե�ֵ��
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
     * ����archivalInNHours���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivalInNHours(String value) {
        this.archivalInNHours = value;
    }

}

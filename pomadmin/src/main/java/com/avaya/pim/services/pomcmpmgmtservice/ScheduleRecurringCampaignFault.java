
package com.avaya.pim.services.pomcmpmgmtservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:15:55.955+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "ScheduleRecurringCampaignFaultInfo", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
public class ScheduleRecurringCampaignFault extends Exception {
    
    private com.avaya.pim.services.pomcmpmgmtservice.ScheduleRecurringCampaignFaultInfo scheduleRecurringCampaignFaultInfo;

    public ScheduleRecurringCampaignFault() {
        super();
    }
    
    public ScheduleRecurringCampaignFault(String message) {
        super(message);
    }
    
    public ScheduleRecurringCampaignFault(String message, Throwable cause) {
        super(message, cause);
    }

    public ScheduleRecurringCampaignFault(String message, com.avaya.pim.services.pomcmpmgmtservice.ScheduleRecurringCampaignFaultInfo scheduleRecurringCampaignFaultInfo) {
        super(message);
        this.scheduleRecurringCampaignFaultInfo = scheduleRecurringCampaignFaultInfo;
    }

    public ScheduleRecurringCampaignFault(String message, com.avaya.pim.services.pomcmpmgmtservice.ScheduleRecurringCampaignFaultInfo scheduleRecurringCampaignFaultInfo, Throwable cause) {
        super(message, cause);
        this.scheduleRecurringCampaignFaultInfo = scheduleRecurringCampaignFaultInfo;
    }

    public com.avaya.pim.services.pomcmpmgmtservice.ScheduleRecurringCampaignFaultInfo getFaultInfo() {
        return this.scheduleRecurringCampaignFaultInfo;
    }
}
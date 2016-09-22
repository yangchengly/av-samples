
package com.avaya.pim.services.pomcmpmgmtservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:15:56.039+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "ResumePausedJobFaultInfo", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
public class ResumePausedJobFault extends Exception {
    
    private com.avaya.pim.services.pomcmpmgmtservice.ResumePausedJobFaultInfo resumePausedJobFaultInfo;

    public ResumePausedJobFault() {
        super();
    }
    
    public ResumePausedJobFault(String message) {
        super(message);
    }
    
    public ResumePausedJobFault(String message, Throwable cause) {
        super(message, cause);
    }

    public ResumePausedJobFault(String message, com.avaya.pim.services.pomcmpmgmtservice.ResumePausedJobFaultInfo resumePausedJobFaultInfo) {
        super(message);
        this.resumePausedJobFaultInfo = resumePausedJobFaultInfo;
    }

    public ResumePausedJobFault(String message, com.avaya.pim.services.pomcmpmgmtservice.ResumePausedJobFaultInfo resumePausedJobFaultInfo, Throwable cause) {
        super(message, cause);
        this.resumePausedJobFaultInfo = resumePausedJobFaultInfo;
    }

    public com.avaya.pim.services.pomcmpmgmtservice.ResumePausedJobFaultInfo getFaultInfo() {
        return this.resumePausedJobFaultInfo;
    }
}


package com.avaya.pim.services.pomcmpmgmtservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:15:56.128+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "SetMaxAttemptsCountFaultInfo", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
public class SetMaxAttemptsCountFault extends Exception {
    
    private com.avaya.pim.services.pomcmpmgmtservice.SetMaxAttemptsCountFaultInfo setMaxAttemptsCountFaultInfo;

    public SetMaxAttemptsCountFault() {
        super();
    }
    
    public SetMaxAttemptsCountFault(String message) {
        super(message);
    }
    
    public SetMaxAttemptsCountFault(String message, Throwable cause) {
        super(message, cause);
    }

    public SetMaxAttemptsCountFault(String message, com.avaya.pim.services.pomcmpmgmtservice.SetMaxAttemptsCountFaultInfo setMaxAttemptsCountFaultInfo) {
        super(message);
        this.setMaxAttemptsCountFaultInfo = setMaxAttemptsCountFaultInfo;
    }

    public SetMaxAttemptsCountFault(String message, com.avaya.pim.services.pomcmpmgmtservice.SetMaxAttemptsCountFaultInfo setMaxAttemptsCountFaultInfo, Throwable cause) {
        super(message, cause);
        this.setMaxAttemptsCountFaultInfo = setMaxAttemptsCountFaultInfo;
    }

    public com.avaya.pim.services.pomcmpmgmtservice.SetMaxAttemptsCountFaultInfo getFaultInfo() {
        return this.setMaxAttemptsCountFaultInfo;
    }
}

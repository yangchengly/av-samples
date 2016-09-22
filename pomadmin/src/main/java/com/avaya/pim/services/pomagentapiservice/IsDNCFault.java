
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:11:51.495+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "IsDNCFaultInfo", targetNamespace = "http://services.pim.avaya.com/AgentAPI/")
public class IsDNCFault extends Exception {
    
    private com.avaya.pim.services.pomagentapiservice.IsDNCFaultInfo isDNCFaultInfo;

    public IsDNCFault() {
        super();
    }
    
    public IsDNCFault(String message) {
        super(message);
    }
    
    public IsDNCFault(String message, Throwable cause) {
        super(message, cause);
    }

    public IsDNCFault(String message, com.avaya.pim.services.pomagentapiservice.IsDNCFaultInfo isDNCFaultInfo) {
        super(message);
        this.isDNCFaultInfo = isDNCFaultInfo;
    }

    public IsDNCFault(String message, com.avaya.pim.services.pomagentapiservice.IsDNCFaultInfo isDNCFaultInfo, Throwable cause) {
        super(message, cause);
        this.isDNCFaultInfo = isDNCFaultInfo;
    }

    public com.avaya.pim.services.pomagentapiservice.IsDNCFaultInfo getFaultInfo() {
        return this.isDNCFaultInfo;
    }
}

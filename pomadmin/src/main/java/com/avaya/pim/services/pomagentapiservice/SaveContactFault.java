
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:11:51.732+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "SaveContactFaultInfo", targetNamespace = "http://services.pim.avaya.com/AgentAPI/")
public class SaveContactFault extends Exception {
    
    private com.avaya.pim.services.pomagentapiservice.SaveContactFaultInfo saveContactFaultInfo;

    public SaveContactFault() {
        super();
    }
    
    public SaveContactFault(String message) {
        super(message);
    }
    
    public SaveContactFault(String message, Throwable cause) {
        super(message, cause);
    }

    public SaveContactFault(String message, com.avaya.pim.services.pomagentapiservice.SaveContactFaultInfo saveContactFaultInfo) {
        super(message);
        this.saveContactFaultInfo = saveContactFaultInfo;
    }

    public SaveContactFault(String message, com.avaya.pim.services.pomagentapiservice.SaveContactFaultInfo saveContactFaultInfo, Throwable cause) {
        super(message, cause);
        this.saveContactFaultInfo = saveContactFaultInfo;
    }

    public com.avaya.pim.services.pomagentapiservice.SaveContactFaultInfo getFaultInfo() {
        return this.saveContactFaultInfo;
    }
}

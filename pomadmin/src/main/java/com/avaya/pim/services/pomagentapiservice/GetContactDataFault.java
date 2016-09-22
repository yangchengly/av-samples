
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:11:51.388+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "GetContactDataFaultInfo", targetNamespace = "http://services.pim.avaya.com/AgentAPI/")
public class GetContactDataFault extends Exception {
    
    private com.avaya.pim.services.pomagentapiservice.GetContactDataFaultInfo getContactDataFaultInfo;

    public GetContactDataFault() {
        super();
    }
    
    public GetContactDataFault(String message) {
        super(message);
    }
    
    public GetContactDataFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetContactDataFault(String message, com.avaya.pim.services.pomagentapiservice.GetContactDataFaultInfo getContactDataFaultInfo) {
        super(message);
        this.getContactDataFaultInfo = getContactDataFaultInfo;
    }

    public GetContactDataFault(String message, com.avaya.pim.services.pomagentapiservice.GetContactDataFaultInfo getContactDataFaultInfo, Throwable cause) {
        super(message, cause);
        this.getContactDataFaultInfo = getContactDataFaultInfo;
    }

    public com.avaya.pim.services.pomagentapiservice.GetContactDataFaultInfo getFaultInfo() {
        return this.getContactDataFaultInfo;
    }
}


package com.avaya.pim.services.pomagentapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:11:51.654+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "EmptyContactListFaultInfo", targetNamespace = "http://services.pim.avaya.com/AgentAPI/")
public class EmptyContactListFault extends Exception {
    
    private com.avaya.pim.services.pomagentapiservice.EmptyContactListFaultInfo emptyContactListFaultInfo;

    public EmptyContactListFault() {
        super();
    }
    
    public EmptyContactListFault(String message) {
        super(message);
    }
    
    public EmptyContactListFault(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyContactListFault(String message, com.avaya.pim.services.pomagentapiservice.EmptyContactListFaultInfo emptyContactListFaultInfo) {
        super(message);
        this.emptyContactListFaultInfo = emptyContactListFaultInfo;
    }

    public EmptyContactListFault(String message, com.avaya.pim.services.pomagentapiservice.EmptyContactListFaultInfo emptyContactListFaultInfo, Throwable cause) {
        super(message, cause);
        this.emptyContactListFaultInfo = emptyContactListFaultInfo;
    }

    public com.avaya.pim.services.pomagentapiservice.EmptyContactListFaultInfo getFaultInfo() {
        return this.emptyContactListFaultInfo;
    }
}

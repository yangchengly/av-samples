
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:11:51.575+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "AddContactListToJobFaultInfo", targetNamespace = "http://services.pim.avaya.com/AgentAPI/")
public class AddContactListToJobFault extends Exception {
    
    private com.avaya.pim.services.pomagentapiservice.AddContactListToJobFaultInfo addContactListToJobFaultInfo;

    public AddContactListToJobFault() {
        super();
    }
    
    public AddContactListToJobFault(String message) {
        super(message);
    }
    
    public AddContactListToJobFault(String message, Throwable cause) {
        super(message, cause);
    }

    public AddContactListToJobFault(String message, com.avaya.pim.services.pomagentapiservice.AddContactListToJobFaultInfo addContactListToJobFaultInfo) {
        super(message);
        this.addContactListToJobFaultInfo = addContactListToJobFaultInfo;
    }

    public AddContactListToJobFault(String message, com.avaya.pim.services.pomagentapiservice.AddContactListToJobFaultInfo addContactListToJobFaultInfo, Throwable cause) {
        super(message, cause);
        this.addContactListToJobFaultInfo = addContactListToJobFaultInfo;
    }

    public com.avaya.pim.services.pomagentapiservice.AddContactListToJobFaultInfo getFaultInfo() {
        return this.addContactListToJobFaultInfo;
    }
}

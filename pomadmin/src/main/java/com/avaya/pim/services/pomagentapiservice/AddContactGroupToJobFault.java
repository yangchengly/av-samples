
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:11:51.830+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "AddContactGroupToJobFaultInfo", targetNamespace = "http://services.pim.avaya.com/AgentAPI/")
public class AddContactGroupToJobFault extends Exception {
    
    private com.avaya.pim.services.pomagentapiservice.AddContactGroupToJobFaultInfo addContactGroupToJobFaultInfo;

    public AddContactGroupToJobFault() {
        super();
    }
    
    public AddContactGroupToJobFault(String message) {
        super(message);
    }
    
    public AddContactGroupToJobFault(String message, Throwable cause) {
        super(message, cause);
    }

    public AddContactGroupToJobFault(String message, com.avaya.pim.services.pomagentapiservice.AddContactGroupToJobFaultInfo addContactGroupToJobFaultInfo) {
        super(message);
        this.addContactGroupToJobFaultInfo = addContactGroupToJobFaultInfo;
    }

    public AddContactGroupToJobFault(String message, com.avaya.pim.services.pomagentapiservice.AddContactGroupToJobFaultInfo addContactGroupToJobFaultInfo, Throwable cause) {
        super(message, cause);
        this.addContactGroupToJobFaultInfo = addContactGroupToJobFaultInfo;
    }

    public com.avaya.pim.services.pomagentapiservice.AddContactGroupToJobFaultInfo getFaultInfo() {
        return this.addContactGroupToJobFaultInfo;
    }
}

package com.avaya.pim.services.pomagentapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:11:51.511+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "DeleteContactFromListFaultInfo", targetNamespace = "http://services.pim.avaya.com/AgentAPI/")
public class DeleteContactFromListFault extends Exception {
    
    private com.avaya.pim.services.pomagentapiservice.DeleteContactFromListFaultInfo deleteContactFromListFaultInfo;

    public DeleteContactFromListFault() {
        super();
    }
    
    public DeleteContactFromListFault(String message) {
        super(message);
    }
    
    public DeleteContactFromListFault(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteContactFromListFault(String message, com.avaya.pim.services.pomagentapiservice.DeleteContactFromListFaultInfo deleteContactFromListFaultInfo) {
        super(message);
        this.deleteContactFromListFaultInfo = deleteContactFromListFaultInfo;
    }

    public DeleteContactFromListFault(String message, com.avaya.pim.services.pomagentapiservice.DeleteContactFromListFaultInfo deleteContactFromListFaultInfo, Throwable cause) {
        super(message, cause);
        this.deleteContactFromListFaultInfo = deleteContactFromListFaultInfo;
    }

    public com.avaya.pim.services.pomagentapiservice.DeleteContactFromListFaultInfo getFaultInfo() {
        return this.deleteContactFromListFaultInfo;
    }
}
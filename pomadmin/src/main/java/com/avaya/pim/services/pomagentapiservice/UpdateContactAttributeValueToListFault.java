
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:11:51.864+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "UpdateContactAttributeValueToListFaultInfo", targetNamespace = "http://services.pim.avaya.com/AgentAPI/")
public class UpdateContactAttributeValueToListFault extends Exception {
    
    private com.avaya.pim.services.pomagentapiservice.UpdateContactAttributeValueToListFaultInfo updateContactAttributeValueToListFaultInfo;

    public UpdateContactAttributeValueToListFault() {
        super();
    }
    
    public UpdateContactAttributeValueToListFault(String message) {
        super(message);
    }
    
    public UpdateContactAttributeValueToListFault(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateContactAttributeValueToListFault(String message, com.avaya.pim.services.pomagentapiservice.UpdateContactAttributeValueToListFaultInfo updateContactAttributeValueToListFaultInfo) {
        super(message);
        this.updateContactAttributeValueToListFaultInfo = updateContactAttributeValueToListFaultInfo;
    }

    public UpdateContactAttributeValueToListFault(String message, com.avaya.pim.services.pomagentapiservice.UpdateContactAttributeValueToListFaultInfo updateContactAttributeValueToListFaultInfo, Throwable cause) {
        super(message, cause);
        this.updateContactAttributeValueToListFaultInfo = updateContactAttributeValueToListFaultInfo;
    }

    public com.avaya.pim.services.pomagentapiservice.UpdateContactAttributeValueToListFaultInfo getFaultInfo() {
        return this.updateContactAttributeValueToListFaultInfo;
    }
}

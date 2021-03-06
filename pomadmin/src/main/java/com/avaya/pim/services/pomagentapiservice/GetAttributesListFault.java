
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:11:51.473+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "GetAttributesListFaultInfo", targetNamespace = "http://services.pim.avaya.com/AgentAPI/")
public class GetAttributesListFault extends Exception {
    
    private com.avaya.pim.services.pomagentapiservice.GetAttributesListFaultInfo getAttributesListFaultInfo;

    public GetAttributesListFault() {
        super();
    }
    
    public GetAttributesListFault(String message) {
        super(message);
    }
    
    public GetAttributesListFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAttributesListFault(String message, com.avaya.pim.services.pomagentapiservice.GetAttributesListFaultInfo getAttributesListFaultInfo) {
        super(message);
        this.getAttributesListFaultInfo = getAttributesListFaultInfo;
    }

    public GetAttributesListFault(String message, com.avaya.pim.services.pomagentapiservice.GetAttributesListFaultInfo getAttributesListFaultInfo, Throwable cause) {
        super(message, cause);
        this.getAttributesListFaultInfo = getAttributesListFaultInfo;
    }

    public com.avaya.pim.services.pomagentapiservice.GetAttributesListFaultInfo getFaultInfo() {
        return this.getAttributesListFaultInfo;
    }
}

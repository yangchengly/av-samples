
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:11:51.540+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "AddToDNCListFaultInfo", targetNamespace = "http://services.pim.avaya.com/AgentAPI/")
public class AddToDNCListFault extends Exception {
    
    private com.avaya.pim.services.pomagentapiservice.AddToDNCListFaultInfo addToDNCListFaultInfo;

    public AddToDNCListFault() {
        super();
    }
    
    public AddToDNCListFault(String message) {
        super(message);
    }
    
    public AddToDNCListFault(String message, Throwable cause) {
        super(message, cause);
    }

    public AddToDNCListFault(String message, com.avaya.pim.services.pomagentapiservice.AddToDNCListFaultInfo addToDNCListFaultInfo) {
        super(message);
        this.addToDNCListFaultInfo = addToDNCListFaultInfo;
    }

    public AddToDNCListFault(String message, com.avaya.pim.services.pomagentapiservice.AddToDNCListFaultInfo addToDNCListFaultInfo, Throwable cause) {
        super(message, cause);
        this.addToDNCListFaultInfo = addToDNCListFaultInfo;
    }

    public com.avaya.pim.services.pomagentapiservice.AddToDNCListFaultInfo getFaultInfo() {
        return this.addToDNCListFaultInfo;
    }
}

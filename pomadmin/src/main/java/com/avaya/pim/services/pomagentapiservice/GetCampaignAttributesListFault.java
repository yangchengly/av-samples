
package com.avaya.pim.services.pomagentapiservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:11:51.870+08:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "GetCampaignAttributesListFaultInfo", targetNamespace = "http://services.pim.avaya.com/AgentAPI/")
public class GetCampaignAttributesListFault extends Exception {
    
    private com.avaya.pim.services.pomagentapiservice.GetCampaignAttributesListFaultInfo getCampaignAttributesListFaultInfo;

    public GetCampaignAttributesListFault() {
        super();
    }
    
    public GetCampaignAttributesListFault(String message) {
        super(message);
    }
    
    public GetCampaignAttributesListFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetCampaignAttributesListFault(String message, com.avaya.pim.services.pomagentapiservice.GetCampaignAttributesListFaultInfo getCampaignAttributesListFaultInfo) {
        super(message);
        this.getCampaignAttributesListFaultInfo = getCampaignAttributesListFaultInfo;
    }

    public GetCampaignAttributesListFault(String message, com.avaya.pim.services.pomagentapiservice.GetCampaignAttributesListFaultInfo getCampaignAttributesListFaultInfo, Throwable cause) {
        super(message, cause);
        this.getCampaignAttributesListFaultInfo = getCampaignAttributesListFaultInfo;
    }

    public com.avaya.pim.services.pomagentapiservice.GetCampaignAttributesListFaultInfo getFaultInfo() {
        return this.getCampaignAttributesListFaultInfo;
    }
}
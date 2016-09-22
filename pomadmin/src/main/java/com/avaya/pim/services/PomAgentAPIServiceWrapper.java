package com.avaya.pim.services;

import java.util.List;

import javax.xml.ws.BindingProvider;

import com.avaya.pim.services.pomagentapiservice.ContactDataType;
import com.avaya.pim.services.pomagentapiservice.SaveContactToListFault;
import com.avaya.pim.services.pomagentapiservice.VPPOMAgentAPIService;
import com.avaya.pim.services.pomagentapiservice.VPPOMAgentAPIService_Service;

public class PomAgentAPIServiceWrapper {

	public VPPOMAgentAPIService port;

	public static final String ENDPOINT_ADDRESS = "https://192.168.10.76/axis2/services/VP_POMAgentAPIService";
	public static final String USERNAME = "admin";
	public static final String PASSWORD = "admin123";

	static {

		System.setProperty("javax.net.ssl.trustStore", "client.truststore");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
	}

	public PomAgentAPIServiceWrapper() {

		VPPOMAgentAPIService_Service service = new VPPOMAgentAPIService_Service();
		port = service.getAgentAPISOAP();

		this.prepareRequestContext((BindingProvider) port);
	}

	public void prepareRequestContext(BindingProvider bp) {

		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_ADDRESS);
		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, USERNAME);
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, PASSWORD);
	}

	public int saveContactToList(ContactDataType contactToBeSaved) {

		int respCode = 0;
		try {
			respCode = port.saveContactToList(contactToBeSaved, true, true, true, true, true);
		} catch (SaveContactToListFault e) {
			e.printStackTrace();
		}

		return respCode;
	}

	public int saveContactToList(List<ContactDataType> list) {
		int respCode = 0;

		for (ContactDataType contactDataType : list) {
			respCode += this.saveContactToList(contactDataType);
		}

		return respCode;
	}
}

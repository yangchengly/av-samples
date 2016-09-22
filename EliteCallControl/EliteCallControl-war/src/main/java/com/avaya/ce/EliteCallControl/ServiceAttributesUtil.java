package com.avaya.ce.EliteCallControl;

import com.avaya.collaboration.businessdata.api.NoAttributeFoundException;
import com.avaya.collaboration.businessdata.api.ServiceData;
import com.avaya.collaboration.businessdata.api.ServiceNotFoundException;
import com.avaya.collaboration.dal.factory.CollaborationDataFactory;
import com.avaya.collaboration.util.logger.Logger;

public class ServiceAttributesUtil {

	private static Logger logger = Logger.getLogger(ServiceAttributesUtil.class);
	public static final String SERVICE_NAME = "EliteCallControl";
	public static final String SERVICE_VERSION = "1.0.0.0.0";

	private final static ServiceData serviceData = CollaborationDataFactory.getServiceData(SERVICE_NAME,
			SERVICE_VERSION);

	public static String getServiceAttribute(String name) {

		String value = null;
		try {
			value = serviceData.getServiceAttribute(name);
		} catch (NoAttributeFoundException e) {
			logger.error("NoAttributeFoundException " + name, e);
			e.printStackTrace();
		} catch (ServiceNotFoundException e) {
			logger.error("NoAttributeFoundException " + name, e);
			e.printStackTrace();
		}
		return value;
	}

}

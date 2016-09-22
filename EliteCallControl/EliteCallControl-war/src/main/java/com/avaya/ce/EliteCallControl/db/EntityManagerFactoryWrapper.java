package com.avaya.ce.EliteCallControl.db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.avaya.collaboration.util.logger.Logger;

public class EntityManagerFactoryWrapper {

	private static final String ELITE_CALL_CONTROL_DS = "EliteCallControlDS";
	private static EntityManagerFactoryWrapper emfw = null;
	private EntityManagerFactory emf = null;
	
	private static Logger logger = Logger.getLogger(EntityManagerFactoryWrapper.class);

	private EntityManagerFactoryWrapper() {
		
		emf = Persistence.createEntityManagerFactory(EntityManagerFactoryWrapper.ELITE_CALL_CONTROL_DS);
		logger.finer("Generated EntityManagerFactory!");
		
	}

	public static EntityManagerFactoryWrapper getInstance() {
		if (emfw == null)
			emfw = new EntityManagerFactoryWrapper();
		return emfw;
	}
	
	public EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
	
	public void destoryEntityManagerFactory() {
		emf.close();
		logger.finer("Destoryed EntityManagerFactory!");
	}
	

}

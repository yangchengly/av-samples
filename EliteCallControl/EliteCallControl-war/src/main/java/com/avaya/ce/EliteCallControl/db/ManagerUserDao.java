package com.avaya.ce.EliteCallControl.db;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.avaya.ce.EliteCallControl.Constants;
import com.avaya.ce.EliteCallControl.db.entity.ManagerUser;

public class ManagerUserDao {

	@PersistenceContext(unitName = Constants.PERSISTENCE_UNIT_NAME)
	private EntityManager em = null;
	
	public ManagerUserDao(EntityManager em) {
		this.em = em;
	}

	public ManagerUser find(String userName, String password) {
		return em.find(ManagerUser.class, userName);
//		query.setParameter("userName", userName);
//		query.setParameter("password", password);
//		return (ManagerUser) query.getSingleResult();
	}
}

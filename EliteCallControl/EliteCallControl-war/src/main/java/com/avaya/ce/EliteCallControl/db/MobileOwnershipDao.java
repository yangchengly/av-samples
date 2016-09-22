package com.avaya.ce.EliteCallControl.db;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.avaya.ce.EliteCallControl.Constants;
import com.avaya.ce.EliteCallControl.db.entity.MobileOwnership;

public class MobileOwnershipDao {
	@PersistenceContext(unitName = Constants.PERSISTENCE_UNIT_NAME)
	private EntityManager em = null;

	public MobileOwnershipDao(EntityManager em) {
		this.em = em;
	}

	public MobileOwnership find(String mobile) {
		return em.find(MobileOwnership.class, mobile);
	}

	public void persist(MobileOwnership mobileOwnership) {
		em.getTransaction().begin();
		em.persist(mobileOwnership);
		em.getTransaction().commit();
	}
}

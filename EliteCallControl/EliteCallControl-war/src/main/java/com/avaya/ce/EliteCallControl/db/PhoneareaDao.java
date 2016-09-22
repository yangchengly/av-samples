package com.avaya.ce.EliteCallControl.db;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.avaya.ce.EliteCallControl.Constants;
import com.avaya.ce.EliteCallControl.db.entity.Phonearea;

public class PhoneareaDao {

	@PersistenceContext(unitName = Constants.PERSISTENCE_UNIT_NAME)
	private EntityManager em = null;

	public PhoneareaDao(EntityManager em) {
		this.em = em;
	}

	public Phonearea find(String mobile) {
		return em.find(Phonearea.class, mobile);
	}

	public void persist(Phonearea phonearea) {
		em.getTransaction().begin();
		em.persist(phonearea);
		em.getTransaction().commit();
	}
}

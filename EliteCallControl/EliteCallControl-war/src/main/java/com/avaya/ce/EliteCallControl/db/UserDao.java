package com.avaya.ce.EliteCallControl.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.avaya.ce.EliteCallControl.Constants;
import com.avaya.ce.EliteCallControl.db.entity.User;

public class UserDao {

	@PersistenceContext(unitName = Constants.PERSISTENCE_UNIT_NAME)
	private EntityManager em = null;

	public UserDao(EntityManager em) {
		this.em = em;
	}

	public User getSingleResult() {
		Query query = em.createQuery("SELECT x FROM User x");
		return (User) query.getSingleResult();
	}

	public User find(String name) {
		Query query = em.createQuery("SELECT x FROM User x WHERE x.name=:name");
		query.setParameter("name", name);

		return (User) query.getSingleResult();
	}

	public List<User> find(String name, String password) {
		Query query = em.createQuery("SELECT x FROM User x WHERE x.name=:name and x.password=:password");
		query.setParameter("name", name);
		query.setParameter("password", password);

		@SuppressWarnings("unchecked")
		List<User> list = query.getResultList();

		return list;
	}

	public int updatePassword(String name, String password) {
		Query query = em.createQuery("UPDATE User x SET x.password=:password WHERE x.name=:name");
		query.setParameter("password", password);
		query.setParameter("name", name);

		em.getTransaction().begin();
		int iRslt = query.executeUpdate();
		em.getTransaction().commit();

		return iRslt;
	}
}

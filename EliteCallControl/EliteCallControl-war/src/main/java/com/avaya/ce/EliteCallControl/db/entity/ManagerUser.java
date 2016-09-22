package com.avaya.ce.EliteCallControl.db.entity;

import javax.persistence.Entity;

@Entity
public class ManagerUser {

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}

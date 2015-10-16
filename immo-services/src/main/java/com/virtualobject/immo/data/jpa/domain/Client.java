package com.virtualobject.immo.data.jpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


//@MappedSuperclass
public class Client extends Utilisateur {

	private static final long serialVersionUID = -8727756996006797749L;
	
	@Column(length = 80)
	private String login;
	@Column(length = 20)
	private String password;
	@Column(length = 20)
	private String telephone;
	//private List<String> annonces; // liste des Id d'annonces...
	
	public Client() {
		//annonces = new ArrayList<String>();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

//	public List<String> getAnnonces() {
//		return annonces;
//	}
//
//	public void setAnnonces(List<String> annonces) {
//		this.annonces = annonces;
//	}



}

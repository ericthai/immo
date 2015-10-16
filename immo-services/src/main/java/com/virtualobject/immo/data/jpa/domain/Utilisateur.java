package com.virtualobject.immo.data.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name = "UTILISATEURS")
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 3995526909138623135L;

	@Id
	@GeneratedValue
	private Long utilisateurId;
	@Column(length = 60)
	private String typeClient;
	@Column(length = 100)
	private String email;

	public Utilisateur() {
	}

	public String getTypeClient() {
		return typeClient;
	}

	protected void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getUtilisateurId() {
		return utilisateurId;
	}

	public void setUtilisateurId(long utilisateurId) {
		this.utilisateurId = utilisateurId;
	}

}

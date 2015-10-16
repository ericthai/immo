package com.virtualobject.immo.data.jpa.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

//@MappedSuperclass
public class ClientPhysique extends Client {

	private static final long serialVersionUID = -4569019554577080335L;

	static public final String PARTICULIER = "particulier";
	static public final String INDEPENDANT = "independant";

	@Column(length = 10)
	private String civilite;
	@Column(length = 100)
	private String nom;
	@Column(length = 100)
	private String prenom;

	public ClientPhysique() {
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}

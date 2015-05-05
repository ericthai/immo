package com.virtualobject.immo.data.jpa.domain;

import javax.persistence.MappedSuperclass;

//@MappedSuperclass
public class ClientMoral extends Client {

	private static final long serialVersionUID = -3745560349258722828L;
	
	static public final String AGENCE = "agence";
	static public final String PARTENAIRE = "partenaire";
	
	private String raisonSociale;
	private String logo;

	public ClientMoral() {
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}

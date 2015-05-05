package com.virtualobject.immo.data.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "AGENCES")
public class AgenceImmo extends ClientMoral {

	private static final long serialVersionUID = 7824133835937540550L;

	@Id
	@GeneratedValue
	private Long agenceImmoId;

	private String nomReseauAgence;

	public AgenceImmo() {
		setTypeClient(ClientMoral.AGENCE);
	}

	public long getAgenceImmoId() {
		return agenceImmoId;
	}

	public void setAgenceImmoId(long agenceImmoId) {
		this.agenceImmoId = agenceImmoId;
	}

	public String getNomReseauAgence() {
		return nomReseauAgence;
	}

	public void setNomReseauAgence(String nomReseauAgence) {
		this.nomReseauAgence = nomReseauAgence;
	}

}

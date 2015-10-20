package com.virtualobject.immo.data.jpa.domain;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ANNONCES")
public class AnnonceImmo extends Annonce implements Serializable {

	private static final long serialVersionUID = -4926773977993059101L;
	
	private Boolean premium;

	public AnnonceImmo() {
	}

	public BienImmo getBienImmo() {
		return (BienImmo) getAnnonceBusinessObject();
	}

	public void setBienImmo(BienImmo bienImmo) {
		setAnnonceBusinessObject(bienImmo);
	}

	public Boolean getPremium() {
		return premium;
	}

	public void setPremium(Boolean premium) {
		this.premium = premium;
	}

}

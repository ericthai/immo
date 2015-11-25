package com.virtualobject.immo.data.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ANNONCES")
public class AnnonceImmo extends Annonce implements Serializable {

	private static final long serialVersionUID = -4926773977993059101L;

	private Boolean premium;
	
	@OneToOne
	private BienImmo bienImmo;

	public AnnonceImmo() {
	}

	public BienImmo getBienImmo() {
		return bienImmo;
	}

	public void setBienImmo(BienImmo bienImmo) {
		this.bienImmo = bienImmo;
	}

	public Boolean getPremium() {
		return premium;
	}

	public void setPremium(Boolean premium) {
		this.premium = premium;
	}

}

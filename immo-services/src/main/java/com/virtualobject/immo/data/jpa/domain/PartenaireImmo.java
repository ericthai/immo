package com.virtualobject.immo.data.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "PARTENAIRES")
public class PartenaireImmo extends ClientMoral {

	private static final long serialVersionUID = -3014492219118641745L;

	@Id
	@GeneratedValue
	private Long partenaireImmoId;

	public PartenaireImmo() {
		setTypeClient(ClientMoral.PARTENAIRE);
	}

	public long getPartenaireImmoId() {
		return partenaireImmoId;
	}

	public void setPartenaireImmoId(long partenaireImmoId) {
		this.partenaireImmoId = partenaireImmoId;
	}

}

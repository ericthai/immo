package com.virtualobject.immo.data.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "PARTICULIERS")
public class ParticulierImmo extends ClientPhysique {

	private static final long serialVersionUID = 5388757117670548278L;

	@Id
	@GeneratedValue
	private Long particulierImmoId;

	public ParticulierImmo() {
		setTypeClient(ClientPhysique.PARTICULIER);
	}

	public long getParticulierImmoId() {
		return particulierImmoId;
	}

	public void setParticulierImmoId(long particulierImmoId) {
		this.particulierImmoId = particulierImmoId;
	}

}

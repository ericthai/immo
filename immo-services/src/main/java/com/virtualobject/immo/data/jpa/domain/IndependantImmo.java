package com.virtualobject.immo.data.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "INDEPENDANTS")
public class IndependantImmo extends ClientPhysique {

	private static final long serialVersionUID = -4425904439710153495L;

	@Id
	@GeneratedValue
	private Long independantImmoId;

	public IndependantImmo() {
		setTypeClient(ClientPhysique.INDEPENDANT);
	}

	public long getIndependantImmoId() {
		return independantImmoId;
	}

	public void setIndependantImmoId(long independantImmoId) {
		this.independantImmoId = independantImmoId;
	}

}

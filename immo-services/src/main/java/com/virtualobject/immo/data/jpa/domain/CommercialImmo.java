package com.virtualobject.immo.data.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMMERCIAL")
public class CommercialImmo extends UtilisateurImmo implements
		UtilisateurBackOffice {

	private static final long serialVersionUID = 8961884524102654542L;

	@Id
	@GeneratedValue
	private Long commercialImmoId;

	public CommercialImmo() {
	}

	public long getCommercialImmoId() {
		return commercialImmoId;
	}

	public void setCommercialImmoId(long commercialImmoId) {
		this.commercialImmoId = commercialImmoId;
	}

}

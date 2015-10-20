package com.virtualobject.immo.data.jpa.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Objet gere par une Annonce
 * 
 * @author Eric.THAI
 */
@MappedSuperclass
public class AnnonceBusinessObject implements Serializable {

	private static final long serialVersionUID = 5415168373270105694L;

	@Id
	@GeneratedValue
	private Long annonceBusinessObjectId;

	public AnnonceBusinessObject() {
	}

	public Long getAnnonceBusinessObjectId() {
		return annonceBusinessObjectId;
	}

	public void setAnnonceBusinessObjectId(Long annonceBusinessObjectId) {
		this.annonceBusinessObjectId = annonceBusinessObjectId;
	}

}

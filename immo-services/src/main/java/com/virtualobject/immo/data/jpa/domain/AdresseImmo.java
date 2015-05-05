package com.virtualobject.immo.data.jpa.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADRESSE")
public class AdresseImmo {

	@Id
	@GeneratedValue
	private Long adresseImmoId;

	private String adresse;
	private Integer codePostal;
	private String ville;
	private String pays;

	public long getAdresseImmoId() {
		return adresseImmoId;
	}

	public void setAdresseImmoId(long adresseImmoId) {
		this.adresseImmoId = adresseImmoId;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

}

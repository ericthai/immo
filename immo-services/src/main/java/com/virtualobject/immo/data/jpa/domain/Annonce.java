package com.virtualobject.immo.data.jpa.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public class Annonce implements Serializable {

	private static final long serialVersionUID = -6493653477564612327L;

	private String annonceId;
	private String referenceAnnonce;
	private Date dateCreationAnnonce;
	@Column(length = 120)
	private String titre;
	private String description;
	@Column(length = 255)
	private String remarque;
	@Column(length = 60)
	private String etatCourant;

	@OneToMany
	private List<HistoEtat> histoEtat;

	private String clientId;

	private AnnonceBusinessObject annonceBusinessObject;

	public Annonce() {
		dateCreationAnnonce = new Date();
		histoEtat = new ArrayList<HistoEtat>();
	}

	public String getAnnonceId() {
		return annonceId;
	}

	public void setAnnonceId(String annonceId) {
		this.annonceId = annonceId;
	}

	public String getReferenceAnnonce() {
		return referenceAnnonce;
	}

	public void setReferenceAnnonce(String referenceAnnonce) {
		this.referenceAnnonce = referenceAnnonce;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDateCreationAnnonce() {
		return dateCreationAnnonce;
	}

	public void setDateCreationAnnonce(Date dateCreationAnnonce) {
		this.dateCreationAnnonce = dateCreationAnnonce;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRemarque() {
		return remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public List<HistoEtat> getHistoEtat() {
		return histoEtat;
	}

	public void setHistoEtat(List<HistoEtat> histoEtat) {
		this.histoEtat = histoEtat;
	}

	public String getEtatCourant() {
		return etatCourant;
	}

	public void setEtatCourant(String etatCourant) {
		this.etatCourant = etatCourant;
		HistoEtat histoEtat1 = new HistoEtat();
		histoEtat1.setDateEtat(new Date());
		histoEtat1.setEtat(etatCourant);
		getHistoEtat().add(histoEtat1);
	}

	public AnnonceBusinessObject getAnnonceBusinessObject() {
		return annonceBusinessObject;
	}

	public void setAnnonceBusinessObject(AnnonceBusinessObject annonceBusinessObject) {
		this.annonceBusinessObject = annonceBusinessObject;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

}

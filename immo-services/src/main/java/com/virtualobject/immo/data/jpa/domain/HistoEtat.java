package com.virtualobject.immo.data.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HISTOETAT")
public class HistoEtat implements Serializable {

	private static final long serialVersionUID = -5459588807179395312L;

	@Id
	@GeneratedValue
	private Long histoEtatId;

	private String etat;
	private Date dateEtat;
	private String commentaire;

	public HistoEtat() {
	}

	public long getHistoEtatId() {
		return histoEtatId;
	}

	public void setHistoEtatId(long histoEtatId) {
		this.histoEtatId = histoEtatId;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Date getDateEtat() {
		return dateEtat;
	}

	public void setDateEtat(Date dateEtat) {
		this.dateEtat = dateEtat;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

}

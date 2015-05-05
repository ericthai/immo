package com.virtualobject.immo.data.jpa.domain;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.Id;

@MappedSuperclass
public class UtilisateurImmo implements Serializable {

	private static final long serialVersionUID = -3861698865256090170L;

	@Id
	private Long utilisateurImmoId;
	private Utilisateur utilisateur;

	public UtilisateurImmo() {
	}

	public Long getUtilisateurImmoId() {
		return utilisateurImmoId;
	}

	public void setUtilisateurImmoId(Long utilisateurImmoId) {
		this.utilisateurImmoId = utilisateurImmoId;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
}

package com.virtualobject.immo.data.jpa.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHOTOS")
public class PhotoBienImmo {

	@Id
	private Long photoId;

	private String titre;
	private String nomFichier;
	private Boolean photoPrincipale;

	public PhotoBienImmo() {

	}


	public Long getPhotoId() {
		return photoId;
	}


	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}


	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getNomFichier() {
		return nomFichier;
	}

	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	public Boolean getPhotoPrincipale() {
		return photoPrincipale;
	}

	public void setPhotoPrincipale(Boolean photoPrincipale) {
		this.photoPrincipale = photoPrincipale;
	}

}

package com.virtualobject.immo.data.jpa.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.virtualobject.immo.data.jpa.AnnonceBusinessObject;

@Entity
@Table(name = "BIENS")
public class BienImmo implements AnnonceBusinessObject {

	private static final long serialVersionUID = 3803855141876874576L;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String bienImmoId;

	@Column(length = 60)
	private String typeBien;
	private Float surface;
	private Integer nbPiece;
	private Integer prix;
	private Integer taxeFonciere;
	private Integer charges;
	private Integer anneeConstruction;
	private Integer consommationEnergetique;
	private Integer consommationGazEffetSerre;
	private Integer etage;
	private Integer etageTotal;
	private Boolean ascenseur;
	private Integer parking;
	private Boolean cave;
	private Integer terrain;
	@Column(length = 60)
	private String etat;
	private Integer prixVente;
	private Date dateVente;
	private Integer nbChambre;
	private Integer box;
	private Integer balconM2;
	private Integer terrasseM2;

	@OneToMany
	private List<PhotoBienImmo> photos;

	@OneToOne
	private AdresseImmo adresse;

	public AdresseImmo getAdresse() {
		return adresse;
	}

	public void setAdresse(AdresseImmo adresse) {
		this.adresse = adresse;
	}

	public BienImmo() {
	}

	public String getTypeBien() {
		return typeBien;
	}

	public void setTypeBien(String typeBien) {
		this.typeBien = typeBien;
	}

	public Float getSurface() {
		return surface;
	}

	public void setSurface(Float surface) {
		this.surface = surface;
	}

	public Integer getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(Integer nbPiece) {
		this.nbPiece = nbPiece;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public Integer getTaxeFonciere() {
		return taxeFonciere;
	}

	public void setTaxeFonciere(Integer taxeFonciere) {
		this.taxeFonciere = taxeFonciere;
	}

	public Integer getCharges() {
		return charges;
	}

	public void setCharges(Integer charges) {
		this.charges = charges;
	}

	public Integer getAnneeConstruction() {
		return anneeConstruction;
	}

	public void setAnneeConstruction(Integer anneeConstruction) {
		this.anneeConstruction = anneeConstruction;
	}

	public Integer getConsommationEnergetique() {
		return consommationEnergetique;
	}

	public void setConsommationEnergetique(Integer consommationEnergetique) {
		this.consommationEnergetique = consommationEnergetique;
	}

	public Integer getConsommationGazEffetSerre() {
		return consommationGazEffetSerre;
	}

	public void setConsommationGazEffetSerre(Integer consommationGazEffetSerre) {
		this.consommationGazEffetSerre = consommationGazEffetSerre;
	}

	public Integer getEtage() {
		return etage;
	}

	public void setEtage(Integer etage) {
		this.etage = etage;
	}

	public Integer getEtageTotal() {
		return etageTotal;
	}

	public void setEtageTotal(Integer etageTotal) {
		this.etageTotal = etageTotal;
	}

	public Boolean getAscenseur() {
		return ascenseur;
	}

	public void setAscenseur(Boolean ascenseur) {
		this.ascenseur = ascenseur;
	}

	public Integer getParking() {
		return parking;
	}

	public void setParking(Integer parking) {
		this.parking = parking;
	}

	public Boolean getCave() {
		return cave;
	}

	public void setCave(Boolean cave) {
		this.cave = cave;
	}

	public Integer getTerrain() {
		return terrain;
	}

	public void setTerrain(Integer terrain) {
		this.terrain = terrain;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Integer getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(Integer prixVente) {
		this.prixVente = prixVente;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	public Integer getNbChambre() {
		return nbChambre;
	}

	public void setNbChambre(Integer nbChambre) {
		this.nbChambre = nbChambre;
	}

	public Integer getBox() {
		return box;
	}

	public void setBox(Integer box) {
		this.box = box;
	}

	public Integer getBalconM2() {
		return balconM2;
	}

	public void setBalconM2(Integer balconM2) {
		this.balconM2 = balconM2;
	}

	public Integer getTerrasseM2() {
		return terrasseM2;
	}

	public void setTerrasseM2(Integer terrasseM2) {
		this.terrasseM2 = terrasseM2;
	}

	public List<PhotoBienImmo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<PhotoBienImmo> photos) {
		this.photos = photos;
	}

	public String getBienImmoId() {
		return bienImmoId;
	}

	public void setBienImmoId(String bienImmoId) {
		this.bienImmoId = bienImmoId;
	}

}

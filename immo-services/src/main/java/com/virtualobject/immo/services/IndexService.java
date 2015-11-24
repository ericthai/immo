package com.virtualobject.immo.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.virtualobject.immo.data.jpa.domain.AdresseImmo;
import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;
import com.virtualobject.immo.data.jpa.domain.BienImmo;
import com.virtualobject.immo.data.jpa.domain.PhotoBienImmo;

public class IndexService {

	private final Logger logger = Logger.getLogger(AnnonceService.class);

	public List<AnnonceImmo> findAnnoncePremium() {
		//Liste des annonces
		List<AnnonceImmo> annonces = new ArrayList<AnnonceImmo>();
		
		//Premiere annonce
		AnnonceImmo annonce = new AnnonceImmo();
		BienImmo bien = new BienImmo();
		AdresseImmo adresse = new AdresseImmo();
		adresse.setVille("Bagneux");
		bien.setAdresse(adresse);
		//Récupérer la photo premium de chaque annonce
		List<PhotoBienImmo> listPhotos = new ArrayList<PhotoBienImmo>();		
		//Photo
		PhotoBienImmo photo = new PhotoBienImmo();
		photo.setNomFichier("photo/large_5f167486-77b4.jpg");	
		photo.setTitre("Cuisine");
		photo.setPhotoPrincipale(true);
		listPhotos.add(photo);
		bien.setPhotos(listPhotos);
		bien.setPrix(320000);
		bien.setNbChambre(4);
		annonce.setBienImmo(bien);
		annonce.setPremium(true);
		annonce.setDescription("Descripition");
		annonce.setEtatCourant("Etat Courant");
		annonces.add(annonce);		

		
		AnnonceImmo annonce1 = new AnnonceImmo();
		BienImmo bien1 = new BienImmo();
		AdresseImmo adresse1 = new AdresseImmo();
		adresse1.setVille("Bagneux");
		bien1.setAdresse(adresse1);
		//Récupérer la photo premium de chaque annonce
		List<PhotoBienImmo> listPhotos1 = new ArrayList<PhotoBienImmo>();		
		//Photo
		PhotoBienImmo photo1 = new PhotoBienImmo();
		photo1.setNomFichier("photo/large_IMG-0588.JPG");	
		photo1.setTitre("Cuisine");
		photo1.setPhotoPrincipale(true);
		listPhotos1.add(photo1);
		bien1.setPhotos(listPhotos1);
		
		bien1.setPrix(320000);
		bien1.setNbChambre(4);
		annonce1.setBienImmo(bien);
		annonce1.setPremium(true);
		annonce1.setDescription("Descripition");
		annonce1.setEtatCourant("Etat Courant");
		annonces.add(annonce1);		


		AnnonceImmo annonce2 = new AnnonceImmo();
		BienImmo bien2 = new BienImmo();
		AdresseImmo adresse2 = new AdresseImmo();
		adresse2.setVille("Bagneux");
		bien2.setAdresse(adresse2);
		
		//Récupérer la photo premium de chaque annonce
		List<PhotoBienImmo> listPhotos2 = new ArrayList<PhotoBienImmo>();		
		//Photo
		PhotoBienImmo photo2 = new PhotoBienImmo();
		photo2.setNomFichier("photo/large_IMG-0461.JPG");	
		photo2.setTitre("Cuisine");
		photo2.setPhotoPrincipale(true);
		listPhotos2.add(photo2);

		bien2.setPhotos(listPhotos2);
		
		bien2.setPrix(320000);
		bien2.setNbChambre(4);
		annonce2.setBienImmo(bien);
		annonce2.setPremium(true);
		annonce2.setDescription("Descripition");
		annonce2.setEtatCourant("Etat Courant");
		annonces.add(annonce2);		


		AnnonceImmo annonce3 = new AnnonceImmo();
		BienImmo bien3 = new BienImmo();
		AdresseImmo adresse3 = new AdresseImmo();
		adresse3.setVille("Bagneux");
		bien3.setAdresse(adresse3);
		//Récupérer la photo premium de chaque annonce
		List<PhotoBienImmo> listPhotos3 = new ArrayList<PhotoBienImmo>();		
		//Photo
		PhotoBienImmo photo3 = new PhotoBienImmo();
		photo3.setNomFichier("photo/large_image-33-.jpeg");	
		photo3.setTitre("Cuisine");
		photo3.setPhotoPrincipale(true);
		listPhotos3.add(photo3);

		bien3.setPhotos(listPhotos3);
		bien3.setPrix(320000);
		bien3.setNbChambre(4);
		annonce3.setBienImmo(bien3);
		annonce3.setPremium(true);
		annonce3.setDescription("Descripition");
		annonce3.setEtatCourant("Etat Courant");
		annonces.add(annonce3);		

		AnnonceImmo annonce4 = new AnnonceImmo();
		BienImmo bien4 = new BienImmo();
		AdresseImmo adresse4 = new AdresseImmo();
		adresse4.setVille("Bagneux");
		bien4.setAdresse(adresse4);
		//Récupérer la photo premium de chaque annonce
		List<PhotoBienImmo> listPhotos4 = new ArrayList<PhotoBienImmo>();		
		//Photo
		PhotoBienImmo photo4 = new PhotoBienImmo();
		photo4.setNomFichier("photo/large_image.jpg");	
		photo4.setTitre("Cuisine");
		photo4.setPhotoPrincipale(true);
		listPhotos4.add(photo4);
		bien4.setPhotos(listPhotos4);
		bien4.setPrix(320000);
		bien4.setNbChambre(4);
		annonce4.setBienImmo(bien);
		annonce4.setPremium(true);
		annonce4.setDescription("Descripition");
		annonce4.setEtatCourant("Etat Courant");
		annonces.add(annonce4);		

		AnnonceImmo annonce5 = new AnnonceImmo();
		BienImmo bien5 = new BienImmo();
		AdresseImmo adresse5 = new AdresseImmo();
		adresse5.setVille("Bagneux");
		bien5.setAdresse(adresse5);
		//Récupérer la photo premium de chaque annonce
		List<PhotoBienImmo> listPhotos5 = new ArrayList<PhotoBienImmo>();		
		//Photo
		PhotoBienImmo photo5 = new PhotoBienImmo();
		photo5.setNomFichier("photo/large_-DSC0874.jpeg");	
		photo5.setTitre("Cuisine");
		photo5.setPhotoPrincipale(true);
		listPhotos5.add(photo5);
		bien5.setPhotos(listPhotos5);
		bien5.setPrix(320000);
		bien5.setNbChambre(4);
		annonce5.setBienImmo(bien);
		annonce5.setPremium(true);
		annonce5.setDescription("Descripition");
		annonce5.setEtatCourant("Etat Courant");
		annonces.add(annonce5);		

		AnnonceImmo annonce6 = new AnnonceImmo();
		BienImmo bien6 = new BienImmo();
		AdresseImmo adresse6 = new AdresseImmo();
		adresse6.setVille("Bagneux");
		bien6.setAdresse(adresse6);
		//Récupérer la photo premium de chaque annonce
		List<PhotoBienImmo> listPhotos6 = new ArrayList<PhotoBienImmo>();		
		//Photo
		PhotoBienImmo photo6 = new PhotoBienImmo();
		photo6.setNomFichier("photo/large_IMG-0461.JPG");	
		photo6.setTitre("Cuisine");
		photo6.setPhotoPrincipale(true);
		listPhotos6.add(photo6);
		bien6.setPhotos(listPhotos6);
		bien6.setPrix(320000);
		bien6.setNbChambre(4);
		annonce6.setBienImmo(bien6);
		annonce6.setPremium(true);
		annonce6.setDescription("Descripition");
		annonce6.setEtatCourant("Etat Courant");
		annonces.add(annonce6);		

		AnnonceImmo annonce7 = new AnnonceImmo();
		BienImmo bien7 = new BienImmo();
		AdresseImmo adresse7 = new AdresseImmo();
		adresse7.setVille("Bagneux");
		bien7.setAdresse(adresse7);
		//Récupérer la photo premium de chaque annonce
		List<PhotoBienImmo> listPhotos7 = new ArrayList<PhotoBienImmo>();		
		//Photo
		PhotoBienImmo photo7 = new PhotoBienImmo();
		photo7.setNomFichier("photo/large_IMG-0461.JPG");	
		photo7.setTitre("Cuisine");
		photo7.setPhotoPrincipale(true);
		listPhotos7.add(photo7);
		bien7.setPhotos(listPhotos7);
		bien7.setPrix(320000);
		bien7.setNbChambre(4);
		annonce7.setBienImmo(bien7);
		annonce7.setPremium(true);
		annonce7.setDescription("Descripition");
		annonce7.setEtatCourant("Etat Courant");
		annonces.add(annonce7);		

		AnnonceImmo annonce8 = new AnnonceImmo();
		BienImmo bien8 = new BienImmo();
		//Récupérer la photo premium de chaque annonce
		AdresseImmo adresse8 = new AdresseImmo();
		adresse8.setVille("Bagneux");
		bien8.setAdresse(adresse8);
		List<PhotoBienImmo> listPhotos8 = new ArrayList<PhotoBienImmo>();		
		//Photo
		PhotoBienImmo photo8 = new PhotoBienImmo();
		photo8.setNomFichier("photo/large_Salon.jpg");	
		photo8.setTitre("Cuisine");
		photo8.setPhotoPrincipale(true);
		listPhotos8.add(photo8);
		bien8.setPhotos(listPhotos8);
		bien8.setPrix(320000);
		bien8.setNbChambre(4);
		annonce8.setBienImmo(bien8);
		annonce8.setPremium(true);
		annonce8.setDescription("Descripition");
		annonce8.setEtatCourant("Etat Courant");
		annonces.add(annonce8);		

		return annonces;
	}
	
}

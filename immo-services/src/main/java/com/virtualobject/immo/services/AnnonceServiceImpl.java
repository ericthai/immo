/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.virtualobject.immo.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtualobject.immo.data.jpa.AnnonceNotFoundException;
import com.virtualobject.immo.data.jpa.domain.AdresseImmo;
import com.virtualobject.immo.data.jpa.domain.Annonce;
import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;
import com.virtualobject.immo.data.jpa.domain.BienImmo;
import com.virtualobject.immo.data.jpa.domain.PhotoBienImmo;
import com.virtualobject.immo.data.jpa.service.AnnonceDaoService;

@Service
public class AnnonceServiceImpl implements AnnonceService {

	private final Logger logger = Logger.getLogger(AnnonceServiceImpl.class);

	public void create(String id){
		
	}
	
	@Autowired
	private AnnonceDaoService annonceDaoService;

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
		bien.setPrix(380000);
		bien.setNbChambre(4);
		annonce.setBienImmo(bien);
		annonce.setPremium(true);
		annonce.setDescription("Descripition");
		annonce.setEtatCourant("Etat Courant");
		annonces.add(annonce);		

		
		AnnonceImmo annonce1 = new AnnonceImmo();
		BienImmo bien1 = new BienImmo();
		AdresseImmo adresse1 = new AdresseImmo();
		adresse1.setVille("Bagneux1");
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
		
		bien1.setPrix(370000);
		bien1.setNbChambre(4);
		annonce1.setBienImmo(bien1);
		annonce1.setPremium(true);
		annonce1.setDescription("Descripition");
		annonce1.setEtatCourant("Etat Courant");
		annonces.add(annonce1);		


		AnnonceImmo annonce2 = new AnnonceImmo();
		BienImmo bien2 = new BienImmo();
		AdresseImmo adresse2 = new AdresseImmo();
		adresse2.setVille("Bagneux2");
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
		annonce2.setBienImmo(bien2);
		annonce2.setPremium(true);
		annonce2.setDescription("Descripition");
		annonce2.setEtatCourant("Etat Courant");
		annonces.add(annonce2);		


		AnnonceImmo annonce3 = new AnnonceImmo();
		BienImmo bien3 = new BienImmo();
		AdresseImmo adresse3 = new AdresseImmo();
		adresse3.setVille("Bagneux3");
		bien3.setAdresse(adresse3);
		//Récupérer la photo premium de chaque annonce
		List<PhotoBienImmo> listPhotos3 = new ArrayList<PhotoBienImmo>();		
		//Photo
		PhotoBienImmo photo3 = new PhotoBienImmo();
		photo3.setNomFichier("photo/large_20130321-164837.jpg");	
		photo3.setTitre("Cuisine");
		photo3.setPhotoPrincipale(true);
		listPhotos3.add(photo3);

		bien3.setPhotos(listPhotos3);
		bien3.setPrix(330000);
		bien3.setNbChambre(4);
		annonce3.setBienImmo(bien3);
		annonce3.setPremium(true);
		annonce3.setDescription("Descripition");
		annonce3.setEtatCourant("Etat Courant");
		annonces.add(annonce3);		

		AnnonceImmo annonce4 = new AnnonceImmo();
		BienImmo bien4 = new BienImmo();
		AdresseImmo adresse4 = new AdresseImmo();
		adresse4.setVille("Bagneux4");
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
		annonce4.setBienImmo(bien4);
		annonce4.setPremium(true);
		annonce4.setDescription("Descripition");
		annonce4.setEtatCourant("Etat Courant 4");
		annonces.add(annonce4);		

		AnnonceImmo annonce5 = new AnnonceImmo();
		BienImmo bien5 = new BienImmo();
		AdresseImmo adresse5 = new AdresseImmo();
		adresse5.setVille("Bagneux5");
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
		annonce5.setBienImmo(bien5);
		annonce5.setPremium(true);
		annonce5.setDescription("Descripition");
		annonce5.setEtatCourant("Etat Courant");
		annonces.add(annonce5);		

		AnnonceImmo annonce6 = new AnnonceImmo();
		BienImmo bien6 = new BienImmo();
		AdresseImmo adresse6 = new AdresseImmo();
		adresse6.setVille("Bagneux6");
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
		adresse7.setVille("Bagneux7");
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
		adresse8.setVille("Bagneux8");
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
	/**
	 * 
	 */
	public AnnonceImmo createAnnonce(AnnonceImmo annonceImmo) {
		AnnonceImmo annonceImmoRes = annonceDaoService.save(annonceImmo);
		return annonceImmoRes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.virtualobject.immo.services.AnnonceServiceImpl#findAll()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.virtualobject.immo.services.AnnonceService#findAll()
	 */
	@Override
	public List<AnnonceImmo> findAll() {
		logger.info(">>> AnnonceService.findAll()");
		List<AnnonceImmo> annonces = annonceDaoService.findAll();
		logger.info("--->nb annonces = " + annonces.size());
		logger.info("<<< AnnonceService.findAll()");

		return annonces;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.virtualobject.immo.services.AnnonceServiceImpl#findAnnoncePremium()
	 */


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.virtualobject.immo.services.AnnonceServiceImpl#save(java.lang.Object)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.virtualobject.immo.services.AnnonceService#save(java.lang.Object)
	 */
	@Override
	@Transactional
	public Object save(Object annonce) {
		Object obj = null;
		if (annonce instanceof AnnonceImmo) {
			obj = save((AnnonceImmo) annonce);
		}
		return obj;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.virtualobject.immo.services.AnnonceServiceImpl#getOne(long)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.virtualobject.immo.services.AnnonceService#getOne(long)
	 */
	@Override
	public AnnonceImmo getOne(long annonceId) throws AnnonceNotFoundException {
		AnnonceImmo annonceImmo = annonceDaoService.getOne(annonceId);
		return annonceImmo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.virtualobject.immo.services.AnnonceServiceImpl#deleteById(long)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.virtualobject.immo.services.AnnonceService#deleteById(long)
	 */
	@Override
	public void deleteById(long annonceId) {
		annonceDaoService.deleteById(annonceId);
	}

}

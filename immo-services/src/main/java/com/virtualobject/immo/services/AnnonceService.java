package com.virtualobject.immo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.virtualobject.immo.data.jpa.AnnonceNotFoundException;
import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;


@Service
public interface AnnonceService { 

	public void create(String id); 
	
	public List<AnnonceImmo> findAll();

	public Object save(Object annonce);

	public AnnonceImmo getOne(long annonceId) throws AnnonceNotFoundException;

	public void deleteById(long annonceId);

	public List<AnnonceImmo> findAnnoncePremium();
	
	public AnnonceImmo createAnnonce(AnnonceImmo annonceImmo);

}

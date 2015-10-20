package com.virtualobject.immo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;
import com.virtualobject.immo.services.AnnonceService;

@Controller
public class AnnonceController {

	@Autowired
	private AnnonceService annonceService;

	@RequestMapping("/annonces")
	public String findAnnoncesByClient(Map<String, Object> model) {
		List<AnnonceImmo> annonces = annonceService.findAll();
		model.put("annonces", annonces);
		return "annonces.jsp";
	}

	@RequestMapping("/annonces/annonce")
	public String findAnnoncesByClient(
			@RequestParam(value = "annonceId", required = true, defaultValue = "") long annonceId,
			@RequestParam(value = "titre", required = false) String titre, Map<String, Object> model) {
		
		AnnonceImmo annonceImmo = annonceService.getOne(annonceId);
		annonceImmo.setTitre(titre);
		AnnonceImmo annonceImmonew = (AnnonceImmo) annonceService.save(annonceImmo);
		model.put("annonce", annonceImmonew);
		return "./annonce.jsp";
	}

}

package com.virtualobject.immo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;
import com.virtualobject.immo.services.AnnonceService;

@Controller
public class IndexController {

	@Autowired
	private AnnonceService annonceService;
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String findAnnoncesPremium(Map<String, Object> model) {
		List<AnnonceImmo> annonces = annonceService.findAnnoncePremium();
		model.put("annonces", annonces);
		return "index.jsp";
	}
	
}

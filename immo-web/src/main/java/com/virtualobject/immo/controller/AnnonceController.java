package com.virtualobject.immo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    /*
    @RequestMapping("/annonces")
    public String findAnnoncesByClient(@RequestParam(value="clientId", required=false, defaultValue="12345") String clientId, Model model) {
        model.addAttribute("clientId", clientId);
        return "annoncesByClient";
    }
    */
}

package com.virtualobject.immo.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.virtualobject.immo.data.jpa.AnnonceNotFoundException;
import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;
import com.virtualobject.immo.data.jpa.domain.BienImmo;
import com.virtualobject.immo.services.AnnonceService;
//import com.virtualobject.immo.web.AnnonceNotFoundException;
import com.virtualobject.immo.web.ImmoRuntimeException;

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

	@RequestMapping(value="/annonces/annonce", method=RequestMethod.POST)
	public String createAnnonce(Map<String, Object> model){
		AnnonceImmo annonceImmo = new AnnonceImmo();
		annonceImmo.setDateCreationAnnonce(new Date());
		annonceImmo.setTitre("titre");
		BienImmo bienImmo = new BienImmo();
		bienImmo.setCave(true);
		annonceImmo.setBienImmo(bienImmo);
		annonceService.save(annonceImmo);
		model.put("annonce", annonceImmo);
		return "./annonce.jsp";
	}
	
	
	@RequestMapping(value="/annonces/annonce", method=RequestMethod.GET)
	@Transactional
	public String updateAnnonce(@RequestParam(value = "annonceId", required = true, defaultValue = "") Long annonceId,
			@RequestParam(value = "titre", required = false) String titre, Map<String, Object> model) throws AnnonceNotFoundException {

		AnnonceImmo annonceImmo = annonceService.getOne(annonceId);
		if (annonceImmo == null)
			throw new AnnonceNotFoundException("identifiant d'annonce pas trouvée : " + annonceId);
		annonceImmo.setTitre(titre);
		AnnonceImmo annonceImmonew = (AnnonceImmo) annonceService.save(annonceImmo);
		model.put("annonce", annonceImmonew);
		return "./annonce.jsp";
	}

	@ExceptionHandler({RuntimeException.class})
	public ModelAndView handleError(HttpServletRequest req, Exception exception) {
		ModelAndView model = new ModelAndView();
		model.addObject("exception", exception.getMessage());
		model.addObject("url", req.getRequestURL());
		model.setViewName("./annonceError.jsp");
		return model;
	}

	// OK mais Sans controle sur l exception et le modele
	// @ExceptionHandler({ImmoRuntimeException.class})
	// public String annonceError() {
	// return "./annonceError.jsp";
	// }
}

package com.virtualobject.immo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.virtualobject.immo.data.jpa.AnnonceNotFoundException;
import com.virtualobject.immo.services.AnnonceService;
import com.virtualobject.immo.web.ImmoRuntimeException;

@RestController
public class AnnonceRestController {

	@Autowired
	private AnnonceService annonceService;

	@RequestMapping(value = "/annonces/annonce", method = RequestMethod.DELETE)
	public void deleteById(@RequestParam(value = "annonceId", required = true, defaultValue = "") Long annonceId,
			Map<String, Object> model) throws AnnonceNotFoundException {
		//exemple http://localhost:8080/immo-web/annonces/annonce?annonceId=2
		if (annonceId == null) throw new AnnonceNotFoundException("il faut que le parametre annonceId soit NOT NULL");
		annonceService.deleteById(annonceId);
	}
	
}

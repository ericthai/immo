package com.virtualobject.immo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.virtualobject.immo.services.AnnonceService;

@RestController
public class AnnonceRestController {

	@Autowired
	private AnnonceService annonceService;

	@RequestMapping(value = "/annonces/annonce", method = RequestMethod.DELETE)
	public void deleteById(@RequestParam(value = "annonceId", required = true, defaultValue = "") long annonceId,
			Map<String, Object> model) {
		//exemple http://localhost:8080/immo-web/annonces/annonce?annonceId=2
		annonceService.deleteById(annonceId);
	}
}

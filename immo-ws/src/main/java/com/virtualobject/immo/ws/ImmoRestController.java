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

package com.virtualobject.immo.ws;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;
import com.virtualobject.immo.data.jpa.domain.BienImmo;
import com.virtualobject.immo.services.AnnonceService;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
public class ImmoRestController {

	@Autowired
	private AnnonceService annonceService;

	@RequestMapping(value = "/annonces", method = RequestMethod.GET)
	@ResponseBody
	public String getAnnonces() {
		System.out.println("--->ImmoWebServices.getAnnonces()");
		String annoncesString = null;
		List<AnnonceImmo> annonces = annonceService.findAll();
		Gson gson = new Gson();
		annoncesString = gson.toJson(annonces);
		System.out.println("------>annoncesString" + annoncesString);
		System.out.println("<---ImmoWebServices.getAnnonces()");
		return annoncesString;
	}

	@RequestMapping(value = "/annonces", method = RequestMethod.POST)
	@ResponseBody
	public AnnonceImmo createAnnonce(Integer conseiller, Date dateAnnonce,
			Integer compte, String referenceAnnonce, String typeCompte,
			String titre, String descriptionCourte, String descriptionLongue,
			String typeAnnonce, String remarque, Boolean premium,
			double longitude, double lattitude) {

		AnnonceImmo annonceImmo1 = new AnnonceImmo();
		annonceImmo1.setReferenceAnnonce("refAnnonceService1");
		annonceImmo1.setDateCreationAnnonce(new Date());
		annonceImmo1.setEtatCourant("CREEE");
		annonceImmo1.setTitre("titreService1");
		annonceImmo1.setPremium(true);

		BienImmo bienImmo1 = new BienImmo();
		bienImmo1.setPrix(4546789);
		bienImmo1.setCave(true);
		bienImmo1.setDateVente(new Date());
		annonceImmo1.setBienImmo(bienImmo1);

		return annonceImmo1;
	}
}

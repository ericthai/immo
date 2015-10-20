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

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.virtualobject.immo.data.jpa.domain.Annonce;
import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;
import com.virtualobject.immo.data.jpa.service.AnnonceDaoService;

@Service
public class AnnonceService {

	private final Logger logger = Logger.getLogger(AnnonceService.class);

	@Autowired
	private AnnonceDaoService annonceDaoService;

	public List<AnnonceImmo> findAll() {
		logger.info(">>> AnnonceService.findAll()");
		List<AnnonceImmo> annonces = annonceDaoService.findAll();
		logger.info("--->nb annonces = " + annonces.size());
		logger.info("<<< AnnonceService.findAll()");
		
		return annonces;
	}

	public Object save(Object annonce){
		Object obj = null;
		if (annonce instanceof AnnonceImmo){
			obj = save((AnnonceImmo)annonce);
		}
		return obj;
	}
	
	public AnnonceImmo getOne(long annonceId){
		AnnonceImmo annonceImmo = annonceDaoService.getOne(annonceId);
		return annonceImmo;
	}

	private AnnonceImmo save(AnnonceImmo annonceImmo){
		return annonceDaoService.save(annonceImmo);
	}
}

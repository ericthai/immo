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

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.virtualobject.immo.ImmoServicesApplication;
import com.virtualobject.immo.data.jpa.AnnonceNotFoundException;
import com.virtualobject.immo.data.jpa.domain.Annonce;
import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;
import com.virtualobject.immo.data.jpa.service.AnnonceDaoService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=ImmoServicesApplication.class)
public class AnnonceServiceTest  {

	@Autowired
	private AnnonceService annonceService;
	
	@Test
	public void createAnnonce() {
		AnnonceImmo annonceImmo = new AnnonceImmo();
		annonceImmo.setClientId("client11");
		annonceImmo.setDateCreationAnnonce(new Date());
		annonceImmo.setDescription("description11");
		annonceImmo.setPremium(true);
		annonceImmo.setTitre("titre11");
		annonceService.createAnnonce(annonceImmo);
	}

}

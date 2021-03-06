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

package com.virtualobject.immo.data.jpa.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.virtualobject.immo.data.jpa.AnnonceNotFoundException;
import com.virtualobject.immo.data.jpa.domain.Annonce;
import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;


/**
 * Services DAO pour Annonce
 * @author Eric.THAI
 */
public interface AnnonceDaoService {

	public Page<AnnonceImmo> findAnnonces(AnnonceSearchCriteria criteria,
			Pageable pageable);

	public List<AnnonceImmo> findAll();
	
	public AnnonceImmo getOne(Long id) throws AnnonceNotFoundException ;
	
	public AnnonceImmo save(AnnonceImmo annonceImmo);
	
	public void deleteById(Long id);
	
	//Annonce getAnnonce(String critere);

}

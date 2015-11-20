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

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.virtualobject.immo.data.jpa.AnnonceNotFoundException;
import com.virtualobject.immo.data.jpa.domain.Annonce;
import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;
import com.virtualobject.immo.data.jpa.service.AnnonceRepository;


/**
 * Implementation de la DAO Annonce
 * @author Eric.THAI
 *
 */
@Component("AnnonceDaoService")
@Transactional
class AnnonceDaoServiceImpl implements AnnonceDaoService {

	private final AnnonceRepository annonceRepository;


	@Autowired
	public AnnonceDaoServiceImpl(AnnonceRepository annonceRepository) {
		this.annonceRepository = annonceRepository;
	}


	@Override
	public Page<AnnonceImmo> findAnnonces(AnnonceSearchCriteria criteria,
			Pageable pageable) {
		return this.annonceRepository.findAll(pageable);
	}


	@Override
	public List<AnnonceImmo> findAll() {
		return annonceRepository.findAll();
	}

	public AnnonceImmo getOne(Long id) throws AnnonceNotFoundException {
		if (this.annonceRepository.exists(id)) return this.annonceRepository.getOne(id);
		else throw new AnnonceNotFoundException("Annonce Not found");
	}
	
	public AnnonceImmo save(AnnonceImmo annonceImmo){
		return this.annonceRepository.save(annonceImmo);
	}
	
	public void deleteById(Long annonceId){
		annonceRepository.delete(annonceId);
	}
	
//	@Override
//	public Page<Annonce> findCities(AnnonceSearchCriteria criteria, Pageable pageable) {
//
//		Assert.notNull(criteria, "Criteria must not be null");
//		String name = criteria.getName();
//
//		if (!StringUtils.hasLength(name)) {
//			return this.AnnonceRepository.findAll(null);
//		}
//
//		String country = "";
//		int splitPos = name.lastIndexOf(",");
//
//		if (splitPos >= 0) {
//			country = name.substring(splitPos + 1);
//			name = name.substring(0, splitPos);
//		}
//
//		return this.AnnonceRepository
//				.findByNameContainingAndCountryContainingAllIgnoringCase(name.trim(),
//						country.trim(), pageable);
//	}

}

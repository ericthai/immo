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

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.virtualobject.immo.ImmoServicesApplication;
import com.virtualobject.immo.data.jpa.domain.Annonce;
import com.virtualobject.immo.data.jpa.domain.AnnonceImmo;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ImmoServicesApplication.class)
public class AnnonceDaoServiceTest {

	@Autowired
	private AnnonceDaoService annonceDaoService;
	
	@Test
	public void findAll(){
		List<AnnonceImmo> list = null;
		list = annonceDaoService.findAll();
		if ((list == null) || (list.size()==0)){
			System.err.println("erreur : pas d elements");
		}
	}
	
}

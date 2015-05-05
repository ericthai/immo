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

package com.virtualobject.immo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;

@Configuration
@ComponentScan({"com.virtualobject"})
@EnableAutoConfiguration
//@EnableMongoRepositories
public class ImmoWsApplication {

//	static private String loginmongo = "eric";
//	static private String pwdmongo = "eric";
	
	public static void main(String[] args) throws Exception {
		System.out.println(">>>ImmoWsApplication.main()");
		SpringApplication springApplication = new SpringApplication(
				ImmoWsApplication.class);
		ApplicationContext applicationContext = springApplication.run(args);
		System.out.println("<<<ImmoWsApplication.main()");
	}

//	@Override
//	protected String getMappingBasePackage() {
//		return "com.virtualimmo.data.mongo";
//	}

	
//	protected UserCredentials getUserCredentials(){
//		UserCredentials userCredentials = new UserCredentials(loginmongo,pwdmongo);
//		return userCredentials;
//	}
	
//	@Override
//	protected String getDatabaseName() {
//		return "mydatabase";
//	}

	
//	@Override
//	public Mongo mongo() throws Exception {
//		return new Mongo();
//	}
}

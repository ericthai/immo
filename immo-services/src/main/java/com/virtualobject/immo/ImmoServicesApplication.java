package com.virtualobject.immo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.virtualobject.immo.services.AnnonceService;

@Configuration
@ConfigurationProperties(prefix="spring.datasource")
@ComponentScan({ "com.virtualobject" })
@EnableAutoConfiguration
public class ImmoServicesApplication {

	@Autowired
	private AnnonceService annonceService;

	@Autowired
	private Environment _env;

	@Autowired
	private DataSource datasource;

	public ImmoServicesApplication() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(">>>ImmoServicesApplication.main()");
		SpringApplication springApplication = new SpringApplication(
				ImmoServicesApplication.class);
		ApplicationContext applicationContext = springApplication.run(args);
		System.out.println("<<<ImmoServicesApplication.main()");

	}

}

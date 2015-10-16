package com.virtualobject.immo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ConfigurationProperties(prefix="spring.datasource")
@ComponentScan({ "com.virtualobject" })
@EnableAutoConfiguration
public class ImmoWebApplication {

	@Autowired
	private DataSource datasource;
	
	public static void main(String[] args) {
		SpringApplication.run(ImmoWebApplication.class, args);
	}

}

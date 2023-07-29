package com.grampinha.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.grampinha.helpdesk.services.DBServide;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBServide dbService;

	@Bean
	public void instanciaDB() {
		this.dbService.instanciaDB();

	}

}

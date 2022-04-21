package com.misc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misc.dto.DbConfig;

@RestController
public class TestController {
	
	@Autowired
	DbConfig dbConfig;
	
	@Value("${spring.application.name}")
	private String name;
	
	@GetMapping(value = "/name")
	public String CheckStatus() {
		return this.name;
	}
	
	
	@GetMapping(value = "/DBConfig")
	public String DBConfig() {
		return dbConfig.getName();
	}

}

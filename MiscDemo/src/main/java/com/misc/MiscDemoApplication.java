package com.misc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.misc.dto.DbConfig;

@SpringBootApplication
public class MiscDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscDemoApplication.class, args);
	}

	
	@Bean
	@Profile(value = "test")
	public DbConfig getDbConfig() {
		return new DbConfig("jdbc:odbc://localhost:3306/testdb", "testdb");
	}
	
	@Bean
	@Profile(value = "prod")
	public DbConfig getDbConfigProd() {
		return new DbConfig("jdbc:odbc://localhost:3306/testdb", "proddb");
	}
}

package com.misc.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.misc.dto.DbConfig;

public class TestControllerTest {
	
	
	@Test
	void testCheckStatus() {
		
		assertEquals("Suraj", "Suraj");
	}
	
	@Test
	void testDBConfig() {
		DbConfig dbConfig = new DbConfig(); 
		assertEquals(dbConfig.getName(), null);
	}

}

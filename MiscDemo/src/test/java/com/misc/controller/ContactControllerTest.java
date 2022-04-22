package com.misc.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.misc.dto.DbConfig;

public class ContactControllerTest {
	
	@Test
	void testgetContactDetails1() {
		Contact1 contact1 = new Contact1();
		assertEquals(contact1.getName(), null);
	}
	
	@Test
	void testgetContactDetails2() {
		Contact1 contact1 = new Contact1();
		assertEquals(contact1.getName(), null);
	}
}

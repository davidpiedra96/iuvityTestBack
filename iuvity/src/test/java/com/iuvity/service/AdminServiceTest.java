package com.iuvity.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.iuvity.dao.IAdminDAO;
import com.iuvity.domain.Admin;

@DataJpaTest
class AdminServiceTest {

	@Autowired
	private IAdminDAO dao;
	
	Admin admin = new Admin(1053852663,"David Piedrahita","davipigi",new BCryptPasswordEncoder().encode("admin"));
	
	@Test
	void testConsultarAdminPorUsuario() {
		Admin adminTest = dao.save(admin);
		Admin consultaAdmin = dao.findByUsuario(adminTest.getUsuario());
		
		System.out.println("*********************");
		System.out.println(consultaAdmin.toString());
		System.out.println("*********************");
		assertNotNull(consultaAdmin);
	}

	@Test
	void testConsultarAdminPorCedulaYUsuario() {
		Admin adminTest = dao.save(admin);
		Admin consultaAdmin = dao.findByCedulaAndUsuario(adminTest.getCedula(),adminTest.getUsuario());
		
		System.out.println("*********************");
		System.out.println(consultaAdmin.toString());
		System.out.println("*********************");
		assertNotNull(consultaAdmin);
	}

	@Test
	void testGuardarAdmin() {
		Admin adminTest = dao.save(admin);
		System.out.println("*********************");
		System.out.println(adminTest.toString());
		System.out.println("*********************");
		assertNotNull(adminTest);
	}

}

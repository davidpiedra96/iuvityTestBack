package com.iuvity.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.iuvity.dao.IProveedorDAO;
import com.iuvity.domain.Proveedor;

@DataJpaTest
class ProveedorServiceTest {
	
	@Autowired
	private IProveedorDAO dao;

	@Test
	void testObtenerProveedorPorNit() {
		Proveedor prov = new Proveedor("12345","carrera 18","Juliana Meza");
		prov = dao.save(prov);
		
		if (prov != null) {
			Proveedor p = dao.findByNit(prov.getNit());
			assertNotNull(p);
			assertEquals(p.getNit(), prov.getNit());
			assertEquals(p.getCodigo(), prov.getCodigo());
		}
	}

}

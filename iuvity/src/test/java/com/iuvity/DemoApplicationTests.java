package com.iuvity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import com.iuvity.constants.Constants;

@SpringBootTest
class DemoApplicationTests implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate template;

	@Test
	void contextLoads() {
	}
	
	@Override
	public void run(String... args) throws Exception {
		 //CREATE TABLES
		template.execute(Constants.CREATE_PRODUCTO);
		template.execute(Constants.CREATE_KARDEX);
		template.execute(Constants.CREATE_PROVEEDOR);
		template.execute(Constants.CREATE_FACTURA_COMPRA);
		template.execute(Constants.CREATE_PRODUCTO_FACTURA_COMPRA);
		template.execute(Constants.CREATE_CLIENTE);
		template.execute(Constants.CREATE_FACTURA_VENTA);
		template.execute(Constants.CREATE_PRODUCTO_FACTURA_VENTA);
		template.execute(Constants.CREATE_ADMIN);
	}

}

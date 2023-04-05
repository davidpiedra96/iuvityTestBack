package com.iuvity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.iuvity.constants.Constants;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// CREATE TABLES
		template.execute(Constants.CREATE_PRODUCTO);
		template.execute(Constants.CREATE_KARDEX);
		template.execute(Constants.CREATE_PROVEEDOR);
		template.execute(Constants.CREATE_FACTURA_COMPRA);
		template.execute(Constants.CREATE_PRODUCTO_FACTURA_COMPRA);
		template.execute(Constants.CREATE_CLIENTE);
		template.execute(Constants.CREATE_FACTURA_VENTA);
		template.execute(Constants.CREATE_PRODUCTO_FACTURA_VENTA);
		template.execute(Constants.CREATE_ADMIN);
		
		try {
			template.execute(Constants.INSERT_ADMIN);
			template.execute(Constants.INSERT_PROVEEDOR);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

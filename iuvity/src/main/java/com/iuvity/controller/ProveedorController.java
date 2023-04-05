package com.iuvity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iuvity.domain.Proveedor;
import com.iuvity.service.IProveedorService;

@RestController
@RequestMapping("/Proveedor")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class ProveedorController {
	
	@Autowired
	private IProveedorService ips;
	
	@GetMapping("/obtenerProveedorPorCodigo/{codigo}")
	public Proveedor obtenerProveedorPorCodigo(@PathVariable String codigo) {
		return ips.obtenerProveedorPorNit(codigo);
	}

}

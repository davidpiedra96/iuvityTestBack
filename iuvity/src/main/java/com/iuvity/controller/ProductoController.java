package com.iuvity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iuvity.payload.ResponseListarProductos;
import com.iuvity.service.IProductoService;

@RestController
@RequestMapping("/Producto")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class ProductoController {
	
	@Autowired
	private IProductoService ips;
	
	@GetMapping("/listarProductos")
	public List<ResponseListarProductos> listarProductos() {
		List<ResponseListarProductos> lProducto = ips.listarProductos();
		return lProducto;
	}
	
	@GetMapping("/obtenerProducto/{id}")
	public ResponseListarProductos obtenerProducto(@PathVariable String id) {
		return ips.buscarProducto(Integer.parseInt(id));
	}
	
}

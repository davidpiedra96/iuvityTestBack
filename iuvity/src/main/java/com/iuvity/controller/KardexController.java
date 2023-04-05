package com.iuvity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iuvity.domain.Kardex;
import com.iuvity.payload.MessageResponse;
import com.iuvity.payload.RequestConsultarKardexProducto;
import com.iuvity.payload.RequestCreacionStock;
import com.iuvity.payload.RequestDevolucionCompraProducto;
import com.iuvity.payload.RequestDevolucionVentaProducto;
import com.iuvity.payload.RequestIngresoProducto;
import com.iuvity.payload.RequestVentaProducto;
import com.iuvity.service.IKardexService;

@RestController
@RequestMapping("/Kardex")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class KardexController {
	@Autowired
	private IKardexService iks;
	
	/**
	 * Método para testear si el servici esta en funcionamiento
	 * @return
	 */
	@PostMapping("/test")
	public String test() {
		return "Test funcional";
	}
	
	
	@PostMapping("/ingresarProductoNuevo")
	public ResponseEntity<?> ingresarProductoNuevo(@RequestBody RequestCreacionStock rcs) {
		return ResponseEntity.ok(new MessageResponse(iks.ingresarProductoNuevo(rcs)));
	}
	
	@PostMapping("/ingresarCompraProducto")
	public ResponseEntity<?> ingresarCompraProducto(@RequestBody RequestIngresoProducto rip) {
		return ResponseEntity.ok(new MessageResponse(iks.ingresarCompraProducto(rip)));
	}
	
	@PostMapping("/ingresarVentaProducto")
	public ResponseEntity<?> ingresarVentaProducto(@RequestBody RequestVentaProducto rvp) {
		return ResponseEntity.ok(new MessageResponse(iks.ingresarVentaProducto(rvp)));
	}
	
	@PostMapping("/devolucionCompraProducto")
	public ResponseEntity<?> devolucionCompraProducto(@RequestBody RequestDevolucionCompraProducto rdcp) {
		return ResponseEntity.ok(new MessageResponse(iks.devolucionCompraProducto(rdcp)));
	}
	
	@PostMapping("/devolucionVentaProducto")
	public ResponseEntity<?> devolucionVentaProducto(@RequestBody RequestDevolucionVentaProducto rdvp) {
		return ResponseEntity.ok(new MessageResponse(iks.devolucionVentaProducto(rdvp)));
	}
	
	@PostMapping("/consultaKardexMesAnio")
	public List<Kardex> consultaKardexMesAnio(@RequestBody RequestConsultarKardexProducto rckp) {
		return iks.consultaKardexMesAnio(rckp.getMes(), rckp.getAnio(), rckp.getCodigo_producto());
	}
}

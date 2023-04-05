package com.iuvity.service;

import com.iuvity.domain.Proveedor;

public interface IProveedorService {

	/**
	 * Método que obtiene los datos del proveedor por medio del nit
	 * @param nit
	 * @return
	 */
	Proveedor obtenerProveedorPorNit(String nit);
}

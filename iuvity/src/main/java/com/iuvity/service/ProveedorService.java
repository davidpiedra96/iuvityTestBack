package com.iuvity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuvity.dao.IProveedorDAO;
import com.iuvity.domain.Proveedor;

@Service
public class ProveedorService implements IProveedorService{
	
	@Autowired
	private IProveedorDAO ipd;

	@Override
	public Proveedor obtenerProveedorPorNit(String nit) {
		return ipd.findByNit(nit);
	}

}

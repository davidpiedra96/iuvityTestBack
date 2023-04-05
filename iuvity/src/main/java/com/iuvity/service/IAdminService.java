package com.iuvity.service;

import org.springframework.http.ResponseEntity;

import com.iuvity.domain.Admin;
import com.iuvity.payload.LoginRequest;
import com.iuvity.payload.RequestRegistrar;

public interface IAdminService {

	/**
	 * Método que consulta los datos del administrador por medio de su usuario
	 * @param usuario
	 * @return
	 */
	Admin consultarAdminPorUsuario(String usuario);
	
	/**
	 * Método que consulta el administrador por medio de su cedula y su usuario
	 * @param cedula
	 * @param usuario
	 * @return
	 */
	Admin consultarAdminPorCedulaYUsuario(Integer cedula, String usuario);
	
	/**
	 * Método para almacenar un administrador
	 * @param admin
	 * @return
	 */
	Admin guardarAdmin(Admin admin);
}

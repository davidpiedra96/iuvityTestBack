package com.iuvity.service;

import org.springframework.http.ResponseEntity;

import com.iuvity.payload.LoginRequest;
import com.iuvity.payload.RequestRegistrar;

public interface ILoginService {
	/**
	 * Método que realiza el login de usuario administrador
	 * @param loginRequest
	 * @return
	 */
	ResponseEntity<?> login(LoginRequest loginRequest);

	/**
	 * Método para registrar un Usuario Administrador
	 * @param sr
	 * @return
	 */
	ResponseEntity<?> registrarUsuario(RequestRegistrar sr);
	
	/**
	 * Método que valida si el token es valido
	 * @return
	 */
	ResponseEntity<?> validarToken();

}

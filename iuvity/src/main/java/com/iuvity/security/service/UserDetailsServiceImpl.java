package com.iuvity.security.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.iuvity.domain.Admin;
import com.iuvity.domain.AdminConfiguration;
import com.iuvity.domain.ERol;
import com.iuvity.domain.Rol;
import com.iuvity.service.AdminService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AdminService ias;

	/**
	 * Método que consulta el usuario en la base de datos y obtiene sus atributos
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Set<Rol> roles = new HashSet<>();
		Rol rol = new Rol();
		rol.setId(1);
		rol.setNombre(ERol.ROLE_ADMIN);
		roles.add(rol);
		Admin admin = ias.consultarAdminPorUsuario(username);
		AdminConfiguration admc = new AdminConfiguration();
		admc.setCedula(admin.getCedula());
		admc.setNombre(admin.getNombre());
		admc.setUsuario(admin.getUsuario());
		admc.setPassword(admin.getPassword());
		admc.setRoles(roles);
		return UserDetailsImpl.build(admc);
	}
	
	
	
}

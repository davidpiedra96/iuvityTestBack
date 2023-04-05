package com.iuvity.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import com.iuvity.domain.Admin;

@Service
public interface IAdminDAO extends CrudRepository<Admin, Integer> {

	@Query(value = "SELECT * FROM ADMIN WHERE usuario = :usuario", nativeQuery = true)
	Admin findByUsuario(@Param("usuario") String usuario);
	
	@Query(value = "SELECT * FROM ADMIN WHERE cedula = :cedula AND usuario = :usuario", nativeQuery = true)
	Admin findByCedulaAndUsuario(@Param("cedula") Integer cedula, @Param("usuario") String usuario);
}
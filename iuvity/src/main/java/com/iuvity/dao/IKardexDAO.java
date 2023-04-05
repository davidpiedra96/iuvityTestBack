package com.iuvity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iuvity.domain.Kardex;

public interface IKardexDAO extends CrudRepository<Kardex, Integer> {
	@Query(value = "SELECT k.* FROM KARDEX k WHERE k.CODIGO_PRODUCTO = ?1 ORDER BY PARSEDATETIME(k.FECHA,'dd/MM/yyyy','en') ASC", nativeQuery = true)
	List<Kardex> findByCodigoProducto(Integer codigo_producto);

	@Query(value = "SELECT K.* FROM KARDEX K WHERE K.CODIGO_PRODUCTO = ?1 AND CODIGO_FACTURA_VENTA = ?2", nativeQuery = true)
	List<Kardex> findByCodigoProductoAndCodigoFactura(Integer codigo_producto, Integer codigo_factura_venta);

	@Query(value = "SELECT * FROM KARDEX K WHERE MONTH(PARSEDATETIME(k.FECHA,'dd/MM/yyyy','en')) = ?1 AND YEAR(PARSEDATETIME(k.FECHA,'dd/MM/yyyy','en')) = ?2 AND K.CODIGO_PRODUCTO = ?3 ORDER BY PARSEDATETIME(k.FECHA,'dd/MM/yyyy','en') ASC, K.INDICE ASC;", nativeQuery = true)
	List<Kardex> findKardexMesAnio(Integer mes, Integer anio, Integer codigo_producto);
}

package com.mscuentas.service;

import java.util.List;

import com.persistence.entity.Cuentas;
import com.persistence.request.CuentasRequest;



public interface CuentasService {

	
	
	Cuentas guardar (CuentasRequest request);
	Cuentas editar (CuentasRequest request);
	Cuentas buscarPorNombre (String nombre); 
	String eliminar (int id);
	List mostrarTodos();
	String desactivar(String nombre);
	Cuentas buscar (int id);
}

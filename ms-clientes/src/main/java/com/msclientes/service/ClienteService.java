package com.msclientes.service;

import java.util.List;

import com.persistence.entity.Clientes;
import com.persistence.request.ClienteRequest;



//es una interface de negocio 
//aqui se enlistan las operaciones o responsabildades

public interface ClienteService {
	
	Clientes guardar (ClienteRequest request);
	Clientes editar (ClienteRequest request);
	Clientes buscarPorNombre (String nombre); 
	String eliminar (int id);
	List mostrarTodos();
	String desactivar(String nombre);
	Clientes buscar (int id);
	

}

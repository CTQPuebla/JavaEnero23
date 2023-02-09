package com.mstarjetas.service;

import java.util.List;
import com.persistence.entity.Tarjeta;
import com.persistence.request.TarjetasRequest;



public interface TarjetasService {


	Tarjeta guardar (TarjetasRequest request);
	Tarjeta editar (TarjetasRequest request);
	Tarjeta buscarPorNombre (String nombre); 
	String eliminar (int id);
	List mostrarTodos();
	String desactivar(String nombre);
	Tarjeta buscar (int id);
	
	
	
}

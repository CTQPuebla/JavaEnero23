package com.msclientes.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.msclientes.service.ClienteService;
import com.persistence.entity.Clientes;
import com.persistence.repository.ClienteRepository;
import com.persistence.request.ClienteRequest;


//indica que esta clase contiene la resolucion de la logica de negocio
@Transactional
@Service
public class ClienteLogic implements ClienteService{

	
	
	
	//Inyeccion de dependencia
	@Autowired 
	ClienteRepository repo; 
	
	@Override
	public Clientes guardar(ClienteRequest request) {
		
		Clientes cliente = new Clientes ();
		cliente.setNombre(request.getNombre());
		cliente.setApellidos(request.getApellidos());
		cliente.setFechaNac(request.getFechaNac());
		cliente.setRfc(request.getRfc());
		
		
		repo.save(cliente);
		return cliente;
	}

	@Override
	public Clientes editar(ClienteRequest request) {
		
		
		// con el .get() del final, extraemos el objeto del envoltorio opcional
		Clientes cliente = repo.findById(request.getClienteId()).get();
		cliente.setNombre(request.getNombre());
		cliente.setApellidos(request.getApellidos());
		cliente.setFechaNac(request.getFechaNac());
		cliente.setRfc(request.getRfc());
		cliente.setStatus(1);
		
		repo.save(cliente);
		return cliente;
	
	}

	public Clientes buscar(int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public Clientes buscarPorNombre(String nombre) {
		
		
		return repo.findByName(nombre);
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrarTodos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String desactivar(String name) {
		repo.disabled(name);
		return "cliente desactivado";
	}
	
	
	
	

}

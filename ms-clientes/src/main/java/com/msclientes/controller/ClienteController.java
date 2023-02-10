package com.msclientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.msclientes.logic.ClienteLogic;
import com.persistence.entity.Clientes;
import com.persistence.request.ClienteRequest;


//exposicion de funcionalidad de este backend a traves de un conjunto de endpoints que enrutan las peticiones
@RequestMapping("cliente/")//Define el path o la ruta de este controlador
@RestController//configura el consumo y la respuesta de los endpoints por default en json
public class ClienteController {
	
	@Autowired
	ClienteLogic service;
	
	//Mostrar     http://localhost:8090/cliente GET 
	@GetMapping()
	public ResponseEntity<List <Clientes>> mostrar(){ 
		
		List <Clientes> clientes = service.mostrarTodos();
		
		return new ResponseEntity<List<Clientes>>(clientes,HttpStatus.OK);
	
	}
	
	
	
	@GetMapping("buscar-por-id/{id}") //
	public ResponseEntity<Clientes> buscar(@PathVariable int id){ 
		
		Clientes cliente = service.buscar(id);
		
		return new ResponseEntity<Clientes>(cliente,HttpStatus.OK);
	
	}
	
	@PatchMapping("desactivar/{name}") //
	public ResponseEntity<String> desactivar(@PathVariable String name){ 
		
		String response = service.desactivar(name);
		
		return new ResponseEntity<String>(response,HttpStatus.OK);
	
	}
	
	
	@GetMapping("buscar-por-nombre/{nombre}") //
	public ResponseEntity<Clientes> buscarPorNombre(@PathVariable String nombre){ 
		
		Clientes cliente = service.buscarPorNombre(nombre);
		
		return new ResponseEntity<Clientes>(cliente,HttpStatus.OK);
	
	}
	
	//http://localhost:8090/cliente  POST
	@PostMapping()
	public ResponseEntity <Clientes> guardar(@RequestBody ClienteRequest request){
		
		Clientes cliente = service.guardar(request);
		return new ResponseEntity<Clientes>(cliente, HttpStatus.OK);
		
	}
	
	
	//http://localhost:8090/cliente POST 
	@PutMapping()
	public ResponseEntity <Clientes> editar(@RequestBody ClienteRequest request){
		
		Clientes cliente = service.editar(request);
		return new ResponseEntity<Clientes>(cliente, HttpStatus.OK);
		
	}
	
	
	//http:localhost:8090/cliente/eliminar/30
	@DeleteMapping()
	public ResponseEntity <String> eliminar(@PathVariable int id){
		
		String response = service.eliminar(id);
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	


}

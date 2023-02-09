package com.mstarjetas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mstarjetas.logic.TarjetasLogic;
import com.persistence.entity.Cuentas;
import com.persistence.entity.Tarjeta;
import com.persistence.request.CuentasRequest;
import com.persistence.request.TarjetasRequest;



@RequestMapping("tarjeta/")
@RestController
public class TarjetasController {
	
	@Autowired
	TarjetasLogic service;
	
	@GetMapping()
	public ResponseEntity<List <Tarjeta>> mostrar(){ 
			
			List <Tarjeta> tarjetas = service.mostrarTodos();
			
			return new ResponseEntity<List<Tarjeta>>(tarjetas,HttpStatus.OK);
		
		}
	
	@GetMapping("buscar-por-id/{id}") //
	public ResponseEntity<Tarjeta> buscar(@PathVariable int id){ 
		
		Tarjeta tarjeta = service.buscar(id);
		
		return new ResponseEntity<Tarjeta>(tarjeta,HttpStatus.OK);
	
	}
	
	@PostMapping()
	public ResponseEntity <Tarjeta> guardar(@RequestBody TarjetasRequest request){
		
		Tarjeta tarjeta = service.guardar(request);
		return new ResponseEntity<Tarjeta>(tarjeta, HttpStatus.OK);
		
	}
	
	
	@PutMapping()
	public ResponseEntity <Tarjeta> editar(@RequestBody TarjetasRequest request){
		
		Tarjeta tarjeta = service.editar(request);
		return new ResponseEntity<Tarjeta>(tarjeta, HttpStatus.OK);
		
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity <String> eliminar(@PathVariable int id){
		
		String response = service.eliminar(id);
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	
	
	

}

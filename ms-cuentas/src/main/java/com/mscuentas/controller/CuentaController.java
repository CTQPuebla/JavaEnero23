package com.mscuentas.controller;

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
import com.mscuentas.logic.CuentasLogic;
import com.persistence.entity.Cuentas;
import com.persistence.request.CuentasRequest;

@RequestMapping("cuenta/")
@RestController
public class CuentaController {

	@Autowired
	CuentasLogic service;

	@GetMapping()
	public ResponseEntity<List<Cuentas>> mostrar() {

		List<Cuentas> cuentas = service.mostrarTodos();

		return new ResponseEntity<List<Cuentas>>(cuentas, HttpStatus.OK);

	}

	@GetMapping("buscar-por-id/{id}") //
	public ResponseEntity<Cuentas> buscar(@PathVariable int id) {

		Cuentas cuenta = service.buscar(id);

		return new ResponseEntity<Cuentas>(cuenta, HttpStatus.OK);

	}

	@PostMapping()
	public ResponseEntity<Cuentas> guardar(@RequestBody CuentasRequest request) {

		Cuentas cuenta = service.guardar(request);
		return new ResponseEntity<Cuentas>(cuenta, HttpStatus.OK);

	}

	@PutMapping()
	public ResponseEntity<Cuentas> editar(@RequestBody CuentasRequest request) {

		Cuentas cuenta = service.editar(request);
		return new ResponseEntity<Cuentas>(cuenta, HttpStatus.OK);

	}

	// http:localhost:8090/cliente/eliminar/30
	@DeleteMapping()
	public ResponseEntity<String> eliminar(@PathVariable int id) {

		String response = service.eliminar(id);
		return new ResponseEntity<String>(response, HttpStatus.OK);

	}

}

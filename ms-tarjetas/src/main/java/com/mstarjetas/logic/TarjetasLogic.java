package com.mstarjetas.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mstarjetas.service.TarjetasService;
import com.persistence.entity.Clientes;
import com.persistence.entity.Tarjeta;
import com.persistence.repository.ClienteRepository;
import com.persistence.repository.CuentasRepository;
import com.persistence.repository.TarjetasRepository;
import com.persistence.request.TarjetasRequest;



@Service
public class TarjetasLogic implements TarjetasService{

	
	
	@Autowired
	TarjetasRepository daot;
	
	
	
	
	@Override
	public Tarjeta guardar(TarjetasRequest request) {
		Tarjeta tarjeta = new Tarjeta();
		
		tarjeta.setTarjetaId(request.getTarjetaId());
		tarjeta.setNumTarjeta(request.getNumTarjeta());
		tarjeta.setNip(request.getNip());
		tarjeta.setCvv(request.getCvv());
		tarjeta.setVencimiento(request.getVencimiento());
		daot.save(tarjeta);
		return tarjeta;
	}

	@Override
	public Tarjeta editar(TarjetasRequest request) {
		Tarjeta tarjeta = daot.findById(request.getTarjetaId()).get();
		tarjeta.setTarjetaId(request.getTarjetaId());
		tarjeta.setNumTarjeta(request.getNumTarjeta());
		tarjeta.setNip(request.getNip());
		tarjeta.setCvv(request.getCvv());
		tarjeta.setVencimiento(request.getVencimiento());
		
		daot.save(tarjeta);
		return tarjeta;
	}

	@Override
	public Tarjeta buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(int id) {
		daot.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrarTodos() {
		return daot.findAll();
	}

	@Override
	public String desactivar(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tarjeta buscar(int id) {
		return daot.findById(id).get();
	}

}

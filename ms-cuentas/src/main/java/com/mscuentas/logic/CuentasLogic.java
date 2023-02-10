package com.mscuentas.logic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mscuentas.service.CuentasService;
import com.persistence.entity.Clientes;
import com.persistence.entity.Cuentas;
import com.persistence.entity.Tarjeta;
import com.persistence.repository.ClienteRepository;
import com.persistence.repository.CuentasRepository;
import com.persistence.request.CuentasRequest;




@Service
public class CuentasLogic implements CuentasService{

	
	@Autowired
	CuentasRepository repo;
	
	@Autowired
	ClienteRepository daoC;
	
	
	//RestTemplate
	RestTemplate client =new RestTemplate();
	
	@Override
	public Cuentas guardar(CuentasRequest request) {
		Cuentas cuenta = new Cuentas ();
		
		int tarjetaId=request.getTarjeta().getTarjetaId();
		//objeto extraido mediante un repository
		Clientes c= daoC.findById(request.getCliente().getClienteId()).get();
		//Objeto traido mediante la llamada a otro servicio
		Tarjeta t= client.getForObject("http://localhost:8093/tarjeta/buscar-por-id/"+tarjetaId,Tarjeta.class);
		cuenta.setCliente(c);
		cuenta.setClabe(request.getClabe());
		cuenta.setSaldo(request.getSaldo());
		cuenta.setTipo(request.getTipo());
		cuenta.setSaldo_min(request.getSaldo_min());
		cuenta.setSaldo_max(request.getSaldo_max());
		cuenta.setTarjeta(t);
		
		repo.save(cuenta);
		return cuenta;
	}

	@Override
	public Cuentas editar(CuentasRequest request) {
		Cuentas cuenta= new Cuentas();
		int tarjetaId=request.getTarjeta().getTarjetaId();
		Clientes c = daoC.findById(request.getCliente().getClienteId()).get();
		Tarjeta t= client.getForObject("http://localhost:8093/tarjetas/buscar-por-id/"+tarjetaId,Tarjeta.class);
		cuenta.setCliente(c);
		cuenta.setClabe(request.getClabe());
		cuenta.setSaldo(request.getSaldo());
		cuenta.setTipo(request.getTipo());
		cuenta.setSaldo_min(request.getSaldo_min());
		cuenta.setSaldo_max(request.getSaldo_max());
		cuenta.setTarjeta(t);
	
		
		repo.save(cuenta);
		return cuenta;
	}

	@Override
	public Cuentas buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrarTodos() {
		return repo.findAll();
	}

	@Override
	public String desactivar(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cuentas buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}

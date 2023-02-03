package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ClienteDAO;
import com.entity.Cliente;
import com.general.Status;

@Path ("cliente")

public class ClienteService {
	
	Cliente cliente = null;
	ClienteDAO dao = null;
	
	
	@Path ("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Cliente>mostrar(){
		dao =new ClienteDAO();
		List<Cliente> list = dao.mostrar();
		System.out.println("datos: " + list);
		return list;
		
	}
	
	@Path ("guardar")
	@POST
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	public Status guardar (Cliente c) {
		System.out.println("cliente a guardar: " +c);
		Status state = new Status ();
		state.setOb(c);
		
		dao = new ClienteDAO ();
		String res = dao.guardar(c);
		
		if (res.equals("1")) {
			state.setMensaje("Guardado exitosamente");
		}else {
			state.setMensaje("No fue psoble guardar");
			state.setRespuesta(res);
			
		}
		return state;
		
	}
	
	@Path ("eliminar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
public Status eliminar (@PathParam("id")int id) {
		Status state = new Status();
		state.setOb(id);
		
		dao= new ClienteDAO();
		String res = dao.eliminar(id);
		
		if (res.equals("1")) {
			state.setMensaje("Eliminando exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible elminar este registro");
			state.setRespuesta(res);
		}
		
		return state;
	}
	
	@Path ("editar")
	@POST
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	
	public Status editar (Cliente c) {
		
		Status state = new Status ();
		state.setOb(c);
		
		dao = new ClienteDAO ();
		String res = dao.editar(c);
		
		if (res.equals("1")) {
			state.setMensaje("Actualizado exitosamente");
		}else {
			state.setMensaje("No fue psoble actualizar este registro");
			state.setRespuesta(res);
			
		}
		return state;
	
}
	@Path ("buscar-por-id/{id}")
	@POST
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	public Cliente buscar (@PathParam("id") int id) {
		dao = new ClienteDAO();
		cliente = (Cliente) dao.buscar(id);
		System.out.println("Se encontró el registro");
		return cliente;
		
	}
}
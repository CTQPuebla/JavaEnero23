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
import com.entity.Clientes;
import com.general.Status;

@Path ("clientes/")
public class ClienteService {
	
	Clientes cliente = null;
	ClienteDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Clientes> mostar(){
		dao= new ClienteDAO();
		List<Clientes> list = dao.Mostar();
		System.out.println("datos:"+ list);
		
		return list;
		
	}
	
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Clientes c) {
		System.out.println("cliente a guardar "+ c);
		Status state = new Status();
		state.setOb(c);
		
		dao = new ClienteDAO();
		String res = dao.guardar(c);
		
		if(res.equals("1")) {
			state.setMensaje("Guardado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible guardar");
			state.setRespuesta(res);
		}
		
		return state;
	}
	
	@Path("eliminar/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Status eliminar(@PathParam("id")int id) {
		Status state = new Status();
		state.setOb(id);
		
		dao = new ClienteDAO();
		String res=dao.eliminr(id);
			
		
		if(res.equals("1")) {
			state.setMensaje("Eliminado Exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible eliminar este resgostro");
			state.setRespuesta(res);
		}
		
		return state;
	}
	@Path ("editar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Clientes c) {
		
		Status state = new Status();
		state.setOb(c);
		
		dao= new ClienteDAO();
		String res = dao.editar(c);
		
		if(res.equals("1")) {
			state.setMensaje("Actualizado correctamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No posble actualizar este registro");
			state.setRespuesta(res);
		}
		return state;
	}
	@Path("buscar-por-id/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Clientes buscar(@PathParam("id")int id) {
		dao = new ClienteDAO();
		cliente= (Clientes) dao.buscar(id);
		System.out.println("Se encontro el registro");
		return cliente;
	}
	
	
}

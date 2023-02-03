package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.dao.CuentasDAO;
import com.entity.Cuentas;
import com.general.Status;



//http://localhost:8085/jdbc_enq_web/cuentas/mostrar  GET
//HTTP://LOCALHOST:8095/jdbc_enq_web/cuentas/guardar POST  
@Path ("cuentas/")
public class CuentasService {

	Cuentas c = null;
	CuentasDAO dao = null;
	
	
	@POST
	@Path("guardar")
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	public Status guardar(Cuentas cuenta) {

		Status s = new Status();
		s.setOb(cuenta);
		dao = new CuentasDAO();

		String response = dao.guardar(cuenta);

		if (response.equals("1")) {

			s.setMensaje("ok");
			s.setRespuesta(response);

		} else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		return s;
	}
	
	
	@POST
	@Path("editar")
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	public Status editar(Cuentas cuenta) {

		Status s = new Status();
		s.setOb(cuenta);
		dao = new CuentasDAO();

		String response = dao.editar(cuenta);

		if (response.equals("1")) {

			s.setMensaje("ok");
			s.setRespuesta(response);

		} else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		return s;
	}
	
	
	@GET
	@Path("mostrar")
	@Produces ({MediaType.APPLICATION_JSON})
	public List<Cuentas> mostrar() {
		dao = new CuentasDAO();
		return dao.mostrar();
	}
	
	
	@GET
	@Path("buscar-por-id/{id}")
	@Produces ({MediaType.APPLICATION_JSON})
	public Cuentas buscar(@PathParam ("id") int id) {
		dao = new CuentasDAO();
		return (Cuentas) dao.buscar(id);
	}
	
	
	@GET
	@Path("eliminar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) {
		Status s = new Status();
		dao = new CuentasDAO();
		String response = dao.eliminar(id);
		if (response.equals("1")) {
			s.setMensaje("Error");
			s.setRespuesta(response);
		} else {
			s.setMensaje("error");
			s.setRespuesta(response);
		}
		return s;
	}

	
	
}

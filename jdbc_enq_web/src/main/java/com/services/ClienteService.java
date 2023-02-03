package com.services;


import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.dao.ClienteDAO;
import com.dto.ClienteCuentaDTO;
import com.dto.MovimientosDTO;
import com.entity.Cliente;
import com.general.Status;
import javax.ws.rs.core.MediaType;

//las operacion de lectura no necesitan un objeto con valores, solo necesitan un parámetro
//@produces indica que se va a devolver en formato json
//path para ejecutar mostrar
//HTTP://LOCALHOST:8085/jdbc_enq_web/cliente/mostrar  GET
//HTTP://LOCALHOST:8095/jdbc_enq_web/cliente/guardar POST  
@Path ("cliente/")
public class ClienteService {

	Cliente c = null;
	ClienteDAO dao = null;

	
	@POST
	@Path("guardar")
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	public Status guardar(Cliente cliente) {

		Status s = new Status();
		s.setOb(cliente);
		dao = new ClienteDAO();

		String response = dao.guardar(cliente);

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
	public Status editar(Cliente cliente) {

		Status s = new Status();
		s.setOb(cliente);
		dao = new ClienteDAO();

		String response = dao.editar(cliente);

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
	public List<Cliente> mostrar() {
		dao = new ClienteDAO();
		return dao.mostrar();
	}
	
	
	
	@GET
	@Path("listar-clientes-cuentas")
	@Produces ({MediaType.APPLICATION_JSON})
	public List<ClienteCuentaDTO> ClientesCuentas() {
		dao = new ClienteDAO();
		return dao.ClientesCuentas();
	}
	
	@GET
	@Path("movimientos")
	@Produces ({MediaType.APPLICATION_JSON})
	public List<MovimientosDTO> Movimientos() {
		dao = new ClienteDAO();
		return dao.Movimientos();
	}

	
	@GET
	@Path("buscar-por-id/{id}")
	@Produces ({MediaType.APPLICATION_JSON})
	public Cliente buscar(@PathParam ("id") int id) {
		dao = new ClienteDAO();
		return (Cliente) dao.buscar(id);
	}

	
	@GET
	@Path("eliminar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) {
		Status s = new Status();
		dao = new ClienteDAO();
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

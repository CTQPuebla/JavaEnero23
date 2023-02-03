package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Cliente;
import com.general.Metodos;

public class ClienteDAO implements Metodos{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em  = emf.createEntityManager();
	Cliente cliente = null;
	
	
	@Override
	public String guardar(Object ob) {
		cliente =(Cliente)ob;
		em.getTransaction().begin();
		String resultado= null;
		try {
			em.persist(cliente);
			em.getTransaction().commit();
			resultado="1";
			System.out.println("Registro insertado");
		}catch(Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close();
		return null;
	}

	@Override
	public String editar(Object ob) {
	cliente =(Cliente) ob;
	Cliente clientedb = em.find(Cliente.class, cliente.getClienteId());
	String r = null;
	em.getTransaction().begin();
	try {
		clientedb.setNombre(clientedb.getNombre());
		clientedb.setApellido(clientedb.getApellido());
		clientedb.setRfc(clientedb.getRfc());
		clientedb.setFechaNac(clientedb.getFechaNac());
		clientedb.setStatus(clientedb.getStatus());
		em.getTransaction().commit();
		System.out.println("Editado correctamente");
		r="1";
		
	}catch(Exception e) {
		em.getTransaction().rollback();
		System.out.println("No se pudo editar");
		r= e.getMessage();
	}
	
	return r;
	}

	@Override
	public String eliminar(int id) {
		String r =null;
		cliente =em.find(Cliente.class,id);
		em.getTransaction().begin();
		
		try {
			em.remove(cliente);
			em.getTransaction().commit();
			System.out.println("Seha eliminado el registro");
			r="1";
			
		}catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r= e.getMessage();
		}
		
		return null;
	}

	@Override
	public Object buscar(int id) {
		cliente= em.find(Cliente.class,id);
		
		return cliente;
	}

	@Override
	public List mostrar() {
		List<Cliente> ls = em.createQuery("fromCliente").getResultList();
		return ls;
	}

	
}

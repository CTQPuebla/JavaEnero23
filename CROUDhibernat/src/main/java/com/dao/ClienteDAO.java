package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Clientes;
import com.general.Metodos;

public class ClienteDAO implements Metodos  {
	//carga los objetos (las clases definidaa en el  persistentes )
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Tables");
	//caraga todad las operaciones (insert, ubdate, delete, select, contar, etc.)
	EntityManager em = emf.createEntityManager();
	Clientes cliente = null;

	@Override
	public String guardar(Object ob) {
		cliente = (Clientes) ob;
		
		String resultado = null;
		em.getTransaction().begin();
		try {
			em.persist(cliente);
			em.getTransaction().commit();
			resultado ="1";
			System.out.println("Registro Insertado");

		}catch(Exception ex){
			em.getTransaction().rollback();
			resultado = ex.getMessage();
			System.out.println("No se pudo Insertar");	
		}
		
		em.close();
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		cliente = (Clientes) ob;
		Clientes clientedb = em.find(Clientes.class, cliente.getClienteId());
		String r=null;
		
		em.getTransaction().begin();
		
		try {
			clientedb.setNombre(cliente.getNombre());
			clientedb.setApellidos(cliente.getApellidos());
			clientedb.setRfc(cliente.getRfc());
			clientedb.setFechaNac(cliente.getFechaNac());
			clientedb.setStatus(cliente.getStatus());
			em.getTransaction().commit();
			System.out.println("Editado Correctamente");
			r="1";

		}catch(Exception ex){
			em.getTransaction().rollback();
			System.out.println("No se puede Editar");
			r=ex.getMessage();
			
		}
		
		return r;
	}

	@Override
	public String eliminr(int id) {
		String r =null;
		cliente = em.find(Clientes.class, id);
		em.getTransaction().begin();
		
		try {
			em.remove(cliente);
			em.getTransaction().commit();
			System.out.println("Se ha Elimindao el Registro");
			r="1";
		}catch(Exception ex) {
			em.getTransaction().rollback();
			System.out.println("No se puede Eliminar");
			r= ex.getMessage();
			
		}
		
		
		return r;
	}

	@Override
	public Object buscar(int id) {
		cliente = em.find(Clientes.class, id);
		
		return cliente;
	}

	@Override
	public List Mostar() {
		List <Clientes> ls = em.createQuery("from Clientes").getResultList();
		return ls;
	}

}

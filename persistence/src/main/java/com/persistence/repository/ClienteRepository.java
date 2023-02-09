package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Clientes;



//Esta interface hereda la funcionalidad de Spring Data Jpa
//Solo necesita que le indiques con que modelo trabajará
//
//esta interfaz no trabaja con numeros primitivos por eso se pone Integer
// hay que poner el tipo de dato que tiene el @Id de la clase entity
//Esro es basicamente un dao
//para dar el rol de dao se usa @Repository

@Repository
public interface ClienteRepository extends JpaRepository<Clientes,Integer>{
	
	
	@Query("SELECT c from Clientes c WHERE c.nombre=:name")//permite darle implementacion a un metodo. la anotacion @Query utiliza el pseudolenguaje jpql: Java Persistence Query Lenguaje
	Clientes findByName(@Param("name")String name);
	
	
	@Modifying
	@Query ("UPDATE Clientes c SET c.status = 0 WHERE c.nombre=:name")//c es un objeto
	void disabled (@Param("name")String name);

}

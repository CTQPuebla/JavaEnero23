package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Tarjeta;

@Repository
public interface TarjetasRepository extends JpaRepository<Tarjeta,Integer>{
	
	
	

}

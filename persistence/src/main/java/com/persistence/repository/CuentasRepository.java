package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Cuentas;



@Repository
public interface CuentasRepository extends JpaRepository<Cuentas,Integer>{
	
	

}

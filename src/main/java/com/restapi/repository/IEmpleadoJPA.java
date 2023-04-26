package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.model.Empleado;

@Repository
public interface IEmpleadoJPA extends JpaRepository<Empleado,Long> {
    
}

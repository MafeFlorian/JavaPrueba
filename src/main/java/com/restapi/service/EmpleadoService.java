package com.restapi.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.restapi.dto.EmpleadoDto;
import com.restapi.model.Empleado;
import com.restapi.repository.IEmpleadoJPA;

@Service
@Validated
public class EmpleadoService implements IEmpleadoService{

    @Autowired
    private IEmpleadoJPA empleadoJPA;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public EmpleadoDto create(EmpleadoDto empleado) {

        Empleado empleadoEntity = modelMapper.map(empleado, Empleado.class);
        empleadoEntity = empleadoJPA.save(empleadoEntity);

        return modelMapper.map(empleadoEntity, EmpleadoDto.class);
    }
    
}

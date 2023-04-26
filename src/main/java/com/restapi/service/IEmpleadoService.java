package com.restapi.service;

import com.restapi.dto.EmpleadoDto;

import jakarta.validation.Valid;

public interface IEmpleadoService {
    public EmpleadoDto create(@Valid EmpleadoDto empleado);
}

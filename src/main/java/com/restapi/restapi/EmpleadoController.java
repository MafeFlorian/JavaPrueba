package com.restapi.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.dto.EmpleadoDto;
import com.restapi.service.IEmpleadoService;

@RestController
@RequestMapping("/api/employes")
public class EmpleadoController {
    @Autowired
    private IEmpleadoService empleadoService;
    @GetMapping("/restapi")
    public String rest_api(){
        return "Welcome to the jungle";
    }

    @PostMapping("/new")
    public EmpleadoDto newEmpleado(@RequestBody EmpleadoDto empleado){
        return empleadoService.create(empleado);
    }

}

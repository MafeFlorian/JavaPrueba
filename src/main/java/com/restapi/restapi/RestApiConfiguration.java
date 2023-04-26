package com.restapi.restapi;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.restapi.service.EmpleadoService;

@Configuration
public class RestApiConfiguration {
    
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    @Bean
    public EmpleadoService empleadoService(){
        return new EmpleadoService();
    }

}

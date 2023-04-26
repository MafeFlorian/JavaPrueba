package com.restapi.dto;

import java.util.Date;
import java.util.Calendar;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EmpleadoDto {
    private Long id;
    @NotBlank
    @Size(max=25)
    private String nombres;
    @NotBlank
    @Size(max=25)
    private String apellidos;
    @NotBlank
    @Size(max=25)
    private String tipoDocumento;
    @NotBlank
    @Size(max=25)
    private String numeroDocumento;
    private Date fechaNacimiento;
    private Date fechaVinculacion;
    @NotBlank
    @Size(max=25)
    private String cargo;
    private Double salario;

    private String tiempoVinculacion;
    private String edad;

    
    public EmpleadoDto() {
    }

    public EmpleadoDto(Long id, String nombres, String apellidos, String tipoDocumento, String numeroDocumento,
            Date fechaNacimiento, Date fechaVinculacion, String cargo, Double salario) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaVinculacion = fechaVinculacion;
        this.cargo = cargo;
        
        Calendar today = Calendar.getInstance();
        today.setTime(new Date());
        Calendar calendarEdad = Calendar.getInstance();
        calendarEdad.setTime(fechaNacimiento);
        this.edad =  (today.get(Calendar.YEAR) - calendarEdad.get(Calendar.YEAR))+ " años " +
        (today.get(Calendar.MONTH) - calendarEdad.get(Calendar.MONTH)) + " meses " + 
        (today.get(Calendar.DAY_OF_MONTH) - calendarEdad.get(Calendar.DAY_OF_MONTH)) + " dias ";

        Calendar calendarVinculacion = Calendar.getInstance();
        calendarVinculacion.setTime(fechaVinculacion);
        this.edad =  (today.get(Calendar.YEAR) - calendarVinculacion.get(Calendar.YEAR))+ " años " +
        (today.get(Calendar.MONTH) - calendarVinculacion.get(Calendar.MONTH)) + " meses ";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}

package com.proyectoIntegrador.consultorioOdontologico.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;

import java.time.LocalDate;


public class TurnoDTO {
    @JsonProperty(index = 1)
    private Integer id;
    private Paciente paciente;
    private Odontologo odontologo;
    @JsonProperty(index = 2)
    private LocalDate fecha;

    @Override
    public String toString() {
        return "Turno{" +
                "Id=" + id +
                ", paciente=" + paciente +
                ", odontologo=" + odontologo +
                ", fecha=" + fecha +
                '}';
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}

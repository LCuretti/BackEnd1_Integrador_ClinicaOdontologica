package com.proyectoIntegrador.consultorioOdontologico.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="turnos")
public class Turno {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name="paciente_id", nullable = false)
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(name="odontologo_id", nullable = false)
    private Odontologo odontologo;
    private Date fecha;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}

package com.proyectoIntegrador.consultorioOdontologico.entity;

public class Odontologo {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer matricula;

    @Override
    public String toString() {
        return "Odontologo{" +
                "ID=" + id +
                ", Nombre=" + nombre +
                ", Apellido=" + apellido +
                ", Matricula=" + matricula +
                '}';
    }

    public Odontologo(Integer id, String nombre, String apellido, Integer matricula) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public Odontologo(String nombre, String apellido, Integer matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public Odontologo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}

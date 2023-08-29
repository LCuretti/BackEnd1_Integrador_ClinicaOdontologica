package com.proyectoIntegrador.consultorioOdontologico.entity;

public class Odontologo {
    private int id;
    private String matricula;
    private String nombre;
    private String apellido;

    @Override
    public String toString() {
        return "Odontologo{" +
                "ID=" + id +
                ", Matricula=" + matricula +
                ", Nombre=" + nombre +
                ", Apellido=" + apellido +
                '}';
    }

    public Odontologo(int id, String matricula, String nombre, String apellido) {
        this.id = id;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
}

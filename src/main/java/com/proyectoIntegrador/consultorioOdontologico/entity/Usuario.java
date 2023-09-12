package com.proyectoIntegrador.consultorioOdontologico.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    private int id;

    private String nombre;

    private String username;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UsuarioRoleEnum rol;

}

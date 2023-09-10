package com.proyectoIntegrador.consultorioOdontologico.service;


import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;

import java.util.List;


public interface IOdontologoService {
    void agregarOdontologo(Odontologo odontologo);
    Odontologo leerOdontologo(Integer id);
    void modificarOdontologo(Odontologo odontologo);
    void eliminarOdontologo(Integer id);
    List<Odontologo> listarOdontologos();

}


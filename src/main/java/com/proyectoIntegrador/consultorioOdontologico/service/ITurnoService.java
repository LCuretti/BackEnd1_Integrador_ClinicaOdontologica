package com.proyectoIntegrador.consultorioOdontologico.service;


import com.proyectoIntegrador.consultorioOdontologico.entity.Turno;

import java.util.List;


public interface ITurnoService {
    void agregarTurno(Turno turno);
    Turno leerTurno(Integer id);
    void modificarTurno(Turno turno);
    void eliminarTurno(Integer id);
    List<Turno> listarTurnos();
}

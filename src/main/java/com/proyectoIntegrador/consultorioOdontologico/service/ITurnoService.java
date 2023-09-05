package com.proyectoIntegrador.consultorioOdontologico.service;

import com.proyectoIntegrador.consultorioOdontologico.dto.TurnoDTO;
import java.util.Set;

public interface ITurnoService {
    void agregarTurno(TurnoDTO turnoDTO);
    TurnoDTO leerTurno(Integer id);
    void modificarTurno(TurnoDTO turnoDTO);
    void eliminarTurno(Integer id);
    Set<TurnoDTO> listarTurnos();
}

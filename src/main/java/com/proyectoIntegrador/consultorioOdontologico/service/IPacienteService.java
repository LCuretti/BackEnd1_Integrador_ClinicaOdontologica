package com.proyectoIntegrador.consultorioOdontologico.service;

import com.proyectoIntegrador.consultorioOdontologico.dto.PacienteDTO;

import java.util.Set;

public interface IPacienteService {
    void agregarPaciente(PacienteDTO pacienteDTO);
    PacienteDTO leerPaciente(Integer id);
    void modificarPaciente(PacienteDTO pacienteDTO);
    void eliminarPaciente(Integer id);
    Set<PacienteDTO> listarPacientes();

}

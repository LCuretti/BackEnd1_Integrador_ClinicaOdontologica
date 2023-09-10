package com.proyectoIntegrador.consultorioOdontologico.service;


import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;

import java.util.List;


public interface IPacienteService {
    void agregarPaciente(Paciente paciente);
    Paciente leerPaciente(Integer id);
    void modificarPaciente(Paciente paciente);
    void eliminarPaciente(Integer id);
    List<Paciente> listarPacientes();

}

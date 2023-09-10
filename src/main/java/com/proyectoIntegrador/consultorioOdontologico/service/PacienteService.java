package com.proyectoIntegrador.consultorioOdontologico.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyectoIntegrador.consultorioOdontologico.repository.IPacienteRepository;


import java.util.List;
import java.util.Optional;



@Service
public class PacienteService implements IPacienteService{
    @Autowired
    private IPacienteRepository pacienteRepository;
    @Autowired
    ObjectMapper mapper;

    @Override
    public void agregarPaciente(Paciente paciente) {

        pacienteRepository.save(paciente);
    }

    @Override
    public Paciente leerPaciente(Integer id) {
        Optional<Paciente> respuesta = pacienteRepository.findById(id);

        Paciente paciente = null;
        if(respuesta.isPresent())
            paciente = mapper.convertValue(respuesta, Paciente.class);
        return paciente;
    }

    @Override
    public void modificarPaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @Override
    public void eliminarPaciente(Integer id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public List<Paciente> listarPacientes() {
        List<Paciente> pacientes= pacienteRepository.findAll();

        return pacientes;
    }
}

package com.proyectoIntegrador.consultorioOdontologico.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import com.proyectoIntegrador.consultorioOdontologico.entity.Turno;
import com.proyectoIntegrador.consultorioOdontologico.util.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyectoIntegrador.consultorioOdontologico.repository.IPacienteRepository;


import java.time.LocalDate;
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
        paciente.setFechaIngreso(LocalDate.now());
        pacienteRepository.save(paciente);
    }

    @Override
    public Paciente leerPaciente(Integer id) {
        Optional<Paciente> respuesta = pacienteRepository.findById(id);

        Paciente paciente = null;
        if(!respuesta.isPresent()) {
            throw new ResourceNotFoundException(id.toString(), "Paciente Id");
        }
        paciente = mapper.convertValue(respuesta, Paciente.class);
        return paciente;
    }

    @Override
    public void modificarPaciente(Paciente paciente) {
        Optional<Paciente> respuesta = pacienteRepository.findById(paciente.getId());
        if(!respuesta.isPresent()){
            throw new ResourceNotFoundException(paciente.getId().toString(), "Paciente Id"); // evita crear otro registro en caso de que no exista
        }
        pacienteRepository.save(paciente);

    }

    @Override
    public void eliminarPaciente(Integer id) {

        if (!pacienteRepository.existsById(id)) throw new ResourceNotFoundException(id.toString(), "Paciente Id");
        pacienteRepository.deleteById(id);
    }

    @Override
    public List<Paciente> listarPacientes() {
        List<Paciente> pacientes= pacienteRepository.findAll();

        return pacientes;
    }
}

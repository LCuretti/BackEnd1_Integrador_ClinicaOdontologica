package com.proyectoIntegrador.consultorioOdontologico.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectoIntegrador.consultorioOdontologico.dto.CrearPacienteDTO;
import com.proyectoIntegrador.consultorioOdontologico.dto.PacienteDTO;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import com.proyectoIntegrador.consultorioOdontologico.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    IPacienteService pacienteService;

    @Autowired
    ObjectMapper mapper;
    @PostMapping
    public ResponseEntity<?> agregarPaciente(@RequestBody CrearPacienteDTO pacienteDTO){
        pacienteService.agregarPaciente(mapper.convertValue(pacienteDTO, Paciente.class));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public PacienteDTO leerPaciente(@PathVariable Integer id){
        Paciente paciente = pacienteService.leerPaciente(id);
        PacienteDTO pacienteDTO = null;
        if (paciente != null){
            pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);
        }
        return pacienteDTO;
    }

    @PutMapping
    public ResponseEntity<?> modificarPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.modificarPaciente(mapper.convertValue(pacienteDTO, Paciente.class));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable Integer id){
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<PacienteDTO> listarPacientes(){

        List<Paciente> pacientes = pacienteService.listarPacientes();

        Set<PacienteDTO> pacientesDTO = new HashSet<>();
        for(Paciente paciente: pacientes){
            pacientesDTO.add(mapper.convertValue(paciente, PacienteDTO.class));
        }
        return pacientesDTO;
    }

}

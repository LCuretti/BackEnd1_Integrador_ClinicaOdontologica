package com.proyectoIntegrador.consultorioOdontologico.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectoIntegrador.consultorioOdontologico.GlobalExceptionHandler;
import com.proyectoIntegrador.consultorioOdontologico.dto.CrearTurnoDTO;
import com.proyectoIntegrador.consultorioOdontologico.dto.TurnoDTO;
import com.proyectoIntegrador.consultorioOdontologico.entity.Turno;
import com.proyectoIntegrador.consultorioOdontologico.service.ITurnoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    private static final Logger logger = Logger.getLogger(TurnoController.class);
    @Autowired
    ITurnoService turnoService;
    @Autowired
    ObjectMapper mapper;

    @PostMapping
    public ResponseEntity<?> agregarTurno(@RequestBody CrearTurnoDTO turnoDTO){
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoService.agregarTurno(turno);
        logger.info("Agregando el turno con Id: " + turno.getId() + " del paciente id " + turno.getPaciente().getId() + " del odontólogo id " + turno.getOdontologo().getId());
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public TurnoDTO leerTurno(@PathVariable Integer id){
        Turno turno = turnoService.leerTurno(id);
        TurnoDTO turnoDTO = null;
        if (turno != null){
            turnoDTO = mapper.convertValue(turno, TurnoDTO.class);
        }
        logger.info("Buscando turno: " + turnoDTO);
        return turnoDTO;
    }

    @PutMapping
    public ResponseEntity<?> modificarTurno(@RequestBody TurnoDTO turnoDTO){
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoService.modificarTurno(turno);
        logger.info("Modificando el siguiente turno: " + turnoDTO.getId() + " del paciente id " + turnoDTO.getPaciente().getId() + " del odontólogo id " + turnoDTO.getOdontologo().getId());
        return ResponseEntity.ok(HttpStatus.OK);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Integer id){
        turnoService.eliminarTurno(id);
        logger.info("Eliminando turno con id: " + id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<TurnoDTO> listarTurnos(){
        logger.info("Listando y buscando todos los turnos");
        List<Turno> turnos = turnoService.listarTurnos();
        Set<TurnoDTO> turnosDTO = new HashSet<>();
        for (Turno turno: turnos){
            turnosDTO.add(mapper.convertValue(turno, TurnoDTO.class));
        }
        return turnosDTO;
    }

}

package com.proyectoIntegrador.consultorioOdontologico.controller;


import com.proyectoIntegrador.consultorioOdontologico.GlobalExceptionHandler;
import com.proyectoIntegrador.consultorioOdontologico.dto.TurnoDTO;
import com.proyectoIntegrador.consultorioOdontologico.service.ITurnoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    private static final Logger logger = Logger.getLogger(TurnoController.class);
    @Autowired
    ITurnoService turnoService;

    @PostMapping
    public ResponseEntity<?> agregarTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.agregarTurno(turnoDTO);
        logger.info("Agregando el siguiente turno: " + turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public TurnoDTO leerTurno(@PathVariable Integer id){

        TurnoDTO turno = turnoService.leerTurno(id);
        logger.info("Buscando turno: " + turno);
        return turno;
    }

    @PutMapping
    public ResponseEntity<?> modificarTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.modificarTurno(turnoDTO);
        logger.info("Modificando el siguiente turno: " + turnoDTO);
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
        logger.info("Buscando todos los turnos");
        return turnoService.listarTurnos();
    }
}

package com.proyectoIntegrador.consultorioOdontologico.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectoIntegrador.consultorioOdontologico.dto.CrearOdontologoDTO;
import com.proyectoIntegrador.consultorioOdontologico.dto.OdontologoDTO;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.service.IOdontologoService;
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
@RequestMapping("/odontologos")
public class OdontologoController {

    private static final Logger logger = Logger.getLogger(OdontologoController.class);
    @Autowired
    IOdontologoService odontologoService;
    @Autowired
    ObjectMapper mapper;
    @PostMapping
    public ResponseEntity<?> agregarOdontologo(@RequestBody CrearOdontologoDTO odontologoDTO){
        odontologoService.agregarOdontologo(mapper.convertValue(odontologoDTO, Odontologo.class));
        logger.info("Agregando el siguiente odontólogo: " + odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public OdontologoDTO leerOdontologo(@PathVariable Integer id){
        Odontologo odontologo = odontologoService.leerOdontologo(id);
        OdontologoDTO odontologoDTO = null;
        if (odontologo != null){
            odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);
        }
        logger.info("Buscando Odontólogo: " + odontologoDTO);
        return odontologoDTO;
    }

    @PutMapping
    public ResponseEntity<?> modificarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoService.modificarOdontologo(odontologo);
        logger.info("Modificando el siguiente odontólogo: " + odontologo);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Integer id){
        odontologoService.eliminarOdontologo(id);
        logger.info("Borrando el Odontólogo con el ID: " + id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<OdontologoDTO> listarOdontolos(){
        logger.info("Buscando todos los Odontólogos");
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        Set<OdontologoDTO> odontologosDTO = new HashSet<>();
        for (Odontologo odontologo: odontologos){
            odontologosDTO.add(mapper.convertValue(odontologo,OdontologoDTO.class));
        }

        return odontologosDTO;
    }

}

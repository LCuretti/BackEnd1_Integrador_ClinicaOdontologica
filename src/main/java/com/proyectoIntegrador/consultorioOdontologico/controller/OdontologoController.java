package com.proyectoIntegrador.consultorioOdontologico.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectoIntegrador.consultorioOdontologico.dto.CrearOdontologoDTO;
import com.proyectoIntegrador.consultorioOdontologico.dto.OdontologoDTO;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.service.IOdontologoService;
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

    @Autowired
    IOdontologoService odontologoService;
    @Autowired
    ObjectMapper mapper;
    @PostMapping
    public ResponseEntity<?> agregarOdontologo(@RequestBody CrearOdontologoDTO odontologoDTO){

        odontologoService.agregarOdontologo(mapper.convertValue(odontologoDTO, Odontologo.class));
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public OdontologoDTO leerOdontologo(@PathVariable Integer id){
        Odontologo odontologo = odontologoService.leerOdontologo(id);
        OdontologoDTO odontologoDTO = null;
        if (odontologo != null){
            odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);
        }
        return odontologoDTO;
    }

    @PutMapping
    public ResponseEntity<?> modificarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.modificarOdontologo(mapper.convertValue(odontologoDTO, Odontologo.class));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Integer id){
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<OdontologoDTO> listarOdontolos(){
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        Set<OdontologoDTO> odontologosDTO = new HashSet<>();
        for (Odontologo odontologo: odontologos){
            odontologosDTO.add(mapper.convertValue(odontologo,OdontologoDTO.class));
        }
        return odontologosDTO;
    }

}

package com.proyectoIntegrador.consultorioOdontologico.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import com.proyectoIntegrador.consultorioOdontologico.repository.IOdontologoRepository;

import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OdontologoService implements IOdontologoService{
    @Autowired
    private IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void agregarOdontologo(Odontologo odontologo) {
        odontologoRepository.save(odontologo);
    }

    @Override
    public Odontologo leerOdontologo(Integer id) {
        Optional<Odontologo> respuesta = odontologoRepository.findById(id);
        Odontologo odontologo = null;
        if(respuesta.isPresent())
            odontologo = mapper.convertValue(respuesta, Odontologo.class);
        return odontologo;
    }

    @Override
    public void modificarOdontologo(Odontologo odontologo){
        Optional<Odontologo> respuesta = odontologoRepository.findById(odontologo.getId());
        if(respuesta.isPresent()){
            odontologoRepository.save(odontologo); // evita crear otro registro en caso de que no exista
        }


    }

    @Override
    public void eliminarOdontologo(Integer id) {
        odontologoRepository.deleteById(id);
    }

    @Override
    public List<Odontologo> listarOdontologos() {
        List<Odontologo> odontologos= odontologoRepository.findAll();
        return odontologos;

    }
}

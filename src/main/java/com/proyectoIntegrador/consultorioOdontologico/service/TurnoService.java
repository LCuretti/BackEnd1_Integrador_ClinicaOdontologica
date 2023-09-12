package com.proyectoIntegrador.consultorioOdontologico.service;

import com.fasterxml.jackson.databind.ObjectMapper;

<<<<<<< HEAD

=======
import com.proyectoIntegrador.consultorioOdontologico.controller.OdontologoController;
>>>>>>> github/main
import com.proyectoIntegrador.consultorioOdontologico.entity.Turno;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyectoIntegrador.consultorioOdontologico.repository.ITurnoRepository;

import java.util.List;
import java.util.Optional;



@Service
public class TurnoService implements ITurnoService{

    private static final Logger logger = Logger.getLogger(TurnoService.class);
    @Autowired
    private ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void agregarTurno(Turno turno) {
        logger.info("El Service agregó turno: " + turno);
        turnoRepository.save(turno);
    }

    @Override
    public Turno leerTurno(Integer id) {
        Optional<Turno> respuesta = turnoRepository.findById(id);
        Turno turno = null;
        if(respuesta.isPresent())
            turno = mapper.convertValue(respuesta, Turno.class);
        return turno;
    }

    @Override
    public void modificarTurno(Turno turno) {

        turnoRepository.save(turno);
    }

    @Override
    public void eliminarTurno(Integer id) {
        turnoRepository.deleteById(id);
    }

    @Override
    public List<Turno> listarTurnos() {
        List<Turno> turnos= turnoRepository.findAll();
        logger.info("Listando todos los turnos");
        return turnos;
    }

}

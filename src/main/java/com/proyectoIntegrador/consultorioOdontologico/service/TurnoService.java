package com.proyectoIntegrador.consultorioOdontologico.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import com.proyectoIntegrador.consultorioOdontologico.entity.Turno;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyectoIntegrador.consultorioOdontologico.repository.ITurnoRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
public class TurnoService implements ITurnoService{

    private static final Logger logger = Logger.getLogger(TurnoService.class);
    @Autowired
    private ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private OdontologoService odontologoService;


    @Override
    public void agregarTurno(Turno turno) {
        guardarTurno(turno);

    }

    private void guardarTurno(Turno turno){
        Integer odontologoId = turno.getOdontologo().getId();
        Integer pacienteId = turno.getPaciente().getId();

        boolean permitido = true;
        List<Turno> turnos= turnoRepository.findAll();
        if (turnos != null){
            for (Turno t: turnos){
                if (t.getOdontologo().getId() == odontologoId){
                    if (t.getFecha().isEqual(turno.getFecha())){
                        permitido = false;
                    }
                }
            }

        }
        if (permitido) {

            turnoRepository.save(turno);
        }
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
        Optional<Turno> respuesta = turnoRepository.findById(turno.getId());
        if(respuesta.isPresent()){
            guardarTurno(turno); // evita crear otro registro en casod e que no exista
        }

    }

    @Override
    public void eliminarTurno(Integer id) {
        turnoRepository.deleteById(id);
    }

    @Override
    public List<Turno> listarTurnos() {
        List<Turno> turnos= turnoRepository.findAll();
        return turnos;
    }

}

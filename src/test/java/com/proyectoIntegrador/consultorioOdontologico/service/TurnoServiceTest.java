package com.proyectoIntegrador.consultorioOdontologico.service;

import com.proyectoIntegrador.consultorioOdontologico.entity.Domicilio;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import com.proyectoIntegrador.consultorioOdontologico.entity.Turno;
import com.proyectoIntegrador.consultorioOdontologico.util.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TurnoServiceTest {

    @Autowired
    private PacienteService pacienteService;
    private Paciente paciente;
    @Autowired
    private OdontologoService odontologoService;
    private Odontologo odontologo;

    @Autowired
    private TurnoService turnoService;
    private Turno turno;

    @BeforeEach
    public void setUp() {
        paciente = new Paciente();
        paciente.setNombre("Francisco");
        paciente.setApellido("Pelayes");
        paciente.setDni("3546488");
        paciente.setFechaIngreso(LocalDate.now());
        paciente.setDomicilio(new Domicilio("Sarmiento","1234","Godoy Cruz","San juan"));
        odontologo = new Odontologo();
        odontologo.setNombre("Francisco");
        odontologo.setApellido("Pelayes");
        odontologo.setMatricula(6488);
        pacienteService.agregarPaciente(paciente);
        List<Paciente> pacientes = pacienteService.listarPacientes();
        Paciente paciente1 = pacientes.get(0);
        odontologoService.agregarOdontologo(odontologo);
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        Odontologo odontologo1 = odontologos.get(0);
        turno = new Turno();
        turno.setOdontologo(odontologo1);
        turno.setPaciente(paciente1);
        turno.setFecha(LocalDate.now());
    }


    @Test
    void eliminarTurno() {

        turnoService.agregarTurno(turno);
        List<Turno> turnos = turnoService.listarTurnos();
        Turno turno1 = turnos.get(0);
        turnoService.eliminarTurno(turno1.getId());
        assertThrows(ResourceNotFoundException.class, () -> turnoService.leerTurno(turno1.getId()));

    }

    @Test
    void leerTurno() {
        turnoService.agregarTurno(turno);
        List<Turno> turnos = turnoService.listarTurnos();
        Turno turno1 = turnos.get(0);
        Turno turnoBuscado = turnoService.leerTurno(turno1.getId());
        assertEquals(turno1.getId(), turnoBuscado.getId());
    }

    @Test
    void modificarTurno() {
        turnoService.agregarTurno(turno);
        List<Turno> turnos = turnoService.listarTurnos();
        Turno turno1 = turnos.get(0);
        Turno turnoModificado = turnoService.leerTurno(turno1.getId());
        turnoModificado.setFecha(LocalDate.now().plusDays(1));
        turnoService.modificarTurno(turnoModificado);
        assertEquals(turnoService.leerTurno(turno1.getId()).getFecha(), turnoModificado.getFecha());
    }

}






package com.proyectoIntegrador.consultorioOdontologico.service;

import com.proyectoIntegrador.consultorioOdontologico.entity.Domicilio;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import com.proyectoIntegrador.consultorioOdontologico.util.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest

class PacienteServiceTest {

    @Autowired
    private PacienteService pacienteService;
    private Paciente paciente;

    @BeforeEach
    public void setUp() {
        paciente = new Paciente();
        paciente.setNombre("Francisco");
        paciente.setApellido("Pelayes");
        paciente.setDni("3546488");
        paciente.setFechaIngreso(LocalDate.now());
        paciente.setDomicilio(new Domicilio("Sarmiento","1234","Godoy Cruz","San juan"));
    }

    @Test
    void eliminarPaciente() throws Exception {
        pacienteService.agregarPaciente(paciente);
        List<Paciente> pacientes = pacienteService.listarPacientes();
        Paciente paciente1 = pacientes.get(0);
        pacienteService.eliminarPaciente(paciente1.getId());
        assertThrows(ResourceNotFoundException.class, () -> pacienteService.leerPaciente(paciente1.getId()));
    }

    @Test
    void leerPaciente() {
        pacienteService.agregarPaciente(paciente);
        List<Paciente> pacientes = pacienteService.listarPacientes();
        Paciente paciente1 = pacientes.get(0);
        Paciente pacienteBuscado = pacienteService.leerPaciente(paciente1.getId());
        assertEquals(paciente1.getNombre(), pacienteBuscado.getNombre());
    }

    @Test
    void modificarPaciente() {
        pacienteService.agregarPaciente(paciente);
        List<Paciente> pacientes = pacienteService.listarPacientes();
        Paciente paciente1 = pacientes.get(0);
        Paciente pacienteBuscado = pacienteService.leerPaciente(paciente1.getId());
        pacienteBuscado.setNombre("Juan");
        pacienteBuscado.setApellido("López");
        pacienteService.modificarPaciente(pacienteBuscado);
        assertEquals(pacienteService.leerPaciente(paciente1.getId()).getNombre(), pacienteBuscado.getNombre());
    }
}
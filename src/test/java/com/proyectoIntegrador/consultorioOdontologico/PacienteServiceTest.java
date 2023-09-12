package com.proyectoIntegrador.consultorioOdontologico;


import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import com.proyectoIntegrador.consultorioOdontologico.service.IPacienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PacienteServiceTest {

    @Autowired
    private IPacienteService pacienteService;

    @Test
    public void testAgregarPaciente(){

        Paciente paciente = new Paciente();
        paciente.setNombre("Raul");
        paciente.setApellido("Perez");
        pacienteService.agregarPaciente(paciente);
        Paciente pacienteRaul = pacienteService.leerPaciente(1);
        assertTrue(pacienteRaul != null);
    }
    @Test
    public void testModificarPaciente(){

        Paciente paciente = new Paciente();
        paciente.setNombre("Jorge");
        paciente.setApellido("Benitez");
        pacienteService.modificarPaciente(paciente);
        Paciente pacienteJorge = pacienteService.leerPaciente(1);
        assertTrue(pacienteJorge != null);
    }
}
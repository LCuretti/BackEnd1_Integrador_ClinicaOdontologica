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
        Paciente pacienteRaul = pacienteService.leerPaciente(5);
        assertTrue(pacienteRaul != null);
    }

}

package com.proyectoIntegrador.consultorioOdontologico;


import com.proyectoIntegrador.consultorioOdontologico.dto.PacienteDTO;
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

        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setNombre("Raul");
        pacienteDTO.setApellido("Perez");
        pacienteService.agregarPaciente(pacienteDTO);
        PacienteDTO pacienteRaul = pacienteService.leerPaciente(1);
        assertTrue(pacienteRaul != null);
    }
}
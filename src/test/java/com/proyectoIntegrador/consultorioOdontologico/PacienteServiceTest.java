package com.proyectoIntegrador.consultorioOdontologico;


import com.proyectoIntegrador.consultorioOdontologico.controller.OdontologoController;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.service.IOdontologoService;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import com.proyectoIntegrador.consultorioOdontologico.service.IPacienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    private IOdontologoService odontologoService;


    @Test
    public void testAgregarOdontologo(){

        Odontologo odontologo = new Odontologo();
        odontologo.setNombre("Raul");
        odontologo.setApellido("Perez");
        odontologo.setMatricula(5646546);
        odontologoService.agregarOdontologo(odontologo);
        Odontologo odontologoRaul = odontologoService.leerOdontologo(5);
        assertTrue(odontologoRaul != null);
    }
}
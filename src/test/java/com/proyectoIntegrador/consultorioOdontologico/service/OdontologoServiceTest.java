package com.proyectoIntegrador.consultorioOdontologico.service;

import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import com.proyectoIntegrador.consultorioOdontologico.util.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class OdontologoServiceTest {

    @Autowired
    private OdontologoService odontologoService;
    private Odontologo odontologo;

    @BeforeEach
    public void setUp() {
        odontologo = new Odontologo();
        odontologo.setNombre("Francisco");
        odontologo.setApellido("Pelayes");
        odontologo.setMatricula(6488);
    }

    @Test
    void eliminarOdontologo() throws Exception {
        odontologoService.agregarOdontologo(odontologo);
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        Odontologo odontologo1 = odontologos.get(0);
        odontologoService.eliminarOdontologo(odontologo1.getId());
        assertThrows(ResourceNotFoundException.class, () -> odontologoService.leerOdontologo(odontologo1.getId()));
    }

    @Test
    void leerOdontologo() {
        odontologoService.agregarOdontologo(odontologo);
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        Odontologo odontologo1 = odontologos.get(0);
        Odontologo odontologoBuscado = odontologoService.leerOdontologo(odontologo1.getId());
        assertEquals(odontologo1.getNombre(), odontologoBuscado.getNombre());
    }

    @Test
    void modificarOdontologo() {
        odontologoService.agregarOdontologo(odontologo);
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        Odontologo odontologo1 = odontologos.get(0);
        Odontologo odontologoBuscado = odontologoService.leerOdontologo(odontologo1.getId());
        odontologoBuscado.setNombre("Juan");
        odontologoBuscado.setApellido("López");
        odontologoBuscado.setMatricula(54654);
        odontologoService.modificarOdontologo(odontologoBuscado);
        assertEquals(odontologoService.leerOdontologo(odontologo1.getId()).getNombre(), odontologoBuscado.getNombre());
    }
}



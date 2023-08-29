package com.proyectoIntegrador.consultorioOdontologico;

import com.proyectoIntegrador.consultorioOdontologico.dao.Impl.OdontologoDaoArray;
import com.proyectoIntegrador.consultorioOdontologico.dao.Impl.OdontologoDaoH2;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.service.OdontologoService;
import org.junit.jupiter.api.Test;
import org.apache.log4j.Logger;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;

class OdontologoServiceTest {

    private OdontologoService odontologoService;
    private final static Logger LOGGER = Logger.getLogger(OdontologoServiceTest.class);
    @Test
    public void registrarH2MalaMatricula() {
        LOGGER.info("Testiando H2 con matricula erronea");
        OdontologoDaoH2 odontologoDAO = new OdontologoDaoH2();
        OdontologoService odontologoService = new OdontologoService(odontologoDAO);


        Odontologo odo1 = new Odontologo(1,"Luis", "Curetti", 123);
        Odontologo odo2 = new Odontologo(2, "Pedro", "Sanchez", 548);
        Odontologo odo3 = new Odontologo(3,"Marcos", "Lopez", 32);
        Odontologo odo4 = new Odontologo(4, "Brian", "Rodriguez", 698);

        odontologoService.registrar(odo1);
        odontologoService.registrar(odo2);
        odontologoService.registrar(odo3);
        odontologoService.registrar(odo4);

        int cantidadOdontologos;
        cantidadOdontologos = OdontologoService.listar().size();

        Assertions.assertEquals(3, cantidadOdontologos);
    }

    @Test
    public void registrarArraySinNombreOApellido() {
        LOGGER.info("Testiando Array con nombre o apellido vacios");
        OdontologoDaoArray odontologoDAO = new OdontologoDaoArray();
        OdontologoService odontologoService = new OdontologoService(odontologoDAO);


        Odontologo odo1 = new Odontologo(1, "Luis", "Curetti", 123);
        Odontologo odo2 = new Odontologo(2, "", "Sanchez", 548);
        Odontologo odo3 = new Odontologo(3, "Marcos", "Lopez", 128);
        Odontologo odo4 = new Odontologo(4, "Brian", "", 698);

        odontologoService.registrar(odo1);
        odontologoService.registrar(odo2);
        odontologoService.registrar(odo3);
        odontologoService.registrar(odo4);

        Assertions.assertEquals(2, OdontologoService.listar().size());
    }

}
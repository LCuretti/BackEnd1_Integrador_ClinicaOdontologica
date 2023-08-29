package com.proyectoIntegrador.consultorioOdontologico.service;

import com.proyectoIntegrador.consultorioOdontologico.dao.Impl.OdontologoDaoArray;
import com.proyectoIntegrador.consultorioOdontologico.dao.Impl.OdontologoDaoH2;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
//import org.apache.log4j.Logger;
//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {

    private OdontologoService odontologoService;
    //private final static Logger LOGGER = Logger.getLogger(ServicioOdontologosTest.class);
    //@Test
    public void registrarH2MalaMatricula() {
        //LOGGER.info("Testiando H2 con matricula erronea");
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

        //assertEquals(3, servicioOdontologos.listar().size());
    }

    //@Test
    public void registrarArraySinNombreOApellido() {
        //LOGGER.info("Testiando Array con nombre o apellido vacios");
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

        //assertEquals(2, servicioOdontologos.listar().size());
    }

}
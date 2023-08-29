package com.proyectoIntegrador.consultorioOdontologico.service;

import com.proyectoIntegrador.consultorioOdontologico.DAOs.Impl.OdontologoDAOImplArray;
import com.proyectoIntegrador.consultorioOdontologico.DAOs.Impl.OdontologoDAOImplH2;
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
        OdontologoDAOImplH2 odontologoDAO = new OdontologoDAOImplH2();
        OdontologoService odontologoService = new OdontologoService(odontologoDAO);


        Odontologo odo1 = new Odontologo(1,"123", "Luis", "Curetti");
        Odontologo odo2 = new Odontologo(2,"548", "Pedro", "Sanchez");
        Odontologo odo3 = new Odontologo(3,"12", "Marcos", "Lopez");
        Odontologo odo4 = new Odontologo(4,"698", "Brian", "Rodriguez");

        odontologoService.registrar(odo1);
        odontologoService.registrar(odo2);
        odontologoService.registrar(odo3);
        odontologoService.registrar(odo4);

        //assertEquals(3, servicioOdontologos.listar().size());
    }

    //@Test
    public void registrarArraySinNombreOApellido() {
        //LOGGER.info("Testiando Array con nombre o apellido vacios");
        OdontologoDAOImplArray odontologoDAO = new OdontologoDAOImplArray();
        OdontologoService odontologoService = new OdontologoService(odontologoDAO);


        Odontologo odo1 = new Odontologo(1,"123", "Luis", "Curetti");
        Odontologo odo2 = new Odontologo(2,"548", "", "Sanchez");
        Odontologo odo3 = new Odontologo(3,"128", "Marcos", "Lopez");
        Odontologo odo4 = new Odontologo(4,"698", "Brian", "");

        odontologoService.registrar(odo1);
        odontologoService.registrar(odo2);
        odontologoService.registrar(odo3);
        odontologoService.registrar(odo4);

        //assertEquals(2, servicioOdontologos.listar().size());
    }

}
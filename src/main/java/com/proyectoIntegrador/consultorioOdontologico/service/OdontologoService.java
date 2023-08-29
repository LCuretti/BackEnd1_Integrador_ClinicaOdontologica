package com.proyectoIntegrador.consultorioOdontologico.service;

import com.proyectoIntegrador.consultorioOdontologico.dao.IDao;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoService {
    private static IDao odontologoDAO;

    private static Logger LOGGER = Logger.getLogger(OdontologoService.class);

    public OdontologoService(IDao odontologoDAO){ this.odontologoDAO = odontologoDAO;}

    public boolean registrar(Odontologo odontologo){
        LOGGER.info("Intentando persistir al odontologo: " + odontologo);

        if (odontologo.getMatricula().toString().length() < 3){
            LOGGER.warn("Matricula Invalida");
            return false;
        }
        if (odontologo.getNombre().isBlank()){
            LOGGER.warn("Campo Nombre Vacio");
            return false;
        }
        if (odontologo.getApellido().isBlank()){
            LOGGER.warn("Campo Apellido Vacio");
            return false;
        }

        try {
            odontologoDAO.registrar(odontologo);
        } catch (Exception e) {
            LOGGER.error(e);
            return false;
        }

        return true;

    }

    public static List<Odontologo> listar() {
        LOGGER.info("Intentando listar los odontologos");
        List odontologos = null;

        try {
            odontologos = odontologoDAO.listar();
        } catch (Exception e) {
            LOGGER.error(e);
        }

        return odontologos;
    }



}

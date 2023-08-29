package com.proyectoIntegrador.consultorioOdontologico.dao;

import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;

import java.util.List;

public interface IOdontologoDAO {

    public abstract void registrar(Odontologo odontologo) throws Exception;

    public abstract List<Odontologo> listar() throws Exception;
}

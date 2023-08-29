package com.proyectoIntegrador.consultorioOdontologico.dao;

import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;

import java.util.List;

public interface IDao<T> {

    T registrar(T t) throws Exception;

    List<T> listar() throws Exception;

    //T buscar(Integer id);

    //void eliminar(Integer id);

    //T actualizar(T t);

}

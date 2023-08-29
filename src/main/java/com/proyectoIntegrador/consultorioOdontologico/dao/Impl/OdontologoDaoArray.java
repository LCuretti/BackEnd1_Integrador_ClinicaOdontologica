package com.proyectoIntegrador.consultorioOdontologico.dao.Impl;

import com.proyectoIntegrador.consultorioOdontologico.dao.IDao;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoArray implements IDao {
    private List<Odontologo> odontologos;

    public OdontologoDaoArray() {
        odontologos = new ArrayList<Odontologo>();
    }

    @Override
    public void registrar(Odontologo odontologo){
        odontologos.add(odontologo);
    }

    @Override
    public List<Odontologo> listar(){

        for (int i=0; i<odontologos.size(); i++){
            System.out.println(odontologos.get(i));
        }

        return odontologos;
    }
}

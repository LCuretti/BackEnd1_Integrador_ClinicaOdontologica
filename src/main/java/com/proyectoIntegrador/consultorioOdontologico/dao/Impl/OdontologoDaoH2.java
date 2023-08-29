package com.proyectoIntegrador.consultorioOdontologico.dao.Impl;

import com.proyectoIntegrador.consultorioOdontologico.dao.IDao;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.utils.SQLQueries;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {

    private static final Logger LOGGER = Logger.getLogger(OdontologoDaoH2.class);

    private static Connection connection;

    public OdontologoDaoH2(){
        try {
            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:tcp://localhost/~/test";
            connection = DriverManager.getConnection(url, "sa", "");
            try{
                Statement s = connection.createStatement();
                s.execute(SQLQueries.CREATE_TABLES);
                s.close();
                } catch (SQLException e){
                //System.out.println(e);
                LOGGER.error("No se pudieron crear las tablas", e);
                }
        } catch (Exception e) {
            //System.out.println(e);
            LOGGER.error("No se pudo crear el DAO", e);
        }
    }

    @Override
    public Odontologo registrar(Odontologo odontologo) throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.INSERT_CUSTOM)){
            statement.setInt(1, odontologo.getId());
            statement.setString(2,odontologo.getNombre());
            statement.setString(3,odontologo.getApellido());
            statement.setInt(4,odontologo.getMatricula());
            statement.execute();
            return odontologo;
        }catch (Exception e){
            LOGGER.error("No se pudo persistir: " + odontologo,e);
            //System.out.println(e);
            throw new Exception("Sucedio un error al persistir");
        }

    }

    @Override
    public List<Odontologo> listar() throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.LISTAR_ODONTOLOGOS)){
            List<Odontologo> odontologos = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Odontologo odontologo = new Odontologo();
                odontologo.setId(resultSet.getInt(1));
                odontologo.setNombre(resultSet.getString(2));
                odontologo.setApellido(resultSet.getString(3));
                odontologo.setMatricula(resultSet.getInt(4));
                //LOG.info(resultSet.getInt(1));
                //LOG.info(resultSet.getString(2));
                //LOG.info(resultSet.getString(3));
                //LOG.info(resultSet.getInt(4));
                System.out.println(odontologo);
                odontologos.add(odontologo);
            }

            return odontologos;
            }
        catch (Exception e){
            LOGGER.error("Sucedio un error al listar odontologos",e);
            //System.out.println(e);
            throw new Exception("Error al listar odontologos");
        }

        }
    }

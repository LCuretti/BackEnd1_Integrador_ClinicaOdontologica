package com.proyectoIntegrador.consultorioOdontologico.utils;

public class SQLQueries {
    public static final String CREATE_TABLES =
            "DROP TABLE IF EXISTS ODONTOLOGOS;" +
            "CREATE TABLE ODONTOLOGOS(ID INT PRIMARY KEY, MATRICULA VARCHAR(255), NOMBRE VARCHAR(255), APELLIDO VARCHAR(255));" ;

    public static final String INSERT_CUSTOM = "INSERT INTO ODONTOLOGOS VALUES(?,?,?,?);";

    public static final String LISTAR_ODONTOLOGOS = "SELECT * FROM ODONTOLOGOS";
}

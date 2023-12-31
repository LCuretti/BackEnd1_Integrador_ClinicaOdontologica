package com.proyectoIntegrador.consultorioOdontologico;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConsultorioOdontologicoApplication {

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(ConsultorioOdontologicoApplication.class, args);

	}
	//localhost:8080/swagger-ui.html //Documentacion

}

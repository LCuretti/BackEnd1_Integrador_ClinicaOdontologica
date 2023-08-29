package com.proyectoIntegrador.consultorioOdontologico;

import com.proyectoIntegrador.consultorioOdontologico.DAOs.Impl.OdontologoDAOImplArray;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.service.OdontologoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsultorioOdontologicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultorioOdontologicoApplication.class, args);

		OdontologoDAOImplArray odontologoDAO = new OdontologoDAOImplArray();
		//OdontologoDAOImplH2 odontologoDAO = new OdontologoDAOImplH2();

		OdontologoService odontologoService = new OdontologoService(odontologoDAO);

		Odontologo odo1 = new Odontologo(1,"123", "Luis", "Curetti");
		Odontologo odo2 = new Odontologo(2,"1", "Pedro", "Sanchez");
		Odontologo odo3 = new Odontologo(3,"158", "Marcos", "Lopez");
		Odontologo odo4 = new Odontologo(4,"698", "Brian", "Rodriguez");

		odontologoService.registrar(odo1);
		odontologoService.registrar(odo2);
		odontologoService.registrar(odo3);
		odontologoService.registrar(odo4);

		odontologoService.listar();



	}

}

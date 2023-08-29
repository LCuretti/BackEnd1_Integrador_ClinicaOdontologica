package com.proyectoIntegrador.consultorioOdontologico;

import com.proyectoIntegrador.consultorioOdontologico.dao.Impl.OdontologoDaoArray;
import com.proyectoIntegrador.consultorioOdontologico.dao.Impl.OdontologoDaoH2;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.service.OdontologoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsultorioOdontologicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultorioOdontologicoApplication.class, args);

		//OdontologoDaoArray odontologoDAO = new OdontologoDaoArray();
		OdontologoDaoH2 odontologoDAO = new OdontologoDaoH2();

		OdontologoService odontologoService = new OdontologoService(odontologoDAO);

		Odontologo odo1 = new Odontologo(1, "Luis", "Curetti",123);
		Odontologo odo2 = new Odontologo(2, "Pedro", "Sanchez",1);
		Odontologo odo3 = new Odontologo(3, "Marcos", "Lopez", 158);
		Odontologo odo4 = new Odontologo(4, "Brian", "Rodriguez", 698);

		odontologoService.registrar(odo1);
		odontologoService.registrar(odo2);
		odontologoService.registrar(odo3);
		odontologoService.registrar(odo4);


		odontologoService.listar();

	}

}

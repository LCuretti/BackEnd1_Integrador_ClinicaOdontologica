package com.proyectoIntegrador.consultorioOdontologico;

import com.proyectoIntegrador.consultorioOdontologico.dto.DomicilioDTO;
import com.proyectoIntegrador.consultorioOdontologico.entity.Domicilio;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import com.proyectoIntegrador.consultorioOdontologico.entity.Turno;
import com.proyectoIntegrador.consultorioOdontologico.repository.IDomicilioRepository;
import com.proyectoIntegrador.consultorioOdontologico.repository.IOdontologoRepository;
import com.proyectoIntegrador.consultorioOdontologico.repository.IPacienteRepository;
import com.proyectoIntegrador.consultorioOdontologico.repository.ITurnoRepository;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@SpringBootApplication
public class ConsultorioOdontologicoApplication {
	/*
	@Autowired
	private IPacienteRepository pacienteRepository;

	@Autowired
	private IOdontologoRepository odontologoRepository;

	@Autowired
	private ITurnoRepository turnoRepository;

	@Autowired
	private IDomicilioRepository domicilioRepository;

	@PostConstruct
	public void CargarDatosEjemplo(){
		Odontologo odontologo = new Odontologo();
		odontologo.setApellido("Sanchez");
		odontologo.setNombre("Raul");
		odontologo.setMatricula(13216354);
		//logger.info("Guardando Odontólogo: " + odontologo);
		odontologoRepository.save(odontologo);

		Odontologo odontologo1 = new Odontologo();
		odontologo1.setApellido("Perez");
		odontologo1.setNombre("Pedro");
		odontologo1.setMatricula(132163354);
		odontologoRepository.save(odontologo1);

		Odontologo odontologo2 = new Odontologo();
		odontologo2.setApellido("Fernandez");
		odontologo2.setNombre("Jose");
		odontologo2.setMatricula(1321635124);
		odontologoRepository.save(odontologo2);

		DomicilioDTO domicilio = new Domicilio();
		domicilio.setCalle("Colon");
		domicilio.setNumero("3652234");
		domicilio.setLocalidad("Pico Truncado");
		domicilio.setProvincia("Neuquen");

		Paciente paciente = new Paciente();
		paciente.setNombre("Gustavo");
		paciente.setApellido("Domiguez");
		paciente.setDni("321546111");
		paciente.setDomicilio(domicilio);
		paciente.setFechaIngreso(LocalDate.now());

		pacienteRepository.save(paciente);

		/*Domicilio domicilio1 = new Domicilio();
		domicilio1.setCalle("Sarmiento");
		domicilio1.setNumero("3611154");
		domicilio1.setLocalidad("Rosario");
		domicilio1.setProvincia("Santa Fe");

		Paciente paciente1 = new Paciente();
		paciente1.setNombre("Paola");
		paciente1.setApellido("Lucero");
		paciente1.setDni("321246");
		paciente1.setDomicilio(domicilio1);
		paciente1.setFechaIngreso(LocalDate.now());

		pacienteRepository.save(paciente1);

		Domicilio domicilio2 = new Domicilio();
		domicilio2.setCalle("Rivadavia");
		domicilio2.setNumero("362354");
		domicilio2.setLocalidad("Unquillo");
		domicilio2.setProvincia("Cordoba");

		Paciente paciente2 = new Paciente();
		paciente2.setNombre("Sergio");
		paciente2.setApellido("Mendez");
		paciente2.setDni("321523423446");
		paciente2.setDomicilio(domicilio);
		paciente2.setFechaIngreso(LocalDate.now());

		pacienteRepository.save(paciente2);



		Turno turno = new Turno();
		turno.setFecha(LocalDate.now());
		turno.setOdontologo(odontologo);
		turno.setPaciente(paciente);

		turnoRepository.save(turno);

		Turno turno1 = new Turno();
		turno1.setFecha(LocalDate.now());
		turno1.setOdontologo(odontologo1);
		turno1.setPaciente(paciente1);
		turnoRepository.save(turno1);

		Turno turno2 = new Turno();
		turno2.setFecha(LocalDate.now());
		turno2.setOdontologo(odontologo2);
		turno2.setPaciente(paciente2);
		turnoRepository.save(turno2);


	}*/




	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(ConsultorioOdontologicoApplication.class, args);

	}

}

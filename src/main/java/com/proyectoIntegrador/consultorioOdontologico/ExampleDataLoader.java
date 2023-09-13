package com.proyectoIntegrador.consultorioOdontologico;

import com.proyectoIntegrador.consultorioOdontologico.entity.Domicilio;
import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import com.proyectoIntegrador.consultorioOdontologico.entity.Turno;
import com.proyectoIntegrador.consultorioOdontologico.service.OdontologoService;
import com.proyectoIntegrador.consultorioOdontologico.service.PacienteService;
import com.proyectoIntegrador.consultorioOdontologico.service.TurnoService;
import org.apache.log4j.Logger;

import java.time.LocalDate;

public class ExampleDataLoader {

	private static final Logger logger = Logger.getLogger(ExampleDataLoader.class);
	public void loadExamples (){


		OdontologoService odontologoService = new OdontologoService();

		Odontologo odontologo = new Odontologo();
		odontologo.setApellido("Sanchez");
		odontologo.setNombre("Raul");
		odontologo.setMatricula(13216354);
		logger.info("Guardando Odontólogo: " + odontologo);
		odontologoService.agregarOdontologo(odontologo);

		Odontologo odontologo1 = new Odontologo();
		odontologo1.setApellido("Perez");
		odontologo1.setNombre("Pedro");
		odontologo1.setMatricula(132163354);
		odontologoService.agregarOdontologo(odontologo1);

		Odontologo odontologo2 = new Odontologo();
		odontologo2.setApellido("Fernandez");
		odontologo2.setNombre("Jose");
		odontologo2.setMatricula(1321635124);
		odontologoService.agregarOdontologo(odontologo2);

/*
		PacienteService pacienteService = new PacienteService();

		Domicilio domicilio = new Domicilio();
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

		pacienteService.agregarPaciente(paciente);

		Domicilio domicilio1 = new Domicilio();
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

		pacienteService.agregarPaciente(paciente1);

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

		pacienteService.agregarPaciente(paciente2);

		TurnoService turnoService = new TurnoService();

		Turno turno = new Turno();
		turno.setFecha(LocalDate.now());
		turno.setOdontologo(odontologo);
		turno.setPaciente(paciente);

		turnoService.agregarTurno(turno);

		Turno turno1 = new Turno();
		turno1.setFecha(LocalDate.now());
		turno1.setOdontologo(odontologo1);
		turno1.setPaciente(paciente1);
		turnoService.agregarTurno(turno1);

		Turno turno2 = new Turno();
		turno2.setFecha(LocalDate.now());
		turno2.setOdontologo(odontologo2);
		turno2.setPaciente(paciente2);
		turnoService.agregarTurno(turno2);*/
	}
}

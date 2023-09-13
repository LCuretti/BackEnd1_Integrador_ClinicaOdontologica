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

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(ConsultorioOdontologicoApplication.class, args);

	}

}

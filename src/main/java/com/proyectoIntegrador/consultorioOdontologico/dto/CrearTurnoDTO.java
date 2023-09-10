package com.proyectoIntegrador.consultorioOdontologico.dto;

import java.time.LocalDate;

public record CrearTurnoDTO (PacienteDTO paciente,
                             OdontologoDTO odontologo,
                             LocalDate fecha){
}

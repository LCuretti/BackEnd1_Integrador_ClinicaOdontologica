package com.proyectoIntegrador.consultorioOdontologico.repository;

import com.proyectoIntegrador.consultorioOdontologico.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Integer> {
}

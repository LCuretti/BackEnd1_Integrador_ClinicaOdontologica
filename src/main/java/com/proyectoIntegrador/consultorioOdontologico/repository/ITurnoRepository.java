package com.proyectoIntegrador.consultorioOdontologico.repository;

import com.proyectoIntegrador.consultorioOdontologico.entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Integer> {
}

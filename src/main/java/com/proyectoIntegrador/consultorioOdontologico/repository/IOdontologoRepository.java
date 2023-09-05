package com.proyectoIntegrador.consultorioOdontologico.repository;

import com.proyectoIntegrador.consultorioOdontologico.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Integer> {
}

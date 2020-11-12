package com.uisek.servicio.inscripcion.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisek.servicio.commons.model.entity.Estudiantes;

public interface EstudianteDao extends JpaRepository<Estudiantes, Integer> {

}

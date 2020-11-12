package com.uisek.servicio.inscripcion.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisek.servicio.commons.model.entity.Facultad;

public interface FacultadDao extends JpaRepository<Facultad, Integer> {

}

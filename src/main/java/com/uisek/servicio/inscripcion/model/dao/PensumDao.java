package com.uisek.servicio.inscripcion.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisek.servicio.commons.model.entity.Pensum;

public interface PensumDao extends JpaRepository<Pensum, Integer> {

}

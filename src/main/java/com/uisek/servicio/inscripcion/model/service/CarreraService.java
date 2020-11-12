package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.Carrera;

public interface CarreraService {

	public List<Carrera> findAll();

	public Carrera findById(Integer id);

	public Carrera save(Carrera entidad);

	public void delete(Integer id);

}

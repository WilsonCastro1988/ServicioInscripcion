package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.Carrera;
import com.uisek.servicio.commons.model.entity.Facultad;

public interface FacultadService {

	public List<Facultad> findAll();

	public Facultad findById(Integer id);

	public Facultad save(Facultad entidad);

	public void delete(Integer id);

}

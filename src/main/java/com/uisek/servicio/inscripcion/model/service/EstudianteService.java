package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.Estudiantes;

public interface EstudianteService {

	public List<Estudiantes> findAll();

	public Estudiantes findById(Integer id);

	public Estudiantes save(Estudiantes entidad);

	public void delete(Integer id);

}

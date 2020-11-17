package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.Matricula;

public interface MatriculaService {

	public List<Matricula> findAll();

	public Matricula findById(Integer id);

	public Matricula save(Matricula entidad);

	public void delete(Integer id);

}

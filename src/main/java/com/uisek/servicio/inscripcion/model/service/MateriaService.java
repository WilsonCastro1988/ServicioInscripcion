package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.Materias;

public interface MateriaService {

	public List<Materias> findAll();

	public Materias findById(Integer id);

	public Materias save(Materias entidad);

	public void delete(Integer id);

}

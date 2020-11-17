package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.EstadoMatricula;

public interface EstadoMatriculaService {

	public List<EstadoMatricula> findAll();

	public EstadoMatricula findById(Integer id);

	public EstadoMatricula save(EstadoMatricula entidad);

	public void delete(Integer id);

}

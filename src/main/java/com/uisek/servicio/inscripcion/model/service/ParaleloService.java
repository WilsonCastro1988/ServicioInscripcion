package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.Paralelo;

public interface ParaleloService {

	public List<Paralelo> findAll();

	public Paralelo findById(Integer id);

	public Paralelo save(Paralelo entidad);

	public void delete(Integer id);

}

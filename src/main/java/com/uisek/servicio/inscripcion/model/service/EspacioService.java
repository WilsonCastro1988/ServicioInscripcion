package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.Espacio;

public interface EspacioService {

	public List<Espacio> findAll();

	public Espacio findById(Integer id);

	public Espacio save(Espacio entidad);

	public void delete(Integer id);

}

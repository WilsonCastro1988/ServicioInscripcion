package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.Pensum;

public interface PensumService {

	public List<Pensum> findAll();

	public Pensum findById(Integer id);

	public Pensum save(Pensum entidad);

	public void delete(Integer id);

}

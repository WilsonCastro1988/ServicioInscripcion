package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.Horarios;

public interface HorarioService {

	public List<Horarios> findAll();

	public Horarios findById(Integer id);

	public Horarios save(Horarios entidad);

	public void delete(Integer id);

}

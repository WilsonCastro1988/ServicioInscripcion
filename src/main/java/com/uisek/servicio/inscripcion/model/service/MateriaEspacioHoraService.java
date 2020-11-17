package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.MateriasHasEspacioHasHorarios;
import com.uisek.servicio.commons.model.entity.MateriasHasEspacioHasHorariosPK;

public interface MateriaEspacioHoraService {

	public List<MateriasHasEspacioHasHorarios> findAll();

	public MateriasHasEspacioHasHorarios findById(MateriasHasEspacioHasHorariosPK id);

	public MateriasHasEspacioHasHorarios save(MateriasHasEspacioHasHorarios entidad);

	public void delete(MateriasHasEspacioHasHorariosPK id);

}

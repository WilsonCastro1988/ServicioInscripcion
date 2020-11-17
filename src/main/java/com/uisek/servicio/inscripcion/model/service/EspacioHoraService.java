package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.EspacioHasHorarios;
import com.uisek.servicio.commons.model.entity.EspacioHasHorariosPK;

public interface EspacioHoraService {

	public List<EspacioHasHorarios> findAll();

	public EspacioHasHorarios findById(EspacioHasHorariosPK id);

	public EspacioHasHorarios save(EspacioHasHorarios entidad);

	public void delete(EspacioHasHorariosPK id);

}

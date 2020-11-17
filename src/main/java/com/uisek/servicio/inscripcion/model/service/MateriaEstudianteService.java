package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.MateriasHasEstudiantes;
import com.uisek.servicio.commons.model.entity.MateriasHasEstudiantesPK;

public interface MateriaEstudianteService {

	public List<MateriasHasEstudiantes> findAll();

	public MateriasHasEstudiantes findById(MateriasHasEstudiantesPK id);

	public MateriasHasEstudiantes save(MateriasHasEstudiantes entidad);

	public void delete(MateriasHasEstudiantesPK id);

}

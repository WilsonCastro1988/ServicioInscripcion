package com.uisek.servicio.inscripcion.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisek.servicio.commons.model.entity.MateriasHasEstudiantes;
import com.uisek.servicio.commons.model.entity.MateriasHasEstudiantesPK;

public interface MateriaEstudianteDao extends JpaRepository<MateriasHasEstudiantes, MateriasHasEstudiantesPK> {

}

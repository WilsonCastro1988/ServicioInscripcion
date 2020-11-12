package com.uisek.servicio.inscripcion.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisek.servicio.commons.model.entity.MateriasHasEspacioHasHorarios;
import com.uisek.servicio.commons.model.entity.MateriasHasEspacioHasHorariosPK;

public interface MateriaEspacioHorarioDao extends JpaRepository<MateriasHasEspacioHasHorarios, MateriasHasEspacioHasHorariosPK>{
	
	
	

}

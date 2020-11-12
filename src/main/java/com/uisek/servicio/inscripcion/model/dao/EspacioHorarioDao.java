package com.uisek.servicio.inscripcion.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisek.servicio.commons.model.entity.EspacioHasHorarios;
import com.uisek.servicio.commons.model.entity.EspacioHasHorariosPK;

public interface EspacioHorarioDao extends JpaRepository<EspacioHasHorarios, EspacioHasHorariosPK>{
	
	
	

}

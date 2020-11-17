package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.EspacioHasHorarios;
import com.uisek.servicio.commons.model.entity.EspacioHasHorariosPK;
import com.uisek.servicio.inscripcion.model.dao.EspacioHorarioDao;

@Service
public class EspacioHoraServiceImp implements EspacioHoraService {

	@Autowired
	private EspacioHorarioDao repo;

	@Override
	public List<EspacioHasHorarios> findAll() {
		return repo.findAll();
	}

	@Override
	public EspacioHasHorarios findById(EspacioHasHorariosPK id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public EspacioHasHorarios save(EspacioHasHorarios entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(EspacioHasHorariosPK id) {
		repo.deleteById(id);
	}

}

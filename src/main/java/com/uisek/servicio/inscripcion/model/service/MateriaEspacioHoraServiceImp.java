package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.MateriasHasEspacioHasHorarios;
import com.uisek.servicio.commons.model.entity.MateriasHasEspacioHasHorariosPK;
import com.uisek.servicio.inscripcion.model.dao.MateriaEspacioHorarioDao;

@Service
public class MateriaEspacioHoraServiceImp implements MateriaEspacioHoraService {

	@Autowired
	private MateriaEspacioHorarioDao repo;
	


	@Override
	public List<MateriasHasEspacioHasHorarios> findAll() {
		return repo.findAll();
	}

	@Override
	public MateriasHasEspacioHasHorarios findById(MateriasHasEspacioHasHorariosPK id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public MateriasHasEspacioHasHorarios save(MateriasHasEspacioHasHorarios entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(MateriasHasEspacioHasHorariosPK id) {
		repo.deleteById(id);
	}

	

}

package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.Horarios;
import com.uisek.servicio.inscripcion.model.dao.HorarioDao;

@Service
public class HorarioServiceImp implements HorarioService {

	@Autowired
	private HorarioDao repo;
	


	@Override
	public List<Horarios> findAll() {
		return repo.findAll();
	}

	@Override
	public Horarios findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Horarios save(Horarios entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	

}

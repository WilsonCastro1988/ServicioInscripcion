package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.Matricula;
import com.uisek.servicio.inscripcion.model.dao.MatriculaDao;

@Service
public class MatriculaServiceImp implements MatriculaService {

	@Autowired
	private MatriculaDao repo;

	@Override
	public List<Matricula> findAll() {
		return repo.findAll();
	}

	@Override
	public Matricula findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Matricula save(Matricula entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}

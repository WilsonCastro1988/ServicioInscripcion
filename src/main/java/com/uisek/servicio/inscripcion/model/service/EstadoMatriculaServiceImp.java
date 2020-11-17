package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.EstadoMatricula;
import com.uisek.servicio.inscripcion.model.dao.EstadoMatriculaDao;

@Service
public class EstadoMatriculaServiceImp implements EstadoMatriculaService {

	@Autowired
	private EstadoMatriculaDao repo;
	


	@Override
	public List<EstadoMatricula> findAll() {
		return repo.findAll();
	}

	@Override
	public EstadoMatricula findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public EstadoMatricula save(EstadoMatricula entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	

}

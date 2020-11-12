package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.Facultad;
import com.uisek.servicio.inscripcion.model.dao.FacultadDao;

@Service
public class FacultadServiceImp implements FacultadService {

	@Autowired
	private FacultadDao repo;

	

	@Override
	public List<Facultad> findAll() {
		return repo.findAll();
	}

	@Override
	public Facultad findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Facultad save(Facultad entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}

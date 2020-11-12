package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.Carrera;
import com.uisek.servicio.inscripcion.model.dao.CarreraDao;

@Service
public class CarreraServiceImp implements CarreraService {

	@Autowired
	private CarreraDao repo;
	


	@Override
	public List<Carrera> findAll() {
		return repo.findAll();
	}

	@Override
	public Carrera findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Carrera save(Carrera entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	

}

package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.Paralelo;
import com.uisek.servicio.inscripcion.model.dao.ParaleloDao;

@Service
public class ParaleloServiceImp implements ParaleloService {

	@Autowired
	private ParaleloDao repo;
	


	@Override
	public List<Paralelo> findAll() {
		return repo.findAll();
	}

	@Override
	public Paralelo findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Paralelo save(Paralelo entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	

}

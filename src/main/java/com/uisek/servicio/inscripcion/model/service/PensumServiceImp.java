package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.Pensum;
import com.uisek.servicio.inscripcion.model.dao.PensumDao;

@Service
public class PensumServiceImp implements PensumService {

	@Autowired
	private PensumDao repo;
	


	@Override
	public List<Pensum> findAll() {
		return repo.findAll();
	}

	@Override
	public Pensum findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Pensum save(Pensum entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	

}

package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.Espacio;
import com.uisek.servicio.inscripcion.model.dao.EspacioDao;

@Service
public class EspacioServiceImp implements EspacioService {

	@Autowired
	private EspacioDao repo;
	


	@Override
	public List<Espacio> findAll() {
		return repo.findAll();
	}

	@Override
	public Espacio findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Espacio save(Espacio entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	

}

package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.Materias;
import com.uisek.servicio.inscripcion.model.dao.MateriasDao;

@Service
public class MateriaServiceImp implements MateriaService {

	@Autowired
	private MateriasDao repo;
	


	@Override
	public List<Materias> findAll() {
		return repo.findAll();
	}

	@Override
	public Materias findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Materias save(Materias entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	

}

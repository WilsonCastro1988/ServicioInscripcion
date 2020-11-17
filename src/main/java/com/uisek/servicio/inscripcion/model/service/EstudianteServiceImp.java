package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.Estudiantes;
import com.uisek.servicio.inscripcion.model.dao.EstudianteDao;

@Service
public class EstudianteServiceImp implements EstudianteService {

	@Autowired
	private EstudianteDao repo;
	


	@Override
	public List<Estudiantes> findAll() {
		return repo.findAll();
	}

	@Override
	public Estudiantes findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Estudiantes save(Estudiantes entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	

}

package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.MateriasHasEstudiantes;
import com.uisek.servicio.commons.model.entity.MateriasHasEstudiantesPK;
import com.uisek.servicio.inscripcion.model.dao.MateriaEstudianteDao;

@Service
public class MateriaEstudianteServiceImp implements MateriaEstudianteService {

	@Autowired
	private MateriaEstudianteDao repo;
	


	@Override
	public List<MateriasHasEstudiantes> findAll() {
		return repo.findAll();
	}

	@Override
	public MateriasHasEstudiantes findById(MateriasHasEstudiantesPK id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public MateriasHasEstudiantes save(MateriasHasEstudiantes entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(MateriasHasEstudiantesPK id) {
		repo.deleteById(id);
	}

	

}

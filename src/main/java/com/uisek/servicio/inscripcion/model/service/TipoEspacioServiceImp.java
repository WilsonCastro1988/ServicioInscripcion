package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisek.servicio.commons.model.entity.TipoEspacio;
import com.uisek.servicio.inscripcion.model.dao.TipoEspacioDao;

@Service
public class TipoEspacioServiceImp implements TipoEspacioService {

	@Autowired
	private TipoEspacioDao repo;
	


	@Override
	public List<TipoEspacio> findAll() {
		return repo.findAll();
	}

	@Override
	public TipoEspacio findById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public TipoEspacio save(TipoEspacio entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	

}

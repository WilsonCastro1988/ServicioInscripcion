package com.uisek.servicio.inscripcion.model.service;

import java.util.List;

import com.uisek.servicio.commons.model.entity.TipoEspacio;

public interface TipoEspacioService {

	public List<TipoEspacio> findAll();

	public TipoEspacio findById(Integer id);

	public TipoEspacio save(TipoEspacio entidad);

	public void delete(Integer id);

}

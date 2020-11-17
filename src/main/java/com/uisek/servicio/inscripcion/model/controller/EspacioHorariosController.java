package com.uisek.servicio.inscripcion.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisek.servicio.commons.model.entity.EspacioHasHorarios;
import com.uisek.servicio.commons.model.entity.EspacioHasHorariosPK;
import com.uisek.servicio.inscripcion.model.service.EspacioHoraServiceImp;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping(value = "espacio-horario")
public class EspacioHorariosController {

	@Autowired
	private EspacioHoraServiceImp repo;

	@GetMapping("/listar")
	public List<EspacioHasHorarios> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{idTabla1}/{idTabla2}")
	public EspacioHasHorarios ver(@PathVariable Integer idTabla1, @PathVariable Integer idTabla2) {
		EspacioHasHorariosPK pk = new EspacioHasHorariosPK(idTabla1, idTabla2);
		return repo.findById(pk);
	}

	@PostMapping("/crear")
	public EspacioHasHorarios crear(@RequestBody EspacioHasHorarios entidad) {
		return repo.save(entidad);
	}

	@PutMapping("/editar/{idTabla1}/{idTabla2}")
	@ResponseStatus(HttpStatus.CREATED)
	public EspacioHasHorarios editar(@RequestBody EspacioHasHorarios entidad, @PathVariable Integer idTabla1,@PathVariable Integer idTabla2) {
		EspacioHasHorariosPK pk = new EspacioHasHorariosPK(idTabla1, idTabla2);
		EspacioHasHorarios entidadDb = repo.findById(pk);
		entidadDb = entidad;

		return repo.save(entidadDb);
	}

	@DeleteMapping("/eliminar/{idTabla1}/{idTabla2}")
	public void eliminar(@PathVariable Integer idTabla1,@PathVariable Integer idTabla2) {
		EspacioHasHorariosPK pk = new EspacioHasHorariosPK(idTabla1, idTabla2);
		repo.delete(pk);
	}

}

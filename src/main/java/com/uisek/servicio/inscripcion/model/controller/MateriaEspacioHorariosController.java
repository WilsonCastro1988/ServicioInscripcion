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

import com.uisek.servicio.commons.model.entity.MateriasHasEspacioHasHorarios;
import com.uisek.servicio.commons.model.entity.MateriasHasEspacioHasHorariosPK;
import com.uisek.servicio.inscripcion.model.service.MateriaEspacioHoraServiceImp;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping(value = "materia-espacio-horario")
public class MateriaEspacioHorariosController {

	@Autowired
	private MateriaEspacioHoraServiceImp repo;

	@GetMapping("/listar")
	public List<MateriasHasEspacioHasHorarios> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{idTabla1}/{idTabla2}/{idTabla3}")
	public MateriasHasEspacioHasHorarios ver(@PathVariable Integer idTabla1, @PathVariable Integer idTabla2,
			@PathVariable Integer idTabla3) {
		MateriasHasEspacioHasHorariosPK pk = new MateriasHasEspacioHasHorariosPK(idTabla1, idTabla2, idTabla3);
		return repo.findById(pk);
	}

	@PostMapping("/crear")
	public MateriasHasEspacioHasHorarios crear(@RequestBody MateriasHasEspacioHasHorarios entidad) {
		return repo.save(entidad);
	}

	@PutMapping("/editar/{idTabla1}/{idTabla2}/{idTabla3}")
	@ResponseStatus(HttpStatus.CREATED)
	public MateriasHasEspacioHasHorarios editar(@RequestBody MateriasHasEspacioHasHorarios entidad,
			@PathVariable Integer idTabla1, @PathVariable Integer idTabla2, @PathVariable Integer idTabla3) {
		MateriasHasEspacioHasHorariosPK pk = new MateriasHasEspacioHasHorariosPK(idTabla1, idTabla2, idTabla3);
		MateriasHasEspacioHasHorarios entidadDb = repo.findById(pk);
		entidadDb = entidad;

		return repo.save(entidadDb);
	}

	@DeleteMapping("/eliminar/{idTabla1}/{idTabla2}/{idTabla3}")
	public void eliminar(@PathVariable Integer idTabla1, @PathVariable Integer idTabla2,
			@PathVariable Integer idTabla3) {
		MateriasHasEspacioHasHorariosPK pk = new MateriasHasEspacioHasHorariosPK(idTabla1, idTabla2, idTabla3);
		repo.delete(pk);
	}

}

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

import com.uisek.servicio.commons.model.entity.Horarios;
import com.uisek.servicio.inscripcion.model.service.HorarioServiceImp;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping(value = "horarios")
public class HorariosController {

	@Autowired
	private HorarioServiceImp repo;

	@GetMapping("/listar")
	public List<Horarios> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public Horarios ver(@PathVariable Integer id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	public Horarios crear(@RequestBody Horarios entidad) {
		return repo.save(entidad);
	}

	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Horarios editar(@RequestBody Horarios entidad, @PathVariable Integer id) {
		Horarios entidadDb = repo.findById(id);
		entidadDb = entidad;
		entidadDb.setIdhorarios(entidad.getIdhorarios());

		return repo.save(entidadDb);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Integer id) {
		repo.delete(id);
	}

}

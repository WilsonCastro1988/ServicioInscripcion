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

import com.uisek.servicio.commons.model.entity.Facultad;
import com.uisek.servicio.inscripcion.model.service.FacultadServiceImp;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping(value = "facultad")
public class FacultadController {

	@Autowired
	private FacultadServiceImp repo;

	@GetMapping("/listar")
	public List<Facultad> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public Facultad ver(@PathVariable Integer id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	public Facultad crear(@RequestBody Facultad entidad) {
		return repo.save(entidad);
	}

	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Facultad editar(@RequestBody Facultad entidad, @PathVariable Integer id) {
		Facultad agenciaDb = repo.findById(id);
		agenciaDb = entidad;
		agenciaDb.setIdfacultad(entidad.getIdfacultad());

		return repo.save(agenciaDb);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Integer id) {
		repo.delete(id);
	}

}

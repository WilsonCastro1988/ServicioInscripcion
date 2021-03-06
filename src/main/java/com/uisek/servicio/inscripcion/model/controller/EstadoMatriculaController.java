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

import com.uisek.servicio.commons.model.entity.EstadoMatricula;
import com.uisek.servicio.inscripcion.model.service.EstadoMatriculaServiceImp;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping(value = "estado-matricula")
public class EstadoMatriculaController {

	@Autowired
	private EstadoMatriculaServiceImp repo;

	@GetMapping("/listar")
	public List<EstadoMatricula> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public EstadoMatricula ver(@PathVariable Integer id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	public EstadoMatricula crear(@RequestBody EstadoMatricula entidad) {
		return repo.save(entidad);
	}

	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public EstadoMatricula editar(@RequestBody EstadoMatricula entidad, @PathVariable Integer id) {
		EstadoMatricula entidadDb = repo.findById(id);
		entidadDb = entidad;
		entidadDb.setIdestadoMatricula(entidad.getIdestadoMatricula());

		return repo.save(entidadDb);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Integer id) {
		repo.delete(id);
	}

}

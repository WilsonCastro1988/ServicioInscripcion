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

import com.uisek.servicio.commons.model.entity.Matricula;
import com.uisek.servicio.inscripcion.model.service.MatriculaServiceImp;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping(value = "matricula")
public class MatriculaController {

	@Autowired
	private MatriculaServiceImp repo;

	@GetMapping("/listar")
	public List<Matricula> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public Matricula ver(@PathVariable Integer id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	public Matricula crear(@RequestBody Matricula entidad) {
		return repo.save(entidad);
	}

	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Matricula editar(@RequestBody Matricula entidad, @PathVariable Integer id) {
		Matricula agenciaDb = repo.findById(id);
		agenciaDb = entidad;
		agenciaDb.setIdmatricula(entidad.getIdmatricula());

		return repo.save(agenciaDb);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Integer id) {
		repo.delete(id);
	}

}

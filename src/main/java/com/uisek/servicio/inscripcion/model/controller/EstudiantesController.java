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

import com.uisek.servicio.commons.model.entity.Estudiantes;
import com.uisek.servicio.inscripcion.model.service.EstudianteServiceImp;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping(value = "estudiantes")
public class EstudiantesController {

	@Autowired
	private EstudianteServiceImp repo;

	@GetMapping("/listar")
	public List<Estudiantes> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public Estudiantes ver(@PathVariable Integer id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	public Estudiantes crear(@RequestBody Estudiantes entidad) {
		return repo.save(entidad);
	}

	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudiantes editar(@RequestBody Estudiantes entidad, @PathVariable Integer id) {
		Estudiantes agenciaDb = repo.findById(id);
		agenciaDb = entidad;
		agenciaDb.setIdestudiantes(entidad.getIdestudiantes());

		return repo.save(agenciaDb);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Integer id) {
		repo.delete(id);
	}

}

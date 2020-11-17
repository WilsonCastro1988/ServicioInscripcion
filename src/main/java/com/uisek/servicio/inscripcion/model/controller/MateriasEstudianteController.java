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

import com.uisek.servicio.commons.model.entity.MateriasHasEstudiantes;
import com.uisek.servicio.commons.model.entity.MateriasHasEstudiantesPK;
import com.uisek.servicio.inscripcion.model.service.MateriaEstudianteServiceImp;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.OPTIONS })
@RequestMapping(value = "materias-estudiante")
public class MateriasEstudianteController {

	@Autowired
	private MateriaEstudianteServiceImp repo;

	@GetMapping("/listar")
	public List<MateriasHasEstudiantes> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{idTabla1}/{idTabla2}")
	public MateriasHasEstudiantes ver(@PathVariable Integer idTabla1, @PathVariable String idTabla2) {
		MateriasHasEstudiantesPK pk = new MateriasHasEstudiantesPK(idTabla1, idTabla2);
		return repo.findById(pk);
	}

	@PostMapping("/crear")
	public MateriasHasEstudiantes crear(@RequestBody MateriasHasEstudiantes entidad) {
		return repo.save(entidad);
	}

	@PutMapping("/editar/{idTabla1}/{idTabla2}")
	@ResponseStatus(HttpStatus.CREATED)
	public MateriasHasEstudiantes editar(@RequestBody MateriasHasEstudiantes entidad, @PathVariable Integer idTabla1,@PathVariable String idTabla2) {
		MateriasHasEstudiantesPK pk = new MateriasHasEstudiantesPK(idTabla1, idTabla2);
		MateriasHasEstudiantes entidadDb = repo.findById(pk);
		entidadDb = entidad;

		return repo.save(entidadDb);
	}

	@DeleteMapping("/eliminar/{idTabla1}/{idTabla2}")
	public void eliminar(@PathVariable Integer idTabla1,@PathVariable String idTabla2) {
		MateriasHasEstudiantesPK pk = new MateriasHasEstudiantesPK(idTabla1, idTabla2);
		repo.delete(pk);
	}

}

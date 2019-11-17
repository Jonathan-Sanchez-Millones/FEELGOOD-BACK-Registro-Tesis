package edu.moduloalumno.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.AlumnoTemaTesis;
import edu.moduloalumno.entity.Tesiss;
import edu.moduloalumno.service.IAlumnoTemaTesisService;
import edu.moduloalumno.service.ITesissService;

@RestController
@RequestMapping("/tesiss")
public class TesissController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ITesissService service;
	
	@RequestMapping(value = "/listar/{codigo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Tesiss>> getAllTesiss(@PathVariable("codigo") String codigo) {
		logger.info("> getAllAlumnoTemaTesis [AlumnoTemaTesis]");

		List<Tesiss> list = null;
		try {
			list = service.getAllTesiss(codigo);

			if (list == null) {
				list = new ArrayList<Tesiss>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Tesiss>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllAlumnoTemaTesis [AlumnoTemaTesis]");
		return new ResponseEntity<List<Tesiss>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listaralumnos/{id_docente}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Tesiss>> getAllAlumnos(@PathVariable("id_docente") int id_docente) {
		logger.info("> getAllAlumnoTemaTesis [AlumnoTemaTesis]");

		List<Tesiss> list = null;
		try {
			list = service.getAllAlumnos(id_docente);

			if (list == null) {
				list = new ArrayList<Tesiss>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Tesiss>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllAlumnoTemaTesis [AlumnoTemaTesis]");
		return new ResponseEntity<List<Tesiss>>(list, HttpStatus.OK);
	}
	
}

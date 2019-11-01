/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.AlumnoTemaTesis;
import edu.moduloalumno.entity.AlumnoTemaTesisDocente;
import edu.moduloalumno.service.IAlumnoTemaTesisDocenteService;
import edu.moduloalumno.service.IAlumnoTemaTesisService;

@RestController
@RequestMapping("/alumnotematesisdocente")
public class AlumnoTemaTesisDocenteController {
    
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IAlumnoTemaTesisDocenteService service;
	
	@RequestMapping(value = "/add", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AlumnoTemaTesisDocente> addAlumnoTemaTesisDocente(@RequestBody AlumnoTemaTesisDocente alumnoTemaTesisDocente) {

		logger.info("> addAlumnoTemaTesis [AlumnoTemaTesis]");
		
		AlumnoTemaTesisDocente newAlumnoTemaTesis = null;
		try {
			newAlumnoTemaTesis = service.addAlumnoTemaTesisDocente(alumnoTemaTesisDocente);
			
		} catch (Exception e) {
			return new ResponseEntity<AlumnoTemaTesisDocente>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("> addAlumnoTemaTesis [AlumnoTemaTesis]");
		return new ResponseEntity<AlumnoTemaTesisDocente>(newAlumnoTemaTesis, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/delete/{id_atematesis}", method = RequestMethod.DELETE)
	public void deleteAlumnoTemaTesisDocente(@PathVariable("id_atematesis") int id_atematesis) {

		logger.info("> addAlumnoTemaTesis [AlumnoTemaTesis]");
		
		try {
			service.deleteAlumnoTemaTesisDocente(id_atematesis);
		} catch (Exception e) {
		}

		logger.info("> addAlumnoTemaTesis [AlumnoTemaTesis]");
	}
}

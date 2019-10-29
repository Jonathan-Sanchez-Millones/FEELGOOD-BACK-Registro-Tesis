/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.moduloalumno.entity.AlumnoTemaTesisPregunta;
import edu.moduloalumno.service.IAlumnoTemaTesisPreguntaServicee;


@RestController
@RequestMapping("/alumnotematesispregunta")

public class AlumnoTemaTesisPreguntaController {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
	private IAlumnoTemaTesisPreguntaServicee servicee;
    
    
    @RequestMapping(value = "/buscar/{idATemaTesis}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AlumnoTemaTesisPregunta> getAlumnoTemaTesisPreguntaById(@PathVariable("idAtemaTesis") Integer idATemaTesis) {
		logger.info("> getAlumnoTemaTesisPreguntaById [AlumnoTemaTesisPregunta]");

		AlumnoTemaTesisPregunta alum = null;
		try {
			alum = servicee.getAlumnoTemaTesisPreguntaById(idATemaTesis);
		
			if (alum == null) {
				alum = new AlumnoTemaTesisPregunta();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<AlumnoTemaTesisPregunta>(alum, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoTemaTesisPreguntaById [AlumnoTemaTesisPregunta]");
		return new ResponseEntity<AlumnoTemaTesisPregunta>(alum, HttpStatus.OK);
	}
    
        
        @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoTemaTesisPregunta>> getAllAlumnoTemaTesisPregunta() {
		logger.info("> getAllAlumnoTemaTesisPregunta [AlumnoTemaTesisPregunta]");

		List<AlumnoTemaTesisPregunta> list = null;
		try {
			list = servicee.getAllAlumnoTemaTesisPregunta();

			if (list == null) {
				list = new ArrayList<AlumnoTemaTesisPregunta>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoTemaTesisPregunta>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllAlumnoTemaTesisPregunta [AlumnoTemaTesisPregunta]");
		return new ResponseEntity<List<AlumnoTemaTesisPregunta>>(list, HttpStatus.OK);
	}
        
        @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AlumnoTemaTesisPregunta> addAlumnoAlumnoPrograma(@RequestBody AlumnoTemaTesisPregunta alumnoTemaTesisPregunta) {

		logger.info("> addAlumnoTemaTesisPregunta [AlumnoTemaTesisPregunta]");
		
		AlumnoTemaTesisPregunta newAlumnoTemaTesisPregunta = null;
		try {
			newAlumnoTemaTesisPregunta = servicee.addAlumnoTemaTesisPregunta(alumnoTemaTesisPregunta);
		} catch (Exception e) {
			return new ResponseEntity<AlumnoTemaTesisPregunta>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("> addAlumnoTemaTesisPregunta [AlumnoTemaTesisPregunta]");
		return new ResponseEntity<AlumnoTemaTesisPregunta>(newAlumnoTemaTesisPregunta, HttpStatus.CREATED);
	}
}

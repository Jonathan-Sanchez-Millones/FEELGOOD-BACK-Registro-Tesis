/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.api;

import edu.moduloalumno.entity.AlumnoPrograma;
import edu.moduloalumno.entity.AlumnoTemaTesis;
import edu.moduloalumno.service.IAlumnoProgramaService;
import edu.moduloalumno.service.IAlumnoTemaTesisService;
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

/**
 *
 * @author Diego Lopez
 */

@RestController
@RequestMapping("/alumnotematesis")
public class AlumnoTemaTesisController {
    
    	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IAlumnoTemaTesisService service;
	
	@Autowired
	private IAlumnoProgramaService service_alumno_programa;
	
	@RequestMapping(value = "/buscar/{id_atematesis}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AlumnoTemaTesis> getAlumnoTemaTesisById(@PathVariable("id_atematesis") Integer id_atematesis) {
		logger.info("> getAlumnoTemaTesisById [AlumnoTemaTesis]");

		AlumnoTemaTesis alum = null;
		try {
			alum = service.getAlumnoTemaTesisById(id_atematesis);

			if (alum == null) {
				alum = new AlumnoTemaTesis();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<AlumnoTemaTesis>(alum, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoTemaTesisById [AlumnoTemaTesis]");
		return new ResponseEntity<AlumnoTemaTesis>(alum, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/buscarid/{atematesis_titulo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AlumnoTemaTesis> getAlumnoTemaTesisByTitulo(@PathVariable("atematesis_titulo") String atematesis_titulo) {
		logger.info("> getAlumnoTemaTesisById [AlumnoTemaTesis]");

		AlumnoTemaTesis alum = null;
		try {
			alum = service.getAlumnoTemaTesisByTitulo(atematesis_titulo);

			if (alum == null) {
				alum = new AlumnoTemaTesis();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<AlumnoTemaTesis>(alum, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoTemaTesisById [AlumnoTemaTesis]");
		return new ResponseEntity<AlumnoTemaTesis>(alum, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoTemaTesis>> getAllAlumnoTemaTesis() {
		logger.info("> getAllAlumnoTemaTesis [AlumnoTemaTesis]");

		List<AlumnoTemaTesis> list = null;
		try {
			list = service.getAllAlumnoTemaTesis();

			if (list == null) {
				list = new ArrayList<AlumnoTemaTesis>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoTemaTesis>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllAlumnoTemaTesis [AlumnoTemaTesis]");
		return new ResponseEntity<List<AlumnoTemaTesis>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AlumnoTemaTesis> addAlumnoTemaTesis(@RequestBody AlumnoTemaTesis alumnoTemaTesis) {

		logger.info("> addAlumnoTemaTesis [AlumnoTemaTesis]");
		
		AlumnoPrograma alumnoprograma=null;
		AlumnoTemaTesis newAlumnoTemaTesis = null;
		System.out.println("MIRA:"+alumnoTemaTesis.getCod_alumno());
		try {
			alumnoprograma=service_alumno_programa.getAlumnoProgramaById(alumnoTemaTesis.getCod_alumno());
			System.out.println("MIRA2:"+alumnoprograma.getId_programa());
			alumnoTemaTesis.setId_programa(alumnoprograma.getId_programa());
			newAlumnoTemaTesis = service.addAlumnoTemaTesis(alumnoTemaTesis);
		} catch (Exception e) {
			return new ResponseEntity<AlumnoTemaTesis>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("> addAlumnoTemaTesis [AlumnoTemaTesis]");
		return new ResponseEntity<AlumnoTemaTesis>(newAlumnoTemaTesis, HttpStatus.CREATED);
	}
    
	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateAlumnoTemaTesis(@RequestBody AlumnoTemaTesis alumnoTemaTesis) {

		logger.info("> addAlumnoTemaTesis [AlumnoTemaTesis]");
		
		try {
			service.updateAlumnoTemaTesis(alumnoTemaTesis);;
		} catch (Exception e) {
		}

		logger.info("> addAlumnoTemaTesis [AlumnoTemaTesis]");
	}
    
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteAlumnoTemaTesis(@RequestBody AlumnoTemaTesis alumnoTemaTesis) {

		logger.info("> addAlumnoTemaTesis [AlumnoTemaTesis]");
		
		try {
			service.deleteAlumnoTemaTesis(alumnoTemaTesis.getId_atematesis());;
		} catch (Exception e) {
		}

		logger.info("> addAlumnoTemaTesis [AlumnoTemaTesis]");
	}
}

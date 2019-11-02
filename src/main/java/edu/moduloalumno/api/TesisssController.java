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

import edu.moduloalumno.entity.Tesiss;
import edu.moduloalumno.entity.Tesisss;
import edu.moduloalumno.service.ITesissService;
import edu.moduloalumno.service.ITesisssService;

@RestController
@RequestMapping("/tesisss")
public class TesisssController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ITesisssService service;
	
	@RequestMapping(value = "/buscar/{id_atematesis}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Tesisss> getTesisss(@PathVariable("id_atematesis") int id_atematesis) {
		logger.info("> getAllAlumnoTemaTesis [AlumnoTemaTesis]");

		Tesisss list = null;
		try {
			list = service.getTesisss(id_atematesis);

			if (list == null) {
				list = new Tesisss();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<Tesisss>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllAlumnoTemaTesis [AlumnoTemaTesis]");
		return new ResponseEntity<Tesisss>(list, HttpStatus.OK);
	}
}

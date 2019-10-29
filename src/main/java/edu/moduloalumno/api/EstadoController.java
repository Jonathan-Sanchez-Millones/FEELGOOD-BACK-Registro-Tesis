package edu.moduloalumno.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.Estado;
import edu.moduloalumno.service.IAlumnoService;
import edu.moduloalumno.service.IEstadoService;

@RestController
@RequestMapping("/estado")
public class EstadoController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IEstadoService service;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Estado>> getAllEstado() {
		logger.info("> getAlumnoIdByNombresApellidos [Alumno]");

		List<Estado> list = null;

		try {
			list = service.getAllEstados();
			
			if (list == null) {
				list = new ArrayList<Estado>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Estado>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getAlumnoIdByNombresApellidos [Alumno]");
		return new ResponseEntity<List<Estado>>(list, HttpStatus.OK);
	}
}

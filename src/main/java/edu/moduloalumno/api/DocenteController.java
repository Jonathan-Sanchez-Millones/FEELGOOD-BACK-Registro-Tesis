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

import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.Docente;
import edu.moduloalumno.service.IAlumnoService;
import edu.moduloalumno.service.IDocenteService;

@RestController
@RequestMapping("/docente")
public class DocenteController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IDocenteService service;
	
	@RequestMapping(value = "/leer/{nombres}/{apellPat}/{apellMat}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Docente> getIdDocenteByNombre(@PathVariable("nombres") String nombres,@PathVariable("apellPat") String apellPat,@PathVariable("apellMat") String apellMat) {
		logger.info("> getAlumnoIdByNombresApellidos [Alumno]");

		Docente docente = null;
		String apellPat2=apellPat+" ";
		String apellMat2=apellMat+" ";
		System.out.println("MIRA:"+nombres);
		try {
			docente = service.getIdDocenteByNombre(nombres, apellPat2, apellMat2);
			
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<Docente>(docente, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getAlumnoIdByNombresApellidos [Alumno]");
		return new ResponseEntity<Docente>(docente, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Docente>> getAllDocentes() {
		logger.info("> getAlumnoIdByNombresApellidos [Alumno]");

		List<Docente> list = null;

		try {
			list = service.getAllDocentes();
			
			if (list == null) {
				list = new ArrayList<Docente>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Docente>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getAlumnoIdByNombresApellidos [Alumno]");
		return new ResponseEntity<List<Docente>>(list, HttpStatus.OK);
	}
	
}

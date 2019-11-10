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

import edu.moduloalumno.entity.Curso;
import edu.moduloalumno.service.ICursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ICursoService service;
	
	@RequestMapping(value = "/listar/{cod_alumno}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Curso>> getAllCurso(@PathVariable("cod_alumno") String cod_alumno) {
		logger.info("> getAlumnoIdByNombresApellidos [Alumno]");

		List<Curso> list = null;

		try {
			list = service.getAllCursos(cod_alumno);
			
			if (list == null) {
				list = new ArrayList<Curso>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Curso>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getAlumnoIdByNombresApellidos [Alumno]");
		return new ResponseEntity<List<Curso>>(list, HttpStatus.OK);
	}
}

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
import edu.moduloalumno.entity.GrupoInvestigacion;
import edu.moduloalumno.service.IAlumnoService;
import edu.moduloalumno.service.IGrupoInvestigacionService;

@RestController
@RequestMapping("/gi")
public class GrupoInvestigacionController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IGrupoInvestigacionService service;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<GrupoInvestigacion>> getAllGrupoInvestigacion() {
		logger.info("> getAlumnoIdByNombresApellidos [Alumno]");

		List<GrupoInvestigacion> list = null;

		try {
			list = service.getAllGrupoInvestigaciones();
			
			if (list == null) {
				list = new ArrayList<GrupoInvestigacion>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<GrupoInvestigacion>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getAlumnoIdByNombresApellidos [Alumno]");
		return new ResponseEntity<List<GrupoInvestigacion>>(list, HttpStatus.OK);
	}
}

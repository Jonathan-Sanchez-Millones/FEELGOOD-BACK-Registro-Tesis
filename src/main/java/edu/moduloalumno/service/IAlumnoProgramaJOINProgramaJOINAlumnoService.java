package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.AlumnoProgramaJOINProgramaJOINAlumno;
import edu.moduloalumno.entity.Programa;

public interface IAlumnoProgramaJOINProgramaJOINAlumnoService {
	
	List<AlumnoProgramaJOINProgramaJOINAlumno> getAllAlumnoProgramaJOINProgramaJOINAlumnos();
	
	AlumnoProgramaJOINProgramaJOINAlumno getAlumnoProgramaJOINProgramaJOINAlumnosById(String cod_alumno);
	
	List<AlumnoProgramaJOINProgramaJOINAlumno> getAlumnoProgramaJOINProgramaJOINAlumnoIdByNombresApellidosRestringido( String nombresApellidos);
	
	Programa getProgramabyId(Integer id_programa);

}
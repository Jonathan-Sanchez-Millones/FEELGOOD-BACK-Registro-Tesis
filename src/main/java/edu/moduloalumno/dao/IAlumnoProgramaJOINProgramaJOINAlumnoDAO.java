package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.AlumnoProgramaJOINProgramaJOINAlumno;
import edu.moduloalumno.entity.Programa;

public interface IAlumnoProgramaJOINProgramaJOINAlumnoDAO {

	List<AlumnoProgramaJOINProgramaJOINAlumno> getAllAlumnoProgramaJOINProgramaJOINAlumnos();
	
	AlumnoProgramaJOINProgramaJOINAlumno getAlumnoProgramaJOINProgramaJOINAlumnosById(String cod_alumno);

	List<AlumnoProgramaJOINProgramaJOINAlumno> getAlumnoProgramaJOINProgramaJOINAlumnoIdByNombresApellidosRestringido( String nombresApellidos);

	Programa getProgramabyId(Integer id_programa);
}
package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.Alumno;

public interface IAlumnoDAO {

	List<Alumno> getAllAlumnos();

	Alumno getAlumnoById(int idAlum);

	Alumno getAlumnoBycodigo(String codigo);

	Alumno getAlumnoIdByApeNom(String apeNom);
	
	List<Alumno> getAlumnoIdByNombresApellidos(String nombres,String apellidos);
	
	List<Alumno> getAlumnoIdByNombresApellidosRestringido(String nombresApellidos);

	void addAlumno(Alumno alumno);

	void updateAlumno(Alumno alumno);

	void deleteAlumno(int idAlum);

}
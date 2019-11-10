package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.Curso;

public interface ICursoDAO {

	List<Curso> getAllCursos(String cod_alumno);

}

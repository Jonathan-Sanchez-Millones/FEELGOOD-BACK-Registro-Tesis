package edu.moduloalumno.service;
import java.util.List;

import edu.moduloalumno.entity.Curso;

public interface ICursoService {

	List<Curso> getAllCursos(String cod_alumno);
}

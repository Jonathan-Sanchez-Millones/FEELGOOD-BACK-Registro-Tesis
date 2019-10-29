package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.Docente;

public interface IDocenteService {

	Docente getIdDocenteByNombre(String nombres,String apellPat,String apellMat);

	List<Docente> getAllDocentes();
}

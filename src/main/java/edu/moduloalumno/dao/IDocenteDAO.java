package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.Docente;

public interface IDocenteDAO {

	Docente getIdDocenteByNombre(String nombres,String apellPat,String apellMat);
	
	List<Docente> getAllDocentes();
}

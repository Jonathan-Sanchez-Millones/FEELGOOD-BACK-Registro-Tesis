package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.AlumnoTemaTesis;
import edu.moduloalumno.entity.Tesiss;

public interface ITesissDAO {

	List<Tesiss> getAllTesiss(String codigo);

	List<Tesiss> getAllAlumnos(int id_docente);

}

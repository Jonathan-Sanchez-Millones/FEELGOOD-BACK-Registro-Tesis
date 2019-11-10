package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.ICursoDAO;
import edu.moduloalumno.entity.Curso;
import edu.moduloalumno.service.ICursoService;

@Service
public class CursoServiceImpl implements ICursoService{

	@Autowired
	private ICursoDAO cursoDAO;
	
	@Override
	public List<Curso> getAllCursos(String cod_alumno) {
		
		List<Curso> cursoList = cursoDAO.getAllCursos(cod_alumno);
		
		return cursoList;
	}

}

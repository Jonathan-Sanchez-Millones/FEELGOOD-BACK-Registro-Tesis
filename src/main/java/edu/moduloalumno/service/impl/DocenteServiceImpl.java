package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IDocenteDAO;
import edu.moduloalumno.entity.Docente;
import edu.moduloalumno.service.IDocenteService;

@Service
public class DocenteServiceImpl implements IDocenteService{

	@Autowired
	private IDocenteDAO docenteDAO;
	
	@Override
	public Docente getIdDocenteByNombre(String nombres, String apellPat, String apellMat) {
		Docente docente=docenteDAO.getIdDocenteByNombre(nombres, apellPat, apellMat);
		return docente;
	}
	
	@Override
	public List<Docente> getAllDocentes(){
		List<Docente> docente=docenteDAO.getAllDocentes();
		return docente;
	}


}

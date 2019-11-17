package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.ITesissDAO;
import edu.moduloalumno.entity.Tesiss;
import edu.moduloalumno.service.ITesissService;

@Service
public class TesissServiceImpl implements ITesissService{

	@Autowired
    private ITesissDAO tesissDAO;
	
	@Override
    public List<Tesiss> getAllTesiss(String codigo) {
        return tesissDAO.getAllTesiss(codigo);
    }

	@Override
	public List<Tesiss> getAllAlumnos(int id_docente) {
        return tesissDAO.getAllAlumnos(id_docente);

	}
}

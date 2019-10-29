package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IAlumnoDAO;
import edu.moduloalumno.dao.IEstadoDAO;
import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.Estado;
import edu.moduloalumno.service.IEstadoService;

@Service
public class EstadoServiceImpl implements IEstadoService{

	@Autowired
	private IEstadoDAO estadoDAO;
	
	@Override
	public List<Estado> getAllEstados() {
		
		List<Estado> estadoList = estadoDAO.getAllEstados();

		return estadoList;
	}

}

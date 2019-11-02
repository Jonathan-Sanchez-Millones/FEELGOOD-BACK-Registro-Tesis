package edu.moduloalumno.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.ITesissDAO;
import edu.moduloalumno.dao.ITesisssDAO;
import edu.moduloalumno.entity.Tesisss;
import edu.moduloalumno.service.ITesisssService;

@Service
public class TesisssServiceImpl implements ITesisssService{

	@Autowired
    private ITesisssDAO tesisssDAO;

	@Override
	public Tesisss getTesisss(int id_atematesis) {
		return tesisssDAO.getTesisss(id_atematesis);
	}
	
	
}

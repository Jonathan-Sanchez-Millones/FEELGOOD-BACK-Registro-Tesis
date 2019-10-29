package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IAlumnoDAO;
import edu.moduloalumno.dao.IRolDAO;
import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.Rol;
import edu.moduloalumno.service.IRolService;

@Service
public class RolServiceImpl implements IRolService{

	@Autowired
	private IRolDAO RolDAO;
	
	@Override
	public List<Rol> getAllRoles() {
		
		List<Rol> rolList = RolDAO.getAllRoles();
		
		return rolList;
	}

}

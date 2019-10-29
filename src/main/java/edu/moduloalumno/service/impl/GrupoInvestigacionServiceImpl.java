package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IGrupoInvestigacionDAO;
import edu.moduloalumno.entity.GrupoInvestigacion;
import edu.moduloalumno.service.IGrupoInvestigacionService;

@Service
public class GrupoInvestigacionServiceImpl implements IGrupoInvestigacionService{
	@Autowired
	private IGrupoInvestigacionDAO grupoinvestigacionDAO;
	
	@Override
	public List<GrupoInvestigacion> getAllGrupoInvestigaciones() {
		
		List<GrupoInvestigacion> grupoinvestigacionList = grupoinvestigacionDAO.getAllGrupoInvestigaciones();
		
		return grupoinvestigacionList;
	}
}

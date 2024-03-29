/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.service.impl;

import edu.moduloalumno.dao.IAlumnoTemaTesisDocenteDAO;
import edu.moduloalumno.entity.AlumnoTemaTesisDocente;
import edu.moduloalumno.service.IAlumnoTemaTesisDocenteService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yveth Calixto
 */
@Service
public class AlumnoTemaTesisDocenteServiceImpl implements IAlumnoTemaTesisDocenteService {

	@Autowired
    private IAlumnoTemaTesisDocenteDAO alumnoTemaTesisDocenteDAO;
    
	@Override
	public void deleteAlumnoTemaTesisDocente(int id_atematesis) {
		
		alumnoTemaTesisDocenteDAO.deleteAlumnoTemaTesisDocente(id_atematesis);
	}

    @Override
    public List<AlumnoTemaTesisDocente> getAllAlumnoTemaTesisDocente() {
           return alumnoTemaTesisDocenteDAO.getAllAlumnoTemaTesisDocente();
    }

    @Override
    public AlumnoTemaTesisDocente getAlumnoTemaTesisDocenteById(int idDoc, int idATemaTesis) {
           AlumnoTemaTesisDocente obj = alumnoTemaTesisDocenteDAO.getAlumnoTemaTesisDocenteById(idDoc,idATemaTesis);
		return obj;
    }

    @Override
    public AlumnoTemaTesisDocente addAlumnoTemaTesisDocente(AlumnoTemaTesisDocente alumnoTemaTesisDocente) {
           return alumnoTemaTesisDocenteDAO.addAlumnoTemaTesisDocente(alumnoTemaTesisDocente);
    }

    @Override
    public AlumnoTemaTesisDocente updateAlumnoTemaTesisDocente(AlumnoTemaTesisDocente alumnoTemaTesisDocente) {
                return alumnoTemaTesisDocenteDAO.updateAlumnoTemaTesisDocente(alumnoTemaTesisDocente);

    }

    @Override
    public void deleteAlumnoTemaTesisDocente(int idDoc, int idATemaTesis) {
            alumnoTemaTesisDocenteDAO.deleteAlumnoTemaTesisDocente(idDoc, idATemaTesis);
    }
    
}

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

/**
 *
 * @author Yveth Calixto
 */
public class AlumnoTemaTesisDocenteServiceImpl implements IAlumnoTemaTesisDocenteService {

    private IAlumnoTemaTesisDocenteDAO alumnoTemaTesisDocenteDAO;
    
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
    public void updateAlumnoTemaTesisDocente(AlumnoTemaTesisDocente alumnoTemaTesisDocente) {
                alumnoTemaTesisDocenteDAO.updateAlumnoTemaTesisDocente(alumnoTemaTesisDocente);

    }

    @Override
    public void deleteAlumnoTemaTesisDocente(int idDoc, int idATemaTesis) {
            alumnoTemaTesisDocenteDAO.deleteAlumnoTemaTesisDocente(idDoc, idATemaTesis);
    }
    
}

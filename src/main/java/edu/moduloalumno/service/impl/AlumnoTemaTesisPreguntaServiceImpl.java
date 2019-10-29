/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.service.impl;

import edu.moduloalumno.dao.IAlumnoTemaTesisPreguntaDAO;
import edu.moduloalumno.entity.AlumnoTemaTesisPregunta;
import edu.moduloalumno.service.IAlumnoTemaTesisPreguntaServicee;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoTemaTesisPreguntaServiceImpl  implements IAlumnoTemaTesisPreguntaServicee {
    @Autowired
    private IAlumnoTemaTesisPreguntaDAO alumnoTemaTesisPreguntaDAO;

    @Override
    public List<AlumnoTemaTesisPregunta> getAllAlumnoTemaTesisPregunta() {
           return alumnoTemaTesisPreguntaDAO.getAllAlumnoTemaTesisPregunta();

    }

    @Override
    public AlumnoTemaTesisPregunta getAlumnoTemaTesisPreguntaById(int idATemaTesis) {
           AlumnoTemaTesisPregunta obj = alumnoTemaTesisPreguntaDAO.getAlumnoTemaTesisPreguntaById(idATemaTesis);
		return obj;
    }

    @Override
    public AlumnoTemaTesisPregunta addAlumnoTemaTesisPregunta(AlumnoTemaTesisPregunta alumnoTemaTesisPregunta) {
           return alumnoTemaTesisPreguntaDAO.addAlumnoTemaTesisPregunta(alumnoTemaTesisPregunta);
    }

    @Override
    public void updateAlumnoTemaTesisPregunta(AlumnoTemaTesisPregunta alumnoTemaTesisPregunta) {
                alumnoTemaTesisPreguntaDAO.updateAlumnoTemaTesisPregunta(alumnoTemaTesisPregunta);
    }

    @Override
    public void deleteAlumnoTemaTesisPregunta(int idATemaTesis) {
                alumnoTemaTesisPreguntaDAO.deleteAlumnoTemaTesisPregunta(idATemaTesis);
    }
    
}

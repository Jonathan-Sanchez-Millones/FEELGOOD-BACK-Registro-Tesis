/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.service.impl;

import edu.moduloalumno.dao.IAlumnoTemaTesisDAO;
import edu.moduloalumno.entity.AlumnoTemaTesis;
import edu.moduloalumno.service.IAlumnoTemaTesisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diego Lopez
 */
@Service
public class AlumnoTemaTesisServiceImpl implements IAlumnoTemaTesisService {

    @Autowired
    private IAlumnoTemaTesisDAO alumnoTemaTesisDAO;

    @Override
    public List<AlumnoTemaTesis> getAllAlumnoTemaTesis() {
        return alumnoTemaTesisDAO.getAllAlumnoTemaTesis();
    }

    @Override
    public AlumnoTemaTesis getAlumnoTemaTesisById(int id_atematesis) {
        AlumnoTemaTesis obj = alumnoTemaTesisDAO.getAlumnoTemaTesisById(id_atematesis);
        return obj;
    }

    @Override
    public AlumnoTemaTesis getAlumnoTemaTesisByTitulo(String atematesis_titulo) {
        AlumnoTemaTesis obj = alumnoTemaTesisDAO.getAlumnoTemaTesisByTitulo(atematesis_titulo);
        return obj;
    }
    
    @Override
    public AlumnoTemaTesis addAlumnoTemaTesis(AlumnoTemaTesis alumnoTemaTesis) {
        return alumnoTemaTesisDAO.addAlumnoTemaTesis(alumnoTemaTesis);
    }

    @Override
    public void updateAlumnoTemaTesis(AlumnoTemaTesis alumnoTemaTesis) {
        alumnoTemaTesisDAO.updateAlumnoTemaTesis(alumnoTemaTesis);
    }

    @Override
    public void deleteAlumnoTemaTesis(int id_atematesis) {
        alumnoTemaTesisDAO.deleteAlumnoTemaTesis(id_atematesis);
    }

}

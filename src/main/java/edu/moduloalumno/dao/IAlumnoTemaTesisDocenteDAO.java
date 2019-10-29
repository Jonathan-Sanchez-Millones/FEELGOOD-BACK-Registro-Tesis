/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.AlumnoTemaTesisDocente;


/**
 *
 * @author Yveth Calixto
 */
public interface IAlumnoTemaTesisDocenteDAO {
    
        List<AlumnoTemaTesisDocente> getAllAlumnoTemaTesisDocente();

	AlumnoTemaTesisDocente getAlumnoTemaTesisDocenteById(int idAlum, int idDoc);

	AlumnoTemaTesisDocente addAlumnoTemaTesisDocente(AlumnoTemaTesisDocente alumnoTemaTesisDocente);

	void updateAlumnoTemaTesisDocente(AlumnoTemaTesisDocente alumnoTemaTesisDocente);

	void deleteAlumnoTemaTesisDocente(int idDoc, int idATemaTesis);
    
}

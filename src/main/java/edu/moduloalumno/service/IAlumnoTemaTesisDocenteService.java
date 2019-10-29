/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.service;

import edu.moduloalumno.entity.AlumnoTemaTesisDocente;
import java.util.List;

/**
 *
 * @author Yveth Calixto
 */
public interface IAlumnoTemaTesisDocenteService {
    
        List<AlumnoTemaTesisDocente> getAllAlumnoTemaTesisDocente();

	AlumnoTemaTesisDocente getAlumnoTemaTesisDocenteById(int idDoc, int idATemaTesis);
	
	AlumnoTemaTesisDocente addAlumnoTemaTesisDocente(AlumnoTemaTesisDocente alumnoTemaTesisDocente);

	void updateAlumnoTemaTesisDocente(AlumnoTemaTesisDocente alumnoTemaTesisDocente);

	void deleteAlumnoTemaTesisDocente(int idDoc, int idATemaTesis);
    
}

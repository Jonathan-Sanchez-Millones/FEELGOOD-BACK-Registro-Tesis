/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.dao;

import edu.moduloalumno.entity.AlumnoTemaTesisPregunta;
import java.util.List;

/**
 *
 * @author Yveth Calixto
 */
public interface IAlumnoTemaTesisPreguntaDAO {
        List<AlumnoTemaTesisPregunta> getAllAlumnoTemaTesisPregunta();

	AlumnoTemaTesisPregunta getAlumnoTemaTesisPreguntaById(int idATemaTesis);

	AlumnoTemaTesisPregunta addAlumnoTemaTesisPregunta(AlumnoTemaTesisPregunta alumnoTemaTesisPregunta);

	void updateAlumnoTemaTesisPregunta(AlumnoTemaTesisPregunta alumnoTemaTesisPregunta);

	void deleteAlumnoTemaTesisPregunta(int idATemaTesis);
}

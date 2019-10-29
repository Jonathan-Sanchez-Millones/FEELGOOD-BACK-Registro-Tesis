/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.dao;

import edu.moduloalumno.entity.AlumnoTemaTesis;
import java.util.List;

/**
 *
 * @author Diego Lopez
 */
public interface IAlumnoTemaTesisDAO {
    	List<AlumnoTemaTesis> getAllAlumnoTemaTesis();

	AlumnoTemaTesis getAlumnoTemaTesisById(int id_atematesis);

	AlumnoTemaTesis getAlumnoTemaTesisByTitulo(String atematesis_titulo);

	AlumnoTemaTesis addAlumnoTemaTesis(AlumnoTemaTesis alumnoTemaTesis);

	void updateAlumnoTemaTesis(AlumnoTemaTesis alumnoTemaTesis);

	void deleteAlumnoTemaTesis(int id_atematesis);
    
    
}

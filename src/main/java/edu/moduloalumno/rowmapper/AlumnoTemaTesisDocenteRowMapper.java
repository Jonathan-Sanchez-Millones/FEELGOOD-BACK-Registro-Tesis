/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.rowmapper;

import edu.moduloalumno.entity.AlumnoTemaTesisDocente;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Yveth Calixto
 */
public class AlumnoTemaTesisDocenteRowMapper implements RowMapper<AlumnoTemaTesisDocente>  {

    @Override
    public AlumnoTemaTesisDocente mapRow(ResultSet row, int rowNum) throws SQLException {
        AlumnoTemaTesisDocente alumnoTemaTesisDocente = new AlumnoTemaTesisDocente();
        alumnoTemaTesisDocente.setId_docente(row.getInt("id_docente"));
        alumnoTemaTesisDocente.setId_atematesis(row.getInt("id_atematesis"));
        alumnoTemaTesisDocente.setEstado_id(row.getInt("estado_id"));
        alumnoTemaTesisDocente.setRol_id(row.getInt("rol_id"));
        
        return alumnoTemaTesisDocente;

    }
    
    
}

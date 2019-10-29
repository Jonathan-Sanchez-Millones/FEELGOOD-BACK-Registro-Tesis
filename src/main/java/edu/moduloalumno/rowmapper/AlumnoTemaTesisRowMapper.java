/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.rowmapper;

import edu.moduloalumno.entity.AlumnoTemaTesis;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Diego Lopez
 */ 
public class AlumnoTemaTesisRowMapper implements RowMapper<AlumnoTemaTesis>{

    @Override
    public AlumnoTemaTesis mapRow(ResultSet row, int rowNum) throws SQLException {
        AlumnoTemaTesis alumnoTemaTesis = new AlumnoTemaTesis();
        
        alumnoTemaTesis.setId_atematesis(row.getInt("id_atematesis"));
        alumnoTemaTesis.setAtematesis_titulo(row.getString("atematesis_titulo"));
        alumnoTemaTesis.setAtematesis_situacion(row.getString("atematesis_situacion"));
        alumnoTemaTesis.setAtematesis_problema(row.getString("atematesis_problema"));
        alumnoTemaTesis.setAtematesis_justificacion(row.getString("atematesis_justificacion"));
        alumnoTemaTesis.setAtematesis_fecha(row.getDate("atematesis_fecha"));
        alumnoTemaTesis.setAtematesis_comentario(row.getString("atematesis_comentario"));
        alumnoTemaTesis.setCod_alumno(row.getString("cod_alumno"));
        alumnoTemaTesis.setId_programa(row.getInt("id_programa"));
        alumnoTemaTesis.setId_archivo(row.getInt("id_archivo"));
        alumnoTemaTesis.setGi_id(row.getInt("gi_id"));
        alumnoTemaTesis.setId_curso(row.getInt("id_curso"));
        alumnoTemaTesis.setPlanestudios(row.getInt("planestudios"));
        return alumnoTemaTesis;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.rowmapper;

import edu.moduloalumno.entity.AlumnoTemaTesisPregunta;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Yveth Calixto
 */
public class AlumnoTemaTesisPreguntaRowMapper implements RowMapper<AlumnoTemaTesisPregunta>{

    @Override
    public AlumnoTemaTesisPregunta mapRow(ResultSet row, int rowNum) throws SQLException {
          AlumnoTemaTesisPregunta alumnoTemaTesisPregunta = new AlumnoTemaTesisPregunta();
          alumnoTemaTesisPregunta.setId_atematesis(row.getInt("id_atematesis"));
          alumnoTemaTesisPregunta.setId_pregunta(row.getInt("id_pregunta"));
          alumnoTemaTesisPregunta.setRpta(row.getString("rpta"));
          alumnoTemaTesisPregunta.setRpta_detallada(row.getString("rpta_detallada"));
          return alumnoTemaTesisPregunta;
    }
    
}

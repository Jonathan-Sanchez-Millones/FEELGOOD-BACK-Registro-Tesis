package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Tesiss;

public class AlumnosRowMapper implements RowMapper<Tesiss>{

	@Override
    public Tesiss mapRow(ResultSet row, int rowNum) throws SQLException {
        Tesiss tesis = new Tesiss();
        tesis.setCodigo(row.getString("codigo"));
        tesis.setAlumno(row.getString("alumno"));
        tesis.setCurso(row.getString("curso"));
        tesis.setPlan_estudios(row.getInt("plan_estudios"));
        tesis.setTitulo(row.getString("titulo"));
      
        return tesis;
    }
}


package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Tesiss;
import edu.moduloalumno.entity.Tesisss;

public class TesisssRowMapper implements RowMapper<Tesisss>{

	@Override
	public Tesisss mapRow(ResultSet row, int rowNum) throws SQLException {
		
		 	Tesisss tesis = new Tesisss();
	        
		 	tesis.setAtematesis_titulo(row.getString("atematesis_titulo"));
		 	tesis.setAtematesis_situacion(row.getString("atematesis_situacion"));
		 	tesis.setAtematesis_problema(row.getString("atematesis_problema"));
		 	tesis.setAtematesis_justificacion(row.getString("atematesis_justificacion"));
		 	tesis.setAtematesis_fecha(row.getDate("atematesis_fecha"));
		 	tesis.setAtematesis_comentario(row.getString("atematesis_comentario"));
		 	tesis.setGi_id(row.getInt("gi_id"));
		 	tesis.setId_curso(row.getInt("id_curso"));
		 	tesis.setId_docente(row.getInt("id_docente"));
		 	tesis.setEstado_id(row.getInt("estado_id"));
		 	tesis.setRol_id(row.getInt("rol_id"));
	      
	        return tesis;
	}

}

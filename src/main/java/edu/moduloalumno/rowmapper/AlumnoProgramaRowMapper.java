package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.AlumnoPrograma;

public class AlumnoProgramaRowMapper implements RowMapper<AlumnoPrograma> {
	@Override
	public AlumnoPrograma mapRow(ResultSet row, int rowNum) throws SQLException {
		AlumnoPrograma alumnoPrograma = new AlumnoPrograma();
		alumnoPrograma.setCod_alumno(row.getString("cod_alumno"));
		alumnoPrograma.setId_programa(row.getInt("id_programa"));
		return alumnoPrograma;
	}
}
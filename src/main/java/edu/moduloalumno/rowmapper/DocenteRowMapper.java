package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Docente;

public class DocenteRowMapper implements RowMapper<Docente>{

	@Override
	public Docente mapRow(ResultSet row, int rowNum) throws SQLException {
		Docente docente = new Docente();
		docente.setIdDocente(row.getInt("id_docente"));
		docente.setNombres(row.getString("nombres"));
		docente.setApellPat(row.getString("apell_pat"));
		docente.setApellMat(row.getString("apell_mat"));

		return docente;
	}
}

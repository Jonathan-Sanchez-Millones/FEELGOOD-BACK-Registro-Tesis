package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Estado;

public class EstadoRowMapper implements RowMapper<Estado>{

	@Override
	public Estado mapRow(ResultSet row, int rowNum) throws SQLException {
		Estado estado = new Estado();
		estado.setEstado_id(row.getInt("estado_id"));
		estado.setEstado_descripcion(row.getString("estado_descripcion"));
		estado.setEstado_abrev(row.getString("estado_abrev"));
	
		return estado;
	}
}

package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Rol;

public class RolRowMapper implements RowMapper<Rol>{

	@Override
	public Rol mapRow(ResultSet row, int rowNum) throws SQLException {
		Rol rol = new Rol();
		rol.setRol(row.getInt("rol_id"));
		rol.setRol_desc(row.getString("rol_desc"));
		rol.setRol_desc_min(row.getString("rol_desc_min"));
		rol.setRol_desc_ini(row.getString("rol_desc_ini"));
		
		return rol;
	}
}

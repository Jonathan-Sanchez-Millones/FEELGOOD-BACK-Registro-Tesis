package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.GrupoInvestigacion;

public class GrupoInvestigacionRowMapper implements RowMapper<GrupoInvestigacion>{

	@Override
	public GrupoInvestigacion mapRow(ResultSet row, int rowNum) throws SQLException {
		GrupoInvestigacion gi = new GrupoInvestigacion();
		gi.setId_gi(row.getInt("gi_id"));
		gi.setGi_desc(row.getString("gi_nombre"));
		gi.setGi_siglas(row.getString("gi_siglas"));
		
		return gi;
	}
}

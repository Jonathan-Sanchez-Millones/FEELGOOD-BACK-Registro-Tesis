package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IGrupoInvestigacionDAO;
import edu.moduloalumno.entity.GrupoInvestigacion;
import edu.moduloalumno.rowmapper.GrupoInvestigacionRowMapper;

@Transactional
@Repository
public class GrupoInvestigacionDAOImpl implements IGrupoInvestigacionDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<GrupoInvestigacion> getAllGrupoInvestigaciones() {
		String sql = "SELECT gi_id, gi_nombre , gi_siglas  FROM grupo_investigacion";
		
		RowMapper<GrupoInvestigacion> rowMapper = new GrupoInvestigacionRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	
}

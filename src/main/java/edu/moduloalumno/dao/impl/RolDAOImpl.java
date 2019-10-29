package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IRolDAO;
import edu.moduloalumno.entity.Rol;
import edu.moduloalumno.rowmapper.RolRowMapper;

@Transactional
@Repository
public class RolDAOImpl implements IRolDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Rol> getAllRoles() {
		
		String sql = "SELECT rol_id, rol_desc , rol_desc_min , rol_desc_ini  FROM rol";
		
		RowMapper<Rol> rowMapper = new RolRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

}

package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.AlumnoTemaTesis;
import edu.moduloalumno.entity.Tesiss;

public class TesissRowMapper implements RowMapper<Tesiss>{

	 @Override
	    public Tesiss mapRow(ResultSet row, int rowNum) throws SQLException {
	        Tesiss tesis = new Tesiss();
	        
	        tesis.setId_atematesis(row.getInt("id_atematesis"));
	        tesis.setTitulo(row.getString("titulo"));
	        tesis.setSituacion(row.getString("situacion"));
	        tesis.setProblema(row.getString("problema"));
	        tesis.setJustificacion(row.getString("justificacion"));
	        tesis.setFecha(row.getDate("fecha"));
	        tesis.setComentario(row.getString("comentario"));
	        tesis.setCodigo(row.getString("codigo"));
	        tesis.setAlumno(row.getString("alumno"));
	        tesis.setPrograma(row.getString("programa"));
	        tesis.setGrupo_investigacion(row.getString("grupo_investigacion"));
	        tesis.setCurso(row.getString("curso"));
	        tesis.setPlan_estudios(row.getInt("plan_estudios"));
	        tesis.setDocente(row.getString("docente"));
	        tesis.setEstado(row.getString("estado"));
	        tesis.setRol(row.getString("rol"));
	      
	        return tesis;
	    }
}

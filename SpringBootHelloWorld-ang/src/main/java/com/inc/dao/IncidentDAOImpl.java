package com.inc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.inc.constant.SQLConstant;
import com.inc.model.Incident;

@Repository
public class IncidentDAOImpl implements IncidentDAO {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void createInc(Incident inc) {
		Object[] params = new Object[] { inc.getIncidentID(), inc.getIncidentType(), inc.getPriority(),inc.getReportedDate(),
				 inc.getStoreNo(), inc.getCountry(), inc.getWorkedBy(), inc.getOccurnce(), inc.getBreachedTime()
				
			};
		
		try {
			jdbc.update(SQLConstant.QUERY_INSERT, params);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Incident> getAllInc() {
		try {
			return jdbc.query(SQLConstant.QUERY_SELECT, new BeanPropertyRowMapper<>(Incident.class));
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void delete(String id) {
		try {
			jdbc.update(SQLConstant.QUERY_DELETE, new Object[] { id });
		} catch (DataAccessException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public String findIncId(String incidentID) {
		String incId = null;
		try {
			incId = jdbc.queryForObject(SQLConstant.QUERY_FIND_INC_ID, new Object[] {incidentID}, String.class);
		} catch (DataAccessException e) {
			
			e.printStackTrace();
		}
		return incId;
	}

	@Override
	public Incident findInc(String id) {
		
		Incident inc = null;
		try {
			inc = jdbc.queryForObject(SQLConstant.QUERY_FIND_INC, new Object[] {id}, new BeanPropertyRowMapper<>(Incident.class));
		} catch (DataAccessException e) {
			
			e.printStackTrace();
		}
		return inc;
	}

	@Override
	public void update(Incident inc) {
		
		Object[] params = new Object[] { inc.getIncidentID(), inc.getIncidentType(), inc.getPriority(),inc.getReportedDate(),
				 inc.getStoreNo(), inc.getCountry(), inc.getWorkedBy(), inc.getOccurnce(), inc.getBreachedTime(), inc.getIncidentID()
				
			};
		
		try {
			  jdbc.update(SQLConstant.QUERY_UPDATE, params);
		} catch (DataAccessException e) {
			
			e.printStackTrace();
		}
		 
	}

}

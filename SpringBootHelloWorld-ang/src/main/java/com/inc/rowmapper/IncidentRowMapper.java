package com.inc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.inc.model.Incident;

public class IncidentRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Incident inc = new Incident();
		inc.setIncidentID(rs.getString("incidentid"));
		inc.setIncidentType(rs.getString("incidenttype"));
		inc.setPriority(rs.getString("priority"));
		inc.setReportedDate(rs.getDate("reporteddate"));
		inc.setStoreNo(rs.getString("storeno"));
		inc.setCountry(rs.getString("country"));
		inc.setWorkedBy(rs.getString("workedby"));
		inc.setOccurnce(rs.getString("occurence"));
		inc.setBreachedTime(rs.getDate("breachedtime"));
		return inc;
	}

}

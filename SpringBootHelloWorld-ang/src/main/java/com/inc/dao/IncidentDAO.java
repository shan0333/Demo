package com.inc.dao;

import java.util.List;

import com.inc.model.Incident;

public interface IncidentDAO {

	void createInc(Incident inc);

	List<Incident> getAllInc();

	void delete(String id);

	String findIncId(String incidentID);

	Incident findInc(String id);

	void update(Incident i);

}

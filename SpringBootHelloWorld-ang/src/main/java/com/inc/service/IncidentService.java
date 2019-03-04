package com.inc.service;

import java.util.List;

import com.inc.model.Incident;

public interface IncidentService {

	void createInc(Incident inc);

	List<Incident> getAllInc();

	void delete(String id);

	boolean findIncId(String incidentID);

	Incident findInc(String id);

	void update(Incident i);

	
}

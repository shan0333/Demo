package com.inc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inc.dao.IncidentDAO;
import com.inc.model.Incident;

@Service
public class IncidentServiceImpl implements IncidentService {

	@Autowired
	private IncidentDAO iDao;

	@Override
	public void createInc(Incident inc) {
		iDao.createInc(inc);
	}

	@Override
	public List<Incident> getAllInc() {
		return iDao.getAllInc();
	}

	@Override
	public void delete(String id) {
		iDao.delete(id);

	}

	@Override
	public boolean findIncId(String incidentID) {
		boolean isIncId = false;
		String incId = iDao.findIncId(incidentID);
		if (incId != null) {
			isIncId = true;
		}
		return isIncId;
	}

	@Override
	public Incident findInc(String id) {
		return iDao.findInc(id);
	}

	@Override
	public void update(Incident i) {
		iDao.update(i);
		
	}

}

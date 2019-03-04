package com.inc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inc.model.Incident;
import com.inc.service.IncidentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class IncidentController {

	@Autowired
	IncidentService iService;

	@GetMapping(value = "/incident/list", produces = "application/json")
	public List<Incident> getAllInc() {
		return iService.getAllInc();
	}

	@DeleteMapping(path = { "incident/delete/{id}" })
	public void delete(@PathVariable("id") String id) {
		iService.delete(id);
	}

	@RequestMapping(value = "/incident", method = RequestMethod.POST)
	public String create(@RequestBody Incident inc) {

		String response;
		boolean isTrue = iService.findIncId(inc.getIncidentID());
		if (isTrue) {
			response = "INC Already exist";
		} else {
			iService.createInc(inc);
			response = "INC Created sucessfully";
		}

		return response;
	}

	@RequestMapping(value = "/incident/getInc/{id}", method = RequestMethod.GET)
	public Incident create(@PathVariable String id) {
		return iService.findInc(id);
	}

	@RequestMapping(value = "/incident/update/", method = RequestMethod.PUT)
	public String update(@RequestBody Incident inc) {
		
		String response = null;
		Incident i = iService.findInc(inc.getIncidentID());
		
		if(i != null) {
			i.setIncidentID(inc.getIncidentID());
			i.setIncidentType(inc.getIncidentType());
			i.setPriority(inc.getPriority());
			i.setReportedDate(inc.getReportedDate());
			i.setStoreNo(inc.getStoreNo());
			i.setCountry(inc.getCountry());
			i.setWorkedBy(inc.getWorkedBy());
			i.setOccurnce(inc.getOccurnce());
			i.setBreachedTime(inc.getBreachedTime());
			try {
				iService.update(i);
				response = "Incident Updated";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				response = "Something went wrong. Please contact admin";
			}
		}
		return response;
		
		 
		 
		 
	}

}
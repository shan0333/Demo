package com.inc.model;

import java.util.Date;

public class Incident {

	private String incidentID;
	private String incidentType;
	private String priority;
	private Date reportedDate;
	private String storeNo;
	private String country;
	private String workedBy;
	private String occurnce;
	private Date breachedTime;

	public String getIncidentID() {
		return incidentID;
	}

	public void setIncidentID(String incidentID) {
		this.incidentID = incidentID;
	}

	public String getIncidentType() {
		return incidentType;
	}

	public void setIncidentType(String incidentType) {
		this.incidentType = incidentType;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Date getReportedDate() {
		return reportedDate;
	}

	public void setReportedDate(Date reportedDate) {
		this.reportedDate = reportedDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWorkedBy() {
		return workedBy;
	}

	public void setWorkedBy(String workedBy) {
		this.workedBy = workedBy;
	}

	public String getOccurnce() {
		return occurnce;
	}

	public void setOccurnce(String occurnce) {
		this.occurnce = occurnce;
	}

	public Date getBreachedTime() {
		return breachedTime;
	}

	public void setBreachedTime(Date breachedTime) {
		this.breachedTime = breachedTime;
	}

	public String getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	
	
	
}

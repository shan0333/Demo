package com.inc.constant;

public class SQLConstant {

	/*private String incidentID;
	private String incidentType;
	private String priority;
	private Date reportedDate;
	private String storeNo;
	private String country;
	private String workedBy;
	private String occurnce;
	private Date breachedTime;*/
	
	public static String QUERY_INSERT = "insert into incident values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public static String QUERY_SELECT = "select * from incident";
	
	public static String QUERY_DELETE = "delete from incident where incidentid = ?";
	
	public static String QUERY_FIND_INC_ID = "select incidentid from incident where incidentid = ?";
	
	public static String QUERY_FIND_INC = "select * from incident where incidentid = ? ";
	
	public static String QUERY_UPDATE = "update incident set incidentid =?, incidentType=?, priority =?, reportedDate =?, storeNo =?, country =?, workedBy =?, occurnce =?, breachedTime =? where incidentid = ? ";
	
}

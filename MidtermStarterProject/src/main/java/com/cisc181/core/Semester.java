package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

public class Semester {

	//Attributes SemesterID(UUID), StartDate(date), EndDate(date) 
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	//No-arg Constructor
	public Semester(){
		
	}
	
	//3-arg Constructor
	public Semester(UUID SemesterID, Date StartDate, Date EndDate){
		SemesterID = SemesterID;
		StartDate = StartDate;
		EndDate = EndDate;
	}
	
	//SemesterID
	public void setSemesterID(UUID semesterID){
		SemesterID = semesterID;
	}	
	public UUID getSemesterID(){
		return SemesterID;
	}
	
	//StartDate
	public void setStartDate(Date startdate){
		StartDate = startdate;
	}
	public Date getStartDate(){
		return StartDate;
	}
	
	//EndDate
	public void setEndDate(Date enddate){
		EndDate = enddate;
	}
	public Date getEndDate(){
		return EndDate;
	}

}

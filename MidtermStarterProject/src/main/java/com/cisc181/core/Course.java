package com.cisc181.core;
import java.util.UUID;

import com.cisc181.eNums.eMajor;


public class Course {

	//Attributes: CourseID(UUID), CourseName(String), GradePoint(int)
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	//No-arg Constructor 
	public Course(){
		
	}
	
	// Constructor with Arguments
	public Course (String CourseName, UUID CourseID, int GradePoints, eMajor Major){
		this.CourseName = CourseName;
		this.CourseID = CourseID;
		this.GradePoints = GradePoints;	
		this.Major = Major;
	}
	
	//CourseID 
	private void setCourseID(UUID courseID){
		CourseID = courseID;
	}
	public UUID getCourseID(){
		return CourseID;
	}
	
	//CourseName
	private void setCourseName(String courseName){
		CourseName = courseName;
	}
	public String getCourseName(){
		return CourseName;
	}
	
	//GradePoints
	private void setGradePoints(int gradepoints){
		GradePoints = gradepoints;
	}
	public int getGradePoints(){
		return GradePoints; 
	}
	
	//Major
	private void setMajor(eMajor major){
		Major = major;
	}
	public eMajor getMajor(){
		return Major; 
	}
	
}

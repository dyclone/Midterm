package com.cisc181.core;
import java.util.UUID;

public class Enrollment {

	//Attributes SectionId(UUID), StudentID(UUID), EnrollmentID(UUID), Grades(Double)
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	//no-arg constructor
	private Enrollment(){
		
	}
	//two-arg Constructor with StudentID and SectionId as input and EnrollmentID set in constructor
	public  Enrollment(UUID SectionID, UUID StudentID){
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		UUID Enrollment = UUID.randomUUID();
		this.EnrollmentID = EnrollmentID;
	}
	
	//SectionID
		public void setSectionID(UUID sectionID){
			SectionID = sectionID;
		}
		public UUID getSectionID(){
			return SectionID;
		}
		
	//StudentID
		public void setStudentID(UUID studentID){
			StudentID = studentID;
		}
		public UUID getStudentID(){
			return StudentID;
		}
	
		//SetGrade defined as procedure
	public void setGrade(double grade){
		Grade = grade;
	}
	
	
}

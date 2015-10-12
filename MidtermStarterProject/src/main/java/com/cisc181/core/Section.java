package com.cisc181.core;
import java.util.UUID;

public class Section {

	//Attributes SectionID(UUID), RoomID(int)
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	//No-arg Constructor
	public Section(){
		
	}
	public Section( UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID){
	this.CourseID = CourseID;
	this.SemesterID = SemesterID;	
	this.SectionID = SectionID;
	this.RoomID = RoomID;
	}
	
	//CourseID
		public void setCourseID(UUID courseID){
			CourseID = courseID;
		}
		public UUID getCourseID(){
			return CourseID;
		}
		
	//SemesterID
		public void setSemesterID(UUID semesterID){
			SemesterID = semesterID;
		}
		public UUID getSemesterID(){
			return SemesterID;
		}
		
	//SectionID
	public void setSectionID(UUID sectionID){
		SectionID = sectionID;
	}
	public UUID getSectionID(){
		return SectionID;
	}
	
	//RoomID
	public void setRoomID(int roomid){
		RoomID = roomid;
	}
	public int getRoomID(){
		return RoomID;
	}
}

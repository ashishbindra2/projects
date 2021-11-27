package com.ashi.studentProject;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.sql.Date;

//import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	private int studentNo;
	private String studentName;
	private Date studentDob;
	private Date studentDoj;
	

	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(Date string) {
		this.studentDob = string;
	}
	public Date getStudentDoj() {
		return studentDoj;
	}
	public void setStudentDoj(Date string) {
		this.studentDoj = string;
	}
	
	
	@Override
	public String toString() {
		return "Student [ studentNo=" + studentNo + ", studentName=" + studentName
				+ ", studentDob=" + studentDob + ", studentDoj=" + studentDoj + "]";
	}
}

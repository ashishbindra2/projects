package com.ashi.studentProject;

import jakarta.xml.bind.annotation.XmlRootElement;

//import java.sql.Date;

//import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	
	private int studentId;
	private int studentNo;
	private String studentName;
	private String studentDob;
	private String studentDoj;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
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
	public String getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(String string) {
		this.studentDob = string;
	}
	public String getStudentDoj() {
		return studentDoj;
	}
	public void setStudentDoj(String string) {
		this.studentDoj = string;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNo=" + studentNo + ", studentName=" + studentName
				+ ", studentDob=" + studentDob + ", studentDoj=" + studentDoj + "]";
	}
}

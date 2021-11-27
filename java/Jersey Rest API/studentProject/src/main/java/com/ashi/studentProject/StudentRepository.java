package com.ashi.studentProject;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	List<Student> student;

	public StudentRepository() {
		student = new ArrayList<>();
		Student s1 = new Student();
		s1.setStudentId(1);
		s1.setStudentNo(1);
		s1.setStudentName("ashish");
		s1.setStudentDob("1/1/2002");
		s1.setStudentDoj("1/1/2002");

		Student s2 = new Student();
		s2.setStudentId(2);
		s2.setStudentNo(2);
		s2.setStudentName("bindra");
		s2.setStudentDob("1/1/2002");
		s2.setStudentDoj("1/1/2002");
		student.add(s1);
		student.add(s2);
	}

	public List<Student> getStudent() {
		return student;
	}

	public Student getStudent(int id) {
		for (Student s : student) {
			if (s.getStudentId() == id)
				return s;
		}
		return null;
	}

	public void addNewStudent(Student s1) {
		student.add(s1);
		
	}
}

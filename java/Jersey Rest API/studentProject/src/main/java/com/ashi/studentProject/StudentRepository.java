package com.ashi.studentProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

	Connection con = null;

	public StudentRepository() {
		String url = "jdbc:mysql://localhost:3306/studentdb";
		String username = "root";
		String password = "airline";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		String sql = "SELECT * FROM student";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Student s = new Student();
				s.setStudentNo(rs.getInt(1));
				s.setStudentName(rs.getString(2));
				s.setStudentDob(rs.getDate(3));
				s.setStudentDoj(rs.getDate(4));
				students.add(s);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return students;
	}

	public Student getStudent(int id) {
		String sql = "SELECT * FROM student WHERE student_no=" + id;
		Student s = new Student();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				s.setStudentNo(rs.getInt(1));
				s.setStudentName(rs.getString(2));
				s.setStudentDob(rs.getDate(3));
				s.setStudentDoj(rs.getDate(4));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return s;

	}

	public void addNewStudent(Student s1) {
		String sql = "INSERT INTO student(student_no,student_name,student_dob,student_doj) VALUES(?,?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);

			st.setInt(1, s1.getStudentNo());
			st.setString(2, s1.getStudentName());
			st.setDate(3, s1.getStudentDob());
			st.setDate(4, s1.getStudentDoj());
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void updateStudent(Student s1) {
		String sql = "UPDATE  student SET student_name=?,student_dob=?,student_doj=? WHERE student_no=?";
		try {
			PreparedStatement st = con.prepareStatement(sql);

			st.setString(1, s1.getStudentName());
			st.setDate(2, s1.getStudentDob());
			st.setDate(3, s1.getStudentDoj());
			st.setInt(4, s1.getStudentNo());
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

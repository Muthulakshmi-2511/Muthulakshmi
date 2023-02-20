package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("student name is :Lakshmi");
	}
	public void studentId() {
		System.out.println("student id is :"+2527);
	}
	public void studentDept() {
		System.out.println("student department is :ece");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student mystudent=new Student();
		mystudent.studentName();
		mystudent.studentDept();
		mystudent.studentId();
		mystudent.deptName();
		mystudent.collegeCode();
		mystudent.collegeName();
		mystudent.collegeRank();

	}

}

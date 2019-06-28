package jdbcPrc;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{
	int rollno;
	String name;
	String course;
	public Student(int rollno, String name, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + "]";
	}
	public void accept() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rollno ");
		this.rollno=sc.nextInt();
		System.out.println("Enter name ");
		this.name=sc.next();
		System.out.println("Enter course ");
		this.course=sc.next();
	}
}

package jdbcPrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDB {
	static Connection conn;
	public static void insert() {
	
	}
	public static void display() {
		String query1="select * from student";
		try {
			Class.forName("jdbc.mysql.jdbc.driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/std", "root", "root");
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root", "root");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query1);
			while(rs.next()) {
				System.out.println("Rollno is : "+rs.getInt("rollno"));
				System.out.println("Name is : "+rs.getString("name"));
				System.out.println("course is : "+rs.getString("course"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/std", "root", "root");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 Scanner sc =new Scanner(System.in);
		 System.out.println("1.display 2.Insert ");
int ch=sc.nextInt();
		switch (ch) {
		case 1:
			String query1="select * from student";
			try {
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(query1);
				while(rs.next()) {
					System.out.println("Rollno is : "+rs.getInt("rollno"));
					System.out.println("Name is : "+rs.getString("name"));
					System.out.println("course is : "+rs.getString("course"));
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			break;
		case 2: 
			PreparedStatement pst=null;
			try {
				String query="insert into student(rollno,name,course) values(?,?,?)"; 
				pst=conn.prepareStatement(query);		
				
				System.out.println("enter roll no");
				int roll= sc.nextInt();
				System.out.println("enter name ");
				String name = sc.next();
				System.out.println("enter course");
				String course =sc.next();
				
				pst.setInt(1,roll);
				pst.setString(2, name);
				pst.setString(3, course);
				
				int count =pst.executeUpdate();
				if(count>0)
					System.out.println("Data Inserted");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			break;
		default:
			break;
		}
		display();

	}

}

package ssa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class Mainline {
	
	public static Connection  myConn=null;
	public static PreparedStatement myStmt=null;
	public static ResultSet myRs=null;
	
	

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		
		
		makeConnection();
		 
	
 		try { 
			Students students = new Students(); 
 			Student newStudent1 = students.getById(100); 
 			//System.out.println(student); 
 			 
 			newStudent1.firstName = "Eric"; 
 			students.update(newStudent1); 
 			newStudent1 = students.getById(100); 
 			System.out.println(newStudent1); 
 			 
 			Student newStudent2 = new Student(); 
 			newStudent2.firstName = "Davey"; 
 			newStudent2.lastName = "Jones"; 
 			newStudent2.gpa = 3.5; 
 			newStudent2.sat = 1400; 
 			students.insert(newStudent2); 
 			 
 			List<Student> moreStudents = students.getAllStudents(); 
 			for(Student aStudent : moreStudents) { 
 				System.out.println(aStudent); 
 			} 
 			 
 			students.deleteById(202); 
 			 
 			System.out.println("Remaining students"); 
 			List<Student> allStudents = students.getAllStudents(); 
 			for(Student aStudent : allStudents) { 
 				System.out.println(aStudent); 
 			} 
 		} catch (Exception ex) { ex.printStackTrace(); } 
 	} 


	
	static void makeConnection() throws FileNotFoundException, IOException, SQLException {
		
		Properties prop= new Properties();
		prop.load(new FileInputStream("student.properties"));
		String dburl= prop.getProperty("dburl");
		String userName= prop.getProperty("userName");
		String pass= prop.getProperty("pass");
		myConn=DriverManager.getConnection(dburl, userName, pass);
		
		
	}
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


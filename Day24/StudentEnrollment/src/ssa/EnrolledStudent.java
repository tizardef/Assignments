package ssa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class EnrolledStudent {
	
	public static Connection  myConn=null;
	public static PreparedStatement myStmt=null;
	public static ResultSet myRs=null;

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		
	
	enrollStudent();
	makeConnection();
	assignMajor();
	fetchMajor();
	fetchSat();
	
	}
	
	
	static void makeConnection() throws FileNotFoundException, IOException, SQLException {
		
		Properties prop= new Properties();
		prop.load(new FileInputStream("student.properties"));
		String dburl= prop.getProperty("dburl");
		String userName= prop.getProperty("userName");
		String pass= prop.getProperty("pass");
		myConn=DriverManager.getConnection(dburl, userName, pass);
		
		
	}
	
	private static void enrollStudent() throws SQLException{
		
		try{
			makeConnection();
			myStmt= myConn.prepareStatement("Insert into student(first_name, last_name, sat, gpa) values(?,?,?,?)");
			
			
			myStmt.setString(1, "Lou");
			myStmt.setString(2, "Zar");
			myStmt.setInt(3, 950);
			myStmt.setDouble(4, 3.0);
			myStmt.executeUpdate();
			
		}catch(Exception ex){
			
		}finally{
			
		}
		
	}
	
	private static void assignMajor() throws SQLException{
		
		fetchSat();
		fetchMajor();
		
		
	
		try{
			makeConnection();
			myStmt= myConn.prepareStatement("update student set major_id= ? where id=?");
			
			myStmt.setInt(1, 1);
			myStmt.setInt(2, 1);
			myStmt.executeUpdate();
			
			//display();
			
		}catch(Exception ex){
			
		}finally{
			
		}
		
	}
	
	private static void fetchMajor() throws SQLException{

		try{
			makeConnection();
			
			myStmt= myConn.prepareStatement("select student.first_name, student.last_name, major.description from student join major on student.major_id = major_id");
			
			//Set parameter values
			
			
			//Execute the Query
			myRs= myStmt.executeQuery();
			
		}catch(Exception ex){
			//ex.printStackTrace();
		}finally{
			
			//currently working on this print output 
			//System.out.println("myRs.get.student.first_name + myRs.get.student.last_name + myRs.get.student.major_id + myRs.get.major.description");
			
		}

		}
	
	private static void fetchSat() throws SQLException{

		try{
			makeConnection();
			
			myStmt= myConn.prepareStatement("select sat from student where id = ");
			
			//Set parameter values
			myStmt.setInt(1, 100);
			//myStmt.
			
			//Execute the Query
			myRs= myStmt.executeQuery();
		
			if(myRs.getInt("sat") >= 1000){
				assignMajor();
			}else System.out.println("SAT score does not meet major requirement");
				
		
			
			
		}catch(Exception ex){
			//ex.printStackTrace();
		}finally{
			
			
		}

		}


	
}

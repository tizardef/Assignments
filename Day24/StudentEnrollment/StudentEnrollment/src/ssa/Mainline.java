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

public class Mainline {
	
	public static Connection  myConn=null;
	public static PreparedStatement myStmt=null;
	public static ResultSet myRs=null;
	
	

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		
assignMajor();
display();
signUpForClass();
enrollStudent();
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
			
			
			myStmt.setString(1, "Adam");
			myStmt.setString(2, "Zapel");
			myStmt.setInt(3, 1200);
			myStmt.setDouble(4, 3.0);
			myStmt.executeUpdate();
			
			myStmt.setString(1, "Graham");
			myStmt.setString(2, "Krakir");
			myStmt.setInt(3, 500);
			myStmt.setDouble(4, 2.5);
			myStmt.executeUpdate();
			
			myStmt.setString(1, "Ella");
			myStmt.setString(2, "Vader");
			myStmt.setInt(3, 800);
			myStmt.setDouble(4, 3.0);
			myStmt.executeUpdate();
			
			myStmt.setString(1, "Stanley");
			myStmt.setString(2, "Kupp");
			myStmt.setInt(3, 1350);
			myStmt.setDouble(4, 3.3);
			myStmt.executeUpdate();
			
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
				
	
		try{
			makeConnection();
			myStmt= myConn.prepareStatement("update student set major_id= ? where id=?");
			
			myStmt.setInt(1, 3);
			myStmt.setInt(2, 191);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 7);
			myStmt.setInt(2, 192);
			myStmt.executeUpdate();

			myStmt.setInt(1, 2);
			myStmt.setInt(2, 193);
			myStmt.executeUpdate();

			myStmt.setInt(1, 5);
			myStmt.setInt(2, 194);
			myStmt.executeUpdate();

			myStmt.setInt(1, 6);
			myStmt.setInt(2, 195);
			myStmt.executeUpdate();

			
			
			
		}catch(Exception ex){
			
		}finally{
			if(myConn !=null)
				myConn.close();	

			if(myStmt !=null)
				myStmt.close();
			
			}
		
	}
	
	

		

	private static void display() throws SQLException {
		try {
			makeConnection();
			myStmt= myConn.prepareStatement("select table2.*, class.subject,class.section from "
					+ "(select table1.* , major_class_relationship.class_id from ("
					+ "select student.first_name, student.last_name, student.sat, student.major_id, "
					+ "major.description from student join major on student.major_id = major.id) as table1"
					+ " join major_class_relationship on table1.major_id = major_class_relationship.major_id ) as table2"
					+ " join class on table2.class_id=class.id;");

			myRs= myStmt.executeQuery();
			System.out.println("Education System - Enrollment Process");
			System.out.println("=====================================");
			System.out.println("Enrolled"+ myRs.getString("first_name") + " " +  myRs.getString("last_name") + " " + "as a new student." + "\n" + myRs.getString("first_name") + " " + myRs.getString("last_name") + " " + "has an SAT score of" + " " + myRs.getInt("sat") + "." + "\n" + "Asigned" + " " + myRs.getString("first_name") + " " + myRs.getString("last_name") + " " + "to the" + " " + myRs.getInt("description") + " " + "major which requires a required SAT score of" + " " + myRs.getInt("sat") + "\n" + "Enrolled" + " " + myRs.getString("first_name") + " " + myRs.getString("last_name") + " " + "in the following classes:" + "\n" + "1." + " " + myRs.getString("subject") + " " + myRs.getInt("section") + " " + "required for major" + "\n" + "2." + " " + myRs.getString("subject") + " " + myRs.getInt("section") + " " + "required for major" + "\n" + "3." + " " + myRs.getString("subject") + " " + myRs.getInt("section") + " " + " not required for major" + "4." + " " + myRs.getString("subject") + " " + myRs.getInt("section") + " " + " not required for major" );
			
			
			
		}catch(Exception ex){
			
		}finally{
			if(myConn !=null)
				myConn.close();	

			if(myStmt !=null)
				myStmt.close();
			
			}
		
	}
		

	
private static void signUpForClass() throws SQLException{
		
	
		
		
	
		try{
			makeConnection();
			myStmt= myConn.prepareStatement("insert into student_class_relationship (student_id, class_id) values (?, ?)");
			
			myStmt.setInt(1, 191);
			myStmt.setInt(2, 10101);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 191);
			myStmt.setInt(2, 10102);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 191);
			myStmt.setInt(2, 60222);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 191);
			myStmt.setInt(2, 40312);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 192);
			myStmt.setInt(2, 30101);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 192);
			myStmt.setInt(2, 30202);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 192);
			myStmt.setInt(2, 10101);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 192);
			myStmt.setInt(2, 10102);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 193);
			myStmt.setInt(2, 40311);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 193);
			myStmt.setInt(2, 40312);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 193);
			myStmt.setInt(2, 20202);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 193);
			myStmt.setInt(2, 20203);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 194);
			myStmt.setInt(2, 40311);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 194);
			myStmt.setInt(2, 40312);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 194);
			myStmt.setInt(2, 20202);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 194);
			myStmt.setInt(2, 20203);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 195);
			myStmt.setInt(2, 60221);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 195);
			myStmt.setInt(2, 60222);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 195);
			myStmt.setInt(2, 10101);
			myStmt.executeUpdate();
			
			myStmt.setInt(1, 195);
			myStmt.setInt(2, 10102);
			myStmt.executeUpdate();
			
			
			
			
		}catch(Exception ex){
			
		}finally{
			if(myConn !=null)
				myConn.close();	

			if(myStmt !=null)
				myStmt.close();
			
			}
		
	}
	
}

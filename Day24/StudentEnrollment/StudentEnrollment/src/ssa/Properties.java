package ssa;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Properties {

	static Connection myConn=null;
	static Statement stmt=null;
	static ResultSet rs=null;
	public static void main(String[] args) throws SQLException{
		
		try{
			EnrolledStudent std=new EnrolledStudent();
			std.makeConnection();
			
			
			
			stmt= myConn.createStatement();
			rs= stmt.executeQuery("select * from student");
			
			while(rs.next())
				System.out.println(rs.getString("first_name") + "\t \t" + rs.getString("last_name"));
			
		}catch(Exception ex){ ex.printStackTrace();
		}finally{
			if(myConn!= null)
				myConn.close();
			if(stmt !=null)
				stmt.close();
		}
	}
	
	
}
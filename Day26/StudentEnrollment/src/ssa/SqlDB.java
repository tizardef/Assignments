 package ssa; 
 import java.sql.*; 
 

 public class SqlDB { 
	String dburl = null; 
	String userName = null; 
 	String pass = null; 
	public Connection myConn = null; 
	 
 	public int executeSqlUpdate(String sql) throws SQLException { 
 		Statement stmt = myConn.createStatement(); 
 		try { 
 			int rowsAffected = stmt.executeUpdate(sql); 
 			return rowsAffected; 
		} catch(SQLException ex) { throw ex; } 
 	} 
 	public ResultSet executeSqlQuery(String sql) throws SQLException { 
		Statement stmt = myConn.createStatement(); 
 		try { 
 			ResultSet rs = stmt.executeQuery(sql); 
 			return rs; 
 		} catch(SQLException ex) { throw ex; } 
 	} 
 	public SqlDB(String dburl, String userName, String pass) throws SQLException { 
 		myConn = DriverManager.getConnection(dburl, userName, pass); 
 	} 
	public void close() throws SQLException { 
 		if(myConn != null) { myConn.close(); myConn = null; } 
 	} 
 } 

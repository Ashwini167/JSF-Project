package com.trial.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginController {
	public String authorizeUser(String userId, String password) throws Exception {
		String returnString = "failure";	
		
		// JDBC driver name and database URL 
		final String JDBC_DRIVER = "org.h2.Driver";   
		final String DB_URL = "jdbc:h2:~/test";  
		   
		//  Database credentials 
		final String USER = "user"; 
		final String PASS = "pass";
		   
		Connection conn = null; 
		Statement stmt = null; 
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			String sql = "SELECT PASSWORD FROM LOGIN WHERE USERID='"+userId+"'";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				if(rs.getString("PASSWORD").equals(password)){
					returnString = "success";
				}
			}
			rs.close();
			stmt.close(); 
			conn.close();
		}
		catch (SQLException se) {
			se.printStackTrace(); 
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { 
				if(stmt!=null) 
					stmt.close(); 
	         } 
			catch(SQLException se2) {
				
			}  
	        try { 
	        	if(conn!=null) 
	        		conn.close(); 
	         } 
	        catch(SQLException se){ 
	            se.printStackTrace(); 
	         }
		}
	    return returnString;
	}
}
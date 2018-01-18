package com.trial.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.trial.dto.LoginDTO;

public class LoginController {
	public String authorizeUser(LoginDTO loginDTO) throws Exception {
		String returnString = "failure";
		String userId = null;
		String password = null;
		
		// JDBC driver name and database URL 
		final String JDBC_DRIVER = "org.h2.Driver";   
		final String DB_URL = "jdbc:h2:~/test";  
		   
		//  Database credentials 
		final String USER = "user"; 
		final String PASS = "pass";
		   
		Connection conn = null; 
		Statement stmt = null; 
		
		try {
			if(loginDTO!=null) {
				userId = loginDTO.getUserID();
				password = loginDTO.getPassword();
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				stmt = conn.createStatement();
				String sql1 = "SELECT COUNT(*) FROM USER WHERE USER_ID='"+userId+"'";
				System.out.println("The query is: "+sql1);
				ResultSet rs1 = stmt.executeQuery(sql1);
				while(rs1.next()) {
					System.out.println("No of rows: "+rs1.getInt(1));
					if(rs1.getInt(1)==1) {					
						returnString = passwordCheck(userId, password);
					}
					else {
						returnString = "failure";
					}
				}
				rs1.close();
				stmt.close(); 
				conn.close();
			}
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
	
	public String passwordCheck(String userId, String password) throws Exception {
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
			String sql2 = "SELECT PASSWORD FROM USER WHERE USER_ID='"+userId+"'";
			System.out.println("Password query loop: "+sql2);
			ResultSet rs2 = stmt.executeQuery(sql2);
			while(rs2.next()) {
				System.out.println("Password from query is "+rs2.getString("PASSWORD"));
				System.out.println("Pwd from user input is "+password);
				if(rs2.getString("PASSWORD").equals(password)){
					System.out.println("Inside password check loop");
					returnString = "success";
				}
				else {
					returnString = "failure";
				}
			}
			rs2.close();
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
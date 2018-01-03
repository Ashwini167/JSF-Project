package com.trial.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SignUpController {
	public String addUser(String name, char gender, String dob, String email, long mobile1, long mobile2, String billingAddress, String shippingAddress, String userId, String password, char customerType) throws Exception {
		String returnString = "failure";	
		System.out.println("inside controller" + name);
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
			String sql = "INSERT INTO CUSTOMER VALUES (1003,'Ned Stark','M','1987-07-16','ned@north.com',9456123780,9000123456,'Address1 - 641789','Address2 - 789456','ned01','pass123','P')";
			stmt.executeUpdate(sql);
			System.out.println("query executed");
			stmt.close(); 
			conn.close();
			returnString = "success";
			System.out.println("success assigned");
		}
		catch (SQLException se) {
			System.out.println("SQL exception");
			se.printStackTrace(); 
		}
		catch (Exception e) {
			System.out.println("Common exception");
			e.printStackTrace();
		} finally {
			try { 
				if(stmt!=null) 
					stmt.close(); 
	         } 
			catch(SQLException se2) {
				System.out.println("SQL exception 2");
			}  
	        try { 
	        	if(conn!=null) 
	        		conn.close(); 
	         } 
	        catch(SQLException se){ 
	            se.printStackTrace(); 
	            System.out.println("SQL exception 3");
	         }
		}
		System.out.println("Return String is "+returnString);
	    return returnString;
	}
}

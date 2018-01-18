package com.trial.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.trial.dto.AddressDTO;
import com.trial.dto.UserDTO;
import com.trial.dto.UserDetailsDTO;

public class SignUpController {
	public String addUser(UserDTO userDTO) throws Exception {
		String returnString = "failure";
		String userId = null;
		String password = null;
		char userType='C';	
		
		// JDBC driver name and database URL 
		final String JDBC_DRIVER = "org.h2.Driver";   
		final String DB_URL = "jdbc:h2:~/test";  
		   
		//  Database credentials 
		final String USER = "user"; 
		final String PASS = "pass";
		   
		Connection conn = null; 
		Statement stmt = null; 
		try {
			if(userDTO!=null) {
				userId = userDTO.getUserId();
				password = userDTO.getPassword();
				userType = userDTO.getUserType();	
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				stmt = conn.createStatement();
				String sql = "INSERT INTO USER VALUES ('"+userId+"','"+password+"','"+userType+"')";
				stmt.executeUpdate(sql);
				System.out.println("query executed");
				stmt.close(); 
				conn.close();
				returnString = "success";
				System.out.println("success assigned");
			}
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
	
	public String addUserDetails(UserDetailsDTO userDetailsDTO) throws Exception {
		String returnString = "failure";	
		String userId = null;
		String firstName =null;
		String lastName = null;
		char gender = 'M';
		String dob = null;
		String email = null;
		long mobile = 0;
		System.out.println("inside add user method" + firstName);
		// JDBC driver name and database URL 
		final String JDBC_DRIVER = "org.h2.Driver";   
		final String DB_URL = "jdbc:h2:~/test";  
		   
		//  Database credentials 
		final String USER = "user"; 
		final String PASS = "pass";
		   
		Connection conn = null; 
		Statement stmt = null; 
		try {
			if(userDetailsDTO!=null) {
				userId = userDetailsDTO.getUserId();
				firstName = userDetailsDTO.getFirstName();
				lastName = userDetailsDTO.getLastName();
				gender = userDetailsDTO.getGender();
				dob = userDetailsDTO.getDob();
				email = userDetailsDTO.getEmail();
				mobile = userDetailsDTO.getMobile();
				
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				stmt = conn.createStatement();
				String sql = "INSERT INTO USER_DETAILS VALUES ('"+userId+"','"+firstName+"','"+lastName+"','"+gender+"','"+dob+"','"+email+"','"+mobile+"')";
				System.out.println("The query is: "+sql);
				stmt.executeUpdate(sql);
				System.out.println("query executed");
				stmt.close(); 
				conn.close();
				returnString = "success";
				System.out.println("success assigned");
			}
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
	
	public String addAddress(AddressDTO addressDTO) {
		String returnString = "failure";
		String userId = null; 
		String billingAddress = null;
		String shippingAddress = null;
		System.out.println("inside add address method" + userId);
		// JDBC driver name and database URL 
		final String JDBC_DRIVER = "org.h2.Driver";   
		final String DB_URL = "jdbc:h2:~/test";  
		   
		//  Database credentials 
		final String USER = "user"; 
		final String PASS = "pass";
		   
		Connection conn = null; 
		Statement stmt = null; 
		try {
			if(addressDTO!=null) {
				userId = addressDTO.getUserId();
				billingAddress = addressDTO.getBillingAddress();
				shippingAddress = addressDTO.getShippingAddress();
				
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				stmt = conn.createStatement();
				String sql1 = "INSERT INTO ADDRESS VALUES (default,'"+userId+"','"+shippingAddress+"','S')";
				String sql2 = "INSERT INTO ADDRESS VALUES (default,'"+userId+"','"+billingAddress+"','B')";
				System.out.println("The query is: "+sql1);
				stmt.executeUpdate(sql1);
				System.out.println("The query is: "+sql2);
				stmt.executeUpdate(sql2);
				System.out.println("Both queires executed");
				stmt.close(); 
				conn.close();
				returnString = "success";
				System.out.println("success assigned");
			}
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

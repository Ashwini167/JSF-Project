package com.trial.controller;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.trial.dto.ProductDTO;

public class ProductController {
	// JDBC driver name and database URL 
	final String JDBC_DRIVER = "org.h2.Driver";   
	final String DB_URL = "jdbc:h2:~/test";  
			   
	//  Database credentials 
	final String USER = "user"; 
	final String PASS = "pass";	

	Connection conn = null; 
	Statement stmt = null; 
	
	public String addProduct(ProductDTO productDTO, InputStream image) {
		String returnString = "failure";
		String productName = null;
		String supplierID = null;
		int price = 0;
		int quantity = 0;
		String productCategory = null;
		String productSection = null;
		
		try {
			if(productDTO!=null) {
				productName = productDTO.getProductName();
				supplierID = "ned7" ;
				price = productDTO.getPrice();
				quantity = productDTO.getQuantity();
				productCategory = productDTO.getProductCategory() ;
				productSection = productDTO.getProductSection();
				
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				String sql = "INSERT INTO PRODUCT VALUES "
						+ "(default,'"+productName+"',"+price+","+quantity+",'"+supplierID+"','"+productCategory+"','"+productSection+"',?,?,?)";				
				PreparedStatement statement = conn.prepareStatement(sql);	             
	            if (image != null) {
	                // fetches input stream of the upload file for the blob column
	                statement.setBlob(1, image);
	                statement.setBlob(2, image);
	                statement.setBlob(3, image);
	            }				
				System.out.println("The query is: "+sql);	
				statement.executeUpdate();
				//stmt.close(); 
				conn.close();
				returnString="success";
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
	
	public List<ProductDTO> viewProducts() {
		List<ProductDTO> productList = new ArrayList<ProductDTO>();
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			String sql = "SELECT * FROM PRODUCT";
			ResultSet rs = (ResultSet)stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("No of rows: "+rs.getInt(1));
				ProductDTO productDTO = new ProductDTO();
				productDTO.setProductID(rs.getInt("PRODUCT_ID"));
				productDTO.setProductName(rs.getString("PRODUCT_NAME"));
				productDTO.setPrice(rs.getInt("PRICE"));
				productDTO.setQuantity(rs.getInt("QUANTITY"));
				productDTO.setSupplierID(rs.getString("SUPPLIER_ID"));
				productDTO.setProductCategory(rs.getString("PRODUCT_CATEGORY"));
				productDTO.setProductSection(rs.getString("PRODUCT_SECTION"));
				//InputStream byteValue = rs.getBlob("IMAGE1").getBinaryStream();
				//productDTO.setImage1((Part)byteValue);
				productList.add(productDTO);						
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
		
		return productList;
	}
	
}

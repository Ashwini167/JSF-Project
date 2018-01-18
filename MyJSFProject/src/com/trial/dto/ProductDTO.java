package com.trial.dto;

import javax.servlet.http.Part;

public class ProductDTO {
	private int productID;
	private String productName;
	private String supplierID;
	private int price;
	private int quantity;
	private String productCategory;
	private String productSection;
	private Part image1;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductSection() {
		return productSection;
	}
	public void setProductSection(String productSection) {
		this.productSection = productSection;
	}	
	public Part getImage1() {
		return image1;
	}
	public void setImage1(Part image1) {
		this.image1 = image1;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
}

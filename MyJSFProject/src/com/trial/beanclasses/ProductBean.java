package com.trial.beanclasses;

import com.trial.controller.ProductController;
import com.trial.dto.ProductDTO;
import java.io.InputStream;
import java.util.List;
import javax.servlet.http.Part;

public class ProductBean {
	private String productName;
	private String supplierID;
	private int price;
	private int quantity;
	private String productCategory;
	private String productSection;
	private Part image1;
	private List<ProductDTO> productsList;
	
	public ProductBean() {
		System.out.println("Inside constructor");
		onLoad();
	}
	
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
	public List<ProductDTO> getProductsList() {
		return productsList;
	}
	public void setProductsList(List<ProductDTO> productsList) {
		this.productsList = productsList;
	}

	public String addProduct() {
		String actionResult = "failure";
		Part uploadedFile=getImage1();
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductName(productName);
		productDTO.setPrice(getPrice());
		productDTO.setQuantity(getQuantity());
		productDTO.setProductCategory(getProductCategory());
		productDTO.setProductSection(getProductSection());
				
		ProductController productController = new ProductController();
		try {
		actionResult = productController.addProduct(productDTO, processFileUpload(uploadedFile));
		}
		catch (Exception e)
		{
			actionResult = "failure";
		}
		System.out.println("Return value "+actionResult);
		return actionResult;		
	}	
	
	 public InputStream processFileUpload(Part uploadedFile) {
		 InputStream bytes=null;
		 try {	 
			 if (null!=uploadedFile) {	 
				 bytes = uploadedFile.getInputStream();
			 }
		 }
		 catch (Exception e) {
			 System.out.println("Exception while uploading file.. "+e);
		 }
		 return bytes;
	 }
	 
	 public String onLoad() {
		String actionResult = "failure";
		ProductController productController = new ProductController();
		try {
			List<ProductDTO> productList = productController.viewProducts();
			if(!productList.isEmpty()) {
				setProductsList(productList);
				}
				actionResult = "success";
		}
		catch (Exception e)
		{
			actionResult = "failure";
		}
		System.out.println("Return value "+actionResult);		 
		return actionResult;
	 }
	 
	 
}

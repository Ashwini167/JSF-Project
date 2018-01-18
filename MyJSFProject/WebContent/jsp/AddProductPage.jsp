<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/basicStyles.css" type="text/css" />
<title>Add Product</title>
</head>
<body>
	<f:view>
		<jsp:include page="../jsp/header.jsp"></jsp:include>
		<h:form enctype="multipart/form-data">
			<div class="title">
				<h:outputText id="bigTitle1" value="Add Product"></h:outputText>
			</div>
		<div class="productContainer">
			
			<h:outputText styleClass="elementsHeader" id="productNameIn" value="Product Name"></h:outputText>
			<h:inputText styleClass="inputTextBox" id="productName" value="#{productBean.productName}" required="true" maxlength="35" size="35"></h:inputText>
			
			<h:outputText styleClass="elementsHeader" id="priceIn" value="Price"></h:outputText>
			<h:inputText styleClass="inputTextBox" id="price" value="#{productBean.price}" required="true" maxlength="8" size="35"></h:inputText>
			
			<h:outputText styleClass="elementsHeader" id="quantityIn" value="Quantity"></h:outputText>
			<h:inputText styleClass="inputTextBox" id="quantity" value="#{productBean.quantity}" required="true" maxlength="5" size="35"></h:inputText>
			
			<h:inputHidden></h:inputHidden>
			
			<h:outputText styleClass="elementsHeader" id="prodSectionIn" value="Choose the product section:"></h:outputText>
			<h:selectOneMenu id="prodSection" value="#{productBean.productSection}" required="true" requiredMessage="Please select atleast one category!">
				<f:selectItem itemValue="default" itemLabel="Select.." noSelectionOption="true"/>
				<f:selectItem itemValue="men" itemLabel="Men" />
				<f:selectItem itemValue="women" itemLabel="Women" />
				<f:selectItem itemValue="homeappliances" itemLabel="Home Appliances" />
				<f:selectItem itemValue="gadgets" itemLabel="Gadgets" />
				<f:selectItem itemValue="hygiene" itemLabel="Personal hygiene and health care" />
				<f:selectItem itemValue="sportsbooks" itemLabel="Sports, books and more" />
			</h:selectOneMenu>
			
			<h:outputText styleClass="elementsHeader" id="prodCategoryIn" value="Choose the product category:"></h:outputText>
			<h:selectOneMenu id="prodCategory" value="#{productBean.productCategory}" required="true" requiredMessage="Please select atleast one category!">
				<f:selectItem itemValue="default" itemLabel="Select.." noSelectionOption="true"/>
				<f:selectItem itemValue="accessories" itemLabel="Accessories - Watches, Chains, Rings & Studs" />
				<f:selectItem itemValue="bags" itemLabel="Bags & Wallets" />
				<f:selectItem itemValue="dress" itemLabel="Dress" />
				<f:selectItem itemValue="footwear" itemLabel="Footwear" />
				<f:selectItem itemValue="mobile" itemLabel="Mobiles, Tabs, iPad" />
				<f:selectItem itemValue="electronics" itemLabel="Electronic applicances" />
				<f:selectItem itemValue="homedecor" itemLabel="Home Decor Items" />
				<f:selectItem itemValue="beauty" itemLabel="BeautyProducts" />
				<f:selectItem itemValue="books" itemLabel="Books" />
				<f:selectItem itemValue="sports" itemLabel="Sports Accessories" />
			</h:selectOneMenu>
			
			<h:outputText styleClass="elementsHeader" id="image1In" value="Product Name"></h:outputText>
			<h:inputFile id="image1" value="#{productBean.image1}"></h:inputFile>
		
			<h:commandButton styleClass="submitBtn" id="submitBtn" action="#{productBean.addProduct}" value="Sign In"></h:commandButton>
				
			</div>
		</h:form>
	</f:view>
</body>
</html>
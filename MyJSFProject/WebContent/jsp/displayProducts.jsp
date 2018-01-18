<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:h="http://java.sun.com/jsf/html"
	  xmlns:c="http://java.sun.com/jsf/core">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/basicStyles.css" type="text/css"/>
<script src="../js/basicScript.js"></script>
<title>Add Product</title>
</head>
<body>
	<f:view>
		<jsp:include page="../jsp/header.jsp"></jsp:include>
		
		<h:form>
		<div class="title">
			<h:outputText id="bigTitle1" value="Our products are"></h:outputText>
		</div>
		<h:dataTable value="#{productBean.productsList}" var="product" styleClass="order-table" headerClass="order-table-header" rowClasses="order-table-odd-row, order-table-even-row">
               <h:column>
                  <f:facet name="header" >
                      <h:outputText value="Product ID"/>
                  </f:facet>                      
           		  <h:outputText value="#{product.productID}"/>            
              </h:column>
              <h:column>
                  <f:facet name="header" >
                      <h:outputText value="Product Name"/>
                  </f:facet>    
                  <h:outputText value="#{product.productName}"/>
              </h:column>
              <h:column>
                  <f:facet name="header" >
                      <h:outputText value="Price (in Rs.)"/>
                  </f:facet>    
                  <h:outputText value="#{product.price}"/>
              </h:column>
              <h:column>
                  <f:facet name="header" >
                      <h:outputText value="Quantity"/>
                  </f:facet>    
                  <h:outputText value="#{product.quantity}"/>
              </h:column>
              <h:column>
                  <f:facet name="header" >
                      <h:outputText value="Product Category"/>
                  </f:facet>    
                  <h:outputText value="#{product.productCategory}"/>
              </h:column>
              <h:column>
                  <f:facet name="header" >
                      <h:outputText value="Product Section"/>
                  </f:facet>    
                  <h:outputText value="#{product.productSection}"/>
              </h:column>
          </h:dataTable>
			
		</h:form>
	</f:view>
</body>
</html>
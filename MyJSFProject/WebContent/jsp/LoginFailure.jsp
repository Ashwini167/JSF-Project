<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="../css/basicStyles.css" type="text/css" />
<title>Login Failed</title>
</head>
<body>
<f:view>
<jsp:include page="../jsp/header.jsp"></jsp:include>
<h:form>
<div class="title">
	<h:outputText id="bigTitle1" value="Either the userID or the password is incorrect. Please try again."></h:outputText>
</div>
</h:form>
</f:view>
</body>
</html>
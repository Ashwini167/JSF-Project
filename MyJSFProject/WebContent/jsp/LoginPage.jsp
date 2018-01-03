<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="../css/basicStyles.css" type="text/css" />
<title>Login Page</title>
</head>
<body>
<f:view>
<jsp:include page="../jsp/header.jsp"></jsp:include>
<h:form>
<div class="title">
	<h:outputText id="bigTitle1" value="Login"></h:outputText>
</div>
<div class="container">
		<h:outputText styleClass="elementsHeader" id="userID" value="User ID"></h:outputText>
		<h:inputText styleClass="inputTextBox" id="userId" value="#{loginBean.userID}" required="true" maxlength="30" size="35"></h:inputText>
		<h:outputText styleClass="elementsHeader" id="password" value="Password"></h:outputText>
		<h:inputSecret styleClass="inputTextBox" id="pwd" value="#{loginBean.password}" required="true" maxlength="30" size="35"></h:inputSecret>	
		<h:commandButton styleClass="submitBtn" id="submitBtn" action="#{loginBean.authorize}" value="Sign In"></h:commandButton>
		<h:selectBooleanCheckbox styleClass="rememberMe" value="RememberMe" id="chkRememberMe" />
		<h:outputLabel styleClass="checkBoxDisplay" id="remember" value="Remember me on this device"></h:outputLabel> 
    	<div class="elementsHeader floatRight">
    	<h:outputLink id="signup" value="../jsp/SignUpPage.jsp">New User? Sign up here!</h:outputLink>
    	</div>
	    <div class="elementsHeader floatRight">
	    <h:outputLink id="forgot" value="../jsp/ForgotPasswordPage.jsp">Forgot password?</h:outputLink>
		</div>
</div>
</h:form>
</f:view>
</body>
</html>
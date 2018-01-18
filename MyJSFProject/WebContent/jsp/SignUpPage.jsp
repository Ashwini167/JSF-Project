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
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Sign Up Page</title>
</head>
<body>
<f:view>
<jsp:include page="../jsp/header.jsp"></jsp:include>
<h:form>
<div class="title">
	<h:outputText id="bigTitle1" value="Sign Up!"></h:outputText>
</div>
<h:messages></h:messages>
<div class="signUpContainer">
		
		<h:outputText styleClass="elementsHeader" id="userTypeIn" value="Signup As:"></h:outputText>
		<h:selectOneMenu id="userType" value="#{signUpBean.userType}" required="true" requiredMessage="Please choose if you are logging in as customer or supplier">
			<f:selectItem itemValue="N" itemLabel="Select.." noSelectionOption="true"/>
			<f:selectItem itemValue="S" itemLabel="Supplier" />
			<f:selectItem itemValue="C" itemLabel="Customer" />
		</h:selectOneMenu>
		
		<h:outputText styleClass="elementsHeader" id="firstNameIn" value="First Name"></h:outputText>
		<h:inputText styleClass="inputTextBox" id="firstName" value="#{signUpBean.firstName}" required="true" maxlength="30" size="35" requiredMessage="Please enter the first name"></h:inputText>
		<h:outputText styleClass="elementsHeader" id="lastNameIn" value="Last Name"></h:outputText>
		<h:inputText styleClass="inputTextBox" id="lastName" value="#{signUpBean.lastName}" required="true" maxlength="30" size="35" requiredMessage="Please enter atleast one alphabet in the last name"></h:inputText>
		
		<h:outputText styleClass="elementsHeader" id="genderIn" value="Gender"></h:outputText>
		<h:selectOneRadio styleClass="elementsHeader" id="gender" value="#{signUpBean.gender}" required="true" requiredMessage="Please choose the gender">
					<f:selectItem itemValue="M" itemLabel="Male" />
					<f:selectItem itemValue="F" itemLabel="Female" />
					<f:selectItem itemValue="O" itemLabel="Others" />
		</h:selectOneRadio>
		
		<h:outputText styleClass="elementsHeader" id="dobIn" value="Enter your date of birth (YYYY-MM-DD format)"></h:outputText>
		<h:inputText styleClass="inputTextBox" id="dob" value="#{signUpBean.dob}" required="true" maxlength="30" size="35" requiredMessage="Please enter your date of birth"></h:inputText>
		
		<h:outputText styleClass="elementsHeader" id="mobileIn" value="Mobile number"></h:outputText>
		<h:inputText styleClass="inputTextBox" id="mobile" value="#{signUpBean.mobile}" required="true" maxlength="10" size="35" requiredMessage="Please enter your mobile number"></h:inputText>
				
		<h:outputText styleClass="elementsHeader" id="emailIn" value="Email ID"></h:outputText>
		<h:inputText styleClass="inputTextBox" id="email" value="#{signUpBean.email}" required="true" maxlength="30" size="35" requiredMessage="Please enter a valid email ID"></h:inputText>
		
		<h:outputText styleClass="elementsHeader" id="sAddrIn" value="Enter the shipping address"></h:outputText>
		<h:inputTextarea styleClass="elementsHeader" id="sAddr" cols="40" rows="5" value="#{signUpBean.shippingAddress}" required="true" requiredMessage="Please enter the shipping address"></h:inputTextarea>
		
		<h:outputText styleClass="elementsHeader" id="bAddrIn" value="Enter the billing address"></h:outputText>
		<h:inputTextarea styleClass="elementsHeader" id="bAddr" cols="40" rows="5" value="#{signUpBean.billingAddress}" required="true" requiredMessage="Please enter the billing address or select the check box to copy the address from shipping adddress"></h:inputTextarea>
		
		<h:selectBooleanCheckbox styleClass="indivcheckbox ui-chkbox-icon" value="same" id="sameAddrIn" />
			<h:outputLabel styleClass="checkBoxDisplay" id="sameAddr" value="Both addresses are the same"></h:outputLabel>
		
		<h:outputText styleClass="elementsHeader" id="userIdIn" value="Choose an User ID"></h:outputText>
		<h:inputText styleClass="inputTextBox" id="userId" value="#{signUpBean.userId}" required="true" maxlength="10" size="35" requiredMessage="Please choose an User ID and check for its availability"></h:inputText>
		
		<h:commandButton styleClass="submitBtn" id="checkAvailBtn" action="#{signUpBean.checkAvailability}" value="Check Availability"></h:commandButton>
		
		<h:outputText styleClass="elementsHeader" id="passwordIn" value="Choose your password"></h:outputText>
		<h:inputSecret styleClass="inputTextBox" id="password" value="#{signUpBean.password}" required="true" maxlength="30" size="35" requiredMessage="Please choose your password"></h:inputSecret>
		
		<h:outputText styleClass="elementsHeader" id="rePasswordIn" value="Re-enter your password"></h:outputText>
		<h:inputSecret styleClass="inputTextBox" id="rePassword" value="#{signUpBean.password}" required="true" maxlength="30" size="35" requiredMessage="Please re-enter the chosen password"></h:inputSecret>
		
		<h:selectBooleanCheckbox styleClass="indivcheckbox ui-chkbox-icon ui-icon-check" value="agreement" id="agreeIn" required="true" requiredMessage="Please agree to the terms and conditions to proceed further"/>
			<h:outputLabel styleClass="checkBoxDisplay" id="agree" value="I agree to all terms and conditions"></h:outputLabel>	
			
		<h:commandButton styleClass="submitBtn" id="submitBtn" action="#{signUpBean.createUser}" value="Submit and Sign Up"></h:commandButton>
		
		<div class="elementsHeader floatRight">
    		<h:outputText id="loginRedirect1" value="Existing User? If yes, please "></h:outputText>
    		<h:outputLink id="signup" value="../jsp/LoginPage.jsp">Login</h:outputLink>
    		<h:outputText id="loginRedirect2" value=" here."></h:outputText>
    	</div>
</div>
</h:form>
</f:view>
</body>
</html>
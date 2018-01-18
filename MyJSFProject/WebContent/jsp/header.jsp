<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="../css/basicStyles.css" type="text/css" />
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Welcome to Cart.com</title>
</head>

<body>

<nav class="navbar navbar-inverse">
<div class="container-fluid">
  <div class="navbar-header">
  	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
  	<a class="navbar-brand" href="#">Cart.com</a>
  </div>
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
      <li class="active">
        <a href="../jsp/LandingPage.jsp">Home<span class="sr-only">(current)</span></a>
      </li>
      <li>
        <a href="../jsp/LoginPage.jsp"><span class="glyphicon glyphicon-log-in"></span>  Login</a>
      </li>
      <li>
        <a href="../jsp/SignUpPage.jsp"><span class="glyphicon glyphicon-user"></span>  Sign Up</a>
      </li>
    </ul>
    <form class="navbar-form navbar-right">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-success">Go!</button>
    </form>
  </div>
  </div>
</nav>
</body>
</html>
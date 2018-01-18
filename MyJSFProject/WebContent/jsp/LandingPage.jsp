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
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Welcome to Cart.com</title>
</head>
<body>
<f:view>
	<jsp:include page="../jsp/header.jsp"></jsp:include>
	<h:form>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    
    <div class="carousel-inner">
      <div class="item active">
        <img src="../images/carouseImage1.jpg" alt="Los Angeles" style="width:100%;">
      </div>
      <div class="item">
        <img src="../images/carouseImage2.jpg" alt="Chicago" style="width:100%;">
      </div>
      <div class="item">
        <img src="../images/carouseImage3.jpg" alt="New York" style="width:100%;">
      </div>  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  
  <div>
  	<h1>Explore our products:</h1>
  </div>
  
  <div class="row">
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="../images/Men.jpg" alt="Men Apparels">
      <div class="caption">
        <h3>Men Apparels</h3>
        <p>Surf more for latest trends for Men like watches, branded formals, casuals, footwear, etc.</p>
        <p><a href="../jsp/Products.jsp" class="btn btn-success" role="button">Explore</a></p>
      </div>
    </div>
  </div>
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="../images/Women.png" alt="Women Apparels">
      <div class="caption">
        <h3>Women Apparels</h3>
        <p>Surf more for latest trends for women like handbags, sling bags, accessories, branded formals, casuals, footwear, etc.</p>
        <p><a href="../jsp/Products.jsp" class="btn btn-success" role="button">Explore</a></p>
      </div>
    </div>
  </div>
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="../images/kitchenappliances.png" alt="Home Appliances">
      <div class="caption">
        <h3>Home Appliances</h3>
        <p>Find everything that you need to transform your house to the dream home that you wanted it to be!</p>
        <p><a href="../jsp/Products.jsp" class="btn btn-success" role="button">Explore</a></p>
      </div>
    </div>
  </div>
  </div>
  <div class="row">
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="../images/Gadgets.jpg" alt="Electronics">
      <div class="caption">
        <h3>Latest Gadgets</h3>
        <p>Explore the features of latest gadgets. Own them at best prices.</p>
        <p><a href="../jsp/Products.jsp" class="btn btn-success" role="button">Explore</a></p>
      </div>
    </div>
  </div>
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="../images/HealthCare.jpg" alt="Health">
      <div class="caption">
        <h3>Personal Hygiene and Health Care</h3>
        <p>Taking care of yourself is important than anything else! Check out what we have instore for you.</p>
        <p><a href="../jsp/Products.jsp" class="btn btn-success" role="button">Explore</a></p>
      </div>
    </div>
  </div>
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="../images/SportsBooks.png" alt="Sports & Books">
      <div class="caption">
        <h3>Sports, Books & more</h3>
        <p>Escape into the magical world of books. Let your imagination run wild with adventurous tales. Expand your knowledge. Read anything and everything!</p>
        <p><a href="../jsp/Products.jsp" class="btn btn-success" role="button">Explore</a></p>
      </div>
    </div>
  </div>
</div>  

</h:form>
</f:view>
</body>
</html>
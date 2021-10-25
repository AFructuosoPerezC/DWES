<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INICIO</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
	integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
	integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
	crossorigin="anonymous"></script>

<style>
h1 {
  color: blue;
  font: bold;
}

p {
	width: 30%;
}

header {
	background-color: grey;
}

img {
	text-align: center;
	width: 50%;
}
</style>
</head>
<body>
	<% if (session.getAttribute("uname")==null) { %>
		<h1>CENTRAL DE VIAJES</h1>
	
		<form method="post" action="ServletInicio">
			<p>
				<label for="uname" class="form-label">Usuario:</label> <br>
				<input id="uname" type="text"
					name="uname" class="form-control" pattern="^[a-zA-Z0-9_]+$" required>
			</p>
			
			<p>
				<label for="pass" class="form-label">Password:</label>
				<input id="pass" type="password"
					name="pass" class="form-control"
					pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$"
					required> <br>
			</p>
			
			<p>
				<label for="passCheck" class="form-label">Confirmar Password:</label>
				<input id="passCheck" type="password"
					name="passCheck" class="form-control"
					pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$"
					required> <br>
			</p>
			
			<p>
				<label for="email" class="form-label">Email:</label>
				<input id="email" type="email"
					name="email" class="form-control"
					pattern="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"
	    	        required> <br>
			</p>
			
			<button type="submit" name="submit" class="btn btn-primary">REGISTRARSE</button>
		</form>
	<% } else { %>
		<header>
			<a href="index.jsp">Volver</a>
			<a href="ServletLogout">Salir</a>
			<br>
			<p>Usuario: <%= session.getAttribute("uname") %> Sesión: <%= session.getAttribute("sessionDate") %></p> 
		</header>
		
		<img alt="IMG" src="https://promotonews.com/wp-content/uploads/2020/09/IMG-LOGO.jpg">
	<% } %>
</body>
</html>
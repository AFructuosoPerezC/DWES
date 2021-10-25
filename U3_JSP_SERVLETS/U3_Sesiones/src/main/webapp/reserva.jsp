<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RESERVA</title>

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
	header {
		background-color: grey;
		text-align: right;
	}
	
	header p, a {
		color: blue;
	}
	
	h1 {
	  color: blue;
	  font: bold;
	}
	
	form p {
		width: 30%;
	}
</style>
</head>
<body>
	<% if (!session.isNew() || session.getAttribute("uname")!=null) { %>
		<header>
			<a href="index.jsp">Volver</a>
			<a href="ServletLogout">Salir</a>
			<br>
			<p>Usuario: <%= session.getAttribute("uname") %> Sesión: <%= session.getAttribute("sessionDate") %></p> 
		</header>
	
		<h1>CENTRAL DE VIAJES</h1>
	
		<form method="post" action="/ServletReserva">
			<p>
				<label for="initDate" class="form-label">Fecha de Inicio:</label> <br>
				<input id="initDate" type="text"
					name="initdate" class="form-control" required>
			</p>
			
			<p>
				<label for="endDate" class="form-label">Fecha de Fin:</label>
				<input id="endDate" type="text"
					name="endDate" class="form-control" required> <br>
			</p>
			
			<p>
				<label for="numPeople" class="form-label">Número de Personas:</label>
				<input id="numPeople" type="text"
					name="numPeople" class="form-control" pattern="^[0-9]+$" required> <br>
			</p>
			
			<p>
				<label for="services">SERVICIOS</label>
				<br>
				<input type="checkbox" name="services" value="WiFi">WiFi <br>
				<input type="checkbox" name="services" value="Limpieza">Limpieza <br>
				<input type="checkbox" name="services" value="Toallas">Toallas <br>
				<input type="checkbox" name="services" value="Ruta Guiada">Ruta Guiada <br>
				<input type="checkbox" name="services" value="Desayuno">Desayuno <br>
				<input type="checkbox" name="services" value="Sauna">Sauna
			</p>
			
			<button type="submit" name="submit" class="btn btn-primary">RESERVAR</button>
		</form>
	<% } else { %>
		<jsp:forward page="index.jsp"/>
	<% } %>
</body>
</html>
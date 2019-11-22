<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacto</title>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<img
				src="${pageContext.request.contextPath}/resources/img/contacts.jpg"
				alt="contactos" class="float-right" height="150" />
			<h1>${ contacto.idcontacto==0 ? "Nuevo" : "Editar"} contacto</h1>
			<p>Mantenimiento de contactos con Spring e Hibernate.</p>
		</div>
		<form:form action="savecontacto" modelAttribute="contacto" method="post">
			<form:hidden path="idcontacto" />
			<div class="form-group">
				<label for="nombre">Nombre:</label>
				<form:input path="nombre" class="form-control" />
				<form:errors path="nombre" cssClass="error text-danger" />
			</div>
			<div class="form-group">
				<label for="email">Email:</label>
				<form:input path="email" class="form-control" />
				<form:errors path="email" cssClass="error text-danger" />
			</div>
			<div class="form-group">
				<label for="telefono">Teléfono:</label>
				<form:input path="telefono" class="form-control" />
				<form:errors path="telefono" cssClass="error text-danger" />
			</div>
			<input type="submit" value="Guardar" class="btn btn-success" />
			<a href="${pageContext.request.contextPath}/contacto/lista"
				class="btn btn-outline-primary float-right"> Volver a lista de contactos</a>
		</form:form>
	</div>
</body>
</html>
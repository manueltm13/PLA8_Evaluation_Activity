<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de tareas</title>
</head>
<body>
	<h1>Lista de tareas</h1>
	<table>
		<tr>
			<td>Id</td>
			<td>Nombre</td>
			<td>Prioridad</td>
			<td>Vencimiento</td>
		</tr>
		<c:forEach var="tarea" items="${tareas}">
			<c:url var="linkEditar" value="/tarea/updatetarea">
				<c:param name="idtarea" value="${tarea.idtarea }" />
			</c:url>
			<c:url var="linkBorrar" value="/tarea/deletetarea">
				<c:param name="idtarea" value="${tarea.idtarea }" />
			</c:url>
			<tr>
				<td>${tarea.idtarea }</td>
				<td>${tarea.nombre }</td>
				<td>${tarea.prioridad }</td>
				<td><fmt:formatDate value="${tarea.vencimiento}" type="date"
						pattern="dd-MM-yyyy" /></td>
				<td>
					<a href="${linkEditar }">Editar</a>
					<a href="${linkBorrar }" onclick="if(!confirm('¿Está seguro?')) return false">Borrar</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="${pageContext.request.contextPath}/tarea/addtarea">Añadir
		tarea</a>
</body>
</html>
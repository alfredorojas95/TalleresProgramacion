<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="i"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="Formulario" method="get">
		Ingrese el nombre <input type="text" name="nombre"> <br>
		Ingrese el apellido <input type="text" name="apellido"> <br>
		Ingrese el Email <input type="text" name="email"> <br>
		Ingrese el teléfono <input type="text" name="telefono"> <br>
		<input type="submit" value="Enviar"> <br>

		<!-- ${mensaje}   -->

		<i:forEach items="${listaContacto}" var="contacto">
		${contacto.nombre} : 
		${contacto.apellido} : 
		${contacto.email}	:
		${contacto.telefono} : 
		<br/>
		</i:forEach>
		
	</form>
</body>
</html>
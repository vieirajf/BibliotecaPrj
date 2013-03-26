<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>Matricula</th>
				<th>Nome</th>
				<th>Email</th>
				<th>Curso</th>
				<th>Tipo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${usuarioList}" var="usuario">
				<tr>
					<td>${usuario.matricula }</td>
					<td>${usuario.nome }</td>
					<td>${usuario.email }</td>
					<td>${usuario.curso }</td>
					<td>${usuario.tipo }</td>
					<td><a href="edita?id=${usuario.id }">Editar</a></td>
					<td><a href="remove?id=${usuario.id }">Remover</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
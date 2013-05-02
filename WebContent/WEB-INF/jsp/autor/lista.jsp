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
				<th>Id</th>
				<th>Autor</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${autorList}" var="autor">
				<tr>
					<td>${autor.id }</td>
					<td>${autor.nome }</td>
					<td><a href="edita?id=${autor.id }">Editar</a></td>
					<td><a href="remove?id=${autor.id }">Remover</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
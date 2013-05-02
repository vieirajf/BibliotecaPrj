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
				<th>Palavra Chave</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${palavrachaveList}" var="livro">
				<tr>
					<td>${palavrachave.id }</td>
					<td>${palavrachave.palavra }</td>
					<td><a href="edita?id=${palavrachave.id }">Editar</a></td>
					<td><a href="remove?id=${palavrachave.id }">Remover</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
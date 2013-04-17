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
				<th>Título</th>
				<th>Edição</th>
				<th>Ano</th>
				<th>Idioma</th>
				<th>ISBN_10</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${livroList}" var="livro">
				<tr>
					<td>${livro.titulo }</td>
					<td>${livro.edicao }</td>
					<td>${livro.ano }</td>
					<td>${livro.idioma }</td>
					<td>${livro.isbn_10 }</td>
					<td><a href="edita?id=${livro.id }">Editar</a></td>
					<td><a href="remove?id=${livro.id }">Remover</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="adiciona">
		<fieldset>
			<legend>Adicionar Livros</legend>
			
			<label for="titulo">Título:</label>
			<input id="titulo" type="text" name="livro.titulo" />
			
			<label for="edicao">Edição:</label>
			<input id="edicao" type="text" name="livro.edicao" /> 
			
			<label for="ano">Ano:</label> 
			<input id="ano" type="text" name="livro.ano" />
			
			<label for="idioma">Idioma:</label> 
			<input id="idioma" type="text" name="livro.idioma" />
			
			<label for="isbn_10">ISB_10:</label> 
			<input id="isbn_10" type="text" name="livro.isbn_10" />
			
			<button type="submit">Enviar</button>
		</fieldset>
	</form>

</body>
</html>
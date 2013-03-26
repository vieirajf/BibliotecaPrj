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
			<legend>Adicionar Usuário</legend>
			
			<label for="matricula">Matricula:</label>
			<input id="matricula" type="text" name="usuario.matricula" />
			
			<label for="nome">Nome:</label>
			<input id="nome" type="text" name="usuario.nome" /> 
			
			<label for="email">Email:</label> 
			<input id="email" type="text" name="usuario.email" />
			
			<label for="curso">Curso:</label> 
			<input id="curso" type="text" name="usuario.curso" />
			
			<label for="tipo">Tipo:</label> 
			<input id="tipo" type="text" name="usuario.tipo" />
			
			<button type="submit">Enviar</button>
		</fieldset>
	</form>

</body>
</html>
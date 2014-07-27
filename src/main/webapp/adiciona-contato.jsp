<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-BR">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adiciona Contato</title>
</head>
<body>
	<form action="adicionaContato" method="post">
		<label>
		Nome:
			<input type="text" name = "name" /><br />
		</label>
		<label>
		Endereço:
			<input type="text" name = "address" /><br />
		</label>
		<label>
		E-mail:
			<input type="text" name = "email" /><br />
		</label>
		<label>
		Data Nascimento:
			<input type="text" name = "dateBirth" /><br />
		</label>
		<input type="submit" value="Gravar" />
		
	</form>
</body>
</html>
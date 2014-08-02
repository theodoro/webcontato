<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contato Adicionado com sucesso</title>
</head>

<body>
	<jsp:useBean id="contato" class="br.com.webcontato.entity.Contact"></jsp:useBean>
	<p>Contato ${param.name} adicinado com sucesso</p>
	<a href="/webcontato/adiciona-contato.jsp">Voltar</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de contatos</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

		<c:import url="cabecalho.jsp"></c:import>
	<jsp:useBean id="dao" class="br.com.webcontato.dao.ContactDAO"></jsp:useBean>
	
	<table border="1">
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Endereço</th>
			<th>Data de Nascimento</th>
		</tr>
		
		<!-- percorre contatos montando as linhas da tabela -->
		<c:forEach var="contato" items="${dao.list}">
			<tr>
		
				<td>${contato.name}</td>
	
				<td>${contato.email}</td>
		
				<td>${contato.address}</td>
			
				<td>${contato.dateBirth.time}</td>
			</tr>
		</c:forEach>
	</table>
	<c:import url="rodape.jsp"></c:import>
</body>
</html>
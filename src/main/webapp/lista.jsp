<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<jsp:useBean id="dao" class="br.com.webcontato.dao.ContactDAO"></jsp:useBean>
	
	<table border="1">
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Endere�o</th>
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
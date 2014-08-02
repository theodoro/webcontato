<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
			
				<td>
				<fmt:formatDate value="${contato.dateBirth.time}" pattern="dd/MM/yyyy"/>
				
				
				</td>
			</tr>
		</c:forEach>
	</table>
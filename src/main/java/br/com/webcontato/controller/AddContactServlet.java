package br.com.webcontato.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.webcontato.dao.ContactDAO;
import br.com.webcontato.entity.Contact;



@WebServlet(urlPatterns="/adicionaContato")
public class AddContactServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String email = req.getParameter("email");
		
		String dataTxt = req.getParameter("dateBirth");
		
		Calendar dataBirth = null;
		
		try{
			
			Date date = 
					new SimpleDateFormat("dd/MM/yyyy").parse(dataTxt);
			dataBirth = Calendar.getInstance();
			dataBirth.setTime(date);
			
		}catch(ParseException e){
			out.println("Erro na conversão da data");
		}
		
		Contact con = new Contact();
		
		con.setName(name);
		con.setAddress(address);
		con.setEmail(email);
		con.setDateBirth(dataBirth);
		
		ContactDAO dao = new ContactDAO();
		dao.save(con);
		
		// imprime o nome do contato que foi adicionado
		out.println("<html>");
		out.println("<body>");
		out.println("Contato " + con.getName() +
		" adicionado com sucesso");
		out.println("<a href=/webcontato/adiciona-contato.jsp> Voltar </a>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}

package br.com.webcontato.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.webcontato.connection.ConnectionFactory;
import br.com.webcontato.entity.Contact;

public class ContactDAO {
	
	private Connection connection = null;
	
	public ContactDAO(){
		this.connection = ConnectionFactory.getConnection();
	}
	
	public void save(Contact contact){
		
		try{
			String sql = "insert into tbcontact (name, address, email, dateBirth) values (?, ?, ?, ?)";
			
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, contact.getName());
			stmt.setString(2, contact.getAddress());
			stmt.setString(3, contact.getEmail());
			stmt.setDate(4, new Date(contact.getDateBirth().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void update(Contact contact){
		
		try{
			String sql = "update tbcontact set name=?, address=?, email=?, dataBirth=?"
					+ "where = id=?";
			
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, contact.getName());
			stmt.setString(2, contact.getAddress());
			stmt.setString(3, contact.getEmail());
			stmt.setDate(4, new Date(contact.getDateBirth().getTimeInMillis()));
			
			stmt.setLong(5, contact.getId());
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Contact contact){
		
		try{
			String sql = "delete from tbcontact where id=?";
			
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setLong(1, contact.getId());
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Contact> getList(){
		
		try{
			
			List<Contact> lista = new ArrayList<Contact>();
			String sql = "select * from tbcontact";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				
				Contact c = new Contact();
				
				c.setId(rs.getLong("id"));
				c.setName(rs.getString("name"));
				c.setAddress(rs.getString("address"));
				c.setEmail(rs.getString("email"));
				
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dateBirth"));
				c.setDateBirth(data);
				
				lista.add(c);
				
				
			}
			
			rs.close();
			stmt.close();
			return lista;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

}

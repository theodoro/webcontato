package br.com.webcontato.entity;

import java.util.Calendar;

public class Contact {
	
	private Long id;
	private String name;
	private String address;
	private String email;
	private Calendar dateBirth;
	
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Calendar getDateBirth() {
		return dateBirth;
	}


	public void setDateBirth(Calendar dateBirth) {
		this.dateBirth = dateBirth;
	}
	
	
	
	

}

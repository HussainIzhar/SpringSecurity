package com.entity;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="user")
public class User {
   
	@Id
	@GeneratedValue
	private int id;
	
	private String username;
	
	private String password;
	
	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return "Izhar";
		//return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return "Izhar";
		//return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}

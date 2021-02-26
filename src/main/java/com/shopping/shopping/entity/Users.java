package com.shopping.shopping.entity;


import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

import javax.persistence.Column;



@Entity
@Table(name="users2")
public class Users implements Serializable {
 
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	 @GeneratedValue(strategy =GenerationType.IDENTITY)
	 @Column(name="EMPL_Id")
	 private int id ;
	 @Column(name="Empl_name")
	 private String name;
	 
	 @Column(name="password")
	 private String password;
	 @Column(name="email")
	 private String email;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public Users() {
		super();
	}
	public Users(int id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
}

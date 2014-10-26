package com.myCode.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.data.annotation.*;

//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection="users")
@Entity
@Table(name = "users")
public class Users implements Serializable{
	
	@Id
	private String id;

	private String firstName;
	private String lastName;
	
	public Users(){	
	}
	
	public Users(String first, String last){
		firstName = first;
		lastName = last;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

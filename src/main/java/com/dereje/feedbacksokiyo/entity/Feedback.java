package com.dereje.feedbacksokiyo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

 

 @Entity
public class Feedback {
	private String name;
	@Id
	private String email;
	private String regarding;
	private String code;
	private int rating;
	private String message;
	
	public Feedback(){}
	

	public Feedback(String name, String email, String regarding, String code, int rating, String message) {
		super();
		this.name = name;
		this.email = email;
		this.regarding = regarding;
		this.code = code;
		this.rating = rating;
		this.message = message;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegarding() {
		return regarding;
	}

	public void setRegarding(String regarding) {
		this.regarding = regarding;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "Feedback [name=" + name + ", email=" + email + ", regarding=" + regarding + ", code=" + code
				+ ", rating=" + rating + ", message=" + message + "]";
	}


	 
}

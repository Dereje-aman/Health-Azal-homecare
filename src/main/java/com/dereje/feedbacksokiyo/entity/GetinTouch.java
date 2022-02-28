package com.dereje.feedbacksokiyo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GetinTouch {
	
	private String Fullname;
	@Id
	private String Email;
	private String Subject;
	private String message;
	
	
	public GetinTouch() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getFullname() {
		return Fullname;
	}


	public void setFullname(String fullname) {
		Fullname = fullname;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getSubject() {
		return Subject;
	}


	public void setSubject(String subject) {
		Subject = subject;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "GetinTouch [Fullname=" + Fullname + ", Email=" + Email + ", Subject=" + Subject + ", message=" + message
				+ "]";
	}
	
	

}

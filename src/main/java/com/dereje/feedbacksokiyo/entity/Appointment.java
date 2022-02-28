package com.dereje.feedbacksokiyo.entity;



 

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

  

@Entity
public class Appointment {
	
	private String Fullname;
	@Id
	private String Email;
	private String departement;
	private String phonenumber;
	private String message;
//	@DateTimeFormat(pattern="YYYY/MM/DD")
//	private Date AppointmentDate;
	private java.sql.Date AppointmentDate;
	
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Date getAppointmentDate() {
		return AppointmentDate;
	}
	public void setAppointmentDate(java.sql.Date appointmentDate) {
		AppointmentDate = appointmentDate;
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
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Appointment [Fullname=" + Fullname + ", Email=" + Email + ", departement=" + departement
				+ ", phonenumber=" + phonenumber + ", message=" + message + ", AppointmentDate=" + AppointmentDate
				+ "]";
	}

	 
	
	

}

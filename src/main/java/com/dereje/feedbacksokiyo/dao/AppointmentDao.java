package com.dereje.feedbacksokiyo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dereje.feedbacksokiyo.entity.Appointment;
@Component
public class AppointmentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addAppointment(Appointment App) {
		System.out.println("Appointment" + App);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(App);
	}
	
	@Transactional
	public List<Appointment> getAppointments(){
		
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Appointment");
		List<Appointment> l = (List<Appointment>)q.list();
		
		System.out.println(l);
		return l;
	}
	
	
	

}

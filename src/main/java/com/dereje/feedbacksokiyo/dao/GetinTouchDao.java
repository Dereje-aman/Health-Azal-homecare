package com.dereje.feedbacksokiyo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dereje.feedbacksokiyo.entity.Appointment;
import com.dereje.feedbacksokiyo.entity.GetinTouch;

@Component
public class GetinTouchDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addGetinTouch(GetinTouch getintouch) {
		System.out.println("GetinTouch" + getintouch);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(getintouch);
	}
	
	@Transactional
	public List<GetinTouch> GetgetinTouch(){
		
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from GetinTouch");
		List<GetinTouch> l = (List<GetinTouch>)q.list();
		
		System.out.println(l);
		return l;
	}
}

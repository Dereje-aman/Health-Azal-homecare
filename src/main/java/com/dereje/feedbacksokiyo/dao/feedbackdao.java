package com.dereje.feedbacksokiyo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dereje.feedbacksokiyo.entity.Feedback;

//The Data Access Object is basically an object or an interface that provides 
//access to an underlying database or any other persistence storage.
@Component
public class feedbackdao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addFeedback(Feedback fb) {
		System.out.println("check dao" + fb);
		Session session =sessionFactory.getCurrentSession();
		session.save(fb);
	}
	
	@Transactional
	public List<Feedback> getFeedbacks()
	{
		
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Feedback");		// HQL
		List<Feedback> l = (List<Feedback>)q.list();
		
		System.out.println(l);
		return l;
	}

}

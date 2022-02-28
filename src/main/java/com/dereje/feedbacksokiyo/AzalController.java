package com.dereje.feedbacksokiyo;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 

import com.dereje.feedbacksokiyo.dao.AppointmentDao;
import com.dereje.feedbacksokiyo.dao.GetinTouchDao;
import com.dereje.feedbacksokiyo.entity.Appointment;
import com.dereje.feedbacksokiyo.entity.GetinTouch;

@Controller
public class AzalController {
	
	@Autowired
	AppointmentDao appointmentDao;
	Appointment appointment;
	
	@Autowired
	GetinTouchDao getinTouchDao;
	GetinTouch getinTouch;
	
	@RequestMapping("/Azalhome")
	public String azalhome() {
		
		return "index.jsp";
		
	}
	
	@RequestMapping("/addappointment")
	public String addAppointment(@ModelAttribute("appointment") Appointment appointment) {
		
		appointmentDao.addAppointment(appointment);
		
		return "index.jsp";
	}
	
	@RequestMapping("/getAppointments.jsp")
	public ModelAndView getAppointments( ) {
		
		ModelAndView mv = new ModelAndView("index.jsp");
		mv.addObject("index",appointmentDao.getAppointments());
		return mv;
	}
	
	@RequestMapping("/addGetinTouch")
	public String addGetinTouch(@ModelAttribute("getinTouch") GetinTouch getinTouch) {
		
		getinTouchDao.addGetinTouch(getinTouch);
		
		return "index.jsp";
	}
	
	@RequestMapping("/getinTouch.jsp")
	public ModelAndView GEtgetinTouch( ) {
		
		ModelAndView mv = new ModelAndView("index.jsp");
		mv.addObject("index",getinTouchDao.GetgetinTouch());
		return mv;
	}
	
	

}

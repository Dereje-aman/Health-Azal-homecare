package com.dereje.feedbacksokiyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

 
import com.dereje.feedbacksokiyo.dao.feedbackdao;
 
import com.dereje.feedbacksokiyo.entity.Feedback;

@Controller
public class IndexController {

	@Autowired
	feedbackdao fdao;
	Feedback feedback;
	 

	@RequestMapping("/index")
	public String home() {
		return "index.jsp";
	}

	@RequestMapping("/feedback")
	public String feedback() {
		return "feedback.jsp";
	}

	@RequestMapping("/addFeedback")
	//public String addFeedback(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("reg") String reg,@RequestParam("code") String code,@RequestParam("msg") String msg,@RequestParam("rating") int rating) {
		
	public String addFeedback(@ModelAttribute Feedback feedback) {
	// feedback = new Feedback(name,email,reg,code,rating,msg);
	fdao.addFeedback(feedback);
	return"wlecome.jsp";
	}
	@RequestMapping("/getFeedbacks.htm")
	public ModelAndView getFeedbacks()
	{
		ModelAndView mv = new ModelAndView("feedbacks.jsp");
		
		mv.addObject("feedbacks",fdao.getFeedbacks());
		
		return mv;
	}
	@RequestMapping("/question.htm")
	public ModelAndView addQuestion()
	{
		ModelAndView mv = new ModelAndView("question.jsp");
		
		return mv;
	}
	@RequestMapping("/health")
	public ModelAndView health()
	{
		ModelAndView mv = new ModelAndView("index.jsp");
		
		return mv;
	}
}



package com.cinq.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cinq.test.domain.Event;
import com.cinq.test.repository.EventRepository;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	EventRepository eventRepository;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("events", eventRepository.findAll());
		
		return "home";
	}
	
	@RequestMapping(value="/SpringDataJPA-1.0.0-SNAPSHOT/addEvent", method=RequestMethod.POST)
	public String addEvent(@RequestParam Event event){
		eventRepository.save(event);
		return "redirect:/";
	}
	
}

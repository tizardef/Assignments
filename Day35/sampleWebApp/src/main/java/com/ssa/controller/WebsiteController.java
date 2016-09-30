package com.ssa.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@ComponentScan(basePackages="com.ssa")
@Controller
public class WebsiteController {

	
	
	Map<Integer, String> helpOutput = new HashMap<Integer, String>(); 
	
	@RequestMapping("/about")
    public ModelAndView about(HttpServletRequest request, ModelAndView mv) {
//        if(request.getParameter("name") != null){
//            mv.addObject("name", request.getParameter("name"));
//        }
        mv.setViewName("about");
        return mv;
    }
	
	@RequestMapping("/")
    public ModelAndView home(HttpServletRequest request, ModelAndView mv) {
        if(request.getParameter("name") != null){
            mv.addObject("name", request.getParameter("name"));
        }
        mv.setViewName("home");
        return mv;
    }
	@RequestMapping("/help")
    public ModelAndView help(HttpServletRequest request, ModelAndView mv) {
		if(request.getParameter("id") !=null) {
		mv.addObject("id", request.getParameter("id"));
        mv.addObject("description", helpOutput.get(Integer.parseInt(request.getParameter("id"))));
		}
        mv.setViewName("help");
        return mv;
    }
	
	//private string getHelpOutput (int, id) 
	
	public WebsiteController() {
	this.helpOutput = new HashMap<Integer, String> ();
			this.helpOutput.put(1, "If the moon was replaced by Mercury, it would be very bad");
			this.helpOutput.put(2, "If the moon was replaced by Venus, it would be very bad");
			this.helpOutput.put(3, "If the moon was replaced by Mars, it would be very bad");
			this.helpOutput.put(4, "If the moon was replaced by Jupiter, it would be very bad");
			this.helpOutput.put(5, "If the moon was replaced by Saturn, it would be very bad");
			this.helpOutput.put(6, "If the moon was replaced by Uranus, it would be very bad");
			this.helpOutput.put(7, "If the moon was replaced by Neptune, it would be very bad");
			
				
	}
	
 
	
	
}


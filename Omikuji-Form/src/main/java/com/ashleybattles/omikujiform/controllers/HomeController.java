package com.ashleybattles.omikujiform.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

//import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class HomeController {
	
//	A route to render the home page that shows the Omikuji form
//	A POST route to process the form when the user hits "send"
//	A route to render their fortune
	
	@RequestMapping("/")
    public String index(HttpSession session,Model model) {
		model.addAttribute("number", session.getAttribute("number"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("thing", session.getAttribute("thing"));
		

        return "form.jsp";
    }
	
	@PostMapping("/omikuji")
    public String omikuji(
    		@RequestParam(value = "number") String number,
    		@RequestParam(value = "city") String city,
    		@RequestParam(value = "hobby") String hobby,
    		@RequestParam(value = "thing") String thing,
    		@RequestParam Map<String, String> requestParams,
    		HttpSession session
    		) {
		System.out.println(number);
		System.out.println(city);
		System.out.println(hobby);
		System.out.println(thing);
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		
		return "redirect:/omikuji/show";
			

//        return "form.jsp";
    }
	
	@GetMapping("/omikuji/show")
	public String result() {
		return "index.jsp";
	}

}

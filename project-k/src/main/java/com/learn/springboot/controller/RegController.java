package com.learn.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learn.springboot.entity.Register;
import com.learn.springboot.servcies.RegService;

import jakarta.servlet.http.HttpSession;

@Controller
public class RegController {
	@Autowired
	RegService rs;

	public RegController(RegService rs) {
		super();
		this.rs = rs;
	}
	
	@PostMapping("create")
	public String regSave(@ModelAttribute Register register) {
		rs.regSave(register);
		return "home";
	}
	
	@GetMapping("map-log")
	public String logIn()
	{
		return"login";
	}
	
	@PostMapping("login")
	public String Admin(@RequestParam String email, @RequestParam String name, HttpSession session) {
	    // Check if the provided email and name are valid
	    boolean status = rs.checkR(email, name);

	    if (status) { // If the check is successful
	        // Set the email attribute in the session
	        session.setAttribute("email", email);

	        // If the email matches the admin's email, return the admin page
	        if (email.equals("mjpintya@gmail.com")) {
	            return "adminpage";
	        }
	    }

	    // If the check fails, return the admin failed page
	    return "adminfaild";
	}
	
	@GetMapping("viewreg")
	public String viewRegS(Model model) {
		List<Register> rlist=rs.viewReg();
		model.addAttribute("rlist",rlist);
		return "viewrege";
	}
}

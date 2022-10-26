package com.example.social_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login(String name, Model model) {
		model.addAttribute("name", name);
		return "login";
	}
	
	@PostMapping("/login")
    public String postMethod(@RequestParam("name") String name, @RequestParam("password") String password, Model model) {
        if ("sonldh".equals(name) && "password".equals("password")) {
        	model.addAttribute("name", name);
        	return "greeting";
        }
        else {
        	return "greeting";
        }
    }
	
}

package com.calculationui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class CalculationIuApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculationIuApplication.class, args);
	}
	
	@RequestMapping("/")
	String home(ModelMap modal) {
		modal.addAttribute("title","Simple Calculation");
		return "index";
	}

	@RequestMapping("/partials/{page}")
	String partialHandler(@PathVariable("page") final String page) {
		return page;
	}
}

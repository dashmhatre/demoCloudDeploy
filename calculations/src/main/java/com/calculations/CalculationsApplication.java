package com.calculations;

import javax.websocket.server.PathParam;

import javax.xml.ws.RequestWrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculations.componant.Calculation;
import com.calculations.util.MessageUtil;

@SpringBootApplication
@RestController
@RequestMapping("/calculation")
@ComponentScan
public class CalculationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculationsApplication.class, args);
	}
	
	//@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<?> additionOfTwoNumber(@RequestBody Calculation cal) {
		
			System.out.println("Inside Addtion Method");
			Double finalCalculation = cal.getFirstValue() + cal.getSecondValue();
			System.out.println("Final Addition result := "+ finalCalculation);
			
			MessageUtil message = new MessageUtil();
			message.setSuccessMessage("Final Addition result := "+ finalCalculation);
			
			//return "Final Addition result := "+ finalCalculation;
			return new ResponseEntity<MessageUtil>(message, HttpStatus.OK);
		
	}
	
	//@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/multiplication", method = RequestMethod.POST)
	public ResponseEntity<MessageUtil> multiplicationOfTwoNumber(@RequestBody Calculation cal) {
		
			Double finalCalculation = cal.getFirstValue() * cal.getSecondValue();
			
			MessageUtil message = new MessageUtil();
			message.setSuccessMessage("Final Multiplication result := "+ finalCalculation);
			
			//return "Final Addition result := "+ finalCalculation;
			return new ResponseEntity<MessageUtil>(message, HttpStatus.OK);
		
	}
	
	//@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value = "/subtraction", method = RequestMethod.POST)
	public ResponseEntity<MessageUtil> subtractionOfTwoNumber(@RequestBody Calculation cal) {
		
			Double finalCalculation = cal.getFirstValue() - cal.getSecondValue();
			
			MessageUtil message = new MessageUtil();
			message.setSuccessMessage("Final Subtraction result := "+ finalCalculation);
			
			//return "Final Addition result := "+ finalCalculation;
			return new ResponseEntity<MessageUtil>(message, HttpStatus.OK);
		
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

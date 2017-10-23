package com.calculationCircuitbreaker.controller;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.calculationCircuitbreaker.Util.MessageUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class CircuitBreakerController {

	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@HystrixCommand(fallbackMethod = "calladditionOfTwoNumber_Fallback")
	public ResponseEntity<?> additionOfTwoNumber(@RequestBody Object cal) {
	
		System.out.println("==============Inside Add Circut Breaker===========");
		
		RestTemplate restTemplate = new RestTemplate();
		URI uri = URI.create("http://localhost:8888/service/calculation/add");
		try{
		ResponseEntity<?> obj  =  restTemplate.postForEntity(uri, cal, Object.class);
		System.out.println("ABC======="+obj.getBody());
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return restTemplate.postForEntity(uri, cal, Object.class);
	}
	
	public ResponseEntity<?> calladditionOfTwoNumber_Fallback(Object cal){
		
		MessageUtil message = new MessageUtil();
		message.setErrorMessage("Service is Down...Please try after sometime");
		
		return new ResponseEntity(message, HttpStatus.NOT_FOUND);
	}
}

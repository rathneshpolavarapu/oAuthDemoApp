package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

	@GetMapping("/get-Info")
	public  ResponseEntity<String> getJetInfo(){
		
		String jetinfo="None of the rader can find this jet";
		return new ResponseEntity<String>(jetinfo,HttpStatus.OK);
	}
}

package com.producer.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producer.setup.dto.Employee;
import com.producer.setup.service.KafkaObjectMessagePubliser;

@RestController
@RequestMapping("/object")
public class KafkaObjectProducerController {

	@Autowired
	KafkaObjectMessagePubliser publiser;
	
	

	@PostMapping("/producer")
	public ResponseEntity<?> setObjectProducer(@RequestBody Employee emp) {
		System.out.println(emp);

		try {

			publiser.produceObject(emp);

			return ResponseEntity.ok("Message deliver successfully.");
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong !Please correct its" + e);
		}

	}
	
	
	

}

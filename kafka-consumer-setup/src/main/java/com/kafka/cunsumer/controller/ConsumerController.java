package com.kafka.cunsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.cunsumer.Entity.Employee;
import com.kafka.cunsumer.service.Cunsumer;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	@Autowired
	Cunsumer consumer;
	
	@GetMapping("/get")
	public List<Employee> showDetails(){
		
		return consumer.showDetails();
	}
	
	
}

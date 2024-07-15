package com.kafka.cunsumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.cunsumer.Entity.Employee;
import com.kafka.cunsumer.repo.EmployeerRepo;





@Service
public class Cunsumer {
	
	@Autowired
   EmployeerRepo repo;
	

	@KafkaListener(topics = "employees", groupId = "mnp" )
	public void kafkacunsumer(String jsonString) throws Exception{


		System.out.println("msg "+jsonString);
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			JsonNode node=objectMapper.readTree(jsonString);
			String asText = node.asText();

//			System.out.println("msg after "+node.asText());   // {"id":31,"name":"in2it","address":"up bihar"}
			
			Employee emp = objectMapper.readValue(asText, Employee.class);           // converting text to Employee Object
			
			 if(emp!=null) {
				 
				 repo.save(emp);
			 }else {
				 throw new Exception("Data insuficent ");
			 }
			
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}

	}
	
	
	public List<Employee> showDetails() {
		
		return repo.findAll();
		
	}
}

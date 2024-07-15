package com.producer.setup.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.producer.setup.dto.Employee;

@Service
public class KafkaObjectMessagePubliser {

	@Autowired(required = true)
	KafkaTemplate<String, Object> template;
	


	public void produceObject(Employee employee) {

		String jsonString = null;

		ObjectMapper objectMapper = new ObjectMapper();

		try {

			jsonString = objectMapper.writeValueAsString(employee);

		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}

		CompletableFuture<SendResult<String, Object>> future = template.send("employees", jsonString);

		future.whenComplete((result, ex) -> {
			System.out.println("out side if" + ex);
			if (ex == null) {
				System.out.println("sucessfull " + employee);
			} else {
				System.out.println("Please! try again ");
			}
		});

	}
	
	
	

}

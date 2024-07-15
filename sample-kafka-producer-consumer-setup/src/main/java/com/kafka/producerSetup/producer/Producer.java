package com.kafka.producerSetup.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myTopic")
public class Producer {

	@SuppressWarnings("rawtypes")
	@Autowired
	private KafkaTemplate kafkaTemplate;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/send")
	public void sendMessage(@RequestParam String message) {
	
		kafkaTemplate.send("myTopic",message);
		
	
		}
	
}

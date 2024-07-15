package com.producer_setup.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessagePublisher {

	@Autowired
	private KafkaTemplate<String, String> template;

	public void sendMessageToProducer(String message) {
		
	  
	    System.out.println(message);
		CompletableFuture<SendResult<String, String>> future = template.send("myTopic5",message);
		

		System.out.println(future);
		future.whenComplete((result,ex)->{
			if(ex==null) {
				System.out.println("Sent message=[" + message + 
		                 "] with offset=[" + result.getRecordMetadata().offset() + "]");
			}else {
				System.out.println("Unable to send message=[" + 
		                 message + "] due to : " + ex.getMessage());
			}
		});
	}
}

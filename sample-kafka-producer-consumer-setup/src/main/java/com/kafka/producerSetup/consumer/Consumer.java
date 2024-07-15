package com.kafka.producerSetup.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	
	@KafkaListener(topics={"myTopic"}, groupId = "abc")
	public void getMesg(String message) {
		System.out.println(message);
	}
}

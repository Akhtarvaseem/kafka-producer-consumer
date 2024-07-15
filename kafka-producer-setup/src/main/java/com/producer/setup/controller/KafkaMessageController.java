//package com.producer.setup.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.producer.setup.service.KafkaMessagePublisher;
//
//@RestController
//@RequestMapping("myTopic")
//public class KafkaMessageController {
//
//    @Autowired
//	KafkaMessagePublisher  publisher;
//	
//	@PostMapping("/sending")
//	public ResponseEntity<?> getKafkaMsg(@RequestParam String message){
//		System.out.println(message);
//		
//		try {
//			
//
//				publisher.sendMessageToProducer(message);
//
//			
//			return ResponseEntity.ok("Message deliver successfully.");
//		} catch (Exception e) {
//			
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Something went wrong !Please correct its"+e);
//		}
//		
//	}
//}

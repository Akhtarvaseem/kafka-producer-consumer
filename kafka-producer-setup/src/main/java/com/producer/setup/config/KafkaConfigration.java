package com.producer.setup.config;

import java.util.HashMap;
import java.util.Map;


import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;


import com.fasterxml.jackson.databind.ser.std.StringSerializer;

@Configuration
public class KafkaConfigration {
//
////	 @Bean
////	  public Map<String, Object> producerConfigs() {
////	    Map<String, Object> props = new HashMap<>();
////	    
////	    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
////	      "localhost:9092");
////	    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
////	      StringSerializer.class);
////	    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
////	      StringSerializer.class);
////	    
////	    return props;
////	  }
////	
	
//   The above example shows how to configure the Kafka producer to send messages.
	//ProducerFactory is responsible for creating Kafka Producer instances.
//	
	
////	@Bean   //  never define bean here
////	public ProducerFactory<String, String> producerFactory() {
////		return new DefaultKafkaProducerFactory<>(producerConfigs());
////	}
	
	
	//KafkaTemplate helps us to send messages to their respective topic.
	// We’ll see more about KafkaTemplate in the sending messages section.
	
	
//	 // @Bean //  never define bean here
//	  public KafkaTemplate<String, String> kafkaTemplate() {
//		    return new KafkaTemplate<>(producerFactory());
//		  }

}

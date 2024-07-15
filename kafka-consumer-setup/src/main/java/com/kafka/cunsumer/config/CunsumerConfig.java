package com.kafka.cunsumer.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka
public class CunsumerConfig {

	
	 @Bean
	  public Map<String, Object> consumerConfigs() {
		 System.out.println("ehllo ");
	    Map<String, Object> props = new HashMap<>();
	    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
	      "localhost:9092");
	    props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
	      StringDeserializer.class);
//	    props.put(ConsumerConfig.AUTO_OFFSET_RESET_DOC,"earliest");
	    return props;
	  }
	
	 
	 
//	 @Bean
//	  public ConsumerFactory<String, String> consumerFactory() {
//	    return new DefaultKafkaConsumerFactory<>(consumerConfigs());
//	  }
//
//	  @Bean
//	  public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory() {
//	    ConcurrentKafkaListenerContainerFactory<String, String> factory =
//	      new ConcurrentKafkaListenerContainerFactory<>();
//	    factory.setConsumerFactory(consumerFactory());
//	    return factory;
//	  }
	 
	 
}

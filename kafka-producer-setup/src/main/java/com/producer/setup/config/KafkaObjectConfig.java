package com.producer.setup.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

@Configuration

public class KafkaObjectConfig {

//	@Bean
//	public ProducerFactory<String, Object> objectProducerConfig(){
//		Map<String, Object> objPro=new HashMap<>();
//		objPro.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//		objPro.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		objPro.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//		return new DefaultKafkaProducerFactory<>(objPro);
//		
//	}

	@Bean
	Map<String, Object> objectProducerConfig() {
		Map<String, Object> objPro = new HashMap<>();
		objPro.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		objPro.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		objPro.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return objPro;

	}

	@Bean
	ProducerFactory<String, Object> producerFactory() {
		return new DefaultKafkaProducerFactory<>(objectProducerConfig());
	}

	@Bean
	KafkaTemplate<String, Object> kafkaTemplate() {
//		return new KafkaTemplate<>(objectProducerConfig());
		return new KafkaTemplate<>(producerFactory());

	}
}

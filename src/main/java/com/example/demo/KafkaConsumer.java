package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class KafkaConsumer {
	@KafkaListener(topics = "Kafka_Example", groupId = "group_id")
	public void consume(String messgae){
		System.out.println("Consumer Message ::" +messgae);
	}
	
	@KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
			containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user){
		System.out.println("Consumer JSON Message ::" + user);
	}
	
}

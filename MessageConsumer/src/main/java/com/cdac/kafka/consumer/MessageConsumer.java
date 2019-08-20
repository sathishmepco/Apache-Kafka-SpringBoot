package com.cdac.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.cdac.kafka.producer.Message;

@Service
public class MessageConsumer {
	@KafkaListener(topics = "${message.topic.name}", groupId = "greeting", containerFactory = "kafkaListenerContainerFactory")
    public void listenGroupFoo(Message message) {
        System.out.println("Received Messasge in group 'greeting': " + message);
    }
}
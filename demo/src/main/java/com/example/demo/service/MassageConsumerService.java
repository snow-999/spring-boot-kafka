package com.example.demo.service;

import com.example.demo.dto.CustomMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MassageConsumerService {
    @KafkaListener(topics = "my-topic", groupId = "sample-consumer-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}

package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MassageConsumerService {
    @KafkaListener(topics = "my-topic", groupId = "consumer-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}

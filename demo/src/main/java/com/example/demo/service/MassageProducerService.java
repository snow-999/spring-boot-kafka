package com.example.demo.service;

import com.example.demo.dto.CustomMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MassageProducerService {
    private KafkaTemplate<String, String> kafkaTemplate;
    public MassageProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send("my-topic", message);
    }

}

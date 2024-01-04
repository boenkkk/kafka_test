package dev.boenkkk.kafka_test;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "your_topic_name", groupId = "my-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}

package dev.boenkkk.kafka_test;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "T-PARTITIONS")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}

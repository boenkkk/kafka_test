package dev.boenkkk.kafka_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/publish")
    public String sendMessageToKafkaTopic(@RequestBody String message) {
        kafkaProducerService.sendMessage(message);
        return "Message sent to Kafka topic successfully!";
    }
}

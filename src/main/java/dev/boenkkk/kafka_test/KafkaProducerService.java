package dev.boenkkk.kafka_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "T-PARTITIONS";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }

    public void sendMessageSync(String message) throws Exception{
        SendResult<String, String> stringStringSendResult = kafkaTemplate.send(TOPIC, message).get();
        System.out.println("stringStringSendResult: "+stringStringSendResult);
    }
}

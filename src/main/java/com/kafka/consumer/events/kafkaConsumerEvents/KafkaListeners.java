package com.kafka.consumer.events.kafkaConsumerEvents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaListeners {

    @KafkaListener(topics = "MESSAGE-TOPIC",
            groupId = "groupId")
    void listener(String data) {
        log.info("Message from Kafka: " + data);
        // TODO: persist the data into your data base using JPA 22/08/2022
    }
}

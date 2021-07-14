package org.learning.springbootkafka.basickafkaconsumerdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "testTopic",groupId = "1")
    public void consumer(String message){
        log.info("consumer-msg::"+message);
    }

}

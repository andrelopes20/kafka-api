package com.andrelopes.kafkaapi.services;

import com.andrelopes.kafkaapi.dtos.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumerService.class);
    @KafkaListener(topics = "novo-topico", groupId = "myGroup")
    public void jsonKafkaListener(UserDTO user){

        LOGGER.info("USUARIO RECEBIDO -> "+user);

    }

}

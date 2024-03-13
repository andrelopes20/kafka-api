package com.andrelopes.kafkaapi.services;

import com.andrelopes.kafkaapi.dtos.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducerService.class);
    @Autowired
    private KafkaTemplate<String, UserDTO> kafkaTemplate;

    public void sendUser(UserDTO user){

        kafkaTemplate.send("novo-topico", user);
        LOGGER.info("USUARIO ENVIADO -> " + user);
    }

}

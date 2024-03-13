package com.andrelopes.kafkaapi.controller;

import com.andrelopes.kafkaapi.dtos.UserDTO;
import com.andrelopes.kafkaapi.services.JsonKafkaProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    JsonKafkaProducerService jsonKafkaProducerService;

    public KafkaController (JsonKafkaProducerService jsonKafkaProducerService){
        this.jsonKafkaProducerService = jsonKafkaProducerService;
    }

    @PostMapping(value = "/publish")
    public ResponseEntity publish(@RequestBody UserDTO user){
        jsonKafkaProducerService.sendUser(user);
        return ResponseEntity.ok(user);
    }

}

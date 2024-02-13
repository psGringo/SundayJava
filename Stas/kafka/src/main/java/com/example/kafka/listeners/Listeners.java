package com.example.kafka.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listeners {
    @KafkaListener(topics = "amigoscode", groupId = "groupdId")
    void listener(String data){
        System.out.println("Listener received:" + data + " congrats !!!");
    }
}

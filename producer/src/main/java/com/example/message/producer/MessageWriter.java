package com.example.message.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageWriter {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostMapping("/{message}")
    public void postNewMessage(@PathVariable("message") String message) {
        System.out.println("Writing message : " + message);
        rabbitTemplate.convertAndSend(ProducerApplication.TOPIC_EXCHANGE_NAME, "foo.bar.baz", message);
    }
}

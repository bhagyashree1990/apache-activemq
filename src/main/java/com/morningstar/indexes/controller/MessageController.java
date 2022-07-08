package com.morningstar.indexes.controller;

import com.morningstar.indexes.model.CustomMessage;
import com.morningstar.indexes.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private MessageProducer messageProducer;

    @PostMapping("/publish-message")
    public ResponseEntity<String> publishMessage(@RequestBody CustomMessage customMessage) {
        String result = messageProducer.send(customMessage);
        HttpStatus status = "SUCCESS".equals(result) ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity<>(result, status);
    }
}

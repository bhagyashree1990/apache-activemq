package com.morningstar.indexes.producer;

import com.morningstar.indexes.model.CustomMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageProducer.class);

    @Value("${queue-name}")
    private String queueName;

    @Autowired
    private JmsTemplate jmsTemplate;

    public String send(CustomMessage customMessage) {
        try {
            jmsTemplate.convertAndSend(queueName, customMessage);
            LOGGER.info("Produced: {}", customMessage);
            return "SUCCESS";
        } catch (Exception e) {
            LOGGER.error("{}", e);
            return e.getMessage();
        }

    }
}

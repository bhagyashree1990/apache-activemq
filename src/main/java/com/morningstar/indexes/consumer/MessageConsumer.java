package com.morningstar.indexes.consumer;

import com.morningstar.indexes.model.CustomMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "${queue-name}")
    public void messageListener(CustomMessage message) {
        LOGGER.info("Consumed: {}", message);
    }
}

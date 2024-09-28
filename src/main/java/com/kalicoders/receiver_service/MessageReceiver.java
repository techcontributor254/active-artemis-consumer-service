package com.kalicoders.receiver_service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {

    @JmsListener(destination = "learning")
    public void receiveMessage(String message) {
        System.out.println(message);
    }


}

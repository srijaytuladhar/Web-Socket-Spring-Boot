package com.fonepay.websocket.service;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * @author srijay.tuladhar@fonepay.com
 */

@Service
public class WebSocketServiceImpl {
    private final SimpMessagingTemplate simpMessagingTemplate;

    public WebSocketServiceImpl(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    public void sendMessage(String suffix) {
        simpMessagingTemplate.convertAndSend(
            "/topic/" + suffix,
            "default message"
        );
    }
}

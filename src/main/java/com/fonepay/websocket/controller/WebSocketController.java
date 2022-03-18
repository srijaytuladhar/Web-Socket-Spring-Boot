package com.fonepay.websocket.controller;

import com.fonepay.websocket.dto.response.SocketResponse;
import com.fonepay.websocket.dto.request.SocketRequest;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author srijay.tuladhar@fonepay.com
 */

@Controller
public class WebSocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public SocketResponse serverResponse(SocketRequest message) {
        return setterForSocketResponse(message);
    }

    private SocketResponse setterForSocketResponse(SocketRequest message) {
        SocketResponse socketResponse = new SocketResponse();
        socketResponse.setUsername(HtmlUtils.htmlEscape(message.getUsername()));
        socketResponse.setMessage(HtmlUtils.htmlEscape(message.getMessage()));
        responseDateFormatter(socketResponse);
        return socketResponse;
    }

    private void responseDateFormatter(SocketResponse socketResponse) {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:MM:ss dd/MM/yyyy");
        String formattedDate = formatter.format(new Date());
        socketResponse.setResponseDate(formattedDate);
    }
}

package com.fonepay.websocket.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author srijay.tuladhar@fonepay.com
 */

@AllArgsConstructor
@NoArgsConstructor
public class SocketRequest {
    private String username;
    private String message;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

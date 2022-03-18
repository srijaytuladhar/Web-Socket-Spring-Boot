package com.fonepay.websocket.dto.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author srijay.tuladhar@fonepay.com
 */

@NoArgsConstructor
@AllArgsConstructor
public class SocketResponse {
    private String username;
    private String message;
    private String responseDate;

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

    public String getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(String responseDate) {
        this.responseDate = responseDate;
    }
}

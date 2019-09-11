package com.github.sindrebn._3_fun_with_interfaces;

public class WebSender implements WithSenderId {

    public final long senderId;
    public final String username;
    public final String password;

    public WebSender(long senderId, String username, String password) {
        this.senderId = senderId;
        this.username = username;
        this.password = password;
    }

    @Override
    public long getSenderId() {
        return senderId;
    }

    @Override
    public String toString() {
        return "sender with ID '" + senderId + "' authenticated through the website";
    }


}

package com.github.sindrebn._3_fun_with_interfaces;

public class ApiSender implements WithSenderId {

    public final long senderId;
    public final String apiKey;

    public ApiSender(long senderId, String apiKey) {
        this.senderId = senderId;
        this.apiKey = apiKey;
    }

    @Override
    public long getSenderId() {
        return senderId;
    }

    @Override
    public String toString() {
        return "sender with ID '" + senderId + "' authenticated through the API";
    }
}

package com.github.sindrebn._3_fun_with_interfaces;

public class ApiDelivery implements WithSenderId, WithRecipientId {

    public final ApiSender sender;
    public final WithRecipientId recipient;

    public ApiDelivery(ApiSender sender, WithRecipientId recipient) {
        this.sender = sender;
        this.recipient = recipient;
    }

    @Override
    public long getSenderId() {
        return sender.getSenderId();
    }

    @Override
    public long getRecipientId() {
        return recipient.getRecipientId();
    }

    @Override
    public String toString() {
        return "delivery from " + sender + " to " + recipient;
    }
}

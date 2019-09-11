package com.github.sindrebn._3_fun_with_interfaces;

public class WebDelivery implements WithSenderId, WithRecipientId {

    public final WebSender sender;
    public final Recipient recipient;

    public WebDelivery(WebSender sender, Recipient recipient) {
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

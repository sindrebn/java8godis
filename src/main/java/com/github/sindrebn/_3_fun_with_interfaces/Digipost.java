package com.github.sindrebn._3_fun_with_interfaces;

public class Digipost {

    void send(long sender, long recipient, Letter letter) {
        // Deliver the letter to recipient's mail box

        System.out.println("Sending letter from sender '" + sender + "' to recipient '" + recipient + "'");
    }
























    void send(WithSenderId sender, WithRecipientId recipient, Letter letter) {
        // Deliver the letter to recipient's mail box

        System.out.println("Sending letter from " + sender + " to " + recipient);
    }

























    <DELIVERY extends WithSenderId & WithRecipientId> void send(DELIVERY delivery, Letter letter) {
        // Deliver the letter to recipient's mail box

        System.out.println("Sending " + delivery);
    }
}




















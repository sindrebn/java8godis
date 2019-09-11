package com.github.sindrebn._3_fun_with_interfaces;

import static com.github.sindrebn._3_fun_with_interfaces.Letter.INTERESTING_LETTER;

public class _0_RiskyApproach {

    public static void main(String[] args) {
        Digipost digipost = new Digipost();

        long apiSenderId = 1;
        long webSenderId = 2;

        long recipientId = 47;

        Letter letter = INTERESTING_LETTER;

        digipost.send(apiSenderId, recipientId, letter);
        digipost.send(webSenderId, recipientId, letter);

        digipost.send(recipientId, apiSenderId, letter); // uh-oh
    }
}

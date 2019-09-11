package com.github.sindrebn._3_fun_with_interfaces;

import org.junit.jupiter.api.Test;

import static com.github.sindrebn._3_fun_with_interfaces.Letter.INTERESTING_LETTER;

class DigipostTest {

    private Digipost sender = new Digipost();

    @Test
    void sending_works() {
        sender.send(WithSenderId.of(1), WithRecipientId.of(2), INTERESTING_LETTER);
    }













    private Recipient recipient = new Recipient(3, "Sindre");

    @Test
    void sending_works_with_just_lambdas() {
        sender.send(() -> 1, () -> 2, INTERESTING_LETTER);
        sender.send(() -> 1, recipient, INTERESTING_LETTER);
        sender.send(() -> 1, recipient::getRecipientId, INTERESTING_LETTER);
    }























}

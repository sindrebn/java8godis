package com.github.sindrebn._3_fun_with_interfaces;

import no.digipost.util.JustALong;

@FunctionalInterface
interface WithRecipientId {

    static JustARecipientId of(long id) {
        return new JustARecipientId(id);
    }

    long getRecipientId();

    final class JustARecipientId extends JustALong implements WithRecipientId {

        private JustARecipientId(long id) {
            super(id);
        }

        public long getRecipientId() {
            return theLong;
        }
    }
}
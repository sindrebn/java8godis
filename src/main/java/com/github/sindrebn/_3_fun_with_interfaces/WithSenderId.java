package com.github.sindrebn._3_fun_with_interfaces;

import no.digipost.util.JustALong;

@FunctionalInterface
interface WithSenderId {

    static JustASenderId of(long id) {
        return new JustASenderId(id);
    }

    long getSenderId();

    final class JustASenderId extends JustALong implements WithSenderId {

        private JustASenderId(long id) {
            super(id);
        }

        public long getSenderId() {
            return theLong;
        }
    }
}
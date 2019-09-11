package com.github.sindrebn._3_fun_with_interfaces;

import static com.github.sindrebn._3_fun_with_interfaces.Letter.INTERESTING_LETTER;

public class _1_InterfaceFun {

    public static void main(String[] args) {
        Digipost digipost = new Digipost();

        ApiSender apiSender = new ApiSender(1, "secret-api-key");
        WebSender webSender = new WebSender(2, "admin", "admin");

        Recipient recipient = new Recipient(1, "Sindre");

        Letter letter = INTERESTING_LETTER;

        digipost.send(apiSender, recipient, letter);
        digipost.send(webSender, recipient, letter);

//        digipost.send(recipient, webSender, letter); // Won't compile :)
    }

}

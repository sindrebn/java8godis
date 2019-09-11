package com.github.sindrebn._3_fun_with_interfaces;

public class _2_IntersectionTypes {

    public static void main(String[] args) {
        Digipost digipost = new Digipost();

        WebSender webSender = new WebSender(1, "admin", "admin");
        ApiSender apiSender = new ApiSender(1, "dknjf3qfdijos2");

        Recipient recipient = new Recipient(1, "Sindre");

        Letter letter = Letter.INTERESTING_LETTER;

        WebDelivery webDelivery = new WebDelivery(webSender, recipient);
        ApiDelivery apiDelivery = new ApiDelivery(apiSender, recipient);

        digipost.send(webDelivery, letter);
        digipost.send(apiDelivery, letter);


    }
}

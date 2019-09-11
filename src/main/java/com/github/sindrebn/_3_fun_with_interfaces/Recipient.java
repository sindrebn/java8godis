package com.github.sindrebn._3_fun_with_interfaces;

public class Recipient implements WithRecipientId {

    public final long id;
    public final String name;

    public Recipient(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public long getRecipientId() {
        return id;
    }

    @Override
    public String toString() {
        return "recipient '" + name + "' (id: " + id + ")";
    }
}

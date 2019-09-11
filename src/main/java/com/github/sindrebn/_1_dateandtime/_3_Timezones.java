package com.github.sindrebn._1_dateandtime;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _3_Timezones {

    static ZoneId OSLO = ZoneId.of("Europe/Oslo");
    static ZoneId SYDNEY = ZoneId.of("Australia/Sydney");

    public static void main(String[] args) {
        ZonedDateTime systemNow = ZonedDateTime.now();

        System.out.println("ZonedDateTime @ System TimeZone: " + systemNow);

        System.out.println();

        ZonedDateTime sydneyNow = ZonedDateTime.now(SYDNEY);
        System.out.println("ZonedDateTime @ Sydney TimeZone: " + sydneyNow);
        System.out.println();

        System.out.println("@ System TimeZone as Instant:\t" + systemNow.toInstant());
        System.out.println("@ Sydney TimeZone as Instant:\t" + sydneyNow.toInstant());

        Clock sydneyClock = Clock.system(SYDNEY);
        ZonedDateTime osloNow = ZonedDateTime.now(sydneyClock);
        System.out.println("Using Clock set to Sydney TZ:\t" + osloNow);

    }
}

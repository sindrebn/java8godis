package com.github.sindrebn._1_dateandtime;

import java.time.Clock;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class _2_NewSchoolDate {

    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("Instant.now(): " + now);

//        System.out.println(now.get(ChronoField.DAY_OF_MONTH)); <- not allowed :(
//
        System.out.println();

        Clock clock = Clock.systemDefaultZone();
        Instant nowDefaultZone = Instant.now(clock);
//        clock.instant(); <- This is equivalent
        System.out.println("now @ System TimeZone: " + nowDefaultZone);

        Instant inThreeDays = now.plus(3, ChronoUnit.DAYS);
        System.out.println("now + 3 days @ System TimeZone: " + inThreeDays);

        Instant inThreeMonths = now.plus(3, ChronoUnit.MONTHS);
    }

}

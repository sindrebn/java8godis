package com.github.sindrebn._1_dateandtime;

import java.time.Clock;
import java.time.Instant;
import java.time.MonthDay;
import java.time.YearMonth;

import static com.github.sindrebn._1_dateandtime._3_Timezones.OSLO;

public class _6_OtherStuff {

    public static void main(String[] args) throws InterruptedException {
        MonthDay monthDay = MonthDay.now();
        System.out.println("MonthDay now: " + monthDay);

        YearMonth yearMonth = YearMonth.now();
        System.out.println("YearMonth now: " + yearMonth);

        System.out.println();

        Clock fixedOsloClock = Clock.fixed(Instant.now(), OSLO);
        System.out.println("Instant from fixed clock:\t" + fixedOsloClock.instant());

        System.out.println();
        System.out.println("😴 taking a (very) short nap …");
        Thread.sleep(750);
        System.out.println();

        System.out.println("Instant from fixed clock:\t" + fixedOsloClock.instant());
        System.out.println("Instant from system clock:\t" + Instant.now());
    }
}

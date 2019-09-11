package com.github.sindrebn._1_dateandtime;

import no.digipost.time.ControllableClock;

import java.time.*;

import static com.github.sindrebn._1_dateandtime._3_Timezones.OSLO;

public class _7_BestPractices {

    public static void main(String[] args) {
        // Always use a clock with the «correct» time zone
        Clock clock = Clock.system(OSLO);

        // Always use instants to save timestamps in e.g. database
        Instant now = clock.instant();

        // Use local date to save birthdays
        LocalDate birthday = LocalDate.of(1989, 9, 16);

        // Use ZonedDateTime when communicating with other parties
        ZonedDateTime osloNow = now.atZone(OSLO);

        // Use Period and Duration to perform date and time arithmetics
        Period age = Period.between(LocalDate.now(), birthday);
        Instant in24Hours = now.plus(Duration.ofHours(24));

        // Use a fixed clock in your tests to avoid stupid bugs
        Clock fixedClock = Clock.fixed(now, OSLO);

        // Bonus pro tip:
        // Use Digipost's ControllableClock to have complete control of
        // the clock in your tests!
        ControllableClock controllableClock = ControllableClock.freezedAt(Instant.now());
    }

}

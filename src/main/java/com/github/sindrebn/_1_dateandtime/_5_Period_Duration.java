package com.github.sindrebn._1_dateandtime;

import java.time.*;

import static com.github.sindrebn._1_dateandtime._3_Timezones.OSLO;

public class _5_Period_Duration {

    public static void main(String[] args) {
        Duration duration_10_days = Duration.ofDays(10);
        System.out.println("Duration 10 days: " + duration_10_days);

        Period period_10_days = Period.ofDays(10);
        System.out.println("Period 10 days: " + period_10_days);

        System.out.println();

        ZonedDateTime beforeDST = ZonedDateTime.of(LocalDate.of(2019, 10, 20), LocalTime.of(10, 0), OSLO);
        System.out.println("Duration added: \t" + beforeDST.plus(duration_10_days));
        System.out.println("Period added: \t\t" + beforeDST.plus(period_10_days));

        System.out.println();

        Instant first = first();
        Instant second = second();

        Duration between = Duration.between(first, second);
        System.out.println("Duration between two Instants: " + between);
        System.out.println("\tAs nanos: " + between.toNanos());

        System.out.println();

        System.out.println("A random Instant: \t\t" + first);
        System.out.println("With 10 seconds added: \t" + first.plus(Duration.ofSeconds(10)));

        System.out.println();

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1989, Month.SEPTEMBER, 16);
        Period age = Period.between(birthday, today);
        System.out.println("Age as Period: " + age);
        System.out.println(String.format("\t%d years, %d monthsog %d days", age.getYears(), age.getMonths(), age.getDays()));
    }

    private static Instant first() {
        return ZonedDateTime.of(LocalDate.of(2019, 5, 16), LocalTime.of(15, 37), OSLO).toInstant();
    }

    private static Instant second() {
        return ZonedDateTime.of(LocalDate.of(2019, 7, 3), LocalTime.of(15, 7), OSLO).toInstant();
    }

}

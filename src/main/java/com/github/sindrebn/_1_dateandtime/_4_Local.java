package com.github.sindrebn._1_dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static com.github.sindrebn._1_dateandtime._3_Timezones.SYDNEY;

public class _4_Local {

    public static void main(String[] args) {
        LocalDate dateSystem = LocalDate.now();
        System.out.println("LocalDate @ System TimeZone: " + dateSystem);

        LocalDate dateSydney = LocalDate.now(SYDNEY);
        System.out.println("LocalDate @ Sydney TimeZone: " + dateSydney);

        System.out.println();

        LocalTime timeSystem = LocalTime.now();
        System.out.println("LocalTime @ System TimeZone: " + timeSystem);

        LocalTime timeSydney = LocalTime.now(SYDNEY);
        System.out.println("LocalTime @ Sydney TimeZone: " + timeSydney);

        System.out.println();

        LocalDateTime dateTimeSydney = timeSydney.atDate(dateSydney);
        System.out.println("LocalDateTime @ Sydney TimeZone: " + dateTimeSydney);

        LocalDateTime sydneyInThreeDays = dateTimeSydney.plus(3, ChronoUnit.DAYS);
        System.out.println("LocalDateTime + 3 days @ Sydney TimeZone: " + sydneyInThreeDays);

    }

}

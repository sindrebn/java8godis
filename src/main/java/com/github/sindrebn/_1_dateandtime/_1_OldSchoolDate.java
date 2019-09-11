package com.github.sindrebn._1_dateandtime;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class _1_OldSchoolDate {

    public static void main(String[] args) {
        Date may17th = new Date(2019, 5, 17);
        System.out.println("Date instantiated with values: " + format(may17th));

        System.out.println();

        Date now = new Date();
        System.out.println("Date instantiated with default constructor: " + now.getDate() + "/" + now.getMonth() + "/" + now.getYear());
        System.out.println("\tFormatted properly: " + format(now));

        System.out.println();


        Date some_date = some_date();
        System.out.println("Some random date: \t\t\t\t\t" + format(some_date));

        System.out.println("* date is passed to some method I don't know what does, but it's probably harmless 🤷‍♀️ *");
        naughtyThirdParty(some_date);

        System.out.println("Hopefully the same date as above: \t" + format(some_date));
    }


    private static Date some_date() {
        return new Date(97, Calendar.FEBRUARY, 21);
    }


    private static String format(Date date) {
        return DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.DEFAULT, Locale.forLanguageTag("nb")).format(date);
    }

    private static void naughtyThirdParty(Date date) {
        date.setDate(14);
        date.setMonth(Calendar.AUGUST);
        date.setYear(108);
        date.setHours(13);
        date.setMinutes(37);
        date.setSeconds(0);
    }

}

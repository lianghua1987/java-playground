package com.hua.java8.date;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.stream.Collectors;

public class TestDate {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().plusMonths(20));
        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(LocalDate.now().isSupported(ChronoField.SECOND_OF_DAY));
        System.out.println(LocalDate.now().withYear(2008));
        System.out.println(LocalDate.now().with(ChronoField.DAY_OF_YEAR, 150));
        System.out.println(LocalDate.now().with(TemporalAdjusters.lastDayOfYear()));
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().with(LocalTime.MIDNIGHT));
        System.out.println(LocalTime.of(11, 20, 11));
        System.out.println(LocalTime.of(11, 20));
        System.out.println(LocalTime.of(11, 20).minus(1, ChronoUnit.HOURS));
        System.out.println(LocalDateTime.now());
        LocalDateTime ldt = LocalDate.now().atTime(LocalTime.now());
        System.out.println(ldt);
        System.out.println(LocalTime.now().atDate(LocalDate.now()));
        System.out.println(LocalDate.now().atTime(LocalTime.now()));
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));
        System.out.println(LocalDateTime.now().getDayOfWeek());
        System.out.println(LocalDateTime.now().get(ChronoField.SECOND_OF_DAY));

        LocalDate ld1 = LocalDate.of(1987, 9, 3);
        LocalDate ld2 = LocalDate.now();
        Period p1 = ld1.until(ld2);
        System.out.println(p1.getDays());
        System.out.println(p1.getMonths());
        System.out.println(p1.getYears());

        Period p2 = Period.ofYears(500);
        System.out.println(p2.toTotalMonths());

        Period p3 = Period.between(LocalDate.of(1987, 9, 3), LocalDate.now());
        System.out.println(p3.getYears());
        System.out.println(p3.getMonths());

        System.out.println(Instant.now());
        // Jan 1st 1970 -> 0 + days * 86400s/day
        System.out.println(Instant.now().getEpochSecond());
        System.out.println(Instant.ofEpochSecond(0)); // 1970-01-01T00:00:00Z

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now().getZone());
        System.out.println(ZonedDateTime.now().getOffset()); // from UTC
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.getAvailableZoneIds().stream().collect(Collectors.joining(", ", "[", "]")));

        System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/New_York")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));

        System.out.println(LocalDateTime.now().atZone(ZoneId.of("America/Los_Angeles")));



    }
}

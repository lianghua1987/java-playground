package com.hua.java8.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

public class TestDateConvert {

    public static void main(String[] args) {
        System.out.println( new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        System.out.println( new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        System.out.println( new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalTime());
        System.out.println(new Date().from(LocalDate.now().atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant()));

    }
}

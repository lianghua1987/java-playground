package com.hua.java8.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestFormater {

    public static void main(String[] args) {
        System.out.println(LocalDate.parse("20200102", DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(LocalDate.parse("2020*10*11", DateTimeFormatter.ofPattern("yyyy*dd*MM")));
    }
}

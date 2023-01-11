package com.hua.java16;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestTimeformat {

    public static void main(String[] args) {
        System.out.println(LocalTime.parse("17:30:00.12345").format(DateTimeFormatter.ofPattern("h B", Locale.US)));

    }
}

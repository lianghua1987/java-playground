package com.hua.java10;

import java.text.NumberFormat;
import java.util.Locale;

public class TestNumberInstance {

    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getNumberInstance();
        System.out.println(format.format(1000000));
        format = NumberFormat.getCompactNumberInstance(Locale.CHINA, NumberFormat.Style.SHORT);
        System.out.println(format.format(1000000));
    }
}

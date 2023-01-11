package com.hua.locale;

import java.util.Locale;

public class TestLocale {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault().getCountry());
        System.out.println(Locale.getDefault().getLanguage());
        Locale.setDefault(Locale.CHINA);
        System.out.println(Locale.getDefault().getCountry());
        System.out.println(Locale.getDefault().getLanguage());
    }
}

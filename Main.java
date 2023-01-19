package ru.tinkoff.qa;

import converters.FahrenheitConverter;

public class Main {
    public static void main(String[] args) {
        FahrenheitConverter f = new FahrenheitConverter("12F");
        System.out.println(f.getConversionResult());
    }
}

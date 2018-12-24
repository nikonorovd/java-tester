package ru.neolant.sandbox;

import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        String[] langs = {"java", "C#", "Pyton", "PHP"};

        List<String> languages = Arrays.asList("java", "C#", "Pyton", "PHP");

        for (String l: languages){
            System.out.println("Я хочу выучить " + l);
        }
    }
}

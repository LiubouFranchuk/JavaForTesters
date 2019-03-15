package com.epam.cdp.Module_7.streams;

import java.util.Arrays;

public class Closure {
    public static void main(String[] args) {
        String[] words = {"Abc", "world", "Moskva"};
        Arrays.asList(words).stream().forEach(e->{
            System.out.println(e=e+"2");
            //lambda varibales are FINAL though here it's a reference so we can change it and add "2"
        });




    }
}

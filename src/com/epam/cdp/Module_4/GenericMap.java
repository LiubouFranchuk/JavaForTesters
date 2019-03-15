package com.epam.cdp.Module_4;

import java.util.HashMap;
import java.util.Map;


public class GenericMap{
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<Integer, String>();
        words.put(1, "First");
        words.put(2, "Second");
        words.put(3, "Third");

        System.out.println("Map: "+ words);
        System.out.println("Word is " + words.get(3));


    }
}

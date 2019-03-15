package com.epam.cdp.Module_4;

import java.util.HashMap;
import java.util.Map;

public class CarsInGarage {
    public static void main(String[] args) {
        Map<String, Integer> garage = new HashMap<>();
        garage.put("Audi", 2);
        garage.put("BMW", 4);
        garage.put("Mercedes", 3);
        System.out.println(garage);
        garage.put("BMW", 1);
        System.out.println(garage);
        garage.put(null, 10);
        System.out.println(garage);
        garage.put(null, null);
        System.out.println(garage.get(null));

        System.out.println(garage.get("BMW"));


        if (garage.containsKey("Zhiguli")) {
            System.out.println("I'm not that rich");
        }else{
            garage.put("Zhiguli", 1);
        }
        System.out.println(garage);

//if NOT contains
        if (!garage.containsKey("Zhiguli")) {
            garage.put("Zhiguli", 1);
        }
        System.out.println(garage);

//keySet is a bucnh of UNIQUE element, keys are not a set as they ain;t unique.
        garage.keySet().forEach(e-> System.out.println(e));
        garage.values().forEach(e-> System.out.println(e));
        garage.forEach((k,v)-> System.out.println(k+" "+v));



    }
}

package com.epam.cdp.Module_7.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> offices = new ArrayList<>();
        //offices in St.Petersburg
        offices.add("Voronezhskaya");
        offices.add("Pevcheskaya");
        offices.add("Chernaya Rechka");

        Stream<String> stream = offices.stream();

        //OPTION 1
    /*    System.out.println(stream.filter(o -> o.startsWith("V")).count());
        //only 1 terminal operation can be done in a stream that's why we chose the line above
        stream.filter(o -> o.startsWith("V")).count();
        //lambda expression = attributes -> body

        stream.map(office -> office.toUpperCase()).forEach(System.out::println);
        //2 colons are used as a variation of lambdas to shorten expressions
*/
        //OPTION 2
        /*List<String> filteredOFfices = stream.filter(o -> o.startsWith("V")).collect(Collectors.toList());
        filteredOFfices.stream().map(office -> office.toUpperCase()).forEach(System.out::println);
*/

        //OPTION 3
        stream.filter(o -> o.startsWith("V")).map(office ->office + " will be closed")
                .forEach(s -> System.out.println(s));
        // forEach(s -> System.out.println(s)); EQUALS forEach(System.out::println);



    }
}

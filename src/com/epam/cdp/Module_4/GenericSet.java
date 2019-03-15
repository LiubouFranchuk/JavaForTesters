package com.epam.cdp.Module_4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericSet {
    public static void main(String[] args) {
        Set<String> words = new HashSet<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");


        // iterator is an archaic phenomenon but can be asked about during assessments along with Set class type
        //currently iterator is simplified
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//iteration OPTION 2
        for (String s: words) {
            System.out.println(s);
        }
    }
}

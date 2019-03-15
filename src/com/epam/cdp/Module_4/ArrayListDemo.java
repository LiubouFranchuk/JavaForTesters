package com.epam.cdp.Module_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] names = {"Alexey", "Alina", "Andrey"};
//        ArrayList list = {ArrayList) Arrays.asList(names);
        List list = Arrays.asList(names);
        list = new ArrayList(list);  //this row is needed for removing elemts and foreach for a list

        for (int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
            System.out.println(names[i]);
        }
// Object is a common variable type in arrays if not speciifed before. That's why we convert it to String when printing.
        for (Object s : list) {
            System.out.println(s.toString());

        }

// File -> Project Structure -> Project -> 8 lambdas etc
        list.remove(20);
        list.forEach(s-> System.out.println(s));


    }
}

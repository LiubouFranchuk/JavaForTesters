package com.epam.cdp.Module_4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 100; i++) {
            list.add(i, "String # " + i);
        }
        
        list.remove(1);
        List sublist = list.subList(10, 15);
//        sublist.forEach(e-> System.out.println(e.toString().charAt(0)));
        sublist.forEach(e-> System.out.println(e));
    }
}

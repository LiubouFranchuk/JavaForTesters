package com.epam.cdp.Module_7;

public class SystemDemo2 {
    public static void main(String[] args) {
//        System.getProperties().forEach((k,v)->System.out.println((String)k + " " + (String)v));
        System.out.println(System.getProperty("os.name"));

        Runtime rt = Runtime.getRuntime();
        System.out.println( rt.availableProcessors());
        System.out.println( rt.freeMemory());
        rt.gc();
        System.gc();

        //рекурсия - 1 в 1 как уровни сна в фильме начало - т.е. в мэйне вызвать мэйн

        System.out.println(String.class.getClassLoader());
        System.out.println(SystemDemo.class.getClassLoader().toString());



    }
}

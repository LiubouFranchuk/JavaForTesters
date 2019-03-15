package com.epam.cdp.Module_7;

public class SystemDemo {
    public static void main(String[] args) {
        long start =  System.currentTimeMillis();
        doHardJob();
        long end =  System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void doHardJob() {
        for (int i = 0; i < 1000000; i++) {

        }
    }
}

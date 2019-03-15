package com.epam.cdp.Module_2;

public class Human {
    public String name = "Adam";
    public Human() {
        System.out.println("Hi from constructor withput params");
    }
    public Human (String name) {
        this.name = name;
    }
}

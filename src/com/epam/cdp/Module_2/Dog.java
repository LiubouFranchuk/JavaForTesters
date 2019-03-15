package com.epam.cdp.Module_2;

public class Dog extends Animal implements Smartable {


    public Dog(String name) {
        super(name);
        this.weight = 30;
        this.height = 100;
    }

    @Override
    public void walk() {
        height++;

    }

    @Override
    public void eat() {
        height++;
        weight++;

    }

    @Override
    public void think() {
        System.out.println("I'm not so smart");

    }
}

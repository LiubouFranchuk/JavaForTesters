package com.epam.cdp.Module_2;

public class Cat extends Animal implements Smartable {
    private String favoutriteFoood = "Wiskas";

    public Cat(int height, int weight, String name, String favoutriteFoood) {
        super(height, weight, name);
        this.favoutriteFoood = favoutriteFoood;
    }

    @Override
    public void think() {
        System.out.println("I'm a smart cat");

    }

    @Override
    public void walk() {
        this.weight--;

    }

    @Override
    public void eat() {
        this.weight++;
        this.height++;

    }
}
